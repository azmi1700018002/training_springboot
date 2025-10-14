package com.app.inventory.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {
    
    //buat bean 
    @Bean
    public String appPesan(){
        return "Aplikasi Springboot Depedensi";
    }

    @Bean
    @Primary
    public String appPesanUtama(){
        return "Aplikasi Springboot Utama";
    }
}
