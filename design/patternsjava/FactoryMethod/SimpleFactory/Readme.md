The second method involves creating a single concrete creator class
  1. Creator Class --> Concrete class
  2. You add implementation code to one factory method to create your product type based on a parameter passed to the method.
  3. To use the factory method (create objects) you create a instance of the creator class and invoke the factory method with an argument for your "class type"

  ADVANTAGE:
   1. Dont need to create a new subclass for every single product.

   ```mermaid
classDiagram
    %% Product Interface
    class Product {
        <<interface>>
        +operation()
    }

    %% Concrete Products
    class ConcreteProductA {
        +operation()
    }

    class ConcreteProductB {
        +operation()
    }

    Product <|.. ConcreteProductA
    Product <|.. ConcreteProductB

    %% Simple Factory
    class SimpleFactory {
        +createProduct(type: String) Product
    }

    SimpleFactory --> Product : creates
    SimpleFactory --> ConcreteProductA
    SimpleFactory --> ConcreteProductB

    %% Client
    class Client {
        +main()
    }

    Client --> SimpleFactory : uses
```

