package com.ict.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class SampleController {
    @GetMapping("/hello")
    public String [] hello(){
        return new String [] {"Hello", "World"};
    }

    @GetMapping("/num")
    public Integer[] num(){
        return new Integer[]{1, 2, 3, 5};
    }
}
