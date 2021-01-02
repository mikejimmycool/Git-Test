package com.mike.base;

public class Demo5 {
    public static void main(String[] args) {
        //操作比较大的数的时候，注意溢出问题
        //jdk7新特性，数字之间可以用下划线分割
        int money = 10_0000_0000;
        //System.out.println(money);
        int years = 20;
        int total = money*years;//计算时候溢出
        System.out.println(total);
        long total2 = money*years;//默认都是int，转换为long前已经溢出
        System.out.println(total2);

        long total3 = money*(long)years;
        System.out.println(total3);


    }
}
