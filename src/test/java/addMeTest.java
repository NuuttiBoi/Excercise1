import org.example.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class addMeTest {
    Calculator app = new Calculator();

    @Test
    public void addMeTest(){
        assertEquals(12, app.add(11,1));
    }
    @Test
    public void subtractTest(){
        assertEquals(10, app.subtract(15,5));
    }
    @Test
    public void multiplyTest(){
        assertEquals(25, app.multiply(5,5));
    }
    @Test
    public void divideTest(){
        assertEquals(2, app.divide(10,4));
    }
}
