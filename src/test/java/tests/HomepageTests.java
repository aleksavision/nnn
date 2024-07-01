package tests;

import baseTest.BaseTest;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class HomepageTests extends BaseTest {

    @Test
    public void chooseRandomLink(){
        System.out.println(homepage.getRandomChosenLink());
    }

    @Test
    public void allLinkAreDisplayed(){
        homepage.getAllLinksQty();
    }

    @Test
    public void backForwardToPage(){
        homepage.proceedRandomPage();
        System.out.println(homepage.getRandomPageTitle());
        back();
        System.out.println(homepage.getHomepageTitle());
        forward();
        System.out.println(homepage.getRandomPageTitle());
        back();
        System.out.println(homepage.getHomepageTitle());
    }

    @Test
    public void openCloseTab(){
        homepage.getHomepageTitle();
        homepage.clickFooterLink();
        switchTo().window(1);
        title();
        closeWindow();
        switchTo().window(0);
        homepage.getHomepageTitle();
    }

    @Test
    public void runnerClass(){
        homepage.getHomepageTitle();
//        WebDriverRunner.addListener();
        WebDriverRunner.clearBrowserCache();
        WebDriverRunner.url();
        WebDriverRunner.source();
        WebDriverRunner.isChrome();
    }

    @Test
    public void allLinks(){
        homepage.printAllLinks();
    }






}
