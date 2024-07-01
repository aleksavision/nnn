package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DigestAuthenticationPage{

    private SelenideElement successMessage = $(By.xpath("//p"));
    public String getSuccessMessage(){
        return successMessage.getText();
    }


}
