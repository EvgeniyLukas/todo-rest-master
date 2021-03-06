package com.example.backendsprinboot;

import java.util.Arrays;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class BackendSprinbootApplication {

  public static void main(String[] args) {
    SpringApplication.run(BackendSprinbootApplication.class, args);

  }

//  @Bean
//  public WebMvcConfigurer corsConfigurer() {
//    return new WebMvcConfigurerAdapter() {
//      @Override
//      public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/api/**")
//            .allowedOrigins("http://localhost:4200")
//            .allowedMethods("GET, PUT, POST, DELETE")
//            .allowedHeaders("Content-Type", "X-Requested-With", "accept", "Origin",
//                "Access-Control-Request-Method",
//                "Access-Control-Request-Headers")
//            .exposedHeaders("Access-Control-Allow-Origin", "Access-Control-Allow-Credentials")
//            .allowCredentials(false).maxAge(3600);
//      }
//    };
//  }

}
