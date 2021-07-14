package com.learning;

public class Sum1 {
    public static void main(String[] abc){
        java.util.Scanner scanner=new java.util.Scanner(System.in);
        System.out.println("enter start value");

        int i =scanner.nextInt();
        System.out.print("enter end value");
        int j=scanner.nextInt();
        int sum=0;
        while (i<=j){

            sum= sum+i;
            i++;
        }
        System.out.println("sum =" +sum);
    }
}
