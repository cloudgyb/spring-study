## Spring Session 学习，分布式中session共享方案

### Spring Session是一套解决分布式下用户Session共享问题的API 和实现。在传统模式下用户session由servlet容器来管理，Spring Session将session从servlet容器中剥离出来，遵循servlet api接口开发了一套新的实现，从开发者角度来说，可以和传统的方式一样来使用session，例如request.getSession()。