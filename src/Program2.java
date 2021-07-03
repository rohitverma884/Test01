public class Program2 {
    public static void main(String[] aaa){
        Program2 mytest = new Program2();
        mytest.EvenorOddNumber(12585);
        mytest.multyply(4,5);
        mytest.addition(7,8);
        mytest.substraction(50,60);
        mytest.divition(1,5);
        mytest.percentage(5,120);
    }
    void EvenorOddNumber(int number){
        if (number % 2==0){
            System.out.println("number is even");
        }
        else {
            System.out.println("number is odd");
        }
    }
    void multyply(int a,int b){
        int c=a*b;
        System.out.println(""+c);
    }
    void addition(int a,int b){
        int c=a+b;
        System.out.println(""+c);
    }
    void substraction(int a,int b){
        int c=a-b;
        System.out.println(""+c);
    }
    void divition(float a,float b){
        float c=a/b;
        System.out.println(""+c);
    }
    void percentage(float a,float b){
        float c=(a/b)*100;
        System.out.println(""+c);
    }
}
