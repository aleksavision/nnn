package baseTest;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.Homepage;

import static data.GlobalData.mainUrl;

abstract public class BaseTest {

    protected Homepage homepage;

    public void setUp(){
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.webdriverLogsEnabled = true;
        Configuration.browserSize = "1920x1080";
        Configuration.headless = false;
        Selenide.open(mainUrl);
        homepage = new Homepage();
    }

    @BeforeMethod
    public void init(){
        setUp();
    }

    @AfterMethod
    public void tearDown(){
        Selenide.closeWebDriver();
    }







}
