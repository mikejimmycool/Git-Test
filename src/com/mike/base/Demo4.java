package com.mike.base;

public class Demo4 {
    public static void main(String[] args) {
    int i = 128;
    byte b = (byte)i;//内存溢出
    double c = i;
        System.out.println(i);
        System.out.println(b);
        System.out.println(c);
        //低------高
        //byte,short,char->int->long->float->double
        //强制转换 （类型）变量名   高--低
        //自动转换   低--高
        /*
        注意点：
        1.不能对布尔值进行转换
        2.不能把对象类型转换为不相干类型
        3.在把高容量转到低容量时，强制转换
        4.转换的时候可能存在内存溢出，或者精度问题！
         */
        System.out.println("==============");
        System.out.println((int)55.8);
        System.out.println((int)-45.89f);


        System.out.println("==============");
        char d = 'a';
        int e = d+1;
        System.out.println(e);
        System.out.println((char)e);

    }
}
