package cn.sztu.slq.service.Impl;

import cn.sztu.slq.dao.Impl.UserDaoImpl;
import cn.sztu.slq.entity.User;
import cn.sztu.slq.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author qingqing
 * @function:
 * @create 2021-01-20-16:53
 */
@Service
/**
 * 业务逻辑层
 */
//@Transactional
public class UserServiceImpl implements IUserService {
    @Autowired
    UserDaoImpl userDao;

    @Override
    /*这里的getUser和Dao、User中的getUser只是名字相同而已，
    所有getUser()方法为了将数据从底层数据库一层层取出来*/
//    @Transactional
    public User getUser(){
        return userDao.getUser();
    }
    @Transactional
    public void trans(){
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            System.out.println("timeout!");
//            e.printStackTrace();
//
//        }
        System.out.println("张三");
        sub();
        save();
    }

    public void sub(){
        userDao.sub();
    }

    public void save(){
        userDao.save();
    }
}
