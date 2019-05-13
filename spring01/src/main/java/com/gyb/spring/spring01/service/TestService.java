package com.gyb.spring.spring01.service;

import com.gyb.spring.spring01.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    private TestDao testDao;

    @Autowired
    public TestService(TestDao testDao) {
        this.testDao = testDao;
        System.out.println(this.testDao);
    }
}
