package com.gyb.springboot.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootConfiguration
@SpringBootTest
@AutoConfigureMockMvc
public class TestController {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void test() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/")
            .accept(MediaType.ALL)).andReturn().getResponse().getStatus();
        System.out.println("test");
    }

}
