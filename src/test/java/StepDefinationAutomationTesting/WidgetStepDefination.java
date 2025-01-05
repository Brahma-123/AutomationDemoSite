package StepDefinationAutomationTesting;

import Pages.AutoCompletePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Hook;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class WidgetStepDefination {
    WebDriver driver = Hooks.getDriver();
    Accordion_Widget accordionWidget;
    AutoCompletePage autoComplete;


    //Get Widget page options
    @When("user mouse over to  Widget section")
    public void user_mouse_over_to_widget_section() {
        accordionWidget = new Accordion_Widget(driver);
        accordionWidget.mouseOverToWidgetDropdown();
    }

    @Then("all options should be visible")
    public void all_options_should_be_visible() {
        accordionWidget.getAllElementsFromWidgetDropdown();
    }

    //Accordion Page automate  -Glue

    @Given("user in Accordion page")
    public void user_in_accordion_page() throws IOException {
        accordionWidget.navigateToAccordionPage();
    }

    @When("get the text from Group one Redability")
    public void get_the_text_from_group_one_redability() {
        accordionWidget.getTheTextFromReadability();
    }

    @When("click Redability secion Panel will close")
    public void click_redability_secion_panel_will_close() {
        accordionWidget.closeReadabilityPanel();
    }

    @When("clicks Single line coding section related text visible")
    public void clicks_single_line_coding_section_related_text_visible() {
        accordionWidget.getTheSingleLineCodeText();
    }

    @When("Again clicks Single line coding that panel will close")
    public void again_clicks_single_line_coding_that_panel_will_close()throws Exception {
        accordionWidget.closeSingleLineCodePanel();
    }

    @When("clicks method chaining option related text visible")
    public void clicks_method_chaining_option_related_text_visible() {
        accordionWidget.getTheMethodChainingText();
    }

    @When("Again clicks Method chaining panel will close")
    public void again_clicks_method_chaining_panel_will_close() {
        accordionWidget.closingMethodChainingPanel();
    }

    @When("clicks cross browser test related text visible")
    public void clicks_cross_browser_test_related_text_visible() {
        accordionWidget.getTheCrossBrowserTestingText();
    }

    @When("Again clicks cross browser test option panel will close")
    public void again_clicks_cross_browser_test_option_panel_will_close() {
        accordionWidget.closeTheCrossBrowserTestingPanel();
    }

    // Auto complete page glue code

    @Given("user in Auto complete page")
    public void user_in_auto_complete_page() {
        autoComplete = new AutoCompletePage(driver);
        autoComplete.navigateToAutoCompletePage();
    }
    @When("enters {string} name into text box")
    public void enters_name_into_text_box(String countryName) {
        autoComplete.enterTheCountryName(countryName);
    }
    @Then("select country from list")
    public void select_country_from_list() {
       autoComplete.selectTheCountryNameFromDropdown();
    }
    @Then("Clear the country from search")
    public void clear_the_country_from_search() {
       autoComplete.clearTheCountry();
    }

}
