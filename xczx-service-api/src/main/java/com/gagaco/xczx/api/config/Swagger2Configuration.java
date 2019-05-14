package com.gagaco.xczx.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author wjj
 * Swagger2的配置类
 * @date 2019-5-11 22:48:04
 */
/*
技术点介绍：
@Configuration Spring的注解，表示这个类是一个配置类，会被扫描到，然后根据他创建bean
@EnableSwagger2 xxx的注解，表示在项目中打开Swagger功能
*/
@Configuration
@EnableSwagger2
public class Swagger2Configuration {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.gagaco.xczx"))
                .paths(PathSelectors.any())
                .build();

    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("学成在线api文档")
                .description("description 学成在线api文档")
                .version("2019.5.11")
                .build();
    }


}
