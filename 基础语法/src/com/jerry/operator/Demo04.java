package com.jerry.operator;

public class Demo04 {
    public static void main(String[] args) {
        //自增++ 自减--
        int a = 3;
        int b = a++;//先赋值后自增
        System.out.println(a);
        int c = ++a;//先自增后赋值
        System.out.println(a);//5
        System.out.println(b);//3
        System.out.println(c);//5

        //幂运算
        double pow = Math.pow(3, 2);
        System.out.println(pow);//9.0
    }
}
