package com.mike.base;

public class Demo7 {
    //类变量 static
    static  double salary = 2500;

    //属性:变量

   //实例变量：从属于对象；如果不自行初始化，这个类型的默认值为0或者0.0
   // 布尔值：默认是false
   // 除了基本类型，其余的默认值都是NULL
   String name;
   int age;




    //main 方法
    public static void main(String[] args) {

        //局部方法;必须申明和初始化值
        int i = 10;
        System.out.println(i);

        //变量类型 变量名字 = new com.mike.base.Demo7()
        Demo7 demo7 = new Demo7();
        System.out.println(demo7.name);
        System.out.println(demo7.age);

        //类变量 static
        System.out.println(salary);



    }


    //其他方法
    public void add(){

    }
}
