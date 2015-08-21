
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
    System.setProperty("webdriver.chrome.driver", "C:\\Job\\Framework\\New folder\\portal-tests-testng\\portal-tests-testng\\src\\test\\chromedriver.exe");
                driver= new ChromeDriver();
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
        Assert.assertEquals(false, false);
    }
}
