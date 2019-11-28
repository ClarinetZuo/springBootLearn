package cn.edu.nefu.zjh.boot_demo;

import cn.edu.nefu.zjh.boot_demo.vo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class BootDemoApplicationTests {
    @Autowired
    Person person;

    @Test
    void contextLoads() {
        System.out.println("测试开始");
        System.out.println(person);
    }

}
