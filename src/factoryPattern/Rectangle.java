package factoryPattern;


//Step 2
//Create concrete classes implementing the same interface.
//Rectangle.java
public class Rectangle implements Shape{
    @Override
    public void draw(){
        System.out.println("Inside Rectangle::draw() method.");
    }
}
