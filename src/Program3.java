public class Program3 {
    public static void main(String[] abc){

        boolean ispass=true;
        Program3 mytest=new Program3();
        boolean iseven=mytest.isevennumber(13);

        mytest.Multiply(1,5);
        mytest.Sub(4,5);
        mytest.Divition(1,1);
    }
    boolean isevennumber(int number){
        if(number%2==0){
            System.out.println("number is even");
            return true;
        }
        else{
            System.out.println("number is odd");
            return false;

        }
    }
    void Multiply(int a,int b){
        int c=a+b;
        System.out.println(""+c);
    }
    void Sub(int a,int b){
        int c=a-b;
        System.out.println(""+c);
    }
    void Divition(double a,double b){
        double c=a/b;
        System.out.println(""+c);

    }
}
