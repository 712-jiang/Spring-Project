package cn.sztu.slq.tests;

import cn.sztu.slq.Beans.Role;
import cn.sztu.slq.Beans.User;
import cn.sztu.slq.Dao.Impl.UserDaoImpl;
import cn.sztu.slq.Dao.UserDao;
import cn.sztu.slq.controller.UserController;
import cn.sztu.slq.service.Impl.RoleServiceImpl;
import cn.sztu.slq.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author qingqing
 * @function:
 * @create 2021-01-11-22:11
 */
public class IocTest {
    ClassPathXmlApplicationContext classPathXmlApplicationContext;
    @Before
    public void before(){
        classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring_ioc.xml");
    }

    @Test
    public void test01(){
        UserController userController = classPathXmlApplicationContext.getBean(UserController.class);//getBean中用Interface接口
        System.out.println(userController);
    }

    @Test
    public void test02(){
        User bean = classPathXmlApplicationContext.getBean(User.class);//getBean中用Interface接口
        Role role = classPathXmlApplicationContext.getBean(Role.class);//getBean中用Interface接口
        System.out.println(bean);
        System.out.println(role.getName());
    }
/*
* Autowire 自动注入
* */
    @Test
    public void test03(){
        UserController bean = classPathXmlApplicationContext.getBean(UserController.class);//getBean中用Interface接口
        bean.getUser();
    }

    /*
     * @DependsOn("user")控制Bean加载顺序
     * */
    @Test
    public void test04(){

    }

    /*
     * 注解实现声明周期
     * */
    @Test
    public void test05(){
        Role bean = classPathXmlApplicationContext.getBean(Role.class);
        classPathXmlApplicationContext.close();
    }

    /*
     * instanceof判断前面的对象属于这个类？子类？接口？
     * */
    @Test
    public void test06(){
        RoleServiceImpl roleService = new RoleServiceImpl();
        if (roleService instanceof UserService)
            System.out.println("OK");

    }

}
