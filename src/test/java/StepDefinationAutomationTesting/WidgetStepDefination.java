package StepDefinationAutomationTesting;

import Pages.Accordion_Widget;
import Pages.AutoCompletePage;
import Pages.DatePickerPage;
import Pages.SliderPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class WidgetStepDefination {
    WebDriver driver = Hooks.getDriver();
    Accordion_Widget accordionWidget;
    AutoCompletePage autoComplete;
    DatePickerPage datePicker;
    SliderPage slider;


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

    //Disable Date Picker page glue code

    @Given("user in Date Picker page")
    public void user_in_date_picker_page() {
        datePicker = new DatePickerPage(driver);
        datePicker.navigateToDatePickerPage();
    }
    @When("click disabled Date picker")
    public void click_disabled_date_picker() {
       datePicker.clickDisabledDatePicker();
    }
    @Then("Calendar should open")
    public void calendar_should_open() {
       datePicker.calenderVerification();
    }
    @When("Select Date,Month and Year")
    public void select_date_month_and_year() {
       datePicker.selectTheDateOnDisabledDatePicker();
    }
    @Then("selected date month and year should be selected")
    public void selected_date_month_and_year_should_be_selected() {
        datePicker.getTheSelectedDate();
    }

    //Enable date picker glue code

    @When("click enable date picker")
    public void click_enable_date_picker() {
        datePicker.selectEnabledDatePicker();
    }
    @Then("enable Calendar should open")
    public void enable_calendar_should_open() {
       datePicker.getTheCurrentMonth();
    }
    @When("Send the date into Text box")
    public void send_the_date_into_text_box() {
        datePicker.sendTheDOBDateMonthYear();
    }
    @Then("get the selected date and close the calendar by clicking enter")
    public void get_the_selected_date_and_close_the_calendar_by_clicking_enter() {
       datePicker.closeTheCalendar();
    }

    //Slider page glue code

    @Given("user in slider page")
    public void user_in_slider_page() {
        slider = new SliderPage(driver);
        slider.navigateToSliderPage();
    }
    @When("set the slider at fifty percentage")
    public void set_the_slider_at_fifty_percentage() {
       slider.moveToFiftyPercent();
    }
    @And("set the slider at ninety percentage")
    public void set_the_slider_at_ninety_percentage() {
        slider.moveToNinetyPercent();
    }
    @And("set the slider at five percentage")
    public void set_the_slider_at_five_percentage() {
      slider.moveToFivePercent();
    }

}
