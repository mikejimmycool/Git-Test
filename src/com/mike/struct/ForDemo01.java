package com.mike.struct;

public class ForDemo01 {
    public static void main(String[] args) {
        int a = 1;//初始化条件
        while (a<=100){//判断条件
            System.out.println(a);//循环体
            a+=2;//迭代 a=a+2

        }
        System.out.println("While循环结束！");

        System.out.println("===========================================");



        for (int i=1;i<=100;i++){
            System.out.println(i);
        }
        System.out.println("For循环结束!");



    }
}
