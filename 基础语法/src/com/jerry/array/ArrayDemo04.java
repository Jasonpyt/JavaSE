package com.jerry.array;

import java.util.Arrays;

public class ArrayDemo04 {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        int[] result = resverArray(arr);
        printArray(result);
    }
    public static int[] resverArray(int[] arr){
        int[] result = new int[arr.length];
        for (int i=0, j=arr.length-1;i<arr.length;i++,j--){
            result[j]=arr[i];
        }
        return result;
    }
    //jdk1.5开始使用
    public static void printArray(int[] array){
        for (int arr:array){
            System.out.print(arr+" ");
        }
    }
}
