
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


/**
 * Created by New on 29.12.2014.
 */
public class TestClassOne {

    WebDriver driver;


    @BeforeTest
    public void before (){
    driver = new FirefoxDriver();
    }

    @Test
    public void testOne () {
        driver.get("http://vk.com/");
		
        Assert.assertEquals(true,true);
        System.out.println("ol ol ol ol ol ol +++++++++++++++++++");
        driver.quit();
    }

    @Test
    public void testTwo () {

        System.out.println("op op op op op op _______________--------------------");
        driver.quit();
        Assert.assertEquals(true, false);
    }
}
