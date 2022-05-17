package FactoryDesignPattern;

public class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Square draw ");
    }
    public void draw(String name) {
        System.out.println("Inside Circle draw "+name);
    }
}
