package com.learning.singleton;

public class MySingleTonClass {


    public static void main(String abc[]) {
        Abc obj1 = new Abc();
        obj1.number = 4;
        Abc.point =90;

        System.out.println(obj1.number);//7
        obj1 = new Abc();
        System.out.println(obj1.number); //0
        System.out.println(Abc.point); //90

        obj1 = new Abc();
        obj1.number = 8;

        Abc obj2 = new Abc();
    }
}


// public, private, protected, default
class Abc {
    public int number;

    static int point;
    public void fun2(){
        int k=8;
        int l=9;
        int m=0;
    }
}