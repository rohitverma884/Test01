package com.learning;

public class Nestedloop {
    public static void main(String[] aaa){
        for(int i=1;i<=3;i++){
            System.out.println("i value= "+i);
            for(int j=1;j<=3;j++){
                System.out.println("j value= "+j);
            }
            System.out.println("\n");
        }
    }
}
