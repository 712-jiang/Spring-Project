package cn.sztu.slq;

import cn.sztu.slq.Beans.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author qingqing
 * @function:
 * @create 2021-01-14-21:27
 */
@ComponentScan
public class SecondJavaConfig {
    @Bean
    public User user2(){
        return new User();
    }
}
