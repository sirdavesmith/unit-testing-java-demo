import org.testng.Assert;
import org.testng.annotations.Test;

public class AdditionInterfaceTest {
    @Test
    public void testPositiveNumberAddition(){
        AdditionInterface additionInterface = new AdditionInterfaceImpl();
        int result = additionInterface.addTwoNumbers(1, 2);
        Assert.assertEquals(result, 3);
    }

    @Test
    public void testNegativeNumberAddition(){
        AdditionInterface additionInterface = new AdditionInterfaceImpl();
        int result = additionInterface.addTwoNumbers(-6, -6);
        Assert.assertEquals(result, -12);
    }

    @Test
    public void testPositiveAndNegativeNumberAddition(){
        AdditionInterface additionInterface = new AdditionInterfaceImpl();
        int result = additionInterface.addTwoNumbers(-6, 10);
        Assert.assertEquals(result, 4);
    }

    @Test
    public void testResultAsStringAddition(){
        AdditionInterfaceImpl additionInterface = new AdditionInterfaceImpl();
        String result = additionInterface.returnAsString(2, 2);
        Assert.assertEquals(result, "4");
    }
}
