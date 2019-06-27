package com.gtcmaile.blogs.util;


import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.HtmlEmail;

/**
 * 发邮件工具类
 */
public final class MailUtils {
    private static final String USER = "15172468307@163.com"; // 发件人称号，同邮箱地址
    private static final String PASSWORD = "gtc123456"; // 如果是qq邮箱可以使户端授权码，或者登录密码

    /**
     *
     * @param to 收件人邮箱
     * @param text 邮件正文
     * @param title 标题
     */
    /* 发送验证信息的邮件 */
    public static boolean sendMail(String to, String text, String title){
        try {
            HtmlEmail email = new HtmlEmail();
            String[] emails = new String[]{to};
            email.setHostName("smtp.163.com");
            email.setSmtpPort(465);
            email.setAuthenticator(new DefaultAuthenticator(USER, PASSWORD));
            email.setSSLOnConnect(true);
            email.setFrom("15172468307@163.com", "蓝天");
            email.addTo(emails[0]);
            email.setSubject(title);
            StringBuffer html = new StringBuffer();
            html.append(text);
            email.setHtmlMsg(html.toString());
            email.setTextMsg("Your email client does not support HTML messages");
            email.send();
            return true;
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("邮件发送失败");
            return false;
        }

    }

    public static void main(String[] args) {

        System.out.println(sendMail("834098187@qq.com","56444","你好"));
    }


}
