package com.mike.scanner;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        //创建一个扫描器对象，用于接收键盘数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("使用next方式接收：");

        //判断用户有没有输入字符串
        if (scanner.hasNext()){
            //使用next方式接收
            String str =scanner.next();//程序会等待输入完毕
            System.out.println("输出的内容为："+str);
        }
        scanner.close();  //IO流的类不关闭会占用资源，用完要关闭

    }
}
