package com.jerry.array;

public class ArrayDemo03 {
    //打印数组元素
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
    //求数组和
    public static int sumArray(int[] arr){
        int sum=0;
        for (int i : arr) {
            sum+=i;
        }
        return sum;
    }
    //求数组最大值
    public static int maxArray(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        printArray(arr);
        int sum = sumArray(arr);
        System.out.println();
        System.out.println("数组元素之和为:"+sum);
        int max = maxArray(arr);
        System.out.println("数组元素最大值为:"+max);
    }
}
