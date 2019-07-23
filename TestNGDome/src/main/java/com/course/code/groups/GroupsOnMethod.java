package com.course.code.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 * @program: AutoTestPractice
 * @description: 分组测试类
 * @author: 吴泽恩
 * @create: 2019-07-23 01:15
 **/
public class GroupsOnMethod {
    @Test(groups="server")
    public void groupTest1(){
        System.out.println("服务端组的测试 1");
    }
    @Test(groups="server")
    public void groupTest2(){
        System.out.println("服务端组的测试 2");
    }

    @Test(groups="client")
    public void groupTest3(){
        System.out.println("客户端组的测试 1");
    }
    @Test(groups="client")
    public void groupTest4(){
        System.out.println("客户端组的测试 2");
    }
    @BeforeGroups("server")
    public void beforeGroupOnServer(){
        System.out.println("BeforeGroupOnServer");
    }
    @AfterGroups("server")
    public void afterGroupOnServer(){
        System.out.println("AfterGroupOnServer");
    }
    @BeforeGroups("client")
    public void beforeGroupOnClient(){
        System.out.println("BeforeGroupOnClient");
    }
    @AfterGroups("client")
    public void afterGroupOnClient(){
        System.out.println("AfterGroupOnClient");
    }
}
