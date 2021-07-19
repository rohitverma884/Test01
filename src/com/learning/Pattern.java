package com.learning;

public class Pattern {
    public static void main(String[] abc) {
        Pattern pattern1 = new Pattern();
        pattern1.number2(5);
    }

    void number(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("" + i);
            for(int j=1;j<=n-1;j++){
                System.out.print(""+i);
            }
            System.out.print("\n");
        }
    }
    void number2(int n) {
        for (int i = 1; i <= n; i++) {
            //System.out.print("" + i);
            for(int j=1;j<=n;j++){
                System.out.print(""+i);
            }
            System.out.print("\n");
        }
    }
}
