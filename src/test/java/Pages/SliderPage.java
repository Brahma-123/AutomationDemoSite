package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SliderPage {
    WebDriver driver;

    public SliderPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    //Slider page elements

    @FindBy(xpath = "//a[contains(text(),'Slider')]")
    WebElement sliderButton;
    @FindBy(id = "slider")
    WebElement sliderForIncreaseAndDecrease;
    double maxSliderValue = 100;
    double move50Percent = 50;
    double move90Percent = 90;
    double move5Percent = 5;


    public void navigateToSliderPage() {
        Actions sliderClick = new Actions(driver);
        sliderClick.moveToElement(sliderButton).click().perform();
        String titleOfSliderPage = driver.getTitle();
        System.out.println("Title of the slider page : " + titleOfSliderPage);
    }

    public void moveToFiftyPercent() {
        int sliderWidth = sliderForIncreaseAndDecrease.getSize().getWidth();
        System.out.println("Slider width : "+sliderWidth);
        int offSet = (int) ((move50Percent/maxSliderValue)*sliderWidth);

        Actions moveSliderFiftyPer = new Actions(driver);
        moveSliderFiftyPer.clickAndHold(sliderForIncreaseAndDecrease)
                .moveByOffset(offSet, 0)
                .release()
                .perform();
    }

    public void moveToNinetyPercent() {
        int sliderWidth = sliderForIncreaseAndDecrease.getSize().getWidth();
        int offSet = (int) ((move90Percent/maxSliderValue)*sliderWidth);
        Actions moveSliderNinetyPer = new Actions(driver);
        moveSliderNinetyPer.clickAndHold(sliderForIncreaseAndDecrease)
                .moveByOffset(offSet, 0)
                .release()
                .perform();
    }

    public void moveToFivePercent() {
        int sliderWidth = sliderForIncreaseAndDecrease.getSize().getWidth();
        int offSet = (int) ((move5Percent/maxSliderValue)*sliderWidth);
        Actions moveSliderFivePer = new Actions(driver);
        moveSliderFivePer.clickAndHold(sliderForIncreaseAndDecrease)
                .moveByOffset(offSet, 0)
                .release()
                .perform();
    }


}
