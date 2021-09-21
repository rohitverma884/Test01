package com.learning.constructor;

public class MyConstructorTest {

    public static void main(String sbc[])
    {
        A objcet2 = new A(6);
        A objcet3 = new A(6,"Rohit");
    }

}

class A{

     public A(int a){
         System.out.println("one arg constructor a= "+a);
     }

    public A(int a, String k){
        System.out.println("one arg constructor a= "+a);
    }



//    public A(){
//
//    }

    public int fun1(){
         return 7;
    }

    public void fun1(int i){
      fun1();
      fun1(5);
      fun2();
    }

    public void fun2(){
    }

}