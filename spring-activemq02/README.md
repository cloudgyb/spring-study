> Spring boot 整合ActiveMQ 发布订阅模式

* 第一步：引入依赖
```$xml
<dependency>
     <groupId>org.springframework.boot</groupId>
     <artifactId>spring-boot-starter-activemq</artifactId>
</dependency>
```
* 第二步：在application.properties配置ActiveMQ的url、用户名、密码等，还需要配置spring.jms.pub-sub-domain=true

* 第三步：编写生产者和消费者