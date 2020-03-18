import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiplicationTest {
    @Test
    public void testPositiveNumberMultiplication(){
        Multiplication multiplication = new Multiplication();
        int result = multiplication.multiplyTwoNumbers(5, 6);
        Assert.assertEquals(result, 30);
    }

    @Test
    public void testTwoNegativeNumberMultiplication(){
        Multiplication multiplication = new Multiplication();
        int result = multiplication.multiplyTwoNumbers(-5, -6);
        Assert.assertEquals(result, 30);
    }

    @Test
    public void testOneNegativeNumberMultiplication(){
        Multiplication multiplication = new Multiplication();
        int result = multiplication.multiplyTwoNumbers(5, -6);
        Assert.assertEquals(result, -30);
    }

    @Test
    public void testMultiplicationByNumberOne(){
        Multiplication multiplication = new Multiplication();
        int result = multiplication.multiplyTwoNumbers(10, 1);
        Assert.assertEquals(result, 10);
    }

    @Test
    public void testMultiplicationByZero(){
        Multiplication multiplication = new Multiplication();
        int result = multiplication.multiplyTwoNumbers(10, 0);
        Assert.assertEquals(result, 0);
    }
}
