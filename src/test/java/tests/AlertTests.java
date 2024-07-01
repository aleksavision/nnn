package tests;

import baseTest.BaseTest;
import pages.JavaScriptAlertsPage;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.switchTo;
import static com.codeborne.selenide.Selenide.title;
import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTest {

    @Test
    public void alert(){
        JavaScriptAlertsPage alertsPage = homepage.clickJavaScriptAlertsLink();
        alertsPage.clickAlertButton();
        Alert alert = switchTo().alert();
        assertEquals(alertsPage.getAlertText(), "I am a JS Alert", "Alert message is incorrect");
        assertEquals(title(), "The Internet", "Title is incorrect");
    }


}
