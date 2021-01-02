package com.mike.struct;

import java.util.Scanner;

public class IfDemo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入成绩：");
        double score = scanner.nextDouble();
        if (score>=90.0 && score<100){
            System.out.println("A");
        }else if (score==100){
            System.out.println("恭喜满分");
        }else if (score<90 && score>=60){
            System.out.println("B");
        }else if (score>0 && score<60){
            System.out.println("不及格");
        }
        else{
            System.out.println("成绩不合法");
        }


        scanner.close();
    }
}
