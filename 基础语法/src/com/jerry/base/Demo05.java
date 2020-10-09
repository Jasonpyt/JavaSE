package com.jerry.base;

public class Demo05 {
    public static void main(String[] args) {
        int money =10_0000_0000;//JDK7新特性
        System.out.println(money);//1000000000
        int years = 20;
        int total = money * years;
        long total2 = (long)(money) * years;//先把一个转换为long
        System.out.println(total);//-1474836480 溢出
        System.out.println(total2);//20000000000
    }
}
