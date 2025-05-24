package design.patternsjava.FactoryMethod.strictType.ConcreteCreator;

import design.patternsjava.FactoryMethod.strictType.ConcreteProducts.Rectangle;
import design.patternsjava.FactoryMethod.strictType.Creator.AbstractShapeFactory;
import design.patternsjava.FactoryMethod.strictType.Product.Shape;

public class RectangleFactory extends AbstractShapeFactory{
    
    protected Shape factoryMethod(){
        return new Rectangle();
    }
}
