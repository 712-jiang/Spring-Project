package cn.sztu.slq.tests;

import cn.sztu.slq.Beans.Job;
import cn.sztu.slq.Beans.MyImportSelector;
import cn.sztu.slq.Beans.Travel;
import cn.sztu.slq.Beans.User;
import cn.sztu.slq.IocJavaConfig;
import cn.sztu.slq.controller.UserController;
import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Proxy;

/**
 * @author qingqing
 * @function:
 * @create 2021-01-14-17:25
 */
public class IocTest {
    AnnotationConfigApplicationContext annotationConfigApplicationContext;
    @Before
    public void before(){
        annotationConfigApplicationContext = new AnnotationConfigApplicationContext(IocJavaConfig.class);
    }

    /*
    * 测试JavaConfig是否创建Bean
    * */
    @Test  //不要忘记！
    public void test01(){
        UserController bean = annotationConfigApplicationContext.getBean(UserController.class);
        System.out.println(bean);

    }

    /*
     * 测试导入第三方Bean并注入数据
     * */
    @Test  //不要忘记！
    public void test02(){
        DruidDataSource bean = annotationConfigApplicationContext.getBean(DruidDataSource.class);
        System.out.println(bean);

    }

    /*
     * import其他javaconfig文件
     * */
    @Test  //不要忘记！
    public void test03(){
        User bean = (User) annotationConfigApplicationContext.getBean("user2");
        DruidDataSource bean2 = (DruidDataSource) annotationConfigApplicationContext.getBean("dataSource");
        System.out.println(bean2.getName());
    }

    /*
     * @import - ImportSelector
     * */
    @Test  
    public void test04(){
        Job bean = annotationConfigApplicationContext.getBean(Job.class);
        System.out.println(bean.getName());
    }

    /*
     * @import - ImportBeanDefinitionRegistrar
     * */
    @Test
    public void test05(){
        Travel travel = annotationConfigApplicationContext.getBean(Travel.class);
        System.out.println(travel.getName());
    }

}


