package com.ana.utils;

import com.ana.bean.User;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class UserIO {
    private static List<User> users=new ArrayList<>();
    private static final String USER_FILE="user.obj";

    //创建写入以及读取的方法
    //写入用户列表
    public boolean writeUsers(){
        try {
            ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(USER_FILE));
            out.writeObject(users);
            out.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
