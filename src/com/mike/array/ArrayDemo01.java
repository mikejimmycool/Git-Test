package com.mike.array;

public class ArrayDemo01 {
    //变量类型 变量名 = 变量值;
    public static void main(String[] args) {
//        int[] nums;//定义1
//        nums = new int[10];//这里面可以存放10个Int类型数字；
        int[] nums = new int[11];

        //赋值
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

//        System.out.println(nums[10]);
        //计算数组内所有数字的和；
        int sum = 0;
        //数组长度 arrays.length
        for (int i = 0; i <= nums.length-1 ; i++) {

            sum = sum + nums[i];

        }

        System.out.println("数组数字之和："+sum);





    }

}
