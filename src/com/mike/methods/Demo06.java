package com.mike.methods;

public class Demo06 {
    //阶乘
    //2! 2*1
    //3! 3*2*1
    //5! 5*4*3*2*1
    //递归    用于小算法    调用次数多会影响性能
    public static void main(String[] args) {
        System.out.println(f(50));

    }
    public static long f(long n){
        if (n==1){
            return 1;
        }else {
            return n*f(n-1);
        }
    }
}
