package com.springboot.laptop.config;


import com.springboot.laptop.repository.LaptopRepo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = {"com.springboot.laptop.repository","com.springboot.laptop.service"})
@Configuration
public class MyConfig {


}