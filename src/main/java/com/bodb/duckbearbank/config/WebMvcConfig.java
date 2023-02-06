package com.bodb.duckbearbank.config;

import com.bodb.duckbearbank.CorsInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author perye
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    private final CorsInterceptor corsInterceptor;

    public WebMvcConfig(CorsInterceptor corsInterceptor) {
        this.corsInterceptor = corsInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 添加跨域拦截器
        registry.addInterceptor(corsInterceptor)
                .addPathPatterns("/**");
    }

}
