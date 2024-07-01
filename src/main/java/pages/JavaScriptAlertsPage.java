package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class JavaScriptAlertsPage {

    private SelenideElement alertButton = $(By.xpath("//button[@onclick='jsAlert()']"));

    public void clickAlertButton(){
        alertButton.click();
    }
    public String getAlertText(){
        return switchTo().alert().getText();
    }
    public void acceptAlert(){
        switchTo().alert().accept();
    }



}
