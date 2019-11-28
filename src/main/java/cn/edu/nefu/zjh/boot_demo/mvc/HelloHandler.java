package cn.edu.nefu.zjh.boot_demo.mvc;

import cn.edu.nefu.zjh.boot_demo.config.JavaConfig;
import cn.edu.nefu.zjh.boot_demo.service.UserService;
import cn.edu.nefu.zjh.boot_demo.vo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * author:Zuo Junhao
 * NEFU
 */
@Controller
public class HelloHandler {
    @Autowired
    Person p;

    @Autowired
    UserService userService;
    @RequestMapping("/login")
    @ResponseBody
    public String login(String userName,String password){
        System.out.println(p);
        System.out.println(userName+"-------"+password);
        userService.login(userName,password);
        return "hello world";
    }
}
