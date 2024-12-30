package StepDefinationAutomationTesting;

import com.beust.ah.A;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class switchToWindowsPage {
    WebDriver driver = Hooks.getDriver();



    @When("click Windows options")
    public void click_windows_options() {
      WebElement windowsOption = driver.findElement(By.xpath("//a[text()='Windows']"));
        Actions act = new Actions(driver);
        act.moveToElement(windowsOption).click().perform();
    }
    @Then("Windows page visible")
    public void windows_page_visible() {
        System.out.println("Title of the Page"+driver.getTitle());
    }

}
