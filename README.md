# spring-cloud-samples

**Spring Cloud 的演示项目**

| 模块                 | 说明                       |
| -------------------- | -------------------------- |
| app-parent           | Maven 父项目，统一依赖管理 |
| app-common-interface | 公共接口定义               |
| eureka-server        | 服务注册与发现模块         |
| app-platform         | 平台微服务                 |
| app-book             | 图书微服务                 |

**项目启动说明**

1. 启动 eureka-server，访问：`http://localhost:8761/` 可查看服务注册的相关信息

2. 启动平台微服务 app-platform

   平台微服务地址为：`http://localhost:7900/`

3. 启动图书微服务 app-book

   图书微服务地址为：`http://localhost:7910/`

4. 访问图书微服务 `cn.huangxulin.cloud.controller.BookController` 相关方法，将会发起对平台微服务的调用

5. ...

**待扩展**

集成 Swagger2