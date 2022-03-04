package com.ana.ui;

import com.ana.bean.User;
import com.ana.service.UserService;
import com.ana.service.impl.UserServiceImpl;
import com.ana.utils.BusinessException;

public class RegisterClass extends BaseClasee{
    public void register() throws BusinessException {
        //可能出现注册失败,因此需要自己书写一个异常信号
        println(getString("input.username"));
        String username=input.nextLine();
        println(getString("input.pwd"));
        String pwd=input.nextLine();
        User user=new User(username,pwd);
        UserService userService=new UserServiceImpl();
        userService.register(user);

    }
}
