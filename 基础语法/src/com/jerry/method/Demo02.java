package com.jerry.method;

/**
 * 比大小
 */
public class Demo02 {
    public static void main(String[] args) {
        int max = new Demo02().max(10, 100);
        System.out.println(max);
    }
    //定义一个方法比较两个整数的大小
    public int max(int num1,int num2){
        int max = 0;
        if (num1>num2){
            max = num1;
        }else  if (num1<num2){
            max = num2;
        }else if(num1 == num2){
            return 0;
        }
        return max;
    }

}
