package cn.edu.nefu.zjh.boot_demo.config;

import cn.edu.nefu.zjh.boot_demo.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * author:Zuo Junhao
 * NEFU
 */
@Configuration
public class JavaConfig {

    // 由容器来创建对象
    @Bean
    public UserService getUserService(){
        return new UserService();
    }
}
