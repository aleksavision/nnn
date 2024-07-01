package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class iFramePage {

    private String iFrameLocator = "mce_0_ifr";
    private SelenideElement inputBox = $(By.xpath("//body[@id='tinymce']"));
    private SelenideElement pageTitle = $(By.xpath("//h3"));
    private SelenideElement closeInfoMessageButton = $(By.xpath("//button[@class='tox-notification__dismiss tox-button tox-button--naked tox-button--icon']"));
    private void clickCloseInfoMessageButton(){closeInfoMessageButton.shouldBe(visible).click();}
    private void getToIFrame(){
        switchTo().frame(0, Duration.ofMillis(3000));
    }
    public void setInput(String text){
        clickCloseInfoMessageButton();
        getToIFrame();
        inputBox.click();
        inputBox.clear();
        inputBox.sendKeys(text);
    }
    public String getEnteredText(){
        return inputBox.getText();
    }
    public String getPageTitle(){
        return pageTitle.getText();
    }




}
