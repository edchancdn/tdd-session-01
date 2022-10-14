package ca.testautomation.session;

import ca.testautomation.session.BadDivisorException;
import ca.testautomation.session.Calculator;
import org.junit.*;
import org.junit.rules.ExpectedException;


// Use static import if you want to access the static members of a class
//import static org.junit.Assert.*;


public class CalculatorTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void multiplyTest() {
        long outcome = calculator.multiply(2, 2);
        Assert.assertEquals(4, outcome);
    }

    @Test
    public void multiplyTestNegativeValues() {
        long outcome = calculator.multiply(2, -2);
        Assert.assertEquals(-4, outcome);
    }

    @Test
    public void divisionTest() {
        long outcome = calculator.divide(4, 2);
        Assert.assertEquals(2, outcome);
    }

    @Test(expected = BadDivisorException.class)
    public void divisionTestZeroDivide() {
        long outcome = calculator.divide(4, 0);
        // Assert no needed here, as the expected
    }

    @Test
    public void arrayMatch() {
        int[] arr1 = {1,4,5};
        int[] arr3 = {1,4,5};
        int[] arr2 = {5,4,1};
        Assert.assertArrayEquals("Arrays don't match", arr1, arr3 );
    }

    @Test
    public void checkNull() {
        Assert.assertNull(calculator.getName());
        // Assert.assertNotNull("Get name is null", calculator.getName());
    }

    @Test
    public void AssertTrueFalse() {
        // Assert.assertTrue(2>1);
        Assert.assertFalse(2<1);
    }

    @Test
    public void testRule() {
        expectedException.expect(ArithmeticException.class);
        expectedException.expectMessage("/ by zero");
        int div = 2/0;

        expectedException.expect(NumberFormatException.class);
        Integer.parseInt("23s");
    }

    @After
    public void tearDown() {
        calculator = null;
    }

}
