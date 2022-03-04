package com.ana.ui;

import com.ana.bean.User;

import java.util.ResourceBundle;
import java.util.Scanner;

public abstract class BaseClasee {
    //表示一个公共的in
    protected static Scanner input=new Scanner(System.in);
    //创建一个当前用户对象
    protected static User currUser;
    private static ResourceBundle r=ResourceBundle.getBundle("com.ana.res.r_temp");
    //创建一个方法根据key获取内容
    public static String getString(String key){
        return r.getString(key);
    }
    //输出
    public static void println(String s){
        System.out.println(s);
    }
    public static void print(String s){
        System.out.println(s);
    }
}
