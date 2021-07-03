package com.learning;

import java.lang.module.FindException;

public class Marray4 {
    public static void main(String[] abc){
        // int stu_ids[] = {1,2,3,4,6,7,8};
        int stu_ids[] = new int[100];

        for(int i= 1; i<=stu_ids.length; i++){
            int index = i-1;
            stu_ids[index] = i;
        }
         boolean isfound=false;
        for(int i= 0; i<stu_ids.length; i++){
            if(stu_ids[i]==70){
                //System.out.println("value found");
                isfound=true;
             break;
            }
        }

        if(isfound){
            System.out.println("value found");
        }
        else{
            System.out.println("value not found");
        }
    }
}
