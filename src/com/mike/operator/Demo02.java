package com.mike.operator;

public class Demo02 {
    public static void main(String[] args) {
        long a = 12233435346546L;
        int b = 123123;
        short c = 10;
        byte d = 8;
        System.out.println(a+b+c+d);//Long
        System.out.println(b+c+d);//Int
        System.out.println(c+d);//Int
        System.out.println((double) c+d);//double

    }
}
