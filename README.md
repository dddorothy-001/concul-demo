## consul-demo

这是一个基于Spring Boot和Spring Cloud Consul实现的服务注册与消费项目，包含两个子模块：

- consul-consumer：提供服务并注册到Consul
- consul-provider：通过consul+Feign实现服务调用

### 项目结构

```
consul-demo/
├── consul-consumer						#消费服务（服务调用方）
│   ├── src
│   │   ├── main
│   │   │   ├── java
│   │   │   │   └── org
│   │   │   │       └── example
│   │   │   │           ├── api			#Feign接口定义
│   │   │   │           ├── config		#Feign日志配置
│   │   │   │           ├── controller
├── consul-provider						#提供服务（服务注册方）
│   ├── src
│   │   ├── main
│   │   │   ├── java
│   │   │   │   └── org
│   │   │   │       └── example
│   │   │   │           ├── controller
```

### 技术栈

| 组件                          | 版本     |
| ----------------------------- | -------- |
| JDK                           | 17       |
| Spring Boot                   | 3.3.5    |
| Spring Cloud                  | 2022.0.5 |
| Spring Cloud Consul Discovery | 2022.0.5 |
| Spring Cloud OpenFeign        | 2022.0.5 |
| Spring Boot Actuator          | 3.1.5    |
| Prometheus Registry           | 1.11.4   |

### 启动方式

1、启动本地consul

```
docker run -d -name=consul -p 8500:8500 -p 8600:8600/udp consul
```

2、启动consul-consumer、consul-provider模块，不分先后

### 访问地址

consul UI的地址

```
http://localhost:8500
```

