package com.example.demo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class HpPrinter implements Printer, InitializingBean {

    private int count;

    @Override
    public void afterPropertiesSet() throws Exception {
        count = 5;
    }

    @Override
    public void print(String message) {
        count--;
        System.out.println("HP printer: " + message);
        System.out.println("Remaining usage: " + count);
    }
}
