package design.patternsjava.FactoryMethod.strictType.java.ConcreteProducts;

import design.patternsjava.FactoryMethod.strictType.java.Product.Shape;

public class Rectangle implements Shape{
    @Override
    public void draw(){
        System.out.println("Drawing Rectangle");
    }
    
}
