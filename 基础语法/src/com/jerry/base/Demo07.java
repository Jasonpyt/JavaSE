package com.jerry.base;

public class Demo07 {
    //属性：变量

    //实例变量:从属于对象,如果没有初始化会有一个默认值
    static String name;
    static int age;
    double salary = 2500.0;
    //main方法
    public static void main(String[] args) {

        //局部变量；必须声明和初始化值
        int i = 10;
        System.out.println(i);
        System.out.println(name);//null
        System.out.println(age);//0
        System.out.println(new Demo07().salary);//通过类进行访问全局变量
    }
    //其他方法
    public void add(){
    }
}
