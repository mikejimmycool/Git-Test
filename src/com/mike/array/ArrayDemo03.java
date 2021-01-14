package com.mike.array;

public class ArrayDemo03 {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,5,6};
        //打印全部数组元素；
        for (int i = 0; i <arrays.length ; i++) {
            System.out.println(arrays[i]);

        }
        System.out.println("=======================");

        //计算所有元素的和
        int sum = 0;
        for (int i = 0; i <arrays.length ; i++) {

            sum = sum +arrays[i];

        }
        System.out.println("数组内所有元素的和："+sum);

        System.out.println("=======================");

        //查找最大元素
        int max = arrays[0];
        for (int i = 0; i < arrays.length ; i++) {
            if (arrays[i]>max){
                max = arrays[i];
            }
        }
        System.out.println("数组内最大的数字为："+max);


    }
}
