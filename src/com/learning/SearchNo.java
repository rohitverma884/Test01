package com.learning;

public class SearchNo {
    public static void main(String[] abc){
        /*int stuid[]={1,2,3,4,5,6,7,8,9,10};
        for(int i=0; i< stuid.length; i++){
            System.out.println(""+stuid[i]);
        }
        String studname[]={"A","B","C"};
        for(int i=0; i< studname.length; i++) {
            System.out.println("" + studname[i]);
        }*/

        SearchNo array= new SearchNo();
        array.findGtno(5);


    }

    public void findGtno(int x){
        int a[]={1,-21,5,50,15,20};
        int ispresent=0;

        for (int i=0; i<a.length; i++){
            if(a[i]==x){
                ispresent=1;
                break;
            }

        }
        if(ispresent==1){
            System.out.println("present");
        }
        else {
            System.out.println("not present");
        }

    }
}

