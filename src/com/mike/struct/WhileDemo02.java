package com.mike.struct;

public class WhileDemo02 {
    public static void main(String[] args) {
        //计算1+2+3+...+100=?

        //高斯的故事
        int i = 0;
        int sum = 0;
        while (i<=100){
            sum = sum +i;
            i++;
        }
        System.out.println(sum);

    }

}
