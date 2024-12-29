package StepDefinationAutomationTesting;

import Pages.RegisterUserPage;
import Pages.indexPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class RedirectToRegisterPage {
    WebDriver driver = Hooks.getDriver();
    indexPage landingPage;
    RegisterUserPage registerUser;

    @Given("user in index page")
    public void user_in_index_page() {
        driver.get("https://demo.automationtesting.in/Index.html");
        landingPage = new indexPage(driver);
        landingPage.checkIndexTile();

    }
    @When("user clicks Skip sign-in button")
    public void user_clicks_skip_sign_in_button() {
        landingPage.clickSkipSigninPageButton();
    }
    @Then("User land in Register page")
    public void user_land_in_register_page()throws Exception {
        registerUser = new RegisterUserPage(driver);
        registerUser.getTitle_of_RegisterPage();
    }

    @Given("user in Register page")
    public void user_in_register_page()throws Exception {
        registerUser.getTitle_of_RegisterPage() ;
    }
    @When("user Enter Firstname {string} and Last name {string}")
    public void user_enter_firstname_and_last_name(String firName, String lasName) {
       registerUser.enterFirstAndLastName(firName,lasName);
    }
    @And("Enter Address {string}")
    public void enter_address(String houseAddress) {
       registerUser.enterAddress(houseAddress);
    }
    @And("Enter Email id {string}")
    public void enter_email_id(String mailID) {
      registerUser.sendEmailId(mailID);
    }
    @And("Enter phone number {string}")
    public void enter_phone_number(String mobileNumber) {
        registerUser.enterPhoneNumer(mobileNumber);
    }
    @And("Select gener and Hobbies")
    public void select_gener_and_hobbies() {
       registerUser.getListOfHobbies();
       registerUser.selectGender();

    }
    @And("Select Language")
    public void select_language() {
        registerUser.languageSelect();
    }
    @And("Select Skills and country")
    public void select_skills_and_country() {
          registerUser.selectCountryAndSkills();
    }
    @And("Select Date of Birth")
    public void select_date_of_birth() throws Exception {
        registerUser.selectDOB();
         }
    @And("enter password {string} and Confirm password {string}")
    public void enter_password_and_confirm_password(String password1, String confirmPassword1) {

        registerUser.enterPasswordAndConfirmPassword(password1,confirmPassword1);

    }
    @And("Click Submit button")
    public void click_submit_button() throws  Exception {
        registerUser.submitButton();
    }
    @Then("Need to check")
    public void need_to_check() {
        System.out.println("Skip for now");
    }


}
