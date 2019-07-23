package com.course.code;

import org.testng.annotations.*;

/**
 * @program: AutoTestPractice
 * @description: 基本注解类
 * @author: 吴泽恩
 * @create: 2019-07-22 18:30
 **/
public class BasciAnnotation {
    //最基本的注解
    @Test
    public void testCase1(){
        System.out.println("这是测试用例1");
    }
    @Test
    public void testCase2(){
        System.out.println("这是测试用例2");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod这是在测试方法之前运行的");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod这是在测试方法之后运行的");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass这是在类运行之前运行的方法");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass这是在类运行之后运行的方法");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite测试套件");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite测试套件");
    }

}
