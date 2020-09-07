import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.github.bonigarcia.wdm.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.rmi.Remote;

public class BaseTest {

    private RemoteWebDriver driver;

    @BeforeTest
     public void startChrome() {
        System.out.println("Starting webdriver now");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterTest
    public void closeChrome(){
         System.out.println("Stopping webdriver now");
         driver.close();
         driver.quit();
    }
}
