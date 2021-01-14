package com.mike.array;

import java.util.Arrays;

public class ArrayDemo07 {
//    public static void main(String[] args) {
//        //冒泡排序
//        //1、比较数组中，两个相邻的元素，如果第一个数比第二个大，交换他们位置；
//        //2、每次比较，都会产生一个最大，或者最小的数字；
//        //3、下一轮可以少次排序！
//        //4、依次循环，直到结束！
//
//        int[] a = {1, 2, 5, 6, 3, 2, 1};
//        int[] sortMp = sortMp(a);
//        System.out.println(Arrays.toString(a));
//    }

    public static void main(String[] args) {
        int [] a = {1,4,2,3};
        int[] sortMp = sortMp(a);
        System.out.println(Arrays.toString(a));

    }

    public static int[] sortMp(int[] array) {
        //临时变量
        int temp = 0;
        //外层循环，判断这个过程要走多少次
        for (int i = 0; i < array.length - 1; i++) {
            //内层循环，比较判断两个数，如果第一个数，比第二个大，则交换位置
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j + 1] > array[j]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }
            }

        }
        return array;


    }

}


