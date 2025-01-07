package Pages;

import net.bytebuddy.asm.Advice;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Date;

public class DatePickerPage {
    WebDriver driver;
    public DatePickerPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    //Select DatePicker
    @FindBy(xpath = "//a[contains(text(),'Datepicker')]")
    WebElement datePickerButton;

    //Date picker disabled section elements
    @FindBy(xpath = "//label[text()='DatePicker Disabled']")
    WebElement disabledSectionText;
    @FindBy(id="datepicker1")
    WebElement datePickerDisabledSection;
    @FindBy(xpath = "//div[contains(@class,'ui-datepicker-title')]/span")
    WebElement currentMonth;
    @FindBy(xpath = "//div[contains(@class,'ui-datepicker-title')]/span[2]")
    WebElement currentYear;
    @FindBy(xpath = "//a[contains(text(),'14')]")
    WebElement bornDateAndYear;
    @FindBy(xpath = "//span[contains(text(),'Prev')]")
    WebElement prevYearButton;

    //Date picker enabled section elements
    @FindBy(xpath = "//label[contains(text(),'DatePicker Enabled')]")
    WebElement enabledSectionText;
    @FindBy(id="datepicker2")
    WebElement datePickerEnabledSection;
    @FindBy(xpath = "//select[contains(@title,'Change the month')]//option[text()='January']")
    WebElement currentMonthFromEnabledCalendar;
    String dob = "06/05/1994";



    // Disabled date picker methods

    public void navigateToDatePickerPage(){
        Actions datePickerSelect = new Actions(driver);
        datePickerSelect.moveToElement(datePickerButton).click().perform();
      String title_datePicker =  driver.getTitle();
        System.out.println("Title of Date picker Page - "+title_datePicker);
        //Disabled text verification
       String actualDisabledSectionText =  disabledSectionText.getText();
      String  expectedDisabledText = "DatePicker Disabled";
        Assert.assertEquals(actualDisabledSectionText,expectedDisabledText);
        System.out.println("Disabled selection Text is : "+actualDisabledSectionText);
        //Enabled Text verification
        String actualEnabledSectionText = enabledSectionText.getText();
        String expectedEnabledSectionText = "DatePicker Enabled";
        Assert.assertEquals(actualEnabledSectionText,expectedEnabledSectionText);
        System.out.println("Enabled selection Text : "+actualEnabledSectionText);
    }

    public void clickDisabledDatePicker(){
        datePickerDisabledSection.click();
    }
    public void calenderVerification(){
       String month = currentMonth.getText();
        String year = currentYear.getText();
        System.out.println("Current month is : "+month+" and Year : "+year);
    }
    public void selectTheDateOnDisabledDatePicker(){
        while(true) {
            String month = currentMonth.getText();
            String year = currentYear.getText();
            if (month.contains("October") && year.contains("2022")) {
                break;
            }
             prevYearButton.click();
        }

        bornDateAndYear.click();
    }
    public void getTheSelectedDate(){
       String selectedDate = datePickerDisabledSection.getText();
        System.out.println("Selected date is : "+selectedDate);

    }

    // Enabled date picker Methods

   public void selectEnabledDatePicker(){
       datePickerEnabledSection.click();
    }

    public void getTheCurrentMonth(){
      String currentMonth =  currentMonthFromEnabledCalendar.getText();
        System.out.println("Current Month is : "+currentMonth);
    }

    public void sendTheDOBDateMonthYear(){
        datePickerEnabledSection.sendKeys(dob+Keys.ENTER);
    }
    public void closeTheCalendar(){
     String selectedDOB = datePickerEnabledSection.getText();
        System.out.println("Entered DOB date,Month and Year : "+selectedDOB);
    }
}
