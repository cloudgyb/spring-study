package com.gyb.spring.springcache01;

import com.gyb.spring.springcache01.service.TestServiceWithCache;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.CacheManager;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringCache01ApplicationTests {

    @Autowired
    private TestServiceWithCache testServiceWithCache;
    @Autowired
    private CacheManager cacheManager;
    @Test
    public void testCache() {
        long startTime = System.currentTimeMillis();
        String test = testServiceWithCache.test("abc");
        long endTime1 = System.currentTimeMillis();
        System.out.println("第一次调用："+test+"小号时间："+(endTime1-startTime));
        String test1 = testServiceWithCache.test("abc");
        long endTime2 = System.currentTimeMillis();
        System.out.println("第二次调用："+test1+"小号时间："+(endTime2-endTime1));
        System.out.println(cacheManager);
    }

}
