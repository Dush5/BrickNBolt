import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class NewTest {


    private WebDriver driver = new ChromeDriver();
    public static String title;

    @Test
    public void testEasy()
    {
        driver.get("http://www.grofers.com");
        title = driver.getTitle();
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MICROSECONDS);

    }

    @Test
    public void testValidate()
    {
        Assert.assertEquals(title,"Online Grocery Store: Buy Online Grocery from India's Best Online Supermarket at Discounted Rates | Grofers");
    }

    @Test
    public void testEnd()
    {
      driver.close();
    }

}
