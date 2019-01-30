# spring-cloud-samples

**Spring Cloud 的演示项目**

| 模块                 | 说明                               |
| -------------------- | ---------------------------------- |
| app-parent           | Maven 父项目，统一各模块的版本管理 |
| app-common-interface | 公共接口定义                       |
| eureka-server        | 服务注册与发现模块                 |
| app-platform         | 平台微服务                         |
| app-book             | 图书微服务                         |

**项目启动说明**

1. 启动 eureka-server，访问：`http://localhost:8761/` 可查看服务注册的相关信息

2. 启动平台微服务 app-platform

   平台微服务地址为：`http://localhost:7900/`

   访问平台微服务的 API 接口测试页面：`http://localhost:7900/swagger-ui.html`

3. 启动图书微服务 app-book

   图书微服务地址为：`http://localhost:7910/`

   访问图书微服务的 API 接口测试页面：`http://localhost:7910/swagger-ui.html`

   **测试图书微服务 BookController 的相关接口时，图书微服务会发起对平台微服务的调用**

