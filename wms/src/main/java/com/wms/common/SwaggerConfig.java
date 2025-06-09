package com.wms.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author xiehang
 * @date 2025/6/9 13:22
 */
@Configuration
@EnableOpenApi
public class SwaggerConfig {
    @Bean
    public Docket createRestAPi() {
        return new Docket(DocumentationType.OAS_30)//使用 DocumentationType.OAS_30 指定生成 OpenAPI 3.0 格式的文档；
                .apiInfo(apiInfo())//通过 .apiInfo(apiInfo()) 设置 API 文档的基本信息（如标题、描述、版本）
                .select()//构建 API 选择规则
                // 指定扫描的包,为当前包路径下所有API生成文档,
                .apis(RequestHandlerSelectors.basePackage("com.wms.controller"))
                .paths(PathSelectors.any())//对所有路径的接口都生成文档
                .build();//调用 .build() 完成构建

    }

    /**
     * 构建api文档
     *
     * @return
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("WMS系统接口文档")
                .description("WMS系统接口文档")
                .version("1.0")
                .build();
    }
}
