package com.learning;

import java.util.Scanner;

public class Mortgage {
    public static void main(String[] abc){
        final byte MONTHS_IN_YEAR=12;
        final byte PERCENT=100;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Principal: ");
        int principal=scanner.nextInt();
        //System.out.println("Principal: "+principal);
        System.out.print("Annual Interest Rate");
        float annualInterest=scanner.nextFloat();
        float monthlyInterest= annualInterest/PERCENT/MONTHS_IN_YEAR;
        System.out.print("Period (year): ");
        byte year=scanner.nextByte();
        //int numberOfPayment


    }
}
