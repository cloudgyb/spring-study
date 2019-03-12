> Spring Boot 集成ActiveMQ 队列模式 Demo

* 第一步: application.properties 配置ActiveMQ 的 URL 、用户名和密码等
* 第二步：编写Producer 并注册为Spring 组件，使用JmsMessagingTemplate发送消息
* 第三步：编写consumer消费队列中的消息，通过@JmsListener监听目标队列

当有队列中有消息时，自动调用consumer消费 