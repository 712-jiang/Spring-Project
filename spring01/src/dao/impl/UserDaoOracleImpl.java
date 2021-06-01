package dao.impl;

import dao.IUserDao;

/**
 * @author qingqing
 * @function:
 * @create 2021-01-09-16:35
 */
public class UserDaoOracleImpl implements IUserDao {
    @Override
    public void getUser() {
        System.out.println("查询oracle");
    }
}
