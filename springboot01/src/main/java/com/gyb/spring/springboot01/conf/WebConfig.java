package com.gyb.spring.springboot01.conf;

import com.gyb.spring.springboot01.web.TestInterceptor;
import com.gyb.spring.springboot01.web.filter.TestFilter;
import com.gyb.spring.springboot01.web.filter.TestFilter2;
import com.gyb.spring.springboot01.web.servlet.TestServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.servlet.Filter;
import javax.servlet.Servlet;

@Configuration
public class WebConfig extends WebMvcConfigurationSupport {

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new TestInterceptor());
    }

    /*@Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**","classpath:/static/");
    }*/

    @Bean
    public FilterRegistrationBean addFilter(){
        FilterRegistrationBean<Filter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new TestFilter());
        return registrationBean;
    }

    @Bean
    public FilterRegistrationBean addFilter1(){
        FilterRegistrationBean<Filter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new TestFilter2());
        return registrationBean;
    }
    @Bean
    public ServletRegistrationBean addServlet(){
        ServletRegistrationBean<Servlet> registrationBean = new ServletRegistrationBean<>();
        registrationBean.setServlet(new TestServlet());
        registrationBean.addUrlMappings("/controller");
        return registrationBean;
    }

    @Bean
    public InternalResourceViewResolver addResourceViewResolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        return  resolver;
    }
}
