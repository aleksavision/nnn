package tests;

import baseTest.BaseTest;
import pages.BasicAuthPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class BasicAuthTests extends BaseTest {

    @Test
    public void successAuth(){
        BasicAuthPage basicAuthPage = homepage.openBasicAuthPage();
        assertTrue(basicAuthPage.getSuccessLoginMessage().contains("Congratulations"), "Success message is incorrect");
    }


}
