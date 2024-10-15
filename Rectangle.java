
/**
 * This is the Rectangle class it is a subclass of Shape. It will take in a 
 * length and width and then calculate and return the area and perimeter of the rectangle.
 */
public class Rectangle extends Shape
{
    private double length;
    private double width;
    public Rectangle(String shape, double length, double width)
    {
        super(shape);
        this.length = length;
        this.width = width;
    }
    
    @Override
    public double calculateArea(){
        double area = length * width;
        if(area <= 0.0){
            area = 0.0;
        }
        return area;
    }
    
    @Override
    public double calculatePerimeter(){
        double perimeter = 2 * (length + width);
        if(perimeter <= 0.0){
            perimeter = 0.0;
        }
        return perimeter;
    }

}
