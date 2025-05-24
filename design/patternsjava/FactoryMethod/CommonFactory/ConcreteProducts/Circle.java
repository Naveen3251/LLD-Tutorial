package design.patternsjava.FactoryMethod.SimpleFactory.ConcreteProducts;

import design.patternsjava.FactoryMethod.SimpleFactory.Product.Shape;

public class Circle implements Shape{
    @Override
    public void draw(){
        System.out.println("Hey Drawing Circle");
    }
    
}
