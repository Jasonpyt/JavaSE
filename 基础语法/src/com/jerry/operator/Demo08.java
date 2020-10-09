package com.jerry.operator;

public class Demo08 {
    public static void main(String[] args) {
        //x ? y : z
        //如果x==true，则结果为y，否则结果为z
        int score = 40;
        String result = score<60?"不及格": "及格";
        System.out.println(result);
    }
}
