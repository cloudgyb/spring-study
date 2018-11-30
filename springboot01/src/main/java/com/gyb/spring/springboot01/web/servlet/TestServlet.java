package com.gyb.spring.springboot01.web.servlet;

import org.apache.tomcat.util.http.fileupload.IOUtils;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

public class TestServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("application/x-download");
        resp.addHeader("Content-Disposition","attachment;filename=1.txt");
        ServletOutputStream outputStream = resp.getOutputStream();
        FileInputStream fileInputStream = new FileInputStream("/root/IdeaProjects/spring-study/springboot01/src/main/java/com/gyb/spring/springboot01/conf/WebConfig.java");
        IOUtils.copy(fileInputStream,outputStream);

    }
}
