import org.testng.Assert;
import org.testng.annotations.Test;

public class NamesCountTest {
    @Test
    public void testAddShortName(){
        NamesCount namesCount = new NamesCount();
        String testName = "DJ";

        namesCount.addName(testName);
        Assert.assertEquals(namesCount.getCounts().get(testName), 1.0);
    }

    @Test
    public void testAddLongName(){
        NamesCount namesCount = new NamesCount();
        String testName = "Janice /“ Lokelani /” Keihanaikukauakahihuliheekahaunaele";

        namesCount.addName(testName); //Longest name in the world? http://elitedaily.com/news/world/janice-keihanaikukauakahihuliheekahaunaele-is-furious-her-name-doesnt-fit-state-issued-id/
        Assert.assertEquals(namesCount.getCounts().get(testName), 1.0);
    }

    @Test
    public void testNameProportionWithTwoUniqueNames(){
        NamesCount namesCount = new NamesCount();
        //With enough time, I'd ideally add this in a setup function...see my Selenium solution which has that implemented
        namesCount.addName("James");
        namesCount.addName("John");

        Assert.assertEquals(namesCount.nameProportion("James"), 0.5);
        Assert.assertEquals(namesCount.nameProportion("John"), 0.5);
    }

    @Test
    public void testNameProportionWithSeveralDuplicateNames(){
        NamesCount namesCount = new NamesCount();
        //With enough time, I'd ideally add this in a setup...see my Selenium solution which has that implemented
        namesCount.addName("James");
        namesCount.addName("James");
        namesCount.addName("James");
        namesCount.addName("John");
        namesCount.addName("John");
        namesCount.addName("John");
        namesCount.addName("Mary");

        Assert.assertEquals(namesCount.nameProportion("James"), 0.42857142857142855);
        Assert.assertEquals(namesCount.nameProportion("John"), 0.42857142857142855);
        Assert.assertEquals(namesCount.nameProportion("Mary"), 0.14285714285714285);
    }
}
