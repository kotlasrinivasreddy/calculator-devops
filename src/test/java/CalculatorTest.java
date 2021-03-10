import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculatorTest {

    private static final double DELTA = 0.00000005;

    @Test
    public void squareRootPositive(){
        assertEquals("Positive Test Case: squareRoot, ", 5, Calculator.squareRoot(25), DELTA);
        assertEquals("Positive Test Case: squareRoot, ", 0, Calculator.squareRoot(0), DELTA);
        assertEquals("Positive Test Case: squareRoot, ", Double.NaN, Calculator.squareRoot(-5), DELTA);
    }

    @Test
    public void squareRootNegative(){
        assertNotEquals("Negative Test Case: squareRoot, ", 5, Calculator.squareRoot(89), DELTA);
        assertNotEquals("Negative Test Case: squareRoot, ", 25, Calculator.squareRoot(0), DELTA);
        assertNotEquals("Negative Test Case: squareRoot, ", 2.235, Calculator.squareRoot(-5), DELTA);
    }

    @Test
    public void factorialPositive() {
        assertEquals("Positive Test Case: Factorial, ", 24, Calculator.factorial(4), DELTA);
        assertEquals("Positive Test Case: Factorial, ", 6, Calculator.factorial(3), DELTA);
        assertEquals("Positive Test Case: Factorial, ", Double.NaN, Calculator.factorial(-10), DELTA);
    }

    @Test
    public void factorialNegative() {
        assertNotEquals("Negative Test Case: Factorial,", 224, Calculator.factorial(7), DELTA);
        assertNotEquals("Negative Test Case: Factorial,", 160, Calculator.factorial(5), DELTA);
        assertNotEquals("Negative Test Case: Factorial,", 89, Calculator.factorial(-25), DELTA);
    }

    @Test
    public void calPowPositive() {
        assertEquals("Positive Test Case: Power, ", 9, Calculator.cal_pow(3, 2), DELTA);
        assertEquals("Positive Test Case: Power,", 0.0625, Calculator.cal_pow(4, -2), DELTA);
        assertEquals("Positive Test Case: Power, ", Double.NaN, Calculator.cal_pow(0, 0), DELTA);
    }


    @Test
    public void calPowNegative() {
        assertNotEquals("Negative Test Case: Power, ", 25, Calculator.cal_pow(5, 5), DELTA);
        assertNotEquals("Negative Test Case: Power, ", 126, Calculator.cal_pow(3, 5), DELTA);
        assertNotEquals("Negative Test Case: Power, ", 8, Calculator.cal_pow(0, 0), DELTA);
    }

    @Test
    public void logPositive() {
        assertEquals("Positive Test Case: Log, ", 2.302585092994, Calculator.cal_natural_log(10), DELTA);
        assertEquals("Positive Test Case: Log, ", Double.NEGATIVE_INFINITY, Calculator.cal_natural_log(0), DELTA);
        assertEquals("Positive Test Case: Log, ", Double.NaN, Calculator.cal_natural_log(-7), DELTA);
    }

    @Test
    public void logNegative(){
        assertNotEquals("Negative Test Case: Log, ", 3.567, Calculator.cal_natural_log(4), DELTA);
        assertNotEquals("Negative Test Case: Log, ", 5, Calculator.cal_natural_log(45), DELTA);
        assertNotEquals("Negative Test Case: Log, ", 6, Calculator.cal_natural_log(-4), DELTA);
    }
}