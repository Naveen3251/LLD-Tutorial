package design.patternsjava.FactoryMethod.strictType.ConcreteProducts;

import design.patternsjava.FactoryMethod.strictType.Product.Shape;

public class Rectangle implements Shape{
    @Override
    public void draw(){
        System.out.println("Drawing Rectangle");
    }
    
}
