package com.jerry.struct;

import java.util.Scanner;

/**
 * @ClassName IfDemo02
 * @Description TOOO
 * @Author 34678
 * @Date 2020/10/7 13:31
 * @Version 1.0
 **/


public class IfDemo02 {
    public static void main(String[] args) {
        //考试分数大于60就是及格，否则就是不及格
        //用户键盘输入
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入考试成绩：");
        double score = scanner.nextDouble();
        if (score>60){
            System.out.println("恭喜你，你通过考试了！及格！！");
        }else {
            System.out.println("很遗憾你没有通过考试！继续加油哦！！");
        }
        scanner.close();
    }
}
