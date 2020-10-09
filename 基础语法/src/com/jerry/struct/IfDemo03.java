package com.jerry.struct;

import java.util.Scanner;

/**
 * @ClassName IfDemo03
 * @Description TOOO
 * @Author 34678
 * @Date 2020/10/7 13:40
 * @Version 1.0
 **/


public class IfDemo03 {
    public static void main(String[] args) {
        //if多分支
        //用户输入
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入成绩：");
        double score = scanner.nextDouble();
        //判断
        if (score<=100&&score>=90){
            System.out.println("A级别");
        }else if (score<90&&score>=80){
            System.out.println("B级别");
        }else if (score<80&&score>=60){
            System.out.println("C级别");
        }else if (score<60&&score>=0){
            System.out.println("D级别");
        }else {
            System.out.println("成绩不合法！！");
        }
    }
}
