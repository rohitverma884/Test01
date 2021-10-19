package com.inheritance;

public class B extends A{
    @Override
    void fun1() {
        super.fun1();
        System.out.println("m from B");
    }

    void fun2(){
    }

    void fun2(int k){
    }

    void fun2(int k, float b){
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