package com.gyb.spring;

import com.gyb.spring.mongodb01.Problem;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.ArrayList;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Update.update;
import static org.springframework.data.mongodb.core.query.Query.query;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

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
