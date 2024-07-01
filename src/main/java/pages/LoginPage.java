package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private SelenideElement usernameInput = $("#username");
    private SelenideElement passwordInput = $("#password");
    private SelenideElement loginButton = $(".radius");
    private SelenideElement infoMessage = $("#flash");
    private SelenideElement logOutButton = $(By.xpath("//a[@class='button secondary radius']"));

    @Step("Fill the Email field with username {0} step....")
    public void setUsernameInput(String username){
        usernameInput.setValue(username);
    }

    @Step("Fill the Password field with password {0} step....")
    public void setPasswordInput(String password){
        passwordInput.setValue(password);
    }

    @Step("Send request by clicking the Login button step....")
    public void clickLoginButton(){
        loginButton.click();
    }

    @Step("Get info message text step....")
    public String getInfoMessageText(){
        return infoMessage.shouldHave(appear).getText();
    }

    @Step("Send request by clicking the Log Out button step....")
    public void clickLogoutButton(){
        logOutButton.shouldHave(appear).click();
    }

    
    //решить проблему - не тот тест бади и дублика тестов
    //но для начала переделать проект - тесты не запускаются вообще



}
