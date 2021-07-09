package com.learning;

public class Palindrome {
    public static void main(String[] abc) {
        Palindrome textis = new Palindrome();
        boolean ispelindrom=textis.inputtext("ekbbsj");

        if (ispelindrom) System.out.println("is palindrome");
        else System.out.println("not");


    }

    public boolean inputtext(String s) {
        boolean ispelindrom = false;
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                ispelindrom = true;
                i++;
                j--;
            }
            else {
                ispelindrom=false;
               break;
            }
        }
        return ispelindrom;

    }
}



