package com.example.demo;


import com.example.demo.aspect.Dao;
import com.example.demo.aspect.TestDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        Dao dao = (Dao) context.getBean("testDao");
        Dao dao1 = (Dao) context.getBean("testDao");
        dao.query();
        dao1.query();
    }

}
