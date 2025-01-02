package StepDefinationAutomationTesting;

import Pages.SwitchToPageAlerts;
import Pages.alertsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class switchToPageAlretsWindows {
    WebDriver driver = Hooks.getDriver();
    SwitchToPageAlerts switchToAlerts;
    alertsPage alertsPageAuto;

    @When("mouse over to Switch to dropdown")
    public void mouse_over_to_switch_to_dropdown() throws Exception {
        switchToAlerts = new SwitchToPageAlerts(driver);
        switchToAlerts.mouseOvertoSwitchToDropDown();
    }

    @Then("Alerts,Window and Iframe options visible")
    public void alerts_window_and_iframe_options_visible() {
        switchToAlerts.getAllLists();
    }

    @And("click Alerts options")
    public void click_alerts_options() throws Exception {
        switchToAlerts.clickAlertsOption();
    }

    @Then("user land in alerts page")
    public void user_land_in_alerts_page() {
        switchToAlerts.titleOfAlertsPage();
    }
    //Alert with Ok Scenario

    @Given("user in Alerts page")
    public void user_in_alerts_page() {
        alertsPageAuto = new alertsPage(driver);
        alertsPageAuto.title();
    }

    @When("user click alert with ok button")
    public void user_click_alert_with_ok_button() {
        alertsPageAuto.alertWithOkay();
    }

    @Then("Click the button to display and Alert box button visible")
    public void click_the_button_to_display_and_alert_box_button_visible() {
        alertsPageAuto.setClickToDisplayAlertPopupButton();
    }

    @When("user click above Button to display button")
    public void user_click_above_button_to_display_button() {
        alertsPageAuto.setClickToDisplayAlertPopupButton();
    }

    @Then("Alert popup should be visible with okay button")
    public void alert_popup_should_be_visible_with_okay_button() {
        alertsPageAuto.clickAlertPopupButton();
        alertsPageAuto.getAlertText();
    }

    @When("click Ok button popup")
    public void click_ok_button_popup() {
        alertsPageAuto.clickOkayButtonOnAlertPopup();
    }
     //Alert with Okay and cancel Scenario

    @When("user clicks Alert with Okay&Cancel button")
    public void user_clicks_alert_with_okay_cancel_button() {
       alertsPageAuto.clickAlertsWithOkayAndCancelButton();
    }
    @Then("okay Confirm box button visible")
    public void okay_confirm_box_button_visible() {
        alertsPageAuto.clickDisplayAConfirmBoxButtonVerify();
    }
    @When("Clicks Okay Confirm box button")
    public void clicks_okay_confirm_box_button() {
       alertsPageAuto.clickConfirmBoxButton();
    }
    @Then("Alert popup will be visible with Okay and Cancel button")
    public void alert_popup_will_be_visible_with_okay_and_cancel_button() {
        alertsPageAuto.alertPopupWithOkayAndCancelButton();
    }
    @When("user clicks Okay You pressed okay text visible under Confirm text box")
    public void user_clicks_okay_you_pressed_okay_text_visible_under_confirm_text_box() {
        alertsPageAuto.clickOkayInOkayAndCancelAlertPopup();
    }

    @When("user clicks Cancel you pressed cancel Text visible under Confirm text box button")
    public void user_clicks_cancel_you_pressed_cancel_text_visible_under_confirm_text_box_button() {
        alertsPageAuto.clickCancelInOkayAndCancelAlertPopup();
    }
    //Alert with Text box

    @When("user clicks alert with text box button")
    public void user_clicks_alert_with_text_box_button() {
       alertsPageAuto.clickAlertWithTextBoxButton();
    }
    @Then("prompt box button visible")
    public void prompt_box_button_visible() {
       alertsPageAuto.promptTextButtonVisible();
    }
    @When("Clicks Prompt box button")
    public void clicks_prompt_box_button() {
        alertsPageAuto.clickPromptTextBoxButton();
    }
    @Then("Alert with Text box should be visible")
    public void alert_with_text_box_should_be_visible() {
        alertsPageAuto.getTextOnAlertTextBox();
    }
    @When("clear the text from text box and enter {string}")
    public void clear_the_text_from_text_box_and_enter(String textIntoAlertTextbox) {
       alertsPageAuto.enterTheTextIntoAlertTextbox(textIntoAlertTextbox);
    }
    @Then("accept the alert")
    public void accept_the_alert() {
        alertsPageAuto.acceptTheAlert();
    }
    //Closing the Alert after entering name
    @Then("click cancel button on textbox alert popup")
    public void click_cancel_button_on_textbox_alert_popup() {
       alertsPageAuto.closeTheAlert();
    }
}
