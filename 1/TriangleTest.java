import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.*;

public class TriangleTest {
    private Triangle triangle;
    private String result;

    @BeforeEach
    public void setUp() {
        //print out
        System.out.println("Before each test");
        triangle = new Triangle();
    }

    @Test
    public void testTriangle1() {
        result = triangle.determineTriangle(1, 1, 1);
        assertEquals("Regular triangle", result);
    }

    @Test
    public void testTriangle2() {
        result = triangle.determineTriangle(3, 3, 5);
        assertEquals("Isosceles triangle", result);
    }

    @Test
    public void testTriangle3() {
        result = triangle.determineTriangle(1, 1, 2);
        assertEquals("Not a triangle", result);
    }

    @Test
    public void testTriangle4() {
        result = triangle.determineTriangle(3, 4, 5);
        assertEquals("Right triangle", result);
    }

    @Test
    public void testTriangle5() {
        result = triangle.determineTriangle(0, 0, 0);
        assertEquals("Not a triangle", result);
    }

    @Test
    public void testTriangle6(){
        result = triangle.determineTriangle2(1, 1, 1);
        assertEquals("Regular triangle", result);
    }

    @Test
    public void testTriangle7(){
        result = triangle.determineTriangle2(3, 3, 5);
        assertEquals("Isosceles triangle", result);
    }

    @Test
    public void testTriangle8(){
        result = triangle.determineTriangle2(1, 1, 2);
        assertEquals("Not a triangle", result);
    }

    @Test
    public void testTriangle9(){
        result = triangle.determineTriangle2(3, 4, 5);
        assertEquals("Right triangle", result);
    }

    @Test
    public void testTriangle11(){
        result = triangle.determineTriangle2(3, 4, 6);
        assertEquals("Be a triangle", result);
    }

    @Test
    public void testTriangle12(){
        result = triangle.determineTriangle(3, 4, 6);
        assertEquals("Be a triangle", result);
    }

    @Test
    public void testTriangle10(){
        result = triangle.determineTriangle2(0, 0, 0);
        assertEquals("Not a triangle", result);
    }

    @AfterEach
    public void tearDown() {
        //print out
        System.out.println("After each test");
    }

    @AfterAll
    public static void tearDownAll() {
        //print out
        System.out.println("After all test");
    }

    @BeforeAll
    public static void setUpAll() {
        //print out
        System.out.println("Before all test");
    }
}
