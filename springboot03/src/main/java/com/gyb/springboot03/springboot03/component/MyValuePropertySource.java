package com.gyb.springboot03.springboot03.component;

import org.springframework.core.env.PropertySource;

/**
 * @author gengyuanbo
 * 2019/01/14
 */
public class MyValuePropertySource extends PropertySource {
    public MyValuePropertySource() {
        super("myValue");
    }

    public MyValuePropertySource(String name, Object source) {
        super(name, source);
    }

    @Override
    public Object getProperty(String s) {
        if(s.startsWith("my.")){
            return getPropertyValue(s.substring("my.".length()));
        }
        return null;
    }

    private String getPropertyValue(String type){
        if(type.equals("aaa"))
            return "aaa";
        else if(type.equals("bbb"))
            return "bbb";
        else
            return "default";
    }
}
