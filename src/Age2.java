public class Age2 {
    public static void main(String[] abc){
        Age2 mytest=new Age2();
        mytest.Agetest(52);
    }
    void Agetest(int age){
        if(age>0 && age<11){
            System.out.println("kids");
        }
        else if(age>10 && age<21){
            System.out.println("teen");
        }
        else if(age>20 && age<41){
            System.out.println("young");
        }
        else{
            System.out.println("old");
        }
    }
}
