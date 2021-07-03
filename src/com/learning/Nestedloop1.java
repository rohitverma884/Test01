package com.learning;

public class Nestedloop1 {
    public static void main(String[] abc){
        for(int i=1;i<=5;i++){
            System.out.println("*i"+i);
            for(int j=1;j<=i;j++){
                System.out.println("*j"+j);
            }
            System.out.println("\n");
        }
    }
}
