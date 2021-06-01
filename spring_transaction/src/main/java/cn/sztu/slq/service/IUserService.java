package cn.sztu.slq.service;

import cn.sztu.slq.entity.User;

/**
 * @author qingqing
 * @function:
 * @create 2021-01-20-16:52
 */
public interface IUserService {

    User getUser();

    void trans();
}
