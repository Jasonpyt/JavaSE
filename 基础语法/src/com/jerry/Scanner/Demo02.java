package com.jerry.Scanner;

import java.util.Scanner;

/**
 * @ClassName Demo02
 * @Description TOOO
 * @Author 34678
 * @Date 2020/10/6 13:42
 * @Version 1.0
 **/


public class Demo02 {
    public static void main(String[] args) {
        System.out.println("使用nextLine方式接收：");
        //从键盘接收数据
        Scanner sc = new Scanner(System.in);
        //判断是否还有输入
        if (sc.hasNext()){
            String s = sc.nextLine();
            System.out.println("输出的值为："+s);
        }
        //凡是输入输出流都需要关闭，以节省资源
        sc.close();
    }
}
