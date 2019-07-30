package com.gtcmaile.blogs.web.config;




import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DirectRabbitConfig {
 
    //队列
	@Bean
    public Queue CalonDirectQueue() {
	    //用于图片上传压缩处理
        return new Queue("imgUploadCompress",true);
    }
	
//    //Direct交换机
//	@Bean
//    DirectExchange CalonDirectExchange() {
//        return new DirectExchange("CalonDirectExchange");
//    }
//
//    //绑定
//	@Bean
//    Binding bindingDirect() {
//        return BindingBuilder.bind(CalonDirectQueue()).to(CalonDirectExchange()).with("CalonDirectRouting");
//    }
}
