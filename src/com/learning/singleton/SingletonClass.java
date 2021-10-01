package com.learning.singleton;


public class SingletonClass {
    public int number = 5;
    static SingletonClass currentObject;

   private SingletonClass(){
    }

    public static SingletonClass getInstance(){
       if(currentObject==null) {
           currentObject = new SingletonClass();
       }
      return currentObject;
    }
}
