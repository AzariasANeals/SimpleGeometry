

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CircleTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CircleTest
{
    /**
     * Default constructor for test class CircleTest
     */
    public CircleTest()
    {
    }

    @Test
    public void testValidArea(){
        double expected = 78.53981633974483;
        double radius = 5.0;
        Circle tester = new Circle("Circle", 5);
        double area = tester.calculateArea();
        
        assertEquals(expected, area);
    }
    
    @Test
    public void testValidPerimeter(){
        double expected = 31.41592653589793;
        double radius = 5.0;
        Circle tester = new Circle("Circle", 5);
        double perimeter = tester.calculatePerimeter();
        
        assertEquals(expected, perimeter);
    }
    
    @Test
    public void testInvalidArea(){
        double expected = 0.0;
        double radius = -5.0;
        Circle tester = new Circle("Circle", radius);
        double area = tester.calculateArea();
        
        assertEquals(expected, area);
    }
    
    @Test
    public void testInvalidPerimeter(){
        double expected = 0.0;
        double radius = -5.0;
        Circle tester = new Circle("Circle", radius);
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
