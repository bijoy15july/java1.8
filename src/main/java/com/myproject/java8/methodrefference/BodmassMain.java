package com.myproject.java8.methodrefference;

public class BodmassMain {

    public static int sumRef(int x,int y)
    {
        System.out.println("sum");
        return x+y;
    }
    public static void main(String[] args) {



        Bodmass bodmass=BodmassMain::sumRef;
        System.out.println(sumRef(5,10));
        System.out.println(bodmass.sum(5,10));


    }
}
