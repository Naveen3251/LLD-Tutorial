package design.patternsjava.FactoryMethod.strictType.java.ConcreteProducts;

import design.patternsjava.FactoryMethod.strictType.java.Product.Shape;

public class Circle implements Shape{

    @Override
    public void draw(){
     System.out.println("Drawing circle");

    }
    
}
