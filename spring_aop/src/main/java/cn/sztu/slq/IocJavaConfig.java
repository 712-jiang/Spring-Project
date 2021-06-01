package cn.sztu.slq;

import cn.sztu.slq.Beans.MyImportBeanDefinitionRegistrar;
import cn.sztu.slq.Beans.MyImportSelector;
import cn.sztu.slq.Beans.User;
import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import sun.management.Sensor;

/**
 * @author qingqing
 * @function:
 * @create 2021-01-14-17:30
 */
@Configuration   //用于标记一个spring配置类，spring扫描到它就知道是JavaConfig类
@ComponentScan(basePackages = "cn.sztu.slq")
@PropertySource("classpath:data.properties")
@Import({MyImportBeanDefinitionRegistrar.class})//导入另一个javaconfig

public class IocJavaConfig {
    @Value("${mysql.name}")
    private String name;
    @Value("${mysql.password}")
    private String password;
    @Value("${mysql.url}")
    private String Url;
    @Value("${mysql.driverClassName}")
    private String DriverClassName;

    @Bean(name = {"dataSource","dd"})   //重命名和别名
    public DruidDataSource dataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setName(user3().getName());
        druidDataSource.setPassword(password);
        druidDataSource.setUrl(Url);
        druidDataSource.setDriverClassName(DriverClassName);
        System.out.println(user3().getName());
        return druidDataSource;
    }
    public User user3(){
        return new User();
    }

}
