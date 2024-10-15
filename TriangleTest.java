

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class TriangleTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TriangleTest
{
    /**
     * Default constructor for test class TriangleTest
     */
    public TriangleTest()
    {
    }
    
    @Test
    public void testValidArea(){
        double expected = 10.825317547305483;
        double side1 = 5.0;
        double side2 = 5.0;
        double side3 = 5.0;
        Triangle tester = new Triangle("Triangle", side1, side2, side3);
        double area = tester.calculateArea();
        
        assertEquals(expected, area);
        
    }
    
    @Test
    public void testValidPerimeter(){
        double expected = 15.0;
        double side1 = 5.0;
        double side2 = 5.0;
        double side3 = 5.0;
        Triangle tester = new Triangle("Triangle", side1, side2, side3);
        double perimeter = tester.calculatePerimeter();
        
        assertEquals(expected, perimeter);
    }

    @Test
    public void testInvalidArea(){
        double expected = 0.0;
        double side1 = -5.0;
        double side2 = 5.0;
        double side3 = 5.0;
        Triangle tester = new Triangle("Triangle", side1, side2, side3);
        double area = tester.calculateArea();
        
        assertEquals(expected, area);
        
    }
    
    @Test
    public void testInvalidPerimeter(){
        double expected = 0.0;
        double side1 = -5.0;
        double side2 = 5.0;
        double side3 = 5.0;
        Triangle tester = new Triangle("Triangle",side1, side2, side3);
        double perimeter = tester.calculatePerimeter();
        
        assertEquals(expected, perimeter);
    }    
    
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
