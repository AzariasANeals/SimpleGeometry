
/**
 * This is the Triangle class, it is a subclass of Shape. It will take in 3 side values
 * and then return the area and perimeter of the triangle with those values.
 */
public class Triangle extends Shape
{
    private double side1;
    private double side2;
    private double side3;

    public Triangle(String shape, double side1, double side2, double side3)
    {
        super(shape);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

    }

    @Override
    public double calculateArea(){
        if(side1 <= 0.0 || side2 <= 0.0 || side3 <= 0.0){
            return 0.0;
        }
        double perimeter = calculatePerimeter();
        double s = perimeter/2.0d; 
        double x = s * (s-side1) * (s-side2) * (s-side3);
        return Math.sqrt(x);
    }

    @Override
    public double calculatePerimeter(){
        if(side1 <= 0.0 || side2 <= 0.0 || side3 <= 0.0){
            return 0.0;
        }
        return side1 + side2 + side3;
    }


}
