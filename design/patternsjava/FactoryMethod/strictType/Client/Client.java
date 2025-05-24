package design.patternsjava.FactoryMethod.strictType.Client;

import design.patternsjava.FactoryMethod.strictType.ConcreteCreator.CircleFactory;
import design.patternsjava.FactoryMethod.strictType.ConcreteCreator.RectangleFactory;
import design.patternsjava.FactoryMethod.strictType.Product.Shape;

public class Client {
    public static void main(String[] args){

        //get an object of circle and call its draw method
        Shape shape1=new CircleFactory().getShape();
        shape1.draw();

        Shape shape2=new RectangleFactory().getShape();
        shape2.draw();


    }
    
}
