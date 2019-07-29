package com.atguigu.test;

import com.atguigu.config.MainConfigOfLifeCylce;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigLifeCylce_Test {

    @Test
    public  void Test01(){

        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(MainConfigOfLifeCylce.class);

        System.out.println("容器创立成功");

       // applicationContext.close();

    }

    @Test
    public void Test02(){
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MainConfigOfLifeCylce.class);

        System.out.println("dog容器成立成功");

    }
}
