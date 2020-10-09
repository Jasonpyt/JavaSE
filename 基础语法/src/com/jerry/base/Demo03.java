package com.jerry.base;

public class Demo03 {
    public static void main(String[] args) {
        //整数扩展 进制   二进制0b     十进制     八进制0     十六进制0x
        int i = 10;
        int i2 = 010;
        int i3 = 0x10;
        System.out.println(i);//10
        System.out.println(i2);//8
        System.out.println(i3);//16
        System.out.println("==================================");
        //浮点数拓展
        //float double 有限   离散  舍入误差    大约  接近但不等于
        //银行业务用BigDecimal
        float  f = 0.1F;
        double f1 = 0.1;

        float d1 = 23131312312312313F;
        float d2 = d1 +1;

        System.out.println(f == f1);//false
        System.out.println(d1 == d2);//true
        System.out.println("==============================");
        //字符扩展
        char c1 = 'a';
        char c2 = 'b';
        char c3 = '中';
        char c4 = '\u0062';
        System.out.println((int)c1);//97
        System.out.println((int)c2);//98
        System.out.println((int)c3);//20013
        System.out.println(c4);//b

        //转移字符
        // \t   制表符     \n 换行
        System.out.println("===========================");
        String st1 = "HelloWorld";
        String st2 = "HelloWorld";
        String st3 = new String("HelloWorld");
        String st4 = new String("HelloWorld");
        System.out.println(st1==st2);//true
        System.out.println(st3==st4);//false
        System.out.println("Excl表格 2^16=65536");

        System.out.println("=======================");
        //布尔值扩展
        //less is more
        boolean flag = true;
        if (flag ) {
            System.out.println("真");
        }
    }
}
