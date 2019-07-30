package com.gtcmaile.blogs.pojo.file;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;

/**
 * @Author: jim
 * @Date: 2019/7/30 16:27
 * @Version 1.0
 * 此文件用于文件的消息队列的io操作
 */
@Data
public class FileIOMq implements Serializable {
    String fileName;
    String path;
//    MultipartFile file;
}
