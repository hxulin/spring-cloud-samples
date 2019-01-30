package cn.huangxulin.cloud;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 功能描述:
 *
 * @author hxulin
 */
@Configuration
@EnableSwagger2
public class Swagger2 {

    // Swagger2 的配置文件, 这里可以配置 Swagger2 的一些基本的内容, 比如扫描的包等等
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                // 为当前包路径
                .apis(RequestHandlerSelectors.basePackage("cn.huangxulin.cloud.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    // 构建 Api 文档的详细信息函数, 注意这里的注解引用的是哪个
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                // 页面标题
                .title("图书微服务 REST API 测试")
                // 创建人
                .contact(new Contact("HuangXuLin", "https://huangxulin.cn/", null))
                // 版本号
                .version("1.0")
                // 描述
                .description("API 描述")
                .build();
    }
}
