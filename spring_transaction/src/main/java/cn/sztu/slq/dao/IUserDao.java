package cn.sztu.slq.dao;

import cn.sztu.slq.entity.User;
import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author qingqing
 * @function:
 * @create 2021-01-20-17:04
 */
public interface IUserDao {

    User getUser();

    void sub();

    void save();
}
