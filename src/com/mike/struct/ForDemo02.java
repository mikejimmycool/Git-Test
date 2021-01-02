package com.mike.struct;

public class ForDemo02 {
    public static void main(String[] args) {
        //计算0到100之间所有奇数和偶数的和

        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i <=100; i++) {
            if (i%2!=0){//奇数
                oddSum+=i;//oddSum = oddSum + i；
            }else {//偶数
                evenSum+=i;//evenSum = evenSum + i;
            }
            
        }
        System.out.println("奇数的和："+oddSum);
        System.out.println("偶数的和："+evenSum);

    }
}
