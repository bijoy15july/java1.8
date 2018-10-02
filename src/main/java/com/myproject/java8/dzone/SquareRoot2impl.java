package com.myproject.java8.dzone;

public class SquareRoot2impl {

    public static void main(String[] args){

        SquareRoot2 squareRoot2 = (n) -> {

            if(n.contains("abcd"))
            return "contain abcd";
            else return n;
        };
        System.out.println(squareRoot2.methodBody("test"));
        System.out.println();

    }
}
