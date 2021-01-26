package com.jerry.base;

import com.jerry.method.Demo01;

public class App {
    public static void main(String[] args) {
        int add = Demo01.add(1, 2);
        System.out.println(add);
        StringBuffer sb = new StringBuffer();
        sb.append('刘');
        sb.append('家');
        sb.append('瑞');
        String x = sb.toString();
        System.out.println(sb.equals(x));
        System.out.println(sb.hashCode());
        System.out.println(x.hashCode());
        String name = "如意";
        System.out.print(name instanceof String);//判断name类型是否为String，返回true或false

    }
}
