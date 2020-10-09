package com.jerry.Scanner;

import java.util.Scanner;

/**
 * @ClassName Demo01
 * @Description TOOO
 * @Author 34678
 * @Date 2020/10/6 11:32
 * @Version 1.0
 **/


public class Demo01 {
    public static void main(String[] args) {
        //创建一个扫描器对象，用于接收键盘数据
        Scanner sc = new Scanner(System.in);
        System.out.println("使用next方式接收：");
        //判断用户有没有输入字符串
        if (sc.hasNext()){
            //使用next方式接收
            String s = sc.next();
            System.out.println("输出的内容为："+s);
        }
        //关闭资源
        sc.close();
    }
}
