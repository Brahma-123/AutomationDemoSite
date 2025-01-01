package StepDefinationAutomationTesting;

import Pages.WindowsPage;
import com.beust.ah.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class switchToWindowsPage {
    WebDriver driver = Hooks.getDriver();
    WindowsPage windowsPage;



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

    //Open new Tabbed windows Glue code

    @Given("user in Windows page")
    public void user_in_windows_page() {
        windowsPage = new WindowsPage(driver);
        windowsPage.getTitleName();
    }
    @When("user clicks New Tabbed windows button")
    public void user_clicks_new_tabbed_windows_button() {
        windowsPage.clickTabbedWindowButton();
    }
    @Then("_Blank text with Click button visible")
    public void _blank_text_with_click_button_visible() {
        windowsPage.getTextOfBlank();
    }
    @When("press click button")
    public void press_click_button() {
     windowsPage.pressBlankPageClickButton();

    }
    @Then("new window should open in same browser")
    public void new_window_should_open_in_same_browser() {
        windowsPage.titleOfTheNewWindow();
    }

    //Open new window Glue code

    @When("clicks new separate window button")
    public void clicks_new_separate_window_button() {
        windowsPage.clickNewSeparateWindowButton();
    }
    @Then("new window with Some specification text will be visible")
    public void new_window_with_some_specification_text_will_be_visible() {
       windowsPage.getTextNewWindowSpecification();
    }
    @When("Press click button from Seperate widow")
    public void press_click_button_from_seperate_widow() {
        windowsPage.pressTheClickButtonForNewWindowButton();
    }
    @Then("new separate window should open")
    public void new_separate_window_should_open() {
        windowsPage.navigateToNewGeneratedWindow();
    }

   // Open Multiple windows Glue code
    @When("clicks separate multiple windows button")
    public void clicks_separate_multiple_windows_button() {
        windowsPage.clickSeparateMultipleWindows();
    }
    @Then("open multiple windows text visible")
    public void open_multiple_windows_text_visible() {
        windowsPage.getTextOnSeparateMultipleWindows();
    }
    @When("press click button in Multiple Windows text section")
    public void press_click_button_in_multiple_windows_text_section() {
       windowsPage.pressSeparateMultipleWindowsClickButton();
    }
    @Then("New separate windows should be open")
    public void new_separate_windows_should_be_open() {
        windowsPage.multiNewSeparateWindowsNavigate();
    }



}
