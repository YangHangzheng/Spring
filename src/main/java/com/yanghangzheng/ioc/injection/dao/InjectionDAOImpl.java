package com.yanghangzheng.ioc.injection.dao;

public class InjectionDAOImpl implements InjectionDAO {

    //模拟数据库保存操作
    public void save(String args) {
        System.out.println("保存数据:" + args);
    }

}
