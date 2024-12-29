package Pages;

import StepDefinationAutomationTesting.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class indexPage {
    WebDriver driver;
    RegisterUserPage registerPage;

    @FindBy (xpath = "//button[text()='Skip Sign In']")
    WebElement skipSign_InButton;

    public indexPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void checkIndexTile(){
       String titleOfIndexPage = driver.getTitle();
        System.out.println("Title of the Index page : "+titleOfIndexPage);
        Assert.assertEquals(titleOfIndexPage,"Index");
    }
    public void clickSkipSigninPageButton(){
        skipSign_InButton.click();
    }

}
