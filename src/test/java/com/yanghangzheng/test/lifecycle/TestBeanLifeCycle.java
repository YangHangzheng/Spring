package com.yanghangzheng.test.lifecycle;

import com.yanghangzheng.lifecycle.BeanLifeCycle;
import com.yanghangzheng.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * @author yanghangzheng
 * @date 2018/10/15 下午8:26
 */

@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanLifeCycle extends UnitTestBase {

    public TestBeanLifeCycle() {
        super("classpath*:springlifecycle.xml");
    }

    @Test
    public void test1() {
        BeanLifeCycle beanLifeCycle = super.getBean("beanLifeCycle");
    }

}
