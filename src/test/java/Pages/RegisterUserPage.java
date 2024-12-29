package Pages;

import StepDefinationAutomationTesting.Hooks;
import io.cucumber.java.jv.Lan;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.xpath.XPath;
import java.time.Duration;
import java.util.List;

public class RegisterUserPage {
    WebDriver driver;
    WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(10));


    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement firstName;
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement lastName;
    @FindBy(xpath = "//label[text()='Address']/parent::div/div/textarea")
    WebElement address;
    @FindBy(xpath = "//input[@type='email']")
    WebElement emailId;
    @FindBy(xpath = "//input[@type='tel']")
    WebElement phoneNumber;
    @FindBy(xpath = "//input[@value='Male']")
    WebElement maleRadioButton;
    @FindBy(xpath = "//input[@id='checkbox1']")
    WebElement Hobbies;
    @FindBy(xpath = "//label[text()='Hobbies']/parent::div/div/div//label[contains(text(),'Cricket')]")
    WebElement cricketHobbie;
    @FindBy(xpath = "//a[text()='English']")
    WebElement englishSelect;
    @FindBy(xpath = "//select[@id='Skills']")
    WebElement skills;
    @FindBy(xpath = "//span[@id='select2-country-container']")
    WebElement country;
    @FindBy(xpath = "//select[@id='yearbox']")
    WebElement yearBoxDOB;
    @FindBy(xpath = "//select[@placeholder='Month']")
    WebElement monthDOB;
    @FindBy(xpath = "//select[@placeholder='Day']")
    WebElement dayDOB;

    @FindBy(xpath = "//input[@id='firstpassword']")
    WebElement password;

    @FindBy(xpath = "//input[@id='secondpassword']")
    WebElement confirmPassword;

    @FindBy(xpath = "//button[@id='submitbtn']")
    WebElement submitButton;





    public RegisterUserPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void getTitle_of_RegisterPage()throws Exception{
       String RegisterTitle = driver.getTitle();
        System.out.println("Title of the RegisterPage : "+RegisterTitle);
        Thread.sleep(4000);
    }
    public void enterFirstAndLastName(String Fname,String Lname){
        firstName.sendKeys(Fname);
        lastName.sendKeys(Lname);
    }
    public void enterAddress(String FullAddress){
        address.click();
        address.sendKeys(FullAddress);
    }
    public void sendEmailId(String email){
        emailId.sendKeys(email);
    }
    public void enterPhoneNumer(String mobileNumber){
        phoneNumber.sendKeys(mobileNumber);
    }
    public void getListOfHobbies(){
        List<WebElement> hobbiesList = driver.findElements(By.xpath("//label[text()='Hobbies']/parent::div/div"));
         for(WebElement hobbiesListfor: hobbiesList){
            String hobbieesString = hobbiesListfor.getText();
             System.out.println("List of the Hobbies: "+hobbieesString);
            String cricSelection = cricketHobbie.getText();
             System.out.println("Game : "+cricSelection);
             if (cricSelection.equals("Cricket")&&!hobbiesListfor.isSelected()){
                 Hobbies.click();
             }
         }


    }
    public void selectGender(){
        maleRadioButton.click();
    }
    public void languageSelect(){
      WebElement languages =  driver.findElement(By.xpath("//div[@id='msdd']"));
      languages.click();
      String englishSelect1 = englishSelect.getText();
        System.out.println("Text is : "+englishSelect1);
      if (englishSelect1.equals("English")){
          englishSelect.click();
      }
    }

    public void selectCountryAndSkills() {
        Select selectSkills = new Select(skills);
        selectSkills.selectByContainsVisibleText("Excel");
       WebElement countrySpan = driver.findElement(By.xpath("//span[@id='select2-country-container']/parent::span"));
      countrySpan.click();
     WebElement searchCountry = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
      searchCountry.sendKeys("India");

      if(driver.findElement(By.xpath("//li[contains(text(), 'India')]")).isDisplayed()){
          driver.findElement(By.xpath("//li[contains(text(), 'India')]")).click();
      }else {
          System.out.println("Didn't found the Expected Option");
      }

//      driver.findElement(By.xpath("//li[text()='India']")).click();
//      String selectedCountry = searchCountry.getText();
//        System.out.println("Selected country : "+selectedCountry);
    }

    public void selectDOB() throws  Exception{
        Select doYear= new Select(yearBoxDOB);
       doYear.selectByVisibleText("1994");
       Select dobMonth = new Select(monthDOB);
       dobMonth.selectByContainsVisibleText("October");
       Select dobDate = new Select(dayDOB);
       dobDate.selectByVisibleText("16");
        Thread.sleep(3000);
    }
     public void enterPasswordAndConfirmPassword(String password2,String confirmPassword2){
        password.sendKeys(password2);
        confirmPassword.sendKeys(confirmPassword2);
     }
     public void submitButton()throws Exception{
        submitButton.click();
        Thread.sleep(4000);
     }



}
