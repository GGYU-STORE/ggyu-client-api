package com.ggyu.clientapp.global.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan({"com.ggyu.base", "com.ggyu.clientapp"})
@EntityScan("com.ggyu.base")
@EnableJpaRepositories(basePackages = "com.ggyu.base")
public class AppConfig {
}
