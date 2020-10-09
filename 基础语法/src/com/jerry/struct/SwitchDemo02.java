package com.jerry.struct;

/**
 * @ClassName SwitchDemo02
 * @Description TOOO
 * @Author 34678
 * @Date 2020/10/7 14:10
 * @Version 1.0
 **/


public class SwitchDemo02 {
    public static void main(String[] args) {
        String name = "JerryLau";
        switch (name){
            case "liujiarui":
                System.out.println("liujiarui");
                break;
            case  "JerryLau":
                System.out.println("刘家瑞");
                break;
            default:
                System.out.println("what are you 弄啥哩！！");
        }
    }
}
