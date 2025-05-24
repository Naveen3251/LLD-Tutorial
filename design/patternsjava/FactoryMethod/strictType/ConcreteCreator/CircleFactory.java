package design.patternsjava.FactoryMethod.strictType.ConcreteCreator;

import design.patternsjava.FactoryMethod.strictType.ConcreteProducts.Circle;
import design.patternsjava.FactoryMethod.strictType.Creator.AbstractShapeFactory;
import design.patternsjava.FactoryMethod.strictType.Product.Shape;

public class CircleFactory extends AbstractShapeFactory{
    protected Shape factoryMethod(){
        return new Circle();
    }
}
