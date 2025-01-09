package StepDefinationAutomationTesting;

import Pages.DragAndDropPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class InteractionsStepDefination {
    WebDriver driver = Hooks.getDriver();
    DragAndDropPage dragAndDrop;



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

}
