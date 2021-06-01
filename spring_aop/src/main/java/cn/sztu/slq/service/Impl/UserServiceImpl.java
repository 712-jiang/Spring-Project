package cn.sztu.slq.service.Impl;

import cn.sztu.slq.Dao.UserDao;
import cn.sztu.slq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author qingqing
 * @function:
 * @create 2021-01-11-22:04
 */
@Service
@Primary
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    public void getBean() {

        userDao.getDao();
        System.out.println("User");
    }

}
