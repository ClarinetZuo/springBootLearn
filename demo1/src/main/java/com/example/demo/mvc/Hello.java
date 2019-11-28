package com.example.demo.mvc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author:Zuo Junhao
 * NEFU
 */
@RestController
public class Hello {

    @GetMapping("/")
    public String hello(){
        return "hello SpringBoot";
    }
}
