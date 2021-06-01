package seivice.impl;

import dao.IUserDao;
import seivice.IUserSeivice;

/**
 * @author qingqing
 * @function:
 * @create 2021-01-09-17:50
 */
public class UserTempServiceImpl implements IUserSeivice {
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
