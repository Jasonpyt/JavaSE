package com.jerry.base;



public class Program {
    public static void main(String[] args) {
        float age = 28.0F;
        String s1 = "liujiarui";
        String s2 = "liujiarui";
        String s3 = new String("liujiarui");
        System.out.println(s1.equals(s2));//true
        System.out.println(s1==s2);//true
        System.out.println(s3.equals(s1));//true
        System.out.println(s3==s1);//false
        System.out.println(age);
        int sum = add(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int add = add(new Integer[]{1, 2, 3});
        System.out.println(sum);
        System.out.println(add);
    }
    //可变参数列表
    public static int add(Integer ...numbers){
        int sum=0;
        for (int number : numbers) {
            sum+=number;
        }
        return sum;
    }

}
