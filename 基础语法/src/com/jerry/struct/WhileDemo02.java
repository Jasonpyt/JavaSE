package com.jerry.struct;

import jdk.nashorn.internal.ir.CallNode;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName WhileDemo02
 * @Description TOOO
 * @Author 34678
 * @Date 2020/10/7 14:53
 * @Version 1.0
 **/


public class WhileDemo02 {
    public static void main(String[] args) {
        new Thread(){
              public void run(){
                               while (true){
                                         try {
                                             SimpleDateFormat sdf = new SimpleDateFormat("yyyy年mm月dd日HH时MM分ss秒");
                                             String date = sdf.format(new Date());
                                             Thread.sleep(1000);
                                             System.out.println(date);
                                        } catch (InterruptedException e) {
                                            // TODO Auto-generated catch block
                                            e.printStackTrace();
                                         }
                                 }
                       }
        }.start();
    }
}
