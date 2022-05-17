package FactoryDesignPattern;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory_1 shapeFactory = new ShapeFactory_1();

        // get the circle shape
        shapeFactory.getShape("CIRCLE").draw();
        shapeFactory.getShape("SQUARE").draw();
        shapeFactory.getShape("RECTANGLE").draw();

    }
}
