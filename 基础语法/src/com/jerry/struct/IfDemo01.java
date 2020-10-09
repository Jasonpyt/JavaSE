package com.jerry.struct;

import java.util.Scanner;

/**
 * @ClassName IfDemo01
 * @Description TOOO
 * @Author 34678
 * @Date 2020/10/7 13:24
 * @Version 1.0
 **/


public class IfDemo01 {
    public static void main(String[] args) {
        //if但选择结构
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入内容：");
        String s = scanner.nextLine();
        //equals：判断字符串是否相等
        if (s.equals("Hello")){
            System.out.println(s);
        }
        scanner.close();
        System.out.println("End");
    }
}
