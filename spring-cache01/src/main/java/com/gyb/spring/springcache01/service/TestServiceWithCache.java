package com.gyb.spring.springcache01.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class TestServiceWithCache {
    @Cacheable(cacheNames = "test_cache",key = "#res")
    public String test(String res){
        try {
            TimeUnit.SECONDS.sleep(1);
        }catch (Exception e){
            e.printStackTrace();
        }
        return res;
    }
    
}
