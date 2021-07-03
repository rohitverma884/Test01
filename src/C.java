public class C {
    public static void main(String[] abc){
        boolean ispass=true;
        C mytest = new C();
        boolean iseven = mytest.isvevennumber(12);

    }
    boolean isvevennumber(int number){
        if(number%2==0){
            System.out.println("number is even");
            return true;
        }
        else{
            System.out.println("number is odd");
            return false;
        }
    }

}