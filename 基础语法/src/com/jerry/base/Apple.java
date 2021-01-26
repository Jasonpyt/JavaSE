package com.jerry.base;

public class Apple {
    int i = 0;
    Apple eatApple(){
        i++;
        return this;
    }
    public static void main(String[] args) {
        Apple apple = new Apple();
        System.out.println(apple.eatApple().eatApple());
    }
}
