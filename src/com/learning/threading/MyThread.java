package com.learning.threading;


  // Thread; Runnable;

public class MyThread{

   public static void main(String abc[]){

       PrintTableThread tableThread = new PrintTableThread();
       Thread thread = new Thread(tableThread);
       thread.start();


       PrintNumberThread numberThread = new PrintNumberThread();
       Thread secondThread = new Thread(numberThread);
       secondThread.start();

       ThousandTypeNumber thousandTypeNumber = new ThousandTypeNumber();
       thousandTypeNumber.start();

   }
}

class PrintTableThread implements Runnable{
    @Override
    public void run() {
        for (int i=1;i<=10;i++){
            try {
                Thread.sleep(90);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            System.out.println("Table of 2*" + i + "= " + (i * 2));
        }
    }
}

class PrintNumberThread implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {

            try {
                Thread.sleep(100);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            System.out.println("number = " + i);
        }
    }
}


class ThousandTypeNumber extends Thread{
    @Override
    public void run() {
        for (int i = 1001; i <= 1100; i++) {

            try {
                Thread.sleep(100);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            System.out.println("Thousand numbers  = " + i);
        }
    }
}

