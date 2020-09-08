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
    private String URL;

    public void setURL(String url){
        URL = url;
    }

    public String getURL(){
         return URL;
    }

    @BeforeTest
     public void startChrome() {
        System.out.println("Starting webdriver now");
        WebDriverManager.chromedriver().setup();
        PropertiesExtractor ex = new PropertiesExtractor();
        URL = ex.getProperty("URL");
        System.out.println("Navigating to " + URL);
        driver = new ChromeDriver();
        driver.get(URL);
    }

    @AfterTest
    public void closeChrome(){
         System.out.println("Stopping webdriver now");
         driver.close();
         driver.quit();
    }
}
//Todo
//1) Create a way for always navigating to specific website [\/]
//2) Create a way of easily accessing test data that create
//3) Create Login for website that should be used.
//4) Create basic tests
//5) Learn how the reporting works.