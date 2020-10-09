package com.jerry.struct;

/**
 * @ClassName WhileDemo03
 * @Description TOOO
 * @Author 34678
 * @Date 2020/10/7 15:19
 * @Version 1.0
 **/


public class WhileDemo03 {
    public static void main(String[] args) {
        int num = 0;
        int sum = 0;
        while (num<100){
            num++;
            sum+=num;
        }
        System.out.println("1~100的和为："+sum);

    }
}
