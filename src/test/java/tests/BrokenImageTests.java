package tests;

import baseTest.BaseTest;
import pages.BrokenImagesPage;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class BrokenImageTests extends BaseTest {

    @Test
    public void brokenImage(){
        BrokenImagesPage brokenImagesPage = homepage.clickBrokenImagesLink();
        assertTrue(brokenImagesPage.imageIsDisplayed(), "Image is displayed");
        assertEquals(brokenImagesPage.getAttr(), "120", "Image is displayed");
    }



}
