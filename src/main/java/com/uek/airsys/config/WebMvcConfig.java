package com.uek.airsys.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * 解决跨域配置
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurationSupport {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")   //允许跨域访问的路径
                .allowedOrigins("*")  //允许跨域访问
                .allowedMethods("POST", "GET", "OPTIONS", "DElETE")
                .maxAge(168000)   //预计间隔时间
                .allowCredentials(true);  //是否发送cookie
        super.addCorsMappings(registry);
    }

    /**
     * 解决跨域问题覆盖默认的springMVC配置，会导致swagger2框架的页面找不到
     * 故而需要加入该配置解决路径访问问题
     *
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");

        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");

        registry.addResourceHandler("/assets/**")
                .addResourceLocations("classpath:/static/assets/");
        super.addResourceHandlers(registry);
    }

}
