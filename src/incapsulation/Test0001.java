package incapsulation;

public class Test0001 {
    int a = 8;
    double b =9;
    long  k = 0;
    String name = "Rohit";


    public void fun1(){
        System.out.println("fun1");
    }

    private void fun2(){
        System.out.println("fun2");
    }

     void fun3(){
        System.out.println("fun3");
    }
}


class Execute{
    public static void main(String anc[]){
        Test0001 t = new Test0001();// t--> test0001 heap in RAM

        t.fun1();
        t.fun3();
    }
}