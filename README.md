# dubbo-demo
springboot+dubbo的一个简单的微服务例子。
zookeeper直接用本地的。
consumer里的application.properties里加了server.servlet.context-path=/demo-hmj-consumer,consumer请求接口时url要带上这个，没有这个配置时请求接口就不需要带这个了，现在是没有行配置的
