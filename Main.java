import java.util.ArrayList;
/**
 * This is the Main class for SimpleGeometry. To start it simply create a Circle, Rectangle, 
 * or Triangle and insert the appropriate values for each one. Then add these to the "shapes" ArrayList
 * and run the program! 
 */

public class Main
{
    public static void main(String[] args) throws Exception{
    Circle circle = new Circle("Circle", 1);
    Rectangle rectangle = new Rectangle("Rectangle", 6, 8);
    Triangle triangle = new Triangle("Triangle", 3, 4, 5);
    
    ArrayList<Shape> shapes = new ArrayList<Shape>();
    shapes.add(circle);
    shapes.add(rectangle);
    shapes.add(triangle);
    
    for (Shape s: shapes){
        s.calculateArea();
        s.calculatePerimeter();
        s.displayInfo();
        System.out.println();
    }
        
    }
}
