package design.patternsjava.FactoryMethod.SimpleFactory.Client;

import design.patternsjava.FactoryMethod.SimpleFactory.Product.Shape;
import design.patternsjava.FactoryMethod.SimpleFactory.SimpleFactory.ShapeFactory;

public class Client {
    public static void main(String[] args){
        ShapeFactory shapeFactory=new ShapeFactory();
        Shape shape1=shapeFactory.getShape("Circle");
        shape1.draw();
         Shape shape2=shapeFactory.getShape("Rectangle");
         shape2.draw();
    }
    
}
