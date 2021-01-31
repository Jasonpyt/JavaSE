package com.jerry.array;
//多维数组
public class ArrayDemo05 {
    public static void main(String[] args) {
        int[][] array = new int[2][3];//2行3列
        int[][] arr2 = { {1,2},{3,4,5},{6,7,8,9,10} };
        for (int i = 0; i < arr2.length; i++) {
            for (int j=0;j<arr2[i].length;j++){
                System.out.println(arr2[i][j]);
                System.out.println(arr2[i]);
            }
        }
        printArrays(array);
    }
    public static void printArrays(int array[][]){
        for (int i = 0; i < array.length; i++) {
            for (int j=0;j<array[i].length;j++){
                System.out.println(array[i][j]);

            }
        }
    }
}
