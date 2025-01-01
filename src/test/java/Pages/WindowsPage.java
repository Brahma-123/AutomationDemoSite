package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class WindowsPage {

    WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    public WindowsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    //Open new Tabbed windows- Elements

    @FindBy(xpath = "//a[contains(text(),'Open New Tabbed Windows')]")
    WebElement TabbedWindowsButton;
    @FindBy(xpath = "//p[contains(text(),'If you set the target attribute to ')]")
    WebElement blankText;
    String ExpectedPartialText ="If you set the target attribute to";
    @FindBy(xpath = "//button[contains(text(),'click')]")
    WebElement blankPageClickButton;

    //Open new separate window - elements

    @FindBy(xpath = "//a[contains(text(),'Open New Seperate Windows')]")
    WebElement NewSeparateWindowsButton;
    @FindBy(xpath = "//p[contains(text(),'Click the button to open multiple windows')]")
    WebElement openMultipleWindowsText;
    @FindBy(xpath = "//div[contains(@id,'Seperate')]/button")
    WebElement multipleWindowsClickButton;

    // Open Multiple new windows - Elements

    @FindBy(xpath = "//a[contains(text(),'Open Seperate Multiple Windows')]")
    WebElement separateMultipleWindowsButton;
    @FindBy(xpath = "//p[contains(text(),'Click the button to open multiple windows')]")
    WebElement textMultipleWindows;
    @FindBy(xpath = "//div[contains(@id,'Multiple')]/button")
    WebElement clickButtonForMultipleWindows;


    //Open new Tabbed windows Methods
    public void getTitleName(){
      String titleOfTheWindow =  driver.getTitle();
        System.out.println("Title of the Window : "+titleOfTheWindow);
    }
    public void clickTabbedWindowButton(){
        TabbedWindowsButton.click();
    }
    public void getTextOfBlank(){
      String actualBlankText =  blankText.getText();
      if(actualBlankText.contains(ExpectedPartialText)){
          System.out.println("The Text of _blank : "+actualBlankText);
      }
      else{
          System.out.println("Actual and Expected _blank text are not matched");
      }
    }
    public void pressBlankPageClickButton(){

        blankPageClickButton.click();

    }
    public void titleOfTheNewWindow(){
        String originalWindow = driver.getWindowHandle();
        System.out.println("Original window "+originalWindow);
        Set<String> allWindows = driver.getWindowHandles();
        for(String windowsTitle: allWindows){
            System.out.println("All windows names : "+windowsTitle);
        }
        for(String selectNewWindow:allWindows){
            if (!selectNewWindow.equals(originalWindow)){
                driver.switchTo().window(selectNewWindow);
                System.out.println("Switched new window title : "+driver.getTitle());
             String textFromDifferentBrowser =    driver.findElement(By.xpath("//h4[text()='Selenium WebDriver']")).getText();
                System.out.println("This is text from Selenium website : "+textFromDifferentBrowser);
            }
        }
    }

    //Open new Separate window Methods

    public void clickNewSeparateWindowButton(){
        NewSeparateWindowsButton.click();
    }
    public void getTextNewWindowSpecification(){
        String expectedNewWindowsText = "click the button to open a new window ";
        String actualNewWindowText = openMultipleWindowsText.getText();
        if (actualNewWindowText.contains(expectedNewWindowsText)){
            System.out.println("Text once clicks Separate windows button : "+actualNewWindowText);
        }
        else{
            System.out.println("Actual and Expected text is not matched");
        }

    }
    public void pressTheClickButtonForNewWindowButton(){
        multipleWindowsClickButton.click();
    }
    public void navigateToNewGeneratedWindow(){
        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent window : "+parentWindow);
        Set<String> childWindowHandles = driver.getWindowHandles();
        for (String childWindowHandle : childWindowHandles) {
            System.out.println("All window handle : "+childWindowHandle);
        }
        for (String selectChildWindow : childWindowHandles){
            if (!selectChildWindow.equals(parentWindow)){
                driver.switchTo().window(selectChildWindow);
                System.out.println("Child window title : "+driver.getTitle());
            }
        }

    }

    //Open new Separate multiple windows Methods

    public void clickSeparateMultipleWindows(){
        separateMultipleWindowsButton.click();
    }
    public void getTextOnSeparateMultipleWindows(){
      String actualText  =  textMultipleWindows.getText();
      String expectedText = "Click the button to open multiple windows";
      if(actualText.contains(expectedText)){
          System.out.println("Text once clicks Separate multiple windows : "+actualText);
      }
      else{
          System.out.println("Actual and expected text are not Matched.");
      }
    }
    public void pressSeparateMultipleWindowsClickButton(){
        clickButtonForMultipleWindows.click();
    }

    public void multiNewSeparateWindowsNavigate(){
        String parentWindowHandle = driver.getWindowHandle();
        System.out.println("Parenet window handle : "+parentWindowHandle);
        Set<String> windowHandlesList = driver.getWindowHandles();
        for(String windowHandle : windowHandlesList){
            System.out.println("All windows list : "+windowHandle);
        }
        for(String selectChildMultiWindow:windowHandlesList){
            if (!selectChildMultiWindow.equals(parentWindowHandle)){
                driver.switchTo().window(selectChildMultiWindow);
               String childWindowTitle = driver.getTitle();
                System.out.println("Child window title Name : "+childWindowTitle);

            }
        }
    }

}
