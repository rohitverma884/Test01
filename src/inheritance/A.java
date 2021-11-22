package inheritance;

public class A {
    void fun1(){
        System.out.println("class A");
    }
}


class A1{
    void fun1(){
        System.out.println("class A1");
    }

}

class B1 extends A1{

}

class C1 extends B1{

}

interface I1{
    void funX1();
    void funX2();
}

interface I2{
    void funX1();
    void funX2();
}


abstract class Abs{
    abstract void abc1();

    void abc2(){

    }
}

class X1 extends Abs implements I1, I2{


    @Override
    void abc1() {

    }

    @Override
    public void funX1() {

    }

    @Override
    public void funX2() {

    }
}


