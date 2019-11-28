package com.example.webdemo.mvc;

import com.example.webdemo.vo.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;

/**
 * author:Zuo Junhao
 * NEFU
 */
@Controller
@SessionAttributes(names = "myBook")
public class TestHandler {
    @RequestMapping("/show")
    public String showInfo(Map<String,Object> map){
        map.put("name","zjh");
        map.put("age","25");
        map.put("sex","male");
        map.put("hobby", Arrays.asList("play","fuck"));
        map.put("book",new Book("123","Thinking in Java",100,new Date()));
        map.put("myBook",new Book("123","Hadoop权威指南",100,new Date()));
        return "show";
    }
}
