package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.*;

public class DragDropPage {

    private SelenideElement aBox = $(By.id("column-a"));
    private SelenideElement bBox = $(By.id("column-b"));
    private ElementsCollection boxes = $$(By.className("column"));
    private SelenideElement footerLink = $(By.linkText("Elemental Selenium"));
    public void coverBBox(){
        actions().dragAndDrop(aBox, bBox).build().perform();
    }
    public String getLeftBox(){
        return boxes.get(0).getText();



    }
    public void rightClickOnFooterLink(){
        actions()
                .contextClick(footerLink)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ENTER)
                .build().perform();
    }





}
