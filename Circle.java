
/**
 * This is the Circle class, it is a subclass of Shape. It will take in 
 * a radius, then calculate the area and perimeter of it.
 */
public class Circle extends Shape
{
    private double radius;
    public Circle(String shape, double radius)
    {
        super(shape);
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        if(radius <= 0.0){
            return 0.0;
        }
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter(){
        if(radius <= 0.0){
            return 0.0;
        }
        return Math.PI * 2.0 * radius;
    }

}
