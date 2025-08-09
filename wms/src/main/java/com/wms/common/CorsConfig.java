package com.wms.common;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class CorsConfig implements WebMvcConfigurer {

    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") //对应用程序的所有接口都应用此CORS配置，允许跨域请求访问
                .allowedOriginPatterns("*") // 允许所有来源，生产环境应指定具体域名
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")//允许跨域请求的HTTP方法类型
                .allowedHeaders("*")//允许所有请求头字段通过跨域请求,不对请求头进行限制,任何请求头都可以在跨域请求中使用
                .allowCredentials(true)//允许跨域请求中携带身份凭证信息，如Cookie、HTTP认证信息等
                .maxAge(3600);
    }
}
