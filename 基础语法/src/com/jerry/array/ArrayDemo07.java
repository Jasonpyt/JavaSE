package com.jerry.array;

import java.util.Arrays;

//冒泡排序
public class ArrayDemo07 {
    public static void main(String[] args) {
        int[] arr3 ={31,211,333,11,23,44};
        int[] arr2={1,2,3,4};

        int[] array = sortArray(arr2);
        System.out.println(Arrays.toString(arr2));
    }
    //使用冒泡排序对数组进行排序
    static int[] sortArray(int[] array){
        boolean flag = false;
        int temp=0;//定义临时变量
        for (int i = 0; i < array.length-1; i++) {
            for (int j=0;j<array.length-1-i;j++){
                if (array[j]>array[j+1]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    flag=true;
                }

            }
            if (flag==false){
                break;
            }
        }
        return array;
    }
}
