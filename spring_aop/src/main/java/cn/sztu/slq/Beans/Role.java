package cn.sztu.slq.Beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author qingqing
 * @function:
 * @create 2021-01-12-17:36
 */
@Component
@DependsOn("user")  //控制user先加载

//@Lazy  //不用不加载
//作用域，默认单例：@Scope（“singleton”） prototype

public class Role {
    @Value("勤劳的贪吃青")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role(){
//        System.out.println("Role加载！");
    }

    @PostConstruct   //注解初始化
    public void init(){
//        System.out.println("初始化");
    }

    @PreDestroy
    public void destory(){
        System.out.println("销毁");
    }
}
