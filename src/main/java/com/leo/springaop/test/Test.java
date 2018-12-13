package com.leo.springaop.test;

import com.leo.springaop.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        ProductService productService = (ProductService) context.getBean("productService");
        System.out.println(productService.multiply(4, 5));
    }
}
