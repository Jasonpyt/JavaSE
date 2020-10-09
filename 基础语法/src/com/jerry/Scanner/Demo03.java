package com.jerry.Scanner;

import java.util.Scanner;

/**
 * @ClassName Demo03
 * @Description TOOO
 * @Author 34678
 * @Date 2020/10/6 13:59
 * @Version 1.0
 **/


public class Demo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数据：");
        String s = scanner.nextLine();
        System.out.println(s);
        scanner.close();
    }
}
