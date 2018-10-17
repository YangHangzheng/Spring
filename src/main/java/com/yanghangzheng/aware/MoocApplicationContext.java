package com.yanghangzheng.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author yanghangzheng
 * @date 2018/10/17 下午8:30
 */
public class MoocApplicationContext implements ApplicationContextAware {
    public void setApplicationContext(ApplicationContext applicationContext)
        throws BeansException {
        System.out.println("MoocApplicationContext:" + applicationContext.getBean("moocApplicationContext").hashCode());
    }
}
