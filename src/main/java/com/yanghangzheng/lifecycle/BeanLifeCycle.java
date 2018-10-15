package com.yanghangzheng.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author yanghangzheng
 * @date 2018/10/15 下午8:24
 */
public class BeanLifeCycle { //implements InitializingBean, DisposableBean {
//    public void start() {
//        System.out.println("Bean start.");
//    }
//
//    public void stop() {
//        System.out.println("Bean stop.");
//    }


////    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("Bean afterPropertiesSet");
//    }
//
////    @Override
//    public void destroy() throws Exception {
//        System.out.println("Bean Destory");
//    }
    public void defaultInit() {
        System.out.println("default init");
    }

    public void defaultDest() {
        System.out.println("default destroy");
    }
}
