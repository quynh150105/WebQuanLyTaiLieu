package com.ptdacntt.WebQuanLyTaiLieu.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Web Quản Lý Tài Liệu API")
                        .version("1.0.0")
                        .description("Tài liệu mô tả API cho hệ thống Web Quản Lý Tài Liệu.")
                        .license(new License()
                                .name("API License")
                                .url("https://domain.vn/license")))
                .servers(List.of(
                        new Server()
                                .url("http://localhost:8080")
                                .description("Local Development Server"),
                        new Server()
                                .url("https://api.domain.vn")
                                .description("Production Server")
                ));
    }

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("web-quan-ly-tai-lieu") // tên nhóm hiển thị trong Swagger UI
                .packagesToScan("com.ptdacntt.WebQuanLyTaiLieu.controller") // package chứa các controller
                .build();
    }
}
