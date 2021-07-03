package com.learning;

public class Problem1 {
    public static void main(String[] abc){
        int a=5;
        int b = 3;
        int c = b;
        b=a;
        a=c;
        System.out.println("a="+a+" & b="+b);
    }
}
