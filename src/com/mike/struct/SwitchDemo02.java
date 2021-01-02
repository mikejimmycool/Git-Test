package com.mike.struct;

public class SwitchDemo02 {
    public static void main(String[] args) {
        String name = "lizhihong";
        //java7新特性，表达式结果可以是字符串！
        //字符的本质还是数字

        switch (name){
            case "mike":
                System.out.println("你真帅！");
                break;
            case "xiangyufan":
                System.out.println("好有钱！");
                break;
            default:
                System.out.println("TA是谁？");
                break;
        }
    }
}
