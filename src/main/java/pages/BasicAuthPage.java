package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasicAuthPage {
    private SelenideElement successLoginMessage = $(By.xpath("//p"));
    public String getSuccessLoginMessage(){
        return successLoginMessage.getText();
    }



}
