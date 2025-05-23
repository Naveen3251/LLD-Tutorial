package design.patternsjava.FactoryMethod.strictType.java.ConcreteCreator;

import design.patternsjava.FactoryMethod.strictType.java.ConcreteProducts.Rectangle;
import design.patternsjava.FactoryMethod.strictType.java.Creator.AbstractShapeFactory;
import design.patternsjava.FactoryMethod.strictType.java.Product.Shape;

public class RectangleFactory extends AbstractShapeFactory{
    
    protected Shape factoryMethod(){
        return new Rectangle();
    }
}
