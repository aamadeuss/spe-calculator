import spe.calculator.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test; 

public class CalcTest {
    private Main calculator;
    @Before
    public void setUp() {
        calculator = new Main();
    }
    //test
    @Test
    public void testAddition() {
        double val1 = 17.0;
        double val2 = 58.0;
        double expected_result = 75.0;
        double result = calculator.addition(val1, val2);
        Assert.assertEquals(expected_result, result, 0.0f);
    }
    @Test
    public void testSubtraction() {
        double val1 = 17.0;
        double val2 = 58.0;
        double expected_result = -41.0;
        double result = calculator.subtraction(val1, val2);
        Assert.assertEquals(expected_result, result, 0.0f);
    }
    @Test
    public void testMultiplication() {
        double val1 = 19.0;
        double val2 = 84.0;
        double expected_result = 1596.0;
        double result = calculator.multiplication(val1, val2);
        Assert.assertEquals(expected_result, result, 0.0f);
    }
    @Test
    public void testDivision() {
        double val1 = 19.0;
        double val2 = 84.0;
        double expected_result = 0.2261904761904762;
        double result = calculator.division(val1, val2);
        Assert.assertEquals(expected_result, result, 0.1f);
    }
    @Test
    public void testExponentiation() {
        double val1 = 16.0;
        double val2 = 2.0;
        double expected_result = 256.0;
        double result = calculator.exponentiation(val1, val2);
        Assert.assertEquals(expected_result, result, 0.0f);
    }
    @Test
    public void testSquareRoot() {
        double val1 = 16.0;
        double expected_result = 4.0;
        double result = calculator.squareRoot(val1);
        Assert.assertEquals(expected_result, result, 0.0f);
    }
    @Test
    public void testFactorial() {
        int val1 = 5;
        int expected_result = 120;
        int result = calculator.factorial(val1);
        Assert.assertEquals(expected_result, result);
    }
    @Test
    public void testNaturalLog() {
        double val1 = 2.718;
        double expected_result = 1.0;
        double result = calculator.naturalLogarithm(val1);
        Assert.assertEquals(expected_result, result, 0.2f);
    }
}
