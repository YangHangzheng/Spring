package com.yanghangzheng.ioc.injection.service;

import com.yanghangzheng.ioc.injection.dao.InjectionDAO;

public class InjectionServiceImpl implements InjectionService {

    private InjectionDAO injectionDAO;

    public InjectionServiceImpl(InjectionDAO injectionDAO) {
        this.injectionDAO = injectionDAO;
    }

    //设值注入
    public void setInjectionDAO(InjectionDAO injectionDAO) {
        this.injectionDAO = injectionDAO;
    }

    //模拟业务操作
    public void save(String arg) {
        System.out.println("Service接收参数:" + arg);
        arg = arg + ":" + this.hashCode();
        injectionDAO.save(arg);
    }

}
