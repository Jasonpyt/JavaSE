package com.jerry.Scanner;

import java.util.Scanner;

/**
 * @ClassName Demo05
 * @Description TOOO
 * @Author 34678
 * @Date 2020/10/6 15:43
 * @Version 1.0
 **/


public class Demo05 {
    public static void main(String[] args) {
        //我们可以输入多个数字，并求其总和和与平均数，没输入一个数字用回车确认，
        //通过输入非数字来结束输入并输出执行结果
        //键盘输入数值
        Scanner scanner = new Scanner(System.in);
        //定义求和以及平均数等变量
        double sum = 0.0;
        double avge = 0.0;
        int count = 0;
        System.out.println("请输入数据:");
        //通过循环判断是否还有输入，如果有进行求和和计算平均值
        while (scanner.hasNextDouble()){
            double num = scanner.nextDouble();
            count++;
            sum+=num;
            avge=sum/count;
            System.out.println("你输入了第"+count+"个数据，当前结果sum="+sum);
        }
        System.out.println(count+"个数值的和:"+sum);
        System.out.println(count+"个数值的平均值:"+avge);
        scanner.close();
    }

}
