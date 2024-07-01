package tests;

import baseTest.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import pages.LoginPage;
import org.testng.annotations.Test;

import static data.GlobalData.*;
import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTest {

    @Test (groups = "success", priority = 1, description="logging in with valid credentials")
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Case Description: Verify success login")
    @Story("Story name: Verify success login")
    public void successLogin(){
        LoginPage loginPage = homepage.clickFormAuthenticationLink();
        loginPage.setUsernameInput(validUsername);
        loginPage.setPasswordInput(validPassword);
        loginPage.clickLoginButton();
        assertTrue(loginPage.getInfoMessageText()
                .contains("You logged into a secure area!"),
                "Info message is incorrect");
    }

    @Test (groups = "unsuccess", priority = 2, description="logging in with invalid email")
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Case Description: Verify unsuccess login with invalid email")
    @Story("Story name: Verify unsuccess login")
    public void unsuccessLoginInvalidUsername(){
        LoginPage loginPage = homepage.clickFormAuthenticationLink();
        loginPage.setUsernameInput(invalidUsername);
        loginPage.setPasswordInput(validPassword);
        loginPage.clickLoginButton();
        assertTrue(loginPage.getInfoMessageText()
                        .contains("Your username is invalid!"),
                "Info message is incorrect");
    }

    @Test (groups = "unsuccess", priority = 3, description="logging in with invalid password")
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Case Description: Verify unsuccess login with invalid password")
    @Story("Story name: Verify unsuccess login")
    public void unsuccessLoginInvalidPassword(){
        LoginPage loginPage = homepage.clickFormAuthenticationLink();
        loginPage.setUsernameInput(validUsername);
        loginPage.setPasswordInput(invalidPassword);
        loginPage.clickLoginButton();
        assertTrue(loginPage.getInfoMessageText()
                        .contains("Your password is invalid!"),
                "Info message is incorrect");
    }

    @Test (groups = "success", priority = 4, description="logging out")
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Case Description: Verify success log out")
    @Story("Story name: Verify success log out")
    public void logoutTest(){
        LoginPage loginPage = homepage.clickFormAuthenticationLink();
        loginPage.setUsernameInput(validUsername);
        loginPage.setPasswordInput(validPassword);
        loginPage.clickLoginButton();
        loginPage.clickLogoutButton();
        assertTrue(loginPage.getInfoMessageText()
                        .contains("You logged out of the secure area!"),
                "Info message is incorrect");
    }





}
