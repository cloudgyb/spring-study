package com.gyb.spring.springemail.Service;

import freemarker.template.Configuration;
import freemarker.template.Template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.CharArrayWriter;

/**
 * @author gengyuanbo
 * 2019/03/14
 */
@Component
public class MailTemplate {
    @Autowired
    private Configuration configuration;

    /**
     * 生成html格式的邮件主体
     * @param templateName 模板名称，在resources/templates/下的模板文件
     * @param data 模型数据
     * @return 生成的文本
     * @throws Exception
     */
    public String generateHtmlMailBody(String templateName,Object data) throws Exception {
        Template template = configuration.getTemplate(templateName);
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        template.process(data,charArrayWriter);
        String s = charArrayWriter.toString();
        charArrayWriter.close();
        return s;
    }
}
