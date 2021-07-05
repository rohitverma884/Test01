package com.learning;

public class Revers {
    public static void main(String[] abc){
        Revers reversname=new Revers();
        String xyz= reversname.reversAstring("rohit");
        System.out.println(xyz);
    }

        public String reversAstring(String input){
        String reversed="";
        char[] ch=input.toCharArray();
        int j=ch.length;
        for(int i=j; i>0;i--) {
            reversed= reversed + ch[i-1];
        }

        return reversed;
    }
}
