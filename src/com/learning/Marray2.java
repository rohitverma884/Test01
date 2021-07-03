package com.learning;

public class Marray2 {
    public static void main(String[] abc){
        // int stu_ids[] = {1,2,3,4,6,7,8};
        int stu_ids[] = new int[100];

        for(int i= 1; i<=stu_ids.length; i++){
            int index = i-1;
            stu_ids[index] = i;
        }

        for(int i= 0; i<stu_ids.length; i++){
            System.out.println("value at index "+"i= "+stu_ids[i]);
        }
    }
}
