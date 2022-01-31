import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;
    @Before
    public void before(){
        calculator = new Calculator();
    }
    @Test
    public void add5to7equals12(){
        assertEquals(12, calculator.add(5,7));
    }

    @Test
    public void subtract12from7equals5(){
        assertEquals(5, calculator.subtract(12,7));
    }

    @Test
    public void multiply2with6equals12(){
        assertEquals(12, calculator.multiply(2,6));
    }

    @Test
    public void divide12by6equals2(){
        assertEquals(2.00, calculator.divide(12.00, 6.00), 0.1);
    }
}
