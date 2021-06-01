package dao.impl;

import dao.IUserDao;

/**
 * @author qingqing
 * @function:
 * @create 2020-12-24-23:16
 */
public class UserDaoMysqlImpl implements IUserDao {


    @Override
    public void getUser() {
//查询
        System.out.println("查询mysql数据库");
    }
}
