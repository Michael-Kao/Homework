import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class objTest {
    private int result;

    @BeforeEach
    public void setUp() {
        obj obj = new obj();
        //print out
        System.out.println("Test start");
    }

    @AfterEach
    public void tearDown() {
        //print out
        System.out.println("Test end");
    }

    @Test
    public void objtest1() {
        result = obj.selectobj(1, 0, 1);
        assertEquals(0, result);
        //print out result
        System.out.println("Test1 result: " + result);
    }

    @Test
    public void objtest2() {
        result = obj.selectobj(2, 0, 1);
        assertEquals(1, result);
        //print out result
        System.out.println("Test2 result: " + result);
    }

    @Test
    public void objtest3() {
        result = obj.selectobj(2, 1, 2);
        assertEquals(2, result);
        //print out result
        System.out.println("Test3 result: " + result);
    }

    @Test
    public void objtest4() {
        result = obj.selectobj(3, 1, 2);
        assertEquals(2, result);
        //print out result
        System.out.println("Test4 result: " + result);
    }
}