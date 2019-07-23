package com.course.code.exception;

import org.testng.annotations.Test;

/**
 * @program: AutoTestPractice
 * @description: 异常测试类
 * @author: 吴泽恩
 * @create: 2019-07-23 10:56
 **/
public class ExpectedException {

    @Test(expectedExceptions = RuntimeException.class)
    public void runtimeExceptionFailed(){
        System.out.println("这是一个失败的运行时异常测试");
    }
    @Test(expectedExceptions = RuntimeException.class)
    public void runtimeExceptionSuccess(){
        System.out.println("这是一个成功的运行时异常测试");
        throw new RuntimeException();
    }
}
