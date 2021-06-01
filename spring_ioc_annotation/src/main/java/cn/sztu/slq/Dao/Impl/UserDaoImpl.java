package cn.sztu.slq.Dao.Impl;

import cn.sztu.slq.Beans.Role;
import cn.sztu.slq.Dao.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

/**
 * @author qingqing
 * @function:
 * @create 2021-01-11-22:05
 */
@Repository   //不能写到接口中
/**
 *  1.使用Value注解设置依赖注入的值
 *  2.Value中可以直接放值、&{注入外部属性资源文件的值}、#{写spel值}
* */
public class UserDaoImpl implements UserDao {

    public void getDao() {
        System.out.println("试试换个名字行吗？可以");
    }
}
