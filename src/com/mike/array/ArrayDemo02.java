package com.mike.array;

import java.lang.reflect.Array;

public class ArrayDemo02 {


    public static void main(String[] args) {
        //静态初始化  创建+赋值
        int[] a = {1,2,3,4,5,6,7,8};
        for (int i = 0; i <a.length ; i++) {
            //System.out.print(a[i]+"\t");
            System.out.println("======================");
            System.out.println("a数组内的第"+(i+1)+"个数为："+a[i]);

        }
        //动态初始化：包含默认初始化
        int[] nums = new int[11];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;
        nums[5] = 6;
        nums[6] = 7;
        nums[7] = 8;
        nums[8] = 9;
        nums[9] = 10;
        nums[10] = 11;
        //遍历数组内数字
        for (int j = 0; j <nums.length ; j++) {
            //System.out.println(nums[j]);
            System.out.println("======================");
            System.out.println("nums数组内的第"+(j+1)+"个数为："+nums[j]);

        }


    }

}

