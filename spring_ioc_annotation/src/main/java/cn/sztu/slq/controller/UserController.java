package cn.sztu.slq.controller;

import cn.sztu.slq.Beans.User;
import cn.sztu.slq.service.BaseService;
import cn.sztu.slq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author qingqing
 * @function:
 * @create 2021-01-11-22:02
 */
@Service
public class UserController {
    /*
    *autowire="byType"  自动注入
	bytype？ byname？
	默认优先根据类型匹配
	再根据名字匹配
	如果名字、类型都不匹配：属性名：userSerivice，类名：UserSeriviceImpl
		1.修改属性名字对应bean名字
		2.修改bean的名字对应属性名字
		3.通过@Qualifier设置属性名字（覆盖，不是起别名）：@Qualifier（“userServiceImpl”）
		4.通过@Primary 设置其中一个Bean为主要注入Bean：@Primary
        5.使用泛型作为自动注入限定符
    * */

    @Autowired
    @Qualifier("userServiceImpl")
    UserService userService;

    public void getUser(){
        userService.getBean();
    }

}
