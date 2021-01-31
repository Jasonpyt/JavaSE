package com.jerry.array;

public class ArrayDemo08 {
    public static void main(String[] args) {
        //1.创建一个为二二维数组11*11 0：没有棋子，1：白棋，2：黑旗
        int[][] array1 = new int[11][11];
        array1[1][2]=1;
        array1[2][3]=2;
        //输出原始数组
        for (int[] ints : array1) {
            for (int anInt : ints) {
                System.out.print(anInt+"\t");
            }
            System.out.println();
        }
        
        //转换为稀疏数组
        int sum=0;//计数
        for (int i = 0;i<array1.length;i++){
            for (int j=0;j<array1.length;j++){
                if (array1[i][j]!=0){
                sum++;
                }
            }
        }
        System.out.println("有效数组个数为："+sum);
        System.out.println("=======================");
        //定义稀疏数组
        int[][] array2 = new int[sum+1][3];
        array2[0][0]=array1.length;
        array2[0][1]=array1.length;
        array2[0][2]=sum;

        //计数
        int count =0;
        for (int i = 0; i < array1.length; i++) {
            for (int j=0;j<array1.length;j++){
                if (array1[i][j]!=0){
                    count++;
                    array2[count][0]=i;
                    array2[count][1]=j;
                    array2[count][2]=array1[i][j];
                }
            }
        }
        //打印稀疏数组
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i][0]+"\t"
            +array2[i][1]+"\t"
            +array2[i][2]+"\t");
        }

        System.out.println("==================");
        //还原稀疏数组
        int[][] array3=new int[array2[0][0]][array2[0][1]];
        //给其中的元素还原它的值
        for (int i = 1; i < array2.length; i++) {
            array3[array2[i][0]][array2[i][1]]=array2[i][2];
        }
        //打印还原后的数组
        for (int i = 0; i < array3.length; i++) {
            for (int j=0;j<array3.length;j++){
                System.out.print(array3[i][j]+"\t");
            }
            System.out.println();
        }

    }


}
