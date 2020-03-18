import org.testng.Assert;
import org.testng.annotations.Test;

public class SubtractionTest {
    @Test
    public void testPositiveNumberSubtraction(){
        Subtraction subtraction = new Subtraction();
        int result = subtraction.subtractTwoNumbers(4, 3);
        Assert.assertEquals(result, 1);
    }

    @Test
    public void testSwappedPositiveNumberSubtraction(){
        Subtraction subtraction = new Subtraction();
        int result = subtraction.subtractTwoNumbers(3, 4);
        Assert.assertEquals(result, -1);
    }

    @Test
    public void testTwoNegativeNumberSubtraction(){
        Subtraction subtraction = new Subtraction();
        int result = subtraction.subtractTwoNumbers(-3, -3);
        Assert.assertEquals(result, 0);
    }

    @Test
    public void testOneNegativeNumberSubtraction(){
        Subtraction subtraction = new Subtraction();
        int result = subtraction.subtractTwoNumbers(3, -3);
        Assert.assertEquals(result, 6);
    }
}
