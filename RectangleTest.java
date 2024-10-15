

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class RectangleTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class RectangleTest
{
    /**
     * Default constructor for test class RectangleTest
     */
    public RectangleTest()
    {
    }

    @Test
    public void testValidArea(){
        double expected = 30.0;
        double length = 6.0;
        double width = 5.0;
        Rectangle tester = new Rectangle("Rectangle", length, width);
        double area = tester.calculateArea();
        
        assertEquals(expected, area);
    }
    
    @Test
    public void testValidPerimeter(){
        double expected = 22.0;
        double length = 6.0;
        double width = 5.0;
        Rectangle tester = new Rectangle("Rectangle", length, width);
        double perimeter = tester.calculatePerimeter();
        
        assertEquals(expected, perimeter);
        
    }
    
    @Test
    public void testInvalidArea(){
        double expected = 0.0;
        double length = -6.0;
        double width = 5.0;
        Rectangle tester = new Rectangle("Rectangle", length, width);
        double area = tester.calculateArea();
        
        assertEquals(expected, area);
    }
    
    @Test
    public void testInvalidPerimeter(){
        double expected = 0.0;
        double length = -6.0;
        double width = 5.0;
        Rectangle tester = new Rectangle("Rectangle", length, width);
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
