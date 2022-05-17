package FactoryDesignPattern;

public class Circle implements Shape{


    public void draw() {
        System.out.println("Inside Circle draw ");
    }


    public void draw(String name) {
        System.out.println("Inside Circle draw "+name);
    }


}
