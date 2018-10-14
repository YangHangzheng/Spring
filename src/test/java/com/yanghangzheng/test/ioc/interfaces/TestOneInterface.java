package com.yanghangzheng.test.ioc.interfaces;

import com.yanghangzheng.ioc.interfaces.OneInterface;
import com.yanghangzheng.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestOneInterface extends UnitTestBase {
    public TestOneInterface() {
        super("classpath*:spring-ioc.xml");
    }

    @Test
    public void testHello() {
        OneInterface oneInterface = super.getBean("oneInterface");
        System.out.println(oneInterface.hello("我的输入参数"));
    }
}
