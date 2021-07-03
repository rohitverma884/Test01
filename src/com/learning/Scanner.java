package com.learning;

public class Scanner {
    public static void main(String[] abc){
        //java.util.Scanner scanner=new java.util.Scanner(System.in);
        //System.out.print("Age:");
        //byte age=scanner.nextByte();
        //System.out.println("your age is "+age);

        java.util.Scanner scanner1=new java.util.Scanner(System.in);
        System.out.print("Name:");
        String name=scanner1.nextLine().trim();
        System.out.println("your age is "+name);


    }
}
