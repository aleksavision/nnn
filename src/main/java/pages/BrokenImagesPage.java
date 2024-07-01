package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class BrokenImagesPage {

    private SelenideElement image = $(By.xpath("(//div/img)[1]"));
    public boolean imageIsDisplayed(){
        image.shouldBe(visible);
        return true;
    }
    public String getAttr(){
        return image.getAttribute("width");
    }


}
