package com.gtcmaile.blogs.util.file;


import com.alibaba.fastjson.JSON;
import com.gtcmaile.blogs.util.StringUtils;
import com.gtcmaile.blogs.util.encryption.Md5Utils;
import net.coobird.thumbnailator.Thumbnails;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class FileUtil {

    public static SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
    public static String networkPath = StringUtils.concat(PropertyUtil.getProperty("saveUrl"),":",PropertyUtil.getProperty("savePort"));
    public static final  String webappPath = PropertyUtil.getProperty("webappPath");
    public static String compress = PropertyUtil.getProperty("imageCompress");
    private static final Logger log = LoggerFactory.getLogger(FileUtils.class);

    /**
     * 匹配字符串中的img标签
     */
    public static Pattern p = Pattern.compile("<(img|IMG)(.*?)(>|></img>|/>)");
    /**
     * 匹配图片的地址
     */
    public static Pattern srcText = Pattern.compile("(src|SRC)=(\"|\')(.*?)(\"|\')");

    public static String commUpload(MultipartFile file, String path){
        path = StringUtils.concat("/File/",path , "/" , sdf.format(new Date()),"/");
        if (null == file || file.getSize() <= 0) {
            return null;
        }
        String fileName = Md5Utils.getMD5(file.getOriginalFilename() + Math.random()) + (file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".")));
        File directory = new File(StringUtils.concat(webappPath,path));
        if (!directory.exists() || !directory.isDirectory()) {
            directory.mkdirs();
        }
        try {
            File newFile=new File(StringUtils.concat(webappPath,path,fileName));
            file.transferTo(newFile);
            String saveName = StringUtils.concat(path, fileName);
            if(isImage(newFile)){
                sourceImageCompress(newFile.getPath());
                breviaryImageCompress(newFile.getPath());
            }
            return saveName;
        } catch (IOException e) {
            log.error("file save error:" + e.getMessage());
            return null;
        }

    }

    /**
     * 缩略图片压缩
     * @param sourceFileName
     */
    public static void breviaryImageCompress(String sourceFileName) throws IOException {
        File tempFile=new File(StringUtils.concat(sourceFileName,compress));
        if(FilenameUtils.isExtension(sourceFileName,"mp4")){
            return;
        }
        if(tempFile.exists()&&tempFile.length()<307200){
            return;
        }
        if(tempFile.exists()){
            try {
                Thumbnails.of(tempFile.getPath()).scale(0.8).outputQuality(0.5).toFile(tempFile.getPath());
            } catch (IOException e) {
                log.error("略缩图片文件压缩失败：{}", JSON.toJSONString(e));
                return;
            }
        }else{
            try {
                Thumbnails.of(sourceFileName).scale(0.8).outputQuality(0.5).toFile(tempFile.getPath());
            } catch (IOException e) {
                //保证图片的完整
                FileUtils.copyFile(new File(sourceFileName),new File(tempFile.getPath()));
            }
        }
        breviaryImageCompress(sourceFileName);
    }

    /**
     * 源图亚索
     * @param sourceFileName
     * @throws IOException
     */
    public static void sourceImageCompress(String sourceFileName) throws IOException {
        File tempFile=new File(sourceFileName);
        if(tempFile.exists()&&tempFile.length()<512000|| FilenameUtils.isExtension(sourceFileName,"mp4")){
            return;
        }
        try {
            if(tempFile.exists()){
                Thumbnails.of(tempFile.getPath()).scale(0.8).outputQuality(0.8).toFile(tempFile.getPath());
            }else{
                Thumbnails.of(sourceFileName).scale(0.8).outputQuality(0.8).toFile(tempFile.getPath());
            }
        } catch (IOException e) {
            log.error("源图片文件压缩失败：{}",JSON.toJSONString(e));
            return;
        }
        sourceImageCompress(sourceFileName);
    }

    /**
     * 判断文件是否是图片
     * @param file
     * @return
     */
    private static boolean isImage(File file) {
        if (!file.exists()) {
            return false;
        }
        BufferedImage image = null;
        try {
            image = ImageIO.read(file);
            if (image == null || image.getWidth() <= 0 || image.getHeight() <= 0) {
                return false;
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
