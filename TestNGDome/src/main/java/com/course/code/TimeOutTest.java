package com.course.code;

import org.testng.annotations.Test;

/**
 * @program: AutoTestPractice
 * @description: 超时测试类
 * @author: 吴泽恩
 * @create: 2019-07-24 22:48
 **/
public class TimeOutTest {

    @Test(timeOut = 3000)
    public void testSuccess()throws InterruptedException{
        Thread.sleep(2000);
//        System.out.println("");
    }
    @Test(timeOut = 3000)
    public void testFailed()throws InterruptedException{
        Thread.sleep(5000);
//        System.out.println("");
    }
}
