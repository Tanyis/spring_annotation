package com.atguigu.config;

import com.atguigu.bean.Car;
import com.atguigu.bean.Cat;
import com.atguigu.bean.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@ComponentScan("com.atguigu.bean")
@Configuration
public class MainConfigOfLifeCylce {

    @Scope("prototype")
    @Bean(initMethod = "init",destroyMethod = "destroy")
    public Car Car(){
        return  new Car();
    }

    public Dog Dog(){
        return  new Dog();
    }

    public Cat Cat(){
        return  new Cat();
    }
}
