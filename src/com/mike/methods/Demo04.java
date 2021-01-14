package com.mike.methods;

public class Demo04 {
    public static void main(String[] args) {
        Demo04 demo04 = new Demo04();
        demo04.method(1,2,3,4,5,6);


    }
    //int...   可变参数   一个方法只能有一个且必须是最后一个参数
    public void method(int...i){
        System.out.println(i[0]);
        System.out.println(i[2]);
        System.out.println(i[3]);
        System.out.println(i[4]);
        System.out.println(i[5]);

        System.out.println("===============");
        System.out.print(i[0]);
        System.out.print(i[1]);
        System.out.print(i[2]);
        System.out.print(i[3]);
        System.out.print(i[4]);


    }
}
