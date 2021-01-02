package com.mike.struct;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class IfDemo02 {
    public static void main(String[] args) {
        //考试分数大于60及格，小于60不及格

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入您的成绩：");
        double socre = scanner.nextDouble();

        if(socre >= 60){
            System.out.println("您的成绩为及格");
        }
        else{
            System.out.println("您的成绩为不及格");
        }

        scanner.close();
    }
}
