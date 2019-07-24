package com.course.code;

import org.testng.annotations.Test;

/**
 * @program: AutoTestPractice
 * @description: 依赖测试类
 * @author: 吴泽恩
 * @create: 2019-07-24 09:28
 **/
public class DependTest {

    @Test
    public void test1(){
        System.out.println("依赖测试test 1 run");
        throw new RuntimeException();
    }
    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("依赖测试test 2 run");
    }
    @Test(expectedExceptions = RuntimeException.class)
    public void test3(){
        System.out.println("依赖测试test 3 run");
        throw new RuntimeException();
    }
    @Test(dependsOnMethods = {"test3"})
    public void test4(){
        System.out.println("依赖测试test 4 run");
    }
}
