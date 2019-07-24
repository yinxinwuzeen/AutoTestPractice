package com.course.code.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


/**
 * @program: AutoTestPractice
 * @description: 数据提供者类测试
 * @author: 吴泽恩
 * @create: 2019-07-24 10:44
 **/
public class DataProviderTest {
    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age){
        System.out.println("\t"+"name:"+ name+"\t"+"age:"+age);
    }

    @DataProvider(name= "data")
    public Object[][] test1(){
        Object [][] obj = new Object[][]{
                {"吴泽恩",23},
                {"张媚",21},
                {"张雄",16}
        };
        return obj;
    }
}
