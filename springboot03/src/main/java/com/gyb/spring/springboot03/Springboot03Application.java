package com.gyb.spring.springboot03;

import com.gyb.spring.springboot03.component.MyValuePropertySourceFactory;
import com.gyb.spring.springboot03.component.MyBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@PropertySource(value = "",factory = MyValuePropertySourceFactory.class) //自定义的property注入
@EnableConfigurationProperties
public class Springboot03Application {
    @Value("${my.aaa}")
    private String aaa;

    @Autowired
    private MyBean bean;

    @GetMapping("/hello")
    public String hello(){
        bean.tttt();
        return "hello";
    }

    @GetMapping("/he")
    public String he(){
        System.out.println("he");
        System.out.println(aaa);
        return "he";
    }


    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(Springboot03Application.class);
        springApplication.setBannerMode(Banner.Mode.OFF);
        springApplication.run(args);
    }

}

