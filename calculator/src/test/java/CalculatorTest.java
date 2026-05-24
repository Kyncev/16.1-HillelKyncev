import org.junit.jupiter.api.Test;
import org.example.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {

        assertEquals(49, calculator.add(17, 32));
    }

    @Test
    public void testSubtract() {

        assertEquals(13, calculator.subtract(25, 12));
    }

    @Test
    public void testMultiply() {

        assertEquals(64, calculator.multiply(4, 16));
    }

    @Test
    public void testDivide() {

        assertEquals(3.75, calculator.divide(15, 4));
    }
}