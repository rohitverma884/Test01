package com.learning;

public class Sum {
    public static void main(String[] abc){
        Sum sumvalue=new Sum();
        sumvalue.totalnumbers(2);
    }
    void totalnumbers(int n){

        int sum=0;
        for (int i=1; i<=n; i++){

        sum= sum+i;
        }
        System.out.println("sum of numbers ="+ sum);
        System.out.println("sum = "+(n*(n+1))/2);

    }


}
