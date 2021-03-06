package com.gyb.spring.springboot01;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
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
