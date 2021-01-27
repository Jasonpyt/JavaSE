package com.jerry.method;
//可变参数
public class Demo04 {
    public static void printMax(double...numbers){
        if (numbers.length==0){
            System.out.println("No argument passed");
            return;
        }
        double result = numbers[0];

        //排序
        for (int i = 1;i<numbers.length;i++){
            if (numbers[i]>result){
                result=numbers[i];
            }
        }
        System.out.println("The max value is "+result);
    }

    public static void main(String[] args) {
        printMax(10.1,1111);
        printMax(new double[]{1.2,1.1});
    }
}
