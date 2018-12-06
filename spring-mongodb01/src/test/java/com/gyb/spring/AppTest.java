package com.gyb.spring;

import static org.junit.Assert.assertTrue;
import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

import com.gyb.spring.mongodb01.Problem;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.ArrayList;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void shouldAnswerWithTrue() {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:mongodb.xml");
        MongoTemplate mongoTemplate = (MongoTemplate) context.getBean("mongoTemplate");
        Problem problem = new Problem("6","question1",new ArrayList<>());

        //mongoTemplate.insert(problem,"test");
        Problem byId = mongoTemplate.findById("1", Problem.class,"test");
        System.out.println(byId);
        Problem one = mongoTemplate.findOne(query(where("title").is("question1")), Problem.class, "test");
        System.out.println(one);
        context.close();
    }
}
