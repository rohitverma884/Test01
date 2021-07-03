package com.learning;

public class Primenumber1 {
    public static void main(String[] abc) {
        Primenumber1 number = new Primenumber1();
        number.numberis(5);
    }

    void numberis(int a) {
        boolean isprime=false;//1,
        if (a==2|| a==1){
            System.out.println("prime number");
        return;
        }
        for (int i = 2; i < a; i++) {
            if (a % i == 0){
                isprime=false;
                break;
            }
            else {
                isprime=true;
            }
        }
        if(isprime) System.out.println("prime number");
        else System.out.println("not prime");

    }
}
