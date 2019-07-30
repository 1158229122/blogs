package com.gtcmaile.blogs.web.api.file;

import com.gtcmaile.blogs.pojo.file.FileIOMq;
import com.gtcmaile.blogs.pojo.response.Result;
import com.gtcmaile.blogs.util.StringUtils;
import com.gtcmaile.blogs.util.encryption.Md5Utils;
import com.gtcmaile.blogs.util.file.FileUtil;
import com.gtcmaile.blogs.util.file.PropertyUtil;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * created by jim on 19-6-11 上午11:26
 */
@RestController
@RequestMapping("/file")
public class FileController {
    /**
     * 上传文件的通用接口
     * @param path 上传到哪
     * @param file 文件
     * @return
     */
    @Autowired
    private AmqpTemplate rabbitTemplate;
    public static SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
    @ApiOperation(value = "设置用户信息")
    @PostMapping("upload/{path}")
    public Result commUpload(@PathVariable String path, MultipartFile file){
        //保存文件并返回路径
        String saveName = FileUtil.commUpload(file, path);
        //文件压缩后台处理
        rabbitTemplate.convertAndSend("imgUploadCompress",saveName);
        return  Result.success(saveName);
    }
}
