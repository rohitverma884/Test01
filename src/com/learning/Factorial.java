package com.learning;

public class Factorial {
    public static void main(String[] abc){
        Factorial mytest=new Factorial();
        mytest.Factoirialof(6);
    }
    void Factoirialof(int c) {
        int fact=1;
        for (int i = 1; i <= c ; i++) {
            fact=fact*i;
        }
        System.out.println("" + fact);
    }
}
