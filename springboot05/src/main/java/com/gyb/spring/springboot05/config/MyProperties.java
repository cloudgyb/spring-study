package com.gyb.spring.springboot05.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author gengyuanbo
 * 2019/01/22
 */
@Component
@ConfigurationProperties(prefix = "spring.datasource")
@Getter
@Setter
public class MyProperties {
    private String driverClassName;
    private String url;

    private String username;
    private String password;
}
