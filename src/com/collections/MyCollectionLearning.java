package com.collections;

import java.util.ArrayList;
import java.util.List;

public class MyCollectionLearning {

    public static void main(String abc[]){
        int a[] = {1,2,3,4,5,6};

        int b[]=new int[10];

        int c[] = new int[100];

        ArrayList<Integer> ar = new ArrayList();
        for(int i=1;i<=100;i++){
            ar.add(i);
            //c[i-1] = i;
        }

        System.out.println(" list size "+ar.size());

        List<String> ls = new ArrayList<>();


    }
}
