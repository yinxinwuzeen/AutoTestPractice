package com.course.code.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * @program: AutoTestPractice
 * @description: 套件配置类
 * @author: 吴泽恩
 * @create: 2019-07-22 22:47
 **/
public class SuiteConfig {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before suite 运行了~~");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("after suite 运行了~~");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("BeforeTest");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("AfterTest");
    }

}
