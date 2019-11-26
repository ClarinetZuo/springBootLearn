package cn.edu.nefu.zjh.boot_demo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * author:Zuo Junhao
 * NEFU
 */
@Controller
public class HelloHandler {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello world";
    }
}
