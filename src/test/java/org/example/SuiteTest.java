package org.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({CalculateTest.class})
public class SuiteTest {
    /*
     * 进行集成测试的方法
     * 写一个空类：不包含任何方法
     * 更改测试运行器Suite.class
     * 将测试类作为数组传入到Suite.SuiteClasses（{}）中
     */
}
