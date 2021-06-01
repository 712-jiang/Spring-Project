package cn.sztu.slq.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author qingqing
 * @function:
 * @create 2021-01-12-17:40
 */

@Component
public class User {
    @Value("#{role.name}")   //role, not Role!
    private String name;

    @Autowired
    private Role role;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(){
//        System.out.println("User加载");
    }
}


