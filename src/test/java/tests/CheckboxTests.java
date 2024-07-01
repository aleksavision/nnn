package tests;

import baseTest.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import pages.CheckboxesPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class CheckboxTests extends BaseTest {

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Case Description: veryfying page title")
    @Story("Story name: Verify page title")
    public void checkPageTitle(){
        var checkboxesPage = homepage.clickCheckboxesLink();
        assertEquals(checkboxesPage.getPageTitle(), "Checkboxes");
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Case Description: veryfying checkbox selecting")
    @Story("Story name: Verify if checkbox 1 is selected and checkbox 2 is unselected after the clicking")
    public void selectCheckboxes(){
        CheckboxesPage checkboxesPage = homepage.clickCheckboxesLink();
        checkboxesPage.selectCheckboxes();
        assertTrue(checkboxesPage.checkbox1IsMarked());
        assertTrue(!checkboxesPage.checkbox2IsMarked());
    }

}
