package Pages;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import javax.xml.xpath.XPath;

public class alertsPage {
    WebDriver driver;


    public alertsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Alerts with Okay Elements

    @FindBy(xpath = "//a[contains(text(),'Alert with OK')]")
    WebElement alertWithOkayButton;
    @FindBy(xpath = "//button[contains(text(),'click the button to display an  alert box:')]")
    WebElement clickToDisplayAlertPopup;

    //Elements for Alert with okay and Cancel button
    @FindBy(xpath = "//a[contains(text(),'Alert with OK & Cancel')]")
    WebElement alertWithOkayAndCancelButton;
    @FindBy(xpath = "//button[contains(text(),'click the button to display a confirm box')]")
    WebElement clickTheButtonToDisplayAConfirmBoxButton;
    @FindBy(id = "demo")
    WebElement resultTextOnceClicksOkayOrCancel;


    //Alert with Ok Scenario code
    public void title() {
        String alertsTitle = driver.getTitle();
        System.out.println("Alerts page title : " + alertsTitle);
    }

    public void alertWithOkay() {
        if (alertWithOkayButton.isSelected()) {
            boolean displayAnAlertButton = clickToDisplayAlertPopup.isDisplayed();
        } else {
            alertWithOkayButton.click();
        }
    }

    public void setClickToDisplayAlertPopupButton() {
        String textOfTheDisplayAlertPopupButton = clickToDisplayAlertPopup.getText();
        if (textOfTheDisplayAlertPopupButton.contains(("click the button to display"))) {
            System.out.println("Text on the button : " + textOfTheDisplayAlertPopupButton);
        } else {
            System.out.println("Button not displayed");
        }
    }

    public void clickAlertPopupButton() {
        clickToDisplayAlertPopup.click();
    }

    public void getAlertText() {
        Alert alertWithOkay = driver.switchTo().alert();
        String alertText = alertWithOkay.getText();
        if (alertText.contains("I am an alert box!")) {
            System.out.println("Alert box text : " + alertText);
        } else {
            System.out.println("Text is wrong on Alert box");
        }
    }

    public void clickOkayButtonOnAlertPopup() {
        Alert okayButtonClick = driver.switchTo().alert();
        okayButtonClick.accept();
    }

    // Alert with Okay and cancel Scenario code
    public void clickAlertsWithOkayAndCancelButton() {
        alertWithOkayAndCancelButton.click();
    }

    public void clickDisplayAConfirmBoxButtonVerify() {

        boolean confirmBoxButton = clickTheButtonToDisplayAConfirmBoxButton.isDisplayed();
        if (confirmBoxButton) {
            System.out.println("click the button to display a confirm box is Visible");
        } else {
            System.out.println("click the button to display a confirm box  not found ");
        }

    }

    public void clickConfirmBoxButton() {
        clickTheButtonToDisplayAConfirmBoxButton.click();
    }

    public void alertPopupWithOkayAndCancelButton() {
        Alert okayAndCancelButtonAlert = driver.switchTo().alert();
        String alertOkayAndCancelAlertText = okayAndCancelButtonAlert.getText();
        System.out.println("Text on the Alert popup : " + alertOkayAndCancelAlertText);
    }

    public void clickOkayInOkayAndCancelAlertPopup() {
        Alert clickingOkayButton = driver.switchTo().alert();
        clickingOkayButton.accept();
        String resultFromOkayAndCancelAlert = resultTextOnceClicksOkayOrCancel.getText();
        System.out.println("User Clicked : '" + resultFromOkayAndCancelAlert + "' from the Press a button Alert");
    }

    public void clickCancelInOkayAndCancelAlertPopup() {
        Alert clickingCancelButton = driver.switchTo().alert();
        clickingCancelButton.dismiss();
        String resultFromOkayAndCancelAlert2 = resultTextOnceClicksOkayOrCancel.getText();
        System.out.println("User Clicked : '" + resultFromOkayAndCancelAlert2 + "' from the Press a button Alert");

    }
}
