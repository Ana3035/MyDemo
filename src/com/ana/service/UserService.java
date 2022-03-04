package com.ana.service;

import com.ana.bean.User;
import com.ana.utils.BusinessException;

public interface UserService {
    //注册功能
    public User register(User user) throws BusinessException;

}
