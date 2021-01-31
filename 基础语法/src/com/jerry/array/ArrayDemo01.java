package com.jerry.array;

public class ArrayDemo01 {
    public static void main(String[] args) {
        //声明数组
        int[] num1 = new int[10];//建议使用
        int num2[]=new int[10];
        //数组元素赋值
        //数组元素不赋值的情况下，int默认为0
        num1[0]=10;
        //遍历数组元素
       for (int i=0;i<num1.length;i++){
           System.out.println(num1[i]);
       }
    }
}
