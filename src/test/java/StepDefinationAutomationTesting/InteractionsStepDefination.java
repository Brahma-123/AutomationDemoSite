package StepDefinationAutomationTesting;

import Pages.DragAndDropPage;
import Pages.SelectablePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class InteractionsStepDefination {
    WebDriver driver = Hooks.getDriver();
    DragAndDropPage dragAndDrop;
    SelectablePage selectPage;


    @When("user mouse over to  Interactions section")
    public void user_mouse_over_to_interactions_section() {
        dragAndDrop = new DragAndDropPage(driver);
        dragAndDrop.moveOverToInterActionsSection();
    }

    @Then("interactions section should be visible")
    public void interactions_section_should_be_visible() {
        dragAndDrop.getTheInteractionsList();
    }

    //Static drag and drop = Glue code

    @Given("user navigate to static drag and drop page")
    public void user_navigate_to_static_drag_and_drop_page() {
        dragAndDrop.getListOfDragAndDrops();
        dragAndDrop.navigateToStaticDragAndDropPage();
    }

    @When("drag and drop S Selenium and demosite symbol in first row")
    public void drag_and_drop_s_selenium_and_demosite_symbol_in_first_row() {
        dragAndDrop.dragThreeImagesAndDropInFirstRow();
    }

    @When("drag and drop S Selenium and demosite symbol in second row")
    public void drag_and_drop_s_selenium_and_demosite_symbol_in_second_row() {
        dragAndDrop.dragThreeImagesAndDropInSecondRow();
    }

    @When("drag and drop S Selenium and demosite symbol in third row")
    public void drag_and_drop_s_selenium_and_demosite_symbol_in_third_row() {
        dragAndDrop.dragThreeImagesAndDropInThirdRow();
    }

    @Then("verify the dragable element")
    public void verify_the_dragable_element() {
        dragAndDrop.validateDraggedElements();
    }

    //Dynamic drag and drop glue code

    @Given("user navigate to dyanamic drag and drop page")
    public void user_navigate_to_dyanamic_drag_and_drop_page() {
        dragAndDrop.moveOverToInterActionsSection();
        dragAndDrop.getTheInteractionsList();
        dragAndDrop.getListOfDragAndDrops();
        dragAndDrop.navigateToDynamicDragAndDropPage();
    }

    @When("drag and drop dynamic selenium S and Demosite symbol in First row")
    public void drag_and_drop_dynamic_selenium_s_and_demosite_symbol_in_first_row() {
        dragAndDrop.dynamicDragThreeImagesAndDropInFirstRow();
    }

    @When("drag and drop dynamic selenium S and Demosite symbol in Second row")
    public void drag_and_drop_dynamic_selenium_s_and_demosite_symbol_in_second_row() {
        dragAndDrop.dynamicDragThreeImagesAndDropInSecondRow();
    }

    @When("drag and drop dynamic selenium S and Demosite symbol in Third row")
    public void drag_and_drop_dynamic_selenium_s_and_demosite_symbol_in_third_row() {
        dragAndDrop.dynamicDragThreeImagesAndDropInThirdRow();
    }

    @Then("verify dynamic draggable element")
    public void verify_dynamic_draggable_element() {
        dragAndDrop.validateDynamicDraggedElements();
    }


    // Selectable page - Default Functionality glue code
    @Given("user navigate to selectable page")
    public void user_navigate_to_selectable_page() {
        selectPage = new SelectablePage(driver);
        selectPage.navigateToSelectablePage();
    }

    @When("click default functionality option")
    public void click_default_functionality_option() {
        selectPage.selectDefaultFunctionality();
    }

    @Then("select Readability")
    public void select_readbility() {
        selectPage.selectReadability();
    }

    @Then("select Single line coding")
    public void select_single_line_coding() {
        selectPage.selectSingleLineCoding();
    }

    @Then("select method chaining")
    public void select_method_chaining() {
        selectPage.selectMethodChaining();
    }

    @Then("select cross browser testing")
    public void select_cross_browser_testing() {
        selectPage.selectCrossBrowserTesting();
    }

    @Then("select extent report")
    public void select_extent_report() {
        selectPage.selectExtentReports();
    }

    @Then("select data driven testing")
    public void select_data_driven_testing() {
        selectPage.selectDataDrivenTesting();
    }

    @Then("select functional testing")
    public void select_functional_testing() {
        selectPage.selectFunctionalTesting();
    }


    //Selectable - Serialize Page Glue code

    @Given("user in selectable page")
    public void user_in_selectable_page() {
        selectPage = new SelectablePage(driver);
        selectPage.navigateSelectable();
    }

    @When("click Serialize option")
    public void click_serialize_option() {
        selectPage.selectSerialization();
    }

    @Then("select serialize_Readability")
    public void select_serialize_readability() {
        selectPage.selectSerialize_Readability();
    }

    @Then("select serialize_Single line coding")
    public void select_serialize_single_line_coding() {
        selectPage.selectSerialize_SingleLineCoding();
    }

    @Then("select serialize_method chaining")
    public void select_serialize_method_chaining() {
        selectPage.selectSerialize_MethodChaining();
    }

    @Then("select serialize_cross browser testing")
    public void select_serialize_cross_browser_testing() {
        selectPage.selectSerialize_CrossBrowserTesting();
    }

    @Then("select serialize_extent report")
    public void select_serialize_extent_report() {
        selectPage.selectSerialize_ExtentReports();
    }

    @Then("select serialize_data driven testing")
    public void select_serialize_data_driven_testing() {
        selectPage.selectSerialize_DataDrivenTesting();
    }

    @Then("select serialize_functional testing")
    public void select_serialize_functional_testing() {
        selectPage.selectSerialize_FunctionalTesting();
    }
}
