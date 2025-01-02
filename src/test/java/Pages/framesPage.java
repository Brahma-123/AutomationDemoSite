package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class framesPage {
    WebDriver driver;

    //Constructor for Frame page
    public framesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Navigate to frames page elements
    @FindBy(xpath = "//a[text()='Frames']")
    WebElement clickFramesOption;

    //Single IFrame elements
    @FindBy(xpath = "//a[contains(text(),'Single Iframe')]")
    WebElement singleIFrameButton;
    @FindBy(id = "singleframe")
    WebElement singleIframeId;
    @FindBy(xpath = "//h5[contains(text(),'iFrame Demo')]")
    WebElement textInSingleIFrame;
    @FindBy(xpath = "//input[contains(@type,'text')]")
    WebElement textBoxInSingleIframe;

    //Navigate to Nested Iframe

    @FindBy(xpath = "//a[contains(text(),'Iframe with in an Iframe')]")
    WebElement nestedIframeButton;
    @FindBy(xpath = "//div[@id='Multiple']/iframe")
    WebElement firstIframe;
    @FindBy(xpath = "//div[@class='iframe-container']/iframe")
    WebElement secondFrame;
    @FindBy(xpath = "//h5[contains(text(),'Nested iFrames')]")
    WebElement firstNestIFrameText;
    @FindBy(xpath = "//h5[contains(text(),'iFrame Demo')]")
    WebElement nestedIFrame;
    @FindBy(xpath = "//input[@type='text']")
    WebElement nestedFrameTextBox;


    //Navigate to Frames page

    public void navigateToFramesPage() {
        clickFramesOption.click();
    }

    public void getTitleOfFrames() {
        System.out.println("Title of the page : " + driver.getTitle());
    }

    //Single IFrame methods

    public void userInSingleInFramesPage() {
        String actualSingleIFrameButtonText = singleIFrameButton.getText();
        String expectedSingleIFrameButtonText = "Single Iframe";
        Assert.assertEquals(actualSingleIFrameButtonText, expectedSingleIFrameButtonText);
        System.out.println("Button name is : " + actualSingleIFrameButtonText);
    }

    public void clickSingleInFrameButton() {
        if (singleIFrameButton.isSelected()) {
            driver.switchTo().frame(singleIframeId);
            String textInsideSingleIFrame = textInSingleIFrame.getText();
            System.out.println("Text inside Single iframe : " + textInsideSingleIFrame);
        } else {
            singleIFrameButton.click();
            System.out.println("Single iframe button clicked");
            driver.switchTo().frame(singleIframeId);
            String textInsideSingleIFrame = textInSingleIFrame.getText();
            System.out.println("Text inside Single iframe : " + textInsideSingleIFrame);
        }
    }

    public void enterTextIntoSingleIFrameTextBox() {
        textBoxInSingleIframe.sendKeys("This is Single iframe");
        String gettingEnteredText = textBoxInSingleIframe.getText();
        System.out.println("Entered text into Single iframe text box " + gettingEnteredText);
    }

    public void switchToMainPage() {
        driver.switchTo().defaultContent();
    }

    public void clickNestedIFrameButton() {
        nestedIframeButton.click();
        }

        //Nested Iframe method

        public void navigatedToNestedIFramePage(){
            nestedIframeButton.click();
        }
        public void getTheTextFromFirstFrame(){
          driver.switchTo().frame(firstIframe);
         String actualTextFirstFrame =   firstNestIFrameText.getText();
         String expectedTextFirstFrame = "Nested iFrames";
         Assert.assertEquals(actualTextFirstFrame,expectedTextFirstFrame,"Both are not matched");
        }
       public void secondFrameText(){
        driver.switchTo().frame(secondFrame);
           String actualTextSecondFrame =   nestedIFrame.getText();
           String expectedTextSecondFrame = "iFrame Demo";
           Assert.assertEquals(actualTextSecondFrame,expectedTextSecondFrame,"Both are not matched");
       }
       public void enterTheTextIntoNestedFrameTextBox(){
        nestedFrameTextBox.sendKeys("This is nested frame");
       String enteredText = nestedFrameTextBox.getText();
           System.out.println("Entered text into nested Iframe : "+enteredText);
       }

       public void navigateBackToParentPage(){
        driver.switchTo().defaultContent();
           singleIFrameButton.click();
       }

}
