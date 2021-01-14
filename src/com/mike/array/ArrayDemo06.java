package com.mike.array;

import java.util.Arrays;

public class ArrayDemo06 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 7999, 23834324, 8989, 232};
        //System.out.println(a);//对象的哈希值[I@4554617c
        //打印数组元素Arrays.ToString
        //System.out.println(Arrays.toString(a));
        //printArrays(a);
        //排序
//        Arrays.sort(a);//数组升序排序
//        printArrays(a);
//        System.out.println(Arrays.toString(a));

        //数组填充
        int[] b = {1,2,3,6,45978,2349284};
        Arrays.fill(b,2,4,0);//下标为2,3的赋值
        printArrays(b);


    }

    //自己写
    public static void printArrays(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                System.out.print("[");
            }
            if (i == a.length - 1) {
                System.out.print(a[i] + "]");
            } else {
                System.out.print(a[i] + ", ");
            }


        }
    }

}
