package Pages;

import io.cucumber.java.en_old.Ac;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AutoCompletePage {
    WebDriver driver;

    public AutoCompletePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//a[contains(text(),'AutoComplete')]")
    WebElement autoCompleteButton;

    //Text on Autocomplete page
    @FindBy(id = "somelem")
    WebElement textOnThePage;

    //Search box
    @FindBy(id = "searchbox")
    WebElement searchBox;

    // Input giving for Country
    @FindBy(xpath = "//a[text()='India']")
    WebElement searchCountryInDropdown;

    //Cross icon on selected country
    @FindBy(xpath = "//span[@class='ui-icon ui-icon-close']")
    WebElement crossIcon;

    public void navigateToAutoCompletePage(){
        Actions navigateAutoComplete = new Actions(driver);
        navigateAutoComplete.moveToElement(autoCompleteButton).click().perform();
      String titleOfTheAutoCompletePage =  driver.getTitle();
        System.out.println("Title of the Auto complete page : "+ titleOfTheAutoCompletePage);
       String actualTextOnAutoCompletePage = textOnThePage.getText();
       String expectedTextOnAutoCompletePage ="Check the autocomplete functionality here";
        Assert.assertTrue(actualTextOnAutoCompletePage.contains(expectedTextOnAutoCompletePage),"Both Text are not matched on Auto complete page");
    }

    public void enterTheCountryName(String countryName){
        searchBox.sendKeys(countryName);
    }

    public void selectTheCountryNameFromDropdown(){
        Actions selectCountry = new Actions(driver);
        selectCountry.moveToElement(searchCountryInDropdown).click().perform();
    }
    public void clearTheCountry(){
        crossIcon.click();
    }
}
