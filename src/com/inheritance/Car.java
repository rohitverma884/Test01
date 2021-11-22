package com.inheritance;

public abstract class Car {

    int getNoOfTyeres(){
        return 4;
    }

    abstract int getEngineNumber();

    int getEngineCapacity(){
        return 5;
    }

}


class Toyota extends Car{
    int getEngineNumber(){
        return 4567;
    }
}

class BMW extends Car{
    int getEngineNumber(){
        return 4967;
    }
}


class XyzCar extends Car{
    int getNumberOfTyeres(){
        return 6;
    }

    int getEngineNumber(){
        return 4967;
    }

}