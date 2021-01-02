package com.mike.struct;
/*
package com.mike.struct;
public class ForDemo03 {
    public static void main(String[] args) {
        //输出1~1000之间能被5整除的数，并且每行输出3个
        for (int i = 0; i <= 1000; i++) {
            if (i%5==0){
                System.out.print(i+"\t");
                //System.out.println(i);
            }
            if (i%(5*3)==0){
                //System.out.println();
                System.out.print("\n");
            }
            //println 输出完换行
            //print 输出完不换行
        }
    }
}
 */
public class WhileDemo03 {
    public static void main(String[] args) {
        int i = 0;
        while (i<=1000){
            if (i%5==0){
                System.out.println(i+"\t");
            }

        }
    }
}
