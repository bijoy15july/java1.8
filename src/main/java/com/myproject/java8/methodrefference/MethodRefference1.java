package com.myproject.java8.methodrefference;


import com.myproject.java8.Test;

public class MethodRefference1 {
        public static void saySomething(){
            System.out.println("Hello, this is static method.");
        }


        public static void saySomething1(){
            System.out.println("Hello, this is static method1.");
        }


        public static void main(String[] args) {
            // Referring static method
                Sayable sayable = MethodRefference1::saySomething;
            sayable.say();
                sayable = MethodRefference1::saySomething1;


            Test1 test1 = MethodRefference1::saySomething1;
            // Calling interface method
            sayable.say();
            //test1.say();
        }
    }

