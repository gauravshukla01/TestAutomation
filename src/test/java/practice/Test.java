package practice;

public class Test {
}

class Vehicle{
    String type = "4W";
    int maxSpeed = 100;
    Vehicle(){}
    Vehicle(String type, int maxSpeed){
        this.type= type;
        this.maxSpeed = maxSpeed;
    }

}
class Car extends Vehicle{
    String trans;
    Car(String trans){
       this.trans = trans;
    }
    Car(String type, int speed, String trans){
        super(type, speed);
       // this(trans);
    }
}