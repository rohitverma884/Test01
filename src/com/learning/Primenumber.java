package com.learning;

public class Primenumber {
    public static void main(String[] abc){
        Primenumber number= new Primenumber();
        number.numbertype(4589);
    }
    void numbertype(int a){
        if(a%2==0 && a>2){
            System.out.println("non prime");
        }
        else if(a%3==0 && a>3){
                System.out.println("non prime");
            }
        else {
            System.out.println("prime");
        }



        }

    }

