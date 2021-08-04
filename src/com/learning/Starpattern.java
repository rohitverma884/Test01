package com.learning;

public class Starpattern {

    public static void main(String[] abc) {
        //int a[]={10,12,25,16,8,97};
        Starpattern pattern1 = new Starpattern();
        pattern1.number1(5);
    }

    void number(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("");
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    void number1(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(" ");
            for (int j = 1; j <= n; j++) {

                System.out.print("*");

            }
            System.out.print("\n");
        }
    }
}
