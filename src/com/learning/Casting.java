package com.learning;

public class Casting {
    public static void main(String[] abc){
        short x=1;
        int y=x+2;
        System.out.println(y);

        double a=1.1;
        double b=a+2;
        System.out.println(b);

        double c=1.1;
        int d= (int) c + 2;
        System.out.println(d);

        String m="1";
        int n= Integer.parseInt(m) +2;
        System.out.println(n);

        String k="1.1";
        double l=Double.parseDouble(k)+2;
        System.out.println(l);



    }

}
