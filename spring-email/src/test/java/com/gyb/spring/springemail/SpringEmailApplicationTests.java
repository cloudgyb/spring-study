package com.gyb.spring.springemail;

import com.gyb.spring.springemail.Service.MailTemplate;
import com.gyb.spring.springemail.Service.SendEmailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringEmailApplicationTests {
    @Autowired
    private SendEmailService sendEmailService;

    @Autowired
    private MailTemplate mailTemplate;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testSendSimpleMail() {
        String mess = "<h2>这是一封测试邮件！</h2>";
        sendEmailService.sendSimpleMail("277478869@qq.com","测试邮件",mess);
    }

    @Test
    public void testSendHtmlMail() throws Exception {
        String mess = "<h3>录用通知：恭喜你被启明星辰公司录用！</h3>";
        sendEmailService.sendHtmlMail("gyb_cloud@163.com","通知",mess);
    }

    @Test
    public void testSendHtmlMailWithTemplate() throws Exception {
        HashMap<String, Object> map = new HashMap<>();
        map.put("code","8090");
        map.put("time","5分钟");
        String s = mailTemplate.generateHtmlMailBody("MailSignOnVerifyCode.ftl", map);
        sendEmailService.sendHtmlMail("gyb_cloud@163.com","注册验证码",s);
    }

}
