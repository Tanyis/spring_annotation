package com.atguigu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.atguigu.service","com.atguigu.dao",
        "com.atguigu.controller","com.atguigu.bean"})
public class MainConfigOfAutowired {
}
