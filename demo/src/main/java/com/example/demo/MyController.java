package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MyController {

    @RequestMapping("/product")
    public Store product() {
        Store store = new Store();
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Orange");
        store.setProductList(list);
        return store;
    }

    @RequestMapping("/user")
    public Student user() {
        Student student = new Student();
        student.setName("Sunny");
        return student;
    }
}
