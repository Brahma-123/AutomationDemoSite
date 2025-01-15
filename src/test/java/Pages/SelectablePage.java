package Pages;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.security.cert.X509Certificate;

public class SelectablePage {
    WebDriver driver;

    public SelectablePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Navigate to Selectable page elements
    @FindBy(xpath = "//a[contains(text(),'Selectable')]")
    WebElement selectableOption;
    String expectedSelectableTitle = "Selectable";
    @FindBy(xpath = "//a[contains(text(),'Default Functionality')]")
    WebElement defaultFunctionalityTab;

    //Elements for Default functionalities elements
    @FindBy(xpath = "//div[@id='Default']/ul/li/b[contains(text(),'Readability')]")
    WebElement readabilityElement;
    @FindBy(xpath = "//div[@id='Default']/ul/li/b[contains(text(),'Single Line Coding')]")
    WebElement singleLineCodeElement;
    @FindBy(xpath = "//div[@id='Default']/ul/li/b[contains(text(),'Method Chaining')]")
    WebElement methodChainingElement;
    @FindBy(xpath = "//div[@id='Default']/ul/li/b[contains(text(),'Cross Browser Testing')]")
    WebElement crossBrowserTestingElement;
    @FindBy(xpath = "//div[@id='Default']/ul/li/b[contains(text(),'Extent Reports')]")
    WebElement extentReportsElement;
    @FindBy(xpath = "//div[@id='Default']/ul/li/b[contains(text(),'Data Driven Testing')]")
    WebElement dateDrivenTestingElement;
    @FindBy(xpath = "//div[@id='Default']/ul/li/b[contains(text(),'Functional Testing')]")
    WebElement functionalTestingElement;

    //Serialize page element
    @FindBy(xpath = "//a[contains(text(),'Serialize')]")
    WebElement serializeTab;
    @FindBy(xpath = "//p[@id='feedback']/span")
    WebElement feedBackResult;
    @FindBy(xpath = "//p[@id='feedback']/span[@id='result']")
    WebElement selectedItem;

   @FindBy(xpath = "//div[@id='Serialize']/ul/li/b[contains(text(),'Readability')]")
   WebElement serialize_ReadabilityElement;
    @FindBy(xpath = "//div[@id='Serialize']/ul/li/b[contains(text(),'Single Line Coding')]")
    WebElement serialize_SingleLineCodeElement;
    @FindBy(xpath = "//div[@id='Serialize']/ul/li/b[contains(text(),'Method Chaining')]")
    WebElement serialize_MethodChainingElement;
    @FindBy(xpath = "//div[@id='Serialize']/ul/li/b[contains(text(),'Cross Browser Testing')]")
    WebElement serialize_CrossBrowserTestingElement;
    @FindBy(xpath = "//div[@id='Serialize']/ul/li/b[contains(text(),'Extent Reports')]")
    WebElement serialize_ExtentReportsElement;
    @FindBy(xpath = "//div[@id='Serialize']/ul/li/b[contains(text(),'Data Driven Testing')]")
    WebElement serialize_DateDrivenTestingElement;
    @FindBy(xpath = "//div[@id='Serialize']/ul/li/b[contains(text(),'Functional Testing')]")
    WebElement serialize_FunctionalTestingElement;


    //Navigate to Selectable page Method
    public void navigateToSelectablePage() {
        Actions selectable = new Actions(driver);
        selectable.moveToElement(selectableOption).click().perform();
        String titleOfSelectablePage = driver.getTitle();
        System.out.println("Title of Selectable page : " + titleOfSelectablePage);
        Assert.assertEquals(titleOfSelectablePage, expectedSelectableTitle);
    }

    public void selectDefaultFunctionality() {
        if (defaultFunctionalityTab.isSelected()) {
            System.out.println("Default functionality tab is already selected state");
        } else {
            defaultFunctionalityTab.click();
        }
    }

    public void selectReadability() {
        readabilityElement.click();

    }

    public void selectSingleLineCoding() {
        singleLineCodeElement.click();

    }

    public void selectMethodChaining() {
        methodChainingElement.click();

    }

    public void selectCrossBrowserTesting() {
        crossBrowserTestingElement.click();
    }

    public void selectExtentReports() {
        extentReportsElement.click();
    }

    public void selectDataDrivenTesting() {
        dateDrivenTestingElement.click();
    }

    public void selectFunctionalTesting() {
        functionalTestingElement.click();
        TakesScreenshot SerializationPage = (TakesScreenshot) driver;
        File sourceSerializationPage = SerializationPage.getScreenshotAs(OutputType.FILE);
        File destinationSerializationPage = new File("target/Screenshots/defaultFunctionalityPage.png");
       try {
           FileUtils.copyFile(sourceSerializationPage, destinationSerializationPage);
       }
       catch (Exception e){
           System.out.println("Unable to take the screenshot : "+e);
       }
    }


    // Serialize page Methods

    public void navigateSelectable(){
        Actions selectable = new Actions(driver);
        selectable.moveToElement(selectableOption).click().perform();
        String titleOfSerialization =  driver.getTitle();
        System.out.println("Title of the page : "+titleOfSerialization);
    }

    public void selectSerialization() {
        if (serializeTab.isSelected()) {
            System.out.println("Serialize Tab already selected");
        } else {
          serializeTab.click();
        }
    }

    public void selectSerialize_Readability() {
        serialize_ReadabilityElement.click();
        System.out.println(feedBackResult.getText()+" "+selectedItem.getText());
    }

    public void selectSerialize_SingleLineCoding() {
        serialize_SingleLineCodeElement.click();
        System.out.println(feedBackResult.getText()+" "+selectedItem.getText());
    }

    public void selectSerialize_MethodChaining() {
        serialize_MethodChainingElement.click();
        System.out.println(feedBackResult.getText()+" "+selectedItem.getText());
    }

    public void selectSerialize_CrossBrowserTesting() {
        serialize_CrossBrowserTestingElement.click();
        System.out.println(feedBackResult.getText()+" "+selectedItem.getText());
    }

    public void selectSerialize_ExtentReports() {
        serialize_ExtentReportsElement.click();
        System.out.println(feedBackResult.getText()+" "+selectedItem.getText());
    }

    public void selectSerialize_DataDrivenTesting() {
        serialize_DateDrivenTestingElement.click();
        System.out.println(feedBackResult.getText()+" "+selectedItem.getText());
    }

    public void selectSerialize_FunctionalTesting() {
        serialize_FunctionalTestingElement.click();
        System.out.println(feedBackResult.getText()+" "+selectedItem.getText());
        TakesScreenshot defaultFunctionalitiesPage = (TakesScreenshot) driver;
        File sourceFunctionalitiesPage = defaultFunctionalitiesPage.getScreenshotAs(OutputType.FILE);
        File destinationFunctionalitiesPage = new File("target/Screenshots/SerializePage.png");
        try {
            FileUtils.copyFile(sourceFunctionalitiesPage, destinationFunctionalitiesPage);
        }
        catch (Exception e){
            System.out.println("Unable to take the screenshot : "+e);
        }
    }


}
