package Pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class DragAndDropPage {
    WebDriver driver;

    public DragAndDropPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    //Navigate to interactions
    @FindBy(xpath = "//a[contains(text(),'Interactions')]")
    WebElement interactionsSection;

    // Drag and drop elements
    @FindBy(xpath = "//a[contains(text(),'Drag and Drop')]")
    WebElement dragAndDropOption;
    @FindBy(xpath = "//a[contains(text(),'Static')]")
    WebElement staticDragAndDrop;
    @FindBy(xpath = "//a[contains(text(),'Dynamic')]")
    WebElement dynamicDragAndDrop;
    @FindBy(id = "angular")
    WebElement angularImage;
    @FindBy(id = "mongo")
    WebElement automationSiteImage;
    @FindBy(id = "node")
    WebElement seleniumImage;
    //Drop area
    @FindBy(id = "droparea")
    WebElement dropAreaElement;


    public void moveOverToInterActionsSection(){
        Actions interactions = new Actions(driver);
        interactions.moveToElement(interactionsSection).perform();
    }
    public void getTheInteractionsList(){
        List<WebElement> interactionElements = driver.findElements(By.xpath("//div[contains(@class,'navbar-collapse collapse navbar-right')]/ul/li[6]/ul"));
        for (WebElement interactionList : interactionElements){
           String elementsList =  interactionList.getText();
            System.out.println("List visible Interaction dropdown : "+elementsList);
        }
    }

    //Static Drag and drop methods
    public void getListOfDragAndDrops(){
        Actions dragAndDrop = new Actions(driver);
        dragAndDrop.moveToElement(dragAndDropOption).perform();
      List<WebElement> dragAndDropLists =  driver.findElements(By.xpath("//ul[contains(@class,'childmenu')]"));
      for(WebElement dragAndDropList:dragAndDropLists){
         String optionsOfDragAndDrop = dragAndDropList.getText();
          System.out.println("List of Drag and Drop : "+optionsOfDragAndDrop);
      }
    }
    public void navigateToStaticDragAndDropPage(){
        Actions moveStatic = new Actions(driver);
        moveStatic.moveToElement(staticDragAndDrop).click().perform();
        Assert.assertTrue(angularImage.isDisplayed());
    }
    public void dragThreeImagesAndDropInFirstRow(){
        Actions moveElementsToFirstRow = new Actions(driver);
        moveElementsToFirstRow.clickAndHold(angularImage).moveToElement(dropAreaElement)
                .release()
                .perform();
        moveElementsToFirstRow.clickAndHold(automationSiteImage).moveToElement(dropAreaElement)
                .release()
                .perform();
        moveElementsToFirstRow.clickAndHold(seleniumImage).moveToElement(dropAreaElement)
                .release()
                .perform();
    }
    public void dragThreeImagesAndDropInSecondRow(){
        Actions moveElementsToSecondRow = new Actions(driver);
        moveElementsToSecondRow.clickAndHold(angularImage).moveToElement(dropAreaElement)
                .release()
                .perform();
        moveElementsToSecondRow.clickAndHold(automationSiteImage).moveToElement(dropAreaElement)
                .release()
                .perform();
        moveElementsToSecondRow.clickAndHold(seleniumImage).moveToElement(dropAreaElement)
                .release()
                .perform();
    }
    public void dragThreeImagesAndDropInThirdRow(){
        Actions moveElementsToThirdRow = new Actions(driver);
        moveElementsToThirdRow.clickAndHold(angularImage).moveToElement(dropAreaElement)
                .release()
                .perform();
        moveElementsToThirdRow.clickAndHold(automationSiteImage).moveToElement(dropAreaElement)
                .release()
                .perform();
        moveElementsToThirdRow.clickAndHold(seleniumImage).moveToElement(dropAreaElement)
                .release()
                .perform();
    }
    public void validateDraggedElements(){
        System.out.println("All Images Dragged Successfully refer the StaticDragAndDrop Screenshot");
        TakesScreenshot staticDragSnap = (TakesScreenshot) driver;
        File staticSnap = staticDragSnap.getScreenshotAs(OutputType.FILE);
        File saveStaticSnap = new File("target/Screenshots/StaticDragAndDrop.png");
        try {
            FileUtils.copyFile(staticSnap, saveStaticSnap);
        } catch (IOException e) {
            System.out.println("Failed to capture the Screenshot : "+e);
        }
    }

    // Dynamic Drag and drop methods
    public void navigateToDynamicDragAndDropPage(){
        Actions dynamicDrag = new Actions(driver);
        dynamicDrag.moveToElement(dynamicDragAndDrop).click().perform();
    }
    public void dynamicDragThreeImagesAndDropInFirstRow(){
        Actions moveImagesToFirstRow = new Actions(driver);
        moveImagesToFirstRow.clickAndHold(angularImage)
                .moveToElement(dropAreaElement)
                .release()
                .perform();
        moveImagesToFirstRow.clickAndHold(automationSiteImage)
                .moveToElement(dropAreaElement)
                .release()
                .perform();
        moveImagesToFirstRow.clickAndHold(seleniumImage)
                .moveToElement(dropAreaElement)
                .release()
                .perform();

    }
    public void dynamicDragThreeImagesAndDropInSecondRow(){
        Actions moveImagesToSecondRow = new Actions(driver);
        moveImagesToSecondRow.clickAndHold(angularImage)
                .moveToElement(dropAreaElement)
                .release()
                .perform();
        moveImagesToSecondRow.clickAndHold(automationSiteImage)
                .moveToElement(dropAreaElement)
                .release()
                .perform();
        moveImagesToSecondRow.clickAndHold(seleniumImage)
                .moveToElement(dropAreaElement)
                .release()
                .perform();
    }
    public void dynamicDragThreeImagesAndDropInThirdRow(){
        Actions moveImagesToThirdRow = new Actions(driver);
        moveImagesToThirdRow.clickAndHold(angularImage)
                .moveToElement(dropAreaElement)
                .release()
                .perform();
        moveImagesToThirdRow.clickAndHold(automationSiteImage)
                .moveToElement(dropAreaElement)
                .release()
                .perform();
        moveImagesToThirdRow.clickAndHold(seleniumImage)
                .moveToElement(dropAreaElement)
                .release()
                .perform();
    }
    public void validateDynamicDraggedElements(){
        TakesScreenshot dynamicDragAndDrop = (TakesScreenshot)driver;
        File sourceDynamicDragAndDrop = dynamicDragAndDrop.getScreenshotAs(OutputType.FILE);
        File destinyDynamicDragAndDrop = new File("target/Screenshots/DynamicDragAndDrop.png");
        try {
            FileUtils.copyFile(sourceDynamicDragAndDrop, destinyDynamicDragAndDrop);
        } catch (IOException e) {
            System.out.println("Elements not not dragged successfully : "+e);
        }
        System.out.println("All dynamic images have dropped into dropped area refer the Screen shot on Screenshots folder");
    }
}
