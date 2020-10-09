package com.jerry.struct;

/**
 * @ClassName SwitchDemo01
 * @Description TOOO
 * @Author 34678
 * @Date 2020/10/7 14:01
 * @Version 1.0
 **/


public class SwitchDemo01 {
    public static void main(String[] args) {
        //swithc case
        char grade = 'C';
        switch (grade){
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
                System.out.println("良好");
                break;
            case 'C':
                System.out.println("及格");
                break;
            case 'D':
                System.out.println("不及格");
                break;
            default:
                System.out.println("不合法！！");
        }
    }
}
