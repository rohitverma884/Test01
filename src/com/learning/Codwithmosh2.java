package com.learning;

public class Codwithmosh2 {
    public static void main(String[] abc){
        int result=Math.round(1.2F);
        System.out.println(result);

        int result1= (int) Math.ceil(1.2F);
        System.out.println(result1);

        int result2= (int) Math.floor(1.1);
        System.out.println(result2);

        int result3=Math.max(2,3);
        System.out.println(result3);

        int result4=Math.min(458,889);
        System.out.println(result4);

        double result5=Math.random();
        System.out.println(result5);

        double result6=Math.random()*100;
        System.out.println(result6);

        double result7=Math.round(Math.random()*100);
        System.out.println(result7);

        int result8=(int)Math.round(Math.random()*100);
        System.out.println(result8);
    }
}
