package com.course.code;

import org.testng.annotations.Test;

/**
 * @program: AutoTestPractice
 * @description: 忽略测试类
 * @author: 吴泽恩
 * @create: 2019-07-23 01:08
 **/
public class IgnoreTest {
    @Test
    public void ignoreTest1(){
        System.out.println("这是IgnoreTest 1");
    }
    @Test(enabled = false)
    public void ignoreTest2(){
        System.out.println("这是ignoreTest 2");
    }
    @Test(enabled = true)
    public void ignoreTest3(){
        System.out.println("这是ignoreTest 3");
    }
}
