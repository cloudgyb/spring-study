package com.gyb.spring.springboot03.annotation;

import com.gyb.spring.springboot03.config.Springboot03Config;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author gengyuanbo
 * 2019/01/16
 */

@Inherited
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(Springboot03Config.class)
public @interface EnableSpringboot03 {
}
