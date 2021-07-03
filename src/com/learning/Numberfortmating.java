package com.learning;

import java.text.NumberFormat;

public class Numberfortmating {
    public static void main(String[] abc){
        NumberFormat currency= NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.897);
        System.out.println(result);

        NumberFormat percent= NumberFormat.getPercentInstance();
        String result1 = percent.format(0.1);
        System.out.println(result1);
    }
}
