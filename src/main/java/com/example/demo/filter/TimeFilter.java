package com.example.demo.filter;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.util.Date;

@Component
public class TimeFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        long start = new Date().getTime();
        System.out.println("time filter start");
        chain.doFilter(request, response);
        System.out.println("time filter 耗时："+(new Date().getTime()-start));
        System.out.println("time filter finish");
    }
}
