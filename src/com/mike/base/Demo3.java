package com.mike.base;

public class Demo3 {
    public static void main(String[] args) {
    //整数拓展：进制   二进制0b   十进制 八进制0
    //十六进制0x
    int i = 10;
    int i2 = 010;
    int i3 = 0x110;
    int i4 = 0b10;
        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);


    //少用浮点数进行比较，银行业务用BigDecimal
        System.out.println("==============================");

        char c1 = 'a';
        char c2 = '中';

        System.out.println(c1);
        System.out.println((int)c1);
        System.out.println(c2);
        System.out.println((int)c2);

        //转义字符
        // \t  制表符
        // \n  换行
        System.out.println("hello\tWorld");
        System.out.println("hello\nWorld");

        //布尔值扩展
        boolean flag = true;
        if(flag==true){} //其实和
        if (flag){}//一样
        //Less is more! 代码要精简易读

       char c3 = '\u0061';
        System.out.println(c3);

        String sa = new String("helloworld");
        String sb = new String("helloworld");
        System.out.println(sa==sb);
        String sc = "helloworld";
        String sd = "helloworld";
        System.out.println(sc==sd);


    }
}

