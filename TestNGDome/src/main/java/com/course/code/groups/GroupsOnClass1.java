package com.course.code.groups;

import org.testng.annotations.Test;

/**
 * @program: AutoTestPractice
 * @description: 组测试中的类分组测试类1
 * @author: 吴泽恩
 * @create: 2019-07-23 10:20
 **/
@Test(groups = "student")
public class GroupsOnClass1 {
    public void stu1(){
        System.out.println("GroupsOnClass1中的stu1运行测试");
    }
    public void stu2(){
        System.out.println("GroupsOnClass1中的stu2运行测试");
    }
}
