package com.jerry.base;

import com.jerry.base.FreshJuie.FreshJuiceSize;

public class FreshJuiceTest {
    public static void main(String[] args) {
        FreshJuie freshJuie = new FreshJuie();
        FreshJuiceSize medium = FreshJuiceSize.MEDIUM;
        System.out.println(freshJuie.size= medium);
    }
}

class FreshJuie{
    enum FreshJuiceSize{SMALL,MEDIUM,LARGE}
    FreshJuiceSize size;
}
