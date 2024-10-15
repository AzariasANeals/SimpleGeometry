
/**
 * This is the Shape class, it will take in Shapes and 
 * calculate the area, perimeter, and return the information to the user.
 *
 */
public abstract class Shape
{
    private String shape;


    public Shape(String shape)
    {
        this.shape = shape;
    }
    
    public String getShape(){
        return shape;
    }
    
    public abstract double calculateArea();
    
    public abstract double calculatePerimeter();
    
    public void displayInfo(){
        System.out.println("--SHAPE INFO--");
        System.out.println("Shape: " + shape);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }

}
