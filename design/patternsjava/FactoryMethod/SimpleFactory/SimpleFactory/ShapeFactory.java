package design.patternsjava.FactoryMethod.SimpleFactory.SimpleFactory;

import design.patternsjava.FactoryMethod.SimpleFactory.ConcreteProducts.Circle;
import design.patternsjava.FactoryMethod.SimpleFactory.ConcreteProducts.Rectangle;
import design.patternsjava.FactoryMethod.SimpleFactory.Product.Shape;

public class ShapeFactory {
    
    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("circle")){
            return new Circle();
        }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        return null;
    }
}
