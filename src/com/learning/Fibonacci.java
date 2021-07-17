package com.learning;

public class Fibonacci {
    public static void main(String[] ABC){

        int i;
        int j=2;
        for(i=1; i<100; i=j-i){
            j=i+j;
            System.out.println(""+j);
        }

    }
}
