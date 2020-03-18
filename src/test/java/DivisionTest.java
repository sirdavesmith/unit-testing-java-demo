import org.testng.Assert;
import org.testng.annotations.Test;

public class DivisionTest {
    @Test
    public void testPositiveNumberDivision(){
        Division division = new Division();
        int result = division.divideTwoNumbers(10, 2);
        Assert.assertEquals(result, 5);
    }

    @Test
    public void testOneNegativeNumberDivision(){
        Division division = new Division();
        int result = division.divideTwoNumbers(-2, 2);
        Assert.assertEquals(result, -1);
    }

    @Test
    public void testSwappedOneNegativeNumberDivision(){
        Division division = new Division();
        int result = division.divideTwoNumbers(2, -2);
        Assert.assertEquals(result, -1);
    }

    @Test
    public void testPositiveDivisionByNumberOne(){
        Division division = new Division();
        int result = division.divideTwoNumbers(1, 1);
        Assert.assertEquals(result, 1);
    }

    @Test
    public void testOneNegativeDivisionByNumberOne(){
        Division division = new Division();
        int result = division.divideTwoNumbers(-1, 1);
        Assert.assertEquals(result, -1);
    }

    @Test
    public void testTwoNegativeDivisionByNumberOne(){
        Division division = new Division();
        int result = division.divideTwoNumbers(-1, -1);
        Assert.assertEquals(result, 1);
    }

    @Test
    public void testZeroByOneDivisio(){
        Division division = new Division();
        int result = division.divideTwoNumbers(0, 1);
        Assert.assertEquals(result, 0);
    }

    @Test
    public void testDivisionByZero(){
        Division division = new Division();
        int result = division.divideTwoNumbers(1, 0);
        Assert.assertEquals(result, 0); //Would return undefined if I wanted it to crash
    }

    @Test
    public void testRoundUpDivision(){
        Division division = new Division();
        int result = division.divideTwoNumbers(10, 3);
        Assert.assertEquals(result, 3);
    }
}
