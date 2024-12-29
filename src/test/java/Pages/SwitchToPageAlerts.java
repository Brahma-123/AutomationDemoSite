package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SwitchToPageAlerts {
    WebDriver driver;


    public SwitchToPageAlerts(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[text()='SwitchTo']")
    WebElement switchTo;

    @FindBy(xpath = "//a[text()='Alerts']")
    WebElement alerts;

    public void mouseOvertoSwitchToDropDown() throws  Exception {
        Actions mouseOverToSwitchTo = new Actions(driver);
        mouseOverToSwitchTo.moveToElement(switchTo).perform();
    }
        public void getAllLists() {
            System.out.println("List of options in switchTo dropdown : ");
            List<WebElement> switchToDropdowns = driver.findElements(By.xpath("//ul[@class='dropdown-menu']"));
            for (WebElement switchToDropdown : switchToDropdowns) {
                String switchToString = switchToDropdown.getText();
                System.out.println(switchToString);
                break;
            }
        }
        public void clickAlertsOption() throws  Exception{
        Actions alertSelect = new Actions(driver);
        alertSelect.moveToElement(alerts).click().perform();
        Thread.sleep(3000);

            }
            public void titleOfAlertsPage(){
                String alertsTitle = driver.getTitle();
                System.out.println("Title of the alerts Page : "+alertsTitle);
            }




    }


