package com.gyb.springboot03.springboot03.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author gengyuanbo
 * 2019/01/14
 */

@Component
public class MyBean {
    @Value("${random.uuid}")
    private String uuid;


    @Autowired
    public MyBean(ApplicationArguments arguments) {
        List<String> nonOptionArgs = arguments.getNonOptionArgs();
        for (String nonOptionArg : nonOptionArgs) {
            System.out.println(nonOptionArg);
        }

    }


    public void tttt(){
        System.out.println(uuid);
    }
}
