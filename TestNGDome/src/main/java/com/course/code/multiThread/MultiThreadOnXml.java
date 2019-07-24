package com.course.code.multiThread;

import org.testng.annotations.Test;



/**
 * @program: AutoTestPractice
 * @description: 多线程xml文件实现类
 * @author: 吴泽恩
 * @create: 2019-07-24 18:46
 **/
public class MultiThreadOnXml {

    @Test
    public void multiThreadtest1(){
        System.out.printf("Thread Id: %s%n", Thread.currentThread().getId());
    }
    @Test
    public void multiThreadtest2(){
        System.out.printf("Thread Id: %s%n", Thread.currentThread().getId());
    }
    @Test
    public void multiThreadtest3(){
        System.out.printf("Thread Id: %s%n", Thread.currentThread().getId());
    }
}
