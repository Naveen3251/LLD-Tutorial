package design.patternsjava.FactoryMethod.strictType.java.ConcreteCreator;

import design.patternsjava.FactoryMethod.strictType.java.ConcreteProducts.Circle;
import design.patternsjava.FactoryMethod.strictType.java.Creator.AbstractShapeFactory;
import design.patternsjava.FactoryMethod.strictType.java.Product.Shape;

public class CircleFactory extends AbstractShapeFactory{
    protected Shape factoryMethod(){
        return new Circle();
    }
}
