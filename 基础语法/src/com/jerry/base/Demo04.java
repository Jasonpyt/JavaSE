package com.jerry.base;

public class Demo04 {
    public static void main(String[] args) {
        /*
        * 注意点：
        * 1.不能对布尔值进行转换
        * 2.不能把对象类型转换为不相干的类型
        * 3.在把高容量转换为低容量的时候，强制转换
        * 4.转换的时候可能存在内存溢出，或者精度问题
        * */
        int i = 128;
        byte b = (byte) i;//内存溢出
        double d = i;
        System.out.println(i);//128
        System.out.println(b);//-128
        System.out.println(d);//128.0
        System.out.println((int)333.333F);//精度损失

    }
}
