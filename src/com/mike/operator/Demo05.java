package com.mike.operator;
//逻辑运算符   与（and）&&   或（or）||    非（取反）
 public class Demo05 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println("a && b:"+(a&&b));
        //逻辑与运算：两个变量都为真，结果才为True
        System.out.println("a || b:"+(a||b));
        //逻辑或运算：两个变量有一个为真，结果就为True
        System.out.println("!(a && b):"+!(a&&b));
        //逻辑非运算：真变假，假变真

        //短路运算
        int c = 5;
        boolean d = c<4;
        //boolean e = (c<4)&&(c++>4);
        boolean e = (c>4)&&(c++>4);
        System.out.println(e);
        System.out.println(c);

    }
}
