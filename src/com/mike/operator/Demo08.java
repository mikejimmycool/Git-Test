package com.mike.operator;
//导入包下所有的类
import com.mike.base.*;

//三元运算符
public class Demo08 {
    public static void main(String[] args) {
        //x ? y :z
        //如果x==true，则结果为y，否则结果为z

        int score = 32;
        String type = score <60 ?"不及格":"及格";//必须掌握这个条件运算符
        System.out.println(type);


    }
}
