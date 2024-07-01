package tests;

import baseTest.BaseTest;
import pages.DigestAuthenticationPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class DigestAuthenticationTests extends BaseTest {

    @Test
    public void successLogin(){
        DigestAuthenticationPage digestAuthenticationPage = homepage.clickDigestAuthenticationLink();
        assertTrue(digestAuthenticationPage.getSuccessMessage().contains("Congratulations"));
    }


}
