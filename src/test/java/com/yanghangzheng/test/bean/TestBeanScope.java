package com.yanghangzheng.test.bean;

import com.yanghangzheng.bean.BeanScope;
import com.yanghangzheng.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanScope extends UnitTestBase {

    public TestBeanScope() {
        super("classpath*:spring-beanscope.xml");
    }

    @Test
    public void testSay() {
        BeanScope beanScope = super.getBean("beanScope");
        beanScope.say();
    }
}
