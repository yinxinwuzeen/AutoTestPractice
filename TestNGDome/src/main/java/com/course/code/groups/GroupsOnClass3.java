package com.course.code.groups;

import org.testng.annotations.Test;

/**
 * @program: AutoTestPractice
 * @description: 组测试中的类分组测试类3
 * @author: 吴泽恩
 * @create: 2019-07-23 10:21
 **/
@Test(groups = "teacher")
public class GroupsOnClass3 {
    public void teacher1(){
        System.out.println("GroupsOnClass3中的teacher1运行测试");
    }
    public void teacher2(){
        System.out.println("GroupsOnClass3中的teacher2运行测试");
    }
}
