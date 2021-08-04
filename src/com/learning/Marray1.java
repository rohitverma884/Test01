package com.learning;

public class Marray1 {
    public static void main(String[] abc){
        /*int stuid[]={1,2,3,4,5,6,7,8,9,10};
        for(int i=0; i< stuid.length; i++){
            System.out.println(""+stuid[i]);
        }
        String studname[]={"A","B","C"};
        for(int i=0; i< studname.length; i++) {
            System.out.println("" + studname[i]);
        }*/

        Marray1 array= new Marray1();
        array.findGtno();


    }

    public void findGtno(){
        int a[]={1,-21,7,11,15,20};
        int gtn=0;
        for (int i=0; i<a.length; i++){
            if(a[i]>gtn){
                gtn=a[i];
            }

        }
        System.out.println(""+gtn);
    }
}
