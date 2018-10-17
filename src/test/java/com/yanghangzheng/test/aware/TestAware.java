package com.yanghangzheng.test.aware;

import com.yanghangzheng.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * @author yanghangzheng
 * @date 2018/10/17 下午8:29
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestAware extends UnitTestBase {

    public TestAware() {
        super("classpath:spring-aware.xml");
    }

    @Test
    public void testMoocApplicationContext() {
        System.out.println("MoocApplicationContext:" + super.getBean("moocApplicationContext").hashCode());
    }
}
