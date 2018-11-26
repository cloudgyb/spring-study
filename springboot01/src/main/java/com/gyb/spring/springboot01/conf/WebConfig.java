package com.gyb.spring.springboot01.conf;

import com.gyb.spring.springboot01.web.TestInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class WebConfig extends WebMvcConfigurationSupport {
    @Autowired
    private TestInterceptor testInterceptor;
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(testInterceptor);
    }
}
