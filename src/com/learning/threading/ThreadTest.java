package com.learning.threading;


public class ThreadTest {
    int i;
    public static void main(String abc[]){

        ThreadTest th =new ThreadTest();
        T1 t1= new T1(th);
        t1.setName("T1");
        t1.start();

        T1 t2 = new T1(th);
        t2.setName("T2");
        t2.start();
    }

    public synchronized void print1to10(){
        for( i=1;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+" i= "+i);
        }
    }
}

class T1 extends Thread{
    ThreadTest th;
    T1(ThreadTest th){
        this.th=th;
    }
    @Override
    public void run() {
        super.run();
        th.print1to10();
    }
}
