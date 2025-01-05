package StepDefinationAutomationTesting;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class Hooks {
    private  static WebDriver driver;

    @Before
    public void initializeBrowser(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public static WebDriver getDriver(){
        return driver;
    }
    @After
    public void closeBrowser(){
        if (driver!= null){

            driver.quit();
        }
    }
}
