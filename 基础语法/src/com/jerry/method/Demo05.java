package com.jerry.method;

public class Demo05 {
    public static void main(String[] args) {
        int result = f(11);
        System.out.println(result);
    }
    //递归求阶乘
    public static int f(int n){

                if (n==1){
                    return 1;
                }else {
                    return n*f(n-1);
                }

    }
}
