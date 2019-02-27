### Spring Boot事务配置学习

> 在Spring Boot中使用事务非常简单

1. 引入持久化框架依赖，例如spring-boot-starter-jdbc或者mybatis-spring-boot-starter或者JPA
2. 在启动类上标注@EnableTransactionManagement，启动事务管理
3. 在服务类上标注@Transactional注解，表示该类的所有方法均在事务中执行

> 注意：默认配置下 Spring 只会回滚运行时、未检查异常（继承自 RuntimeException 的异常）或者 Error。
     @Transactional 注解只能应用到 public 方法才有效。
