package com.myproject.java8.dzone;

public class SquareRootImpl {
    public static void main(String[] args){

        SquareRoot squareRoot = (n) -> (Math.sqrt(n));
        System.out.println(squareRoot.findSquareRoot(144));
        System.out.println(squareRoot.findSquareRoot(145));

    }
}
