package cn.sztu.slq.service;

/**
 * @author qingqing
 * @function:
 * @create 2021-01-11-22:03
 */
//public interface UserService {
//
//    void getService();
//}

public interface BaseService<T> {

    T getBean();
}