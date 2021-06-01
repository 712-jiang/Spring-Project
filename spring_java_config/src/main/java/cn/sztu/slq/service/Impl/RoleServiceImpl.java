package cn.sztu.slq.service.Impl;

import cn.sztu.slq.Dao.UserDao;
import cn.sztu.slq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author qingqing
 * @function:
 * @create 2021-01-12-20:56
 */
/*
* 在UserControlerImpl中，由UserService匹配出所有implements该接口的类：RoleServiceImpl. UserServiceImpl
* */
@Service
public class RoleServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    public void getBean() {
        userDao.getDao();
        System.out.println("Role");

    }

}
