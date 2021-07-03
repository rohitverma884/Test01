public class Myprogram {

    public static void main(String[] abcd) {
        Myprogram mytest = new Myprogram();
        //mytest.checkEvenOrOddNumber(106);
        //mytest.multyply(2,5);
        mytest.addition(5,6);
        mytest.substration(100,6);
    }

    void checkEvenOrOddNumber(int number) {
        if (number % 2 == 0) {
            System.out.println("An even number");
        } else {
            System.out.println("An odd number");
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
    void substration(int a,int b){
        int c=a-b;
        System.out.println(""+c);

    }

}