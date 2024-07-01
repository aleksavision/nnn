package tests;

import baseTest.BaseTest;
import pages.DropdownPage;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class DropdownTests extends BaseTest {

    @Test
    public void selectOption(){
        DropdownPage dropdownPage = homepage.clickDropdownLink();
        assertEquals(dropdownPage.getSelectedOption(), dropdownPage.getVisibleOption(), "Option is selected incorrect");

    }





}
