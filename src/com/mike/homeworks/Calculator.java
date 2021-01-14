package com.mike.homeworks;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
/*
写一个计算器
1.写四个方法 加减乘除
2.利用循环+switch进行用户交互
3.传递需要操作的两个数
4.输出结果
 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        double a = scanner.nextDouble();
        System.out.println("请输入运算符：");
        String operator = scanner.next();
        System.out.println("请输入第二个数字：");
        double b = scanner.nextDouble();

        double jisuan = jisuan(a,b,operator);


        scanner.close();

        //int jisuan = jisuan(1,4,'*');



    }


    private static double jisuan(double a, double b, String operator){
        double num = 0;
        switch (operator){
            case "+":
                num = a+b;
                System.out.println(a+"+"+b+"="+num);
                break;
            case "-":
                num = a-b;
                System.out.println(a+"-"+b+"="+num);
                break;
            case "*":
                num = a*b;
                System.out.println(a+"*"+b+"="+num);
                break;
            case "/":
                num = a/b;
                System.out.println(a+"/"+b+"="+num);
                break;
            default:
                System.out.println("错误");
        }
        return num;
    }
}
