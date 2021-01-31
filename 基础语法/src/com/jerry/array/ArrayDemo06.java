package com.jerry.array;

import java.util.Arrays;

public class ArrayDemo06 {
    public static void main(String[] args) {
        //使用Arrays工具类打印数组
//        int[][] arr = new int[3][3];
        int[] arr2 = new int[3];
        int[] arr3 ={31,211,333,11,23,44};
        String print = Arrays.toString(arr2);//只能打印输出一维数组
        System.out.println(print);
        Arrays.sort(arr3);//对数组进行排序
        System.out.println(Arrays.toString(arr3));
    }
}
