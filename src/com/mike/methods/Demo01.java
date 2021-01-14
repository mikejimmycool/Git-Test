package com.mike.methods;

public class Demo01 {
    public static void main(String[] args) {
        //实际参数 用来调用传递给他的参数
        int sum = add(19,2);
        System.out.println(sum);

    }

    //加法方法
    //形式参数，用来定义
    public static int add(int a,int b){
        return a+b;

    }
}
