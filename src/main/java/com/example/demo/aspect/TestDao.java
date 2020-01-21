package com.example.demo.aspect;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("testDao")
@Scope("prototype")
public class TestDao implements Dao {

    @Override
    public void query() {
       // System.out.println(this.hashCode());
        System.out.println("query");
    }
}
