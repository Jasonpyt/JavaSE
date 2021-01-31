package com.jerry.array;

public class ArrayDemo02 {
    public static void main(String[] args) {
        //数组静态初始化
        int[] arr1 =  {1,2,3,4};
        //数组动态初始化
        int[] arr2 =new int[10];
        arr2[1]=10;
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);//没赋值初始化为:0
        }
    }
}
