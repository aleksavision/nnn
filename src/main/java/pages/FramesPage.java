package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class FramesPage {

    private void clickElement(String linkText){
        SelenideElement element = $(By.linkText(linkText));
        element.shouldBe(visible).click();
    }
    public NestedFramesPage clickNestedFramesLink(){
        clickElement("Nested Frames");
        return new NestedFramesPage();
    }
    public iFramePage clickIFrameLink(){
        clickElement("iFrame");
        return new iFramePage();
    }



}
