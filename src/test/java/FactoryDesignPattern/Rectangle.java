package FactoryDesignPattern;

public class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Rectangle draw ");
    }
    public void draw(String name) {
        System.out.println("Inside Circle draw "+name);
    }
}
