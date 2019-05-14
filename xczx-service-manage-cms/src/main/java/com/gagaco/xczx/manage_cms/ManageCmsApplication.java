package com.gagaco.xczx.manage_cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 */
@SpringBootApplication
//@ComponentScan(basePackages={"com.gagaco.xczx.manage_cms"})
@EntityScan({"com.gagaco.xczx.fw.domain.cms"})//扫描实体类
@ComponentScan(basePackages={"com.gagaco.xczx.api"})//扫描接口
public class ManageCmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManageCmsApplication.class, args);
    }
}
