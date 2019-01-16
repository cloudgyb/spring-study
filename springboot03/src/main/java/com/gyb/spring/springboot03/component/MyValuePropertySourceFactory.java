package com.gyb.spring.springboot03.component;

import org.springframework.core.env.PropertySource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.core.io.support.PropertySourceFactory;

import java.io.IOException;

/**
 * @author gengyuanbo
 * 2019/01/14
 */

public class MyValuePropertySourceFactory implements PropertySourceFactory {
    @Override
    public PropertySource<?> createPropertySource(String s, EncodedResource encodedResource) throws IOException {
       return new MyValuePropertySource();
    }
}
