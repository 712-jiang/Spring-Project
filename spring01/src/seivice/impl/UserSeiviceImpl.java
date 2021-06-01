package seivice.impl;

import dao.IUserDao;
import seivice.IUserSeivice;

/**
 * @author qingqing
 * @function:
 * @create 2020-12-24-23:10
 */
public class UserSeiviceImpl implements IUserSeivice {

    public IUserDao getDao() {
        return dao;
    }

    public void setDao(IUserDao dao) {
        this.dao = dao;
    }

    IUserDao dao;

    @Override
    public void getUser() {
        dao.getUser();
    }
}
