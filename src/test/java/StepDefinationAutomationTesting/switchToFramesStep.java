package StepDefinationAutomationTesting;

import Pages.framesPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Hook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;


public class switchToFramesStep{
    WebDriver driver = Hooks.getDriver();
    framesPage FramesP;

    //Single iframe glue code
    @When("click frames option")
    public void click_frames_option() {
        FramesP = new framesPage(driver);
        FramesP.navigateToFramesPage();
    }
    @Then("user Land in Frames page")
    public void user_land_in_frames_page() {
      FramesP.getTitleOfFrames();
    }
    @Given("user single iframe page")
    public void user_single_iframe_page() {
       FramesP.userInSingleInFramesPage();
    }
    @When("user switch into iframe")
    public void user_switch_into_iframe() {
        FramesP.clickSingleInFrameButton();
    }
    @Then("Enter the name into text box")
    public void enter_the_name_into_text_box() {
       FramesP.enterTextIntoSingleIFrameTextBox();
    }
    @Then("come back into the Main page")
    public void come_back_into_the_main_page() {
    FramesP.switchToMainPage();
    }
    @Then("click Nested iframe button")
    public void click_nested_iframe_button() {
        FramesP.clickNestedIFrameButton();
    }

    //Nested iframe glue code

    @Given("user in Nested iframe page")
    public void user_in_nested_iframe_page() {
       FramesP.navigatedToNestedIFramePage();
    }
    @When("user enter into first frame and get text")
    public void user_enter_into_first_frame_and_get_text() {
        FramesP.getTheTextFromFirstFrame();
    }
    @When("user enter into Second frame and get text")
    public void user_enter_into_second_frame_and_get_text() {
        FramesP.secondFrameText();
    }
    @When("user enter the text into text box")
    public void user_enter_the_text_into_text_box() {
       FramesP.enterTheTextIntoNestedFrameTextBox();
    }
    @Then("User navigate to Parent window")
    public void user_navigate_to_parent_window() {
       FramesP.navigateBackToParentPage();
    }


}
