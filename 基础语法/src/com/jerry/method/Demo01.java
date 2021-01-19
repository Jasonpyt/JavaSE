package com.jerry.method;

public class Demo01 {
    public static void main(String[] args) {
    //调用方法
        int add = add(10, 20);
        System.out.println(add);

        printNum();
    }
    //定义一个求和的方法
    public static int add(int a,int b){
        return a+b;
    }
    //定义一个for循环打印数字的方法
    static  void printNum(){
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}
