package com.learning;

import java.util.ArrayList;

public class Program4 {
    public static void main(String[] abc){
        String a="what is your name";
        System.out.println(a);

        int arry[]={5,6,7,2,3,778,458,897,258};
        System.out.println(arry[1]);

        ArrayList numberList =new ArrayList();

        numberList.add(500);
        numberList.add(200);

        System.out.println(numberList.get(0));

        ArrayList names = new ArrayList();

        names.add("Ram");
        names.add("Shyam");
        names.add("Karan");
        names.add("Arjun");

        System.out.println(names.toString());

        int x=500;
        int y =500;

        if(x==y){

            System.out.println("both are equal");

        }
        else if(x>y){
            System.out.println("x is greater");
        }
        else {
            System.out.println("y is greater");
        }
        int arry1[]={5,6};

        if(arry1[0]==arry1[1]){

            System.out.println("both are equal");

        }
        else if(arry1[0]>arry1[1]){
            System.out.println("0 is greater");
        }
        else {
            System.out.println("1 is greater");
        }



    }

}
