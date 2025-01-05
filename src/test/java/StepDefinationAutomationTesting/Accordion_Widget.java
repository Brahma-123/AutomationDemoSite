package StepDefinationAutomationTesting;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class Accordion_Widget {
    WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public Accordion_Widget(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Elements for Widgets
    @FindBy(xpath = "//a[text()='Widgets']")
    WebElement widgetsDropDown;

    //Accordion Elements
    @FindBy(xpath = "//a[contains(text(),'Accordion')]")
    WebElement accordionOption;

    //Readability
    @FindBy(xpath = "//b[contains(text(),'Readability')]")
    WebElement readabilityOption;
    @FindBy(xpath = "//div[@id='collapse1']/div")
    WebElement readabilityText;

    //Single Line code
    @FindBy(xpath = "//b[contains(text(),'Single Line Coding')]")
    WebElement singleLineCodingOption;
    @FindBy(xpath = "//div[@id='collapse2']/div")
    WebElement singleLineCodeText;

    //Method chaining
    @FindBy(xpath = "//b[contains(text(),'Methhod Chaining')]")
    WebElement methodChaining;
    @FindBy(xpath = "//div[@id='collapse3']/div")
    WebElement methodChainingText;

    //Cross Browser Testing
    @FindBy(xpath = "//b[contains(text(),'Cross Browser Testing')]")
    WebElement crossBrowserTesting;
    @FindBy(xpath = "//div[@id='collapse4']/div")
    WebElement crossBrowserTestingText;


    public void mouseOverToWidgetDropdown() {
        Actions action = new Actions(driver);
        action.moveToElement(widgetsDropDown).perform();

    }

    public void getAllElementsFromWidgetDropdown() {
        List<WebElement> listOfWidgets = driver.findElements(By.xpath("//div[@class='navbar-collapse collapse navbar-right']/ul/li[5]/ul"));
        for (WebElement listOfWidget : listOfWidgets) {
            System.out.println("List of the Widgets : " + listOfWidget.getText());
        }

    }

    //Accordion Page Methods

    //Readability Methods

    public void navigateToAccordionPage() throws IOException {
        if (accordionOption.isDisplayed()) {
            accordionOption.click();
            System.out.println("Title of the Accordion Page - " + driver.getTitle());
            TakesScreenshot accordionPage = (TakesScreenshot) driver;
            File destAccordion = accordionPage.getScreenshotAs(OutputType.FILE);
            File sourceAccordion = new File("C:\\Users\\Siddulugari.Reddy\\Desktop\\JioRoomsAdminDashboard\\demo_Automation_Testing\\target\\Screenshots\\accordianPage.png");
            FileUtils.copyFile(destAccordion, sourceAccordion);
        } else {
            System.out.println("Accordion not Selected");
        }
    }

    public void getTheTextFromReadability() {
        if (readabilityOption.isSelected()) {
            String actualReadabilityText = readabilityText.getText();
            String expectedReadabilityText = "This Automation Testing API is very simple to read and understand.";
            Assert.assertTrue(actualReadabilityText.contains(expectedReadabilityText), "Actual text : " + actualReadabilityText + " Expected text : " + expectedReadabilityText);
        } else {
            readabilityOption.click();
            String actualReadabilityText = readabilityText.getText();
            String expectedReadabilityText = "This Automation Testing API is very simple to read and understand.";
            Assert.assertTrue(actualReadabilityText.contains(expectedReadabilityText), "Actual text : " + actualReadabilityText + " Expected text : " + expectedReadabilityText);
        }
    }

    public void closeReadabilityPanel() {
        readabilityOption.click();
        Assert.assertTrue(readabilityText.isDisplayed(),"Readability panel is not closed");
    }


    //Single Line code Method
    public void getTheSingleLineCodeText() {
        boolean verifySingleLineCoding = singleLineCodingOption.isDisplayed();
        if (verifySingleLineCoding) {
            singleLineCodingOption.click();
        } else {
            System.out.println("Single line coding option is not found");
        }
        String actualSingleLineCodeText = singleLineCodeText.getText();
        String expectedSingleLineCodeText = "In this Automation tool, each and every functionality will be achieved by Single line code.";
        Assert.assertTrue(actualSingleLineCodeText.contains(expectedSingleLineCodeText), "Actual text : " + actualSingleLineCodeText + " Partial text : " + expectedSingleLineCodeText);
    }

    public void closeSingleLineCodePanel() throws Exception{
        singleLineCodingOption.click();
        Assert.assertTrue(singleLineCodeText.isDisplayed(),"Single line coding panel is still open");
    }

    //Method chaining methods
    public void getTheMethodChainingText() {

        boolean verifyMethodChaining = methodChaining.isDisplayed();
        if (verifyMethodChaining) {
            methodChaining.click();
        } else {
            System.out.println("Method chaining panel is not found");
        }
        String actualMethodChainingText = methodChainingText.getText();
        String expectedMethodChainingText = "As the name indicates, you can chain the methods without breaking the code i.e";
        System.out.println("Actual method chaining : "+actualMethodChainingText);
       Assert.assertTrue(actualMethodChainingText.contains(expectedMethodChainingText), "Actual text : " + actualMethodChainingText + " Partial text : " + expectedMethodChainingText);
    }



    public void closingMethodChainingPanel() {
        methodChaining.click();
        Assert.assertTrue(methodChainingText.isDisplayed(),"Method chaining panel is still Open");
    }

    //Cross browser Testing Methods
    public void getTheCrossBrowserTestingText() {
        boolean verifyCrossBrowserTesting = crossBrowserTesting.isDisplayed();
        if (verifyCrossBrowserTesting) {
            crossBrowserTesting.click();
        } else {
            System.out.println("Cross browser testing panel is not found");
        }
        String actualCrossBrowserTestingText = crossBrowserTestingText.getText();
        String expectedCrossBrowserTestingText = "NTest your web application across the most popular browsers including Firefox,Chrome and Internet Explorer to validate the functionality.";
        Assert.assertTrue(actualCrossBrowserTestingText.contains(expectedCrossBrowserTestingText), "Actual text : " + actualCrossBrowserTestingText + " Partial text : " + expectedCrossBrowserTestingText);
    }


    public void closeTheCrossBrowserTestingPanel() {
        crossBrowserTesting.click();
        Assert.assertTrue(crossBrowserTestingText.isDisplayed(),"CrossBrowser Panel is collapsed");

    }

}


