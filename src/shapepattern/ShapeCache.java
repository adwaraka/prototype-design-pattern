package shapepattern;
import shapes.Square;
import shapes.Rectangle;
import java.util.Hashtable;

/**
 * Created by DarkPrince on 2/25/2016.
 */

public class ShapeCache {

    private static Hashtable<String, Shape> shapeMap  = new Hashtable<>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache() {
        Square square = new Square();
        square.setId("1");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(), rectangle);

        Rectangle rectangle2 = new Rectangle();
        rectangle2.setId("3");
        shapeMap.put(rectangle2.getId(), rectangle2);
    }
}
