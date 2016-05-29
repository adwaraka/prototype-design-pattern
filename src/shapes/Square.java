package shapes;
import shapepattern.Shape;

/**
 * Created by DarkPrince on 2/25/2016.
 */
public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw(){
        System.out.println("Inside Rectangle::draw() method.");
    }
}