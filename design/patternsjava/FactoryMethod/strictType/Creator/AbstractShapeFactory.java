package design.patternsjava.FactoryMethod.strictType.Creator;

import design.patternsjava.FactoryMethod.strictType.Product.Shape;

public abstract class  AbstractShapeFactory {

    protected abstract Shape factoryMethod();

    public Shape getShape(){
        return factoryMethod();
    }
    
}
