package com.mike.operator;

public class Demo04 {
    public static void main(String[] args) {
        // ++自增，--自减
        int a = 3;
        int b = a++;//执行完这行代码后，先给b赋值，再自增
        //a = a+1；
        System.out.println(a);
        System.out.println(b);
        int c = ++a;//执行完这行代码前，先自增，再给b赋值
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


        //幂运算  2^3 很多运算，我们会使用工具类进行操作！
        //double pow = Math.pow(2,3);
        double pow1 = Math.pow(2, 3);
        double pow = pow1;
        System.out.println(pow);


    }
}
