package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import java.util.Random;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;

public class Homepage{

    private ElementsCollection allLinks = $$(By.xpath("//*[@id='content']/ul/li/a"));
    private SelenideElement pageTitle = $(By.xpath("//h3"));
    private SelenideElement homepageTitle = $x("//h1");

    private void clickElement(String linkText) {
        SelenideElement element = $(By.linkText(linkText));
        element.shouldBe(visible).click();
    }

    public LoginPage clickFormAuthenticationLink() {
        clickElement("Form Authentication");
        return new LoginPage();
    }

    public String getRandomChosenLink() {
        Random random = new Random();
        int randomIndex = random.nextInt(allLinks.size() + 1);
        return allLinks.get(randomIndex).getText();
    }

    public ElementsCollection getAllLinksQty() {
        System.out.println(allLinks.size());
        return allLinks.shouldHave(CollectionCondition.size(44));
    }

    public void proceedRandomPage() {
        Random random = new Random();
        int randomIndex = random.nextInt(allLinks.size() + 1);
        allLinks.get(randomIndex).click();
    }

    public String getRandomPageTitle() {
        return pageTitle.shouldBe(visible).getText();
    }

    public String getHomepageTitle() {
        return homepageTitle.shouldBe(visible).getText();
    }

    public void clickFooterLink() {
        clickElement("Elemental Selenium");
    }

    public JavaScriptAlertsPage clickJavaScriptAlertsLink() {
        clickElement("JavaScript Alerts");
        return new JavaScriptAlertsPage();
    }

    public FramesPage clickFramesLink() {
        clickElement("Frames");
        return new FramesPage();
    }

    public BasicAuthPage openBasicAuthPage() {
        open("https://the-internet.herokuapp.com/basic_auth",
                "",
                "admin", "admin");
        return new BasicAuthPage();
    }
    public void printAllLinks() {
        ElementsCollection links = $$(By.xpath("//div/ul/li/a"));
        links.forEach(e -> System.out.println(e.getText()));
    }

    public DropdownPage clickDropdownLink(){
        clickElement("Dropdown");
        return new DropdownPage();
    }
    public DragDropPage clickDragAndDropLink(){
        clickElement("Drag and Drop");
        return new DragDropPage();
    }
    public AddRemoveElementsPage clickAddRemoveElementsLink(){
        clickElement("Add/Remove Elements");
        return new AddRemoveElementsPage();
    }
    public BrokenImagesPage clickBrokenImagesLink(){
        clickElement("Broken Images");
        return new BrokenImagesPage();
    }

    @Step("Proceed to the Checkboxes page...")
    public CheckboxesPage clickCheckboxesLink(){
        clickElement("Checkboxes");
        return new CheckboxesPage();
    }
    public DigestAuthenticationPage clickDigestAuthenticationLink(){
        open("https://the-internet.herokuapp.com/digest_auth",
                "",
                "admin",
                "admin");
        return new DigestAuthenticationPage();
    }






    //продолжить с стр Disappearing Elements
    //



}
