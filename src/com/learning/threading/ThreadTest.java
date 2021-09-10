package com.learning.threading;


public class ThreadTest extends Thread{
    int i;
    public static void main(String abc[]){


        ThreadTest t1= new ThreadTest();
        t1.setName("T1");
        t1.start();

        ThreadTest t2 = new ThreadTest();
        t2.setName("T2");
        t2.start();
    }

    @Override
    public void run() {
        print1to10();
    }

    public synchronized void print1to10(){
        for( i=1;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+" i= "+i);
        }
    }
}
