package com.gtcmaile.blogs.service;

import com.gtcmaile.blogs.pojo.user.User;
import com.gtcmaile.blogs.util.file.FileUtil;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author: jim
 * @Date: 2019/7/30 15:27
 * @Version 1.0
 */
@Component
//监听图片的消息队列
@RabbitListener(queues = "imgUploadCompress")
public class ImgUploadCompress {
    @RabbitHandler
    public void process(String path) {
        //图片压缩处理
        FileUtil.compressImg(path);
    }
}
