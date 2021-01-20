package com.jerry.base;

public class StringTest {
    public static void main(String[] args) {
    /*public StringBuffer append(String s)
    将指定的字符串追加到此字符序列。
    */
        String str1 = "www.";
        String str2 = "baidu.";
        StringBuffer sb = new StringBuffer();
        String str3 = str1 + str2 + sb.append("com");
        System.out.println(str3);

     /*
    public StringBuffer reverse()
    将此字符序列用其反转形式取代。
     */
        StringBuffer reverse = sb.reverse();
        System.out.println(reverse);


        /*
    public delete(int start, int end)
    移除此序列的子字符串中的字符。
     */
        StringBuffer sb2 = new StringBuffer();
        sb2.append("刘家瑞");
        System.out.println(sb2.delete(1,2));

        /*
        public insert(int offset, int i)
        将 int 参数的字符串表示形式插入此序列中。
        */
        StringBuffer insert = sb2.insert(1, "家");
        System.out.println(insert);

        /*
        replace(int start, int end, String str)
使用给定 String 中的字符替换此序列的子字符串中的字符。
         */
        StringBuffer sb3 = sb2.replace(1, 2, "王");
        System.out.println(sb3);
        sb3.append("666666666666666666666666666666666666666666666666");
        int capacity = sb3.capacity();
        System.out.println(capacity);


        StringBuffer str4=new StringBuffer(3);
        System.out.println(str4.capacity());
    }




}
