package com.jerry.Scanner;

import java.util.Scanner;

/**
 * @ClassName Demo04
 * @Description TOOO
 * @Author 34678
 * @Date 2020/10/6 14:05
 * @Version 1.0
 **/


public class Demo04 {
    public static void main(String[] args) {
        //从键盘接收数据
        Scanner sc = new Scanner(System.in);
        int i = 0;
        float f = 0.0F;

        System.out.println("请输入一个整数：");

        //如果那么
        if (sc.hasNextInt()){
             i = sc.nextInt();
            System.out.println("整数数据："+i);
        }else {
            System.out.println("请输入一个整数！！");
        }
    //接收键盘输入
        System.out.println("请输入一个小数：");
    //如果那么
        if (sc.hasNextFloat()){
            f = sc.nextFloat();
            System.out.println("小数数据："+f);
        }else {
            System.out.println("请输入一个小数数据！！");
        }
    sc.close();
    }
}
