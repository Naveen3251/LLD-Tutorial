package design.patternsjava.FactoryMethod.strictType.java.Creator;

import design.patternsjava.FactoryMethod.strictType.java.Product.Shape;

public abstract class  AbstractShapeFactory {

    protected abstract Shape factoryMethod();

    public Shape getShape(){
        return factoryMethod();
    }
    
}
