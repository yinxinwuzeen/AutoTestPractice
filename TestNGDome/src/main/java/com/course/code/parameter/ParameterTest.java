package com.course.code.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @program: AutoTestPractice
 * @description: 参数测试类
 * @author: 吴泽恩
 * @create: 2019-07-24 10:25
 **/
public class ParameterTest {
    @Test
    @Parameters({"name","age"})
    public void paramTest1(String name,int age){
        System.out.println("\t");
        System.out.println("name:"+ name + "\n" +"age:" + age);
    }
}
