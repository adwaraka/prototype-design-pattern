package shapes;
import shapepattern.Shape;

/**
 * Created by DarkPrince on 2/25/2016.
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}