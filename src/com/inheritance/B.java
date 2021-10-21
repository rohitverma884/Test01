package com.inheritance;

import java.util.ArrayList;
import java.util.List;

public class B extends A{
    @Override
    void fun1() {
       //super.fun1();
        System.out.println(" I m from B fun1");
    }

    void fun2(){
        System.out.println("m from B fun2");
    }

    /*void fun2(int k){
    }

    void fun2(int k, float b){
    }*/


    public static void main(String abc[]){
        A a = new A();
        a.fun1();

        B b = new B();
        b.fun1();
        b.fun2();


        A a1 = new B();
        a1.fun1();


        List<String> list = new ArrayList<>();

      //  B b1 = new A(); not possible

        //B b1 = new C(); not possible


    }

}

/*
*       A
*      / \
*     B   C
*
*     Car
*     / \
 *   Bmw audi, ...
*         /\
*        A1  B,....
*
* */