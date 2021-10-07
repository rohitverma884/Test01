package StaticTest;

public class MyStaticTest {

    MyStaticTest s1;
    static int number = 7;
    int num2 =8;

    public void fun1(){
        System.out.println("fun1 function");
        fun2();
    }

    public void fun2(){
        s1.fun1();
        System.out.println("fun2 function");
        fun1();
    }

    public static void fun3(){
        System.out.println("fun3");
    }

    public static void main(String abc[]){
        System.out.println("main function");

        MyStaticTest s = new MyStaticTest(); // s---pointing to-> memory location
        s.fun1();
        fun3();

        number =9;
    }
}
