package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class AddRemoveElementsPage {

    private SelenideElement addElementButton = $(By.xpath("//button[@onclick='addElement()']"));
    private SelenideElement deleteButton = $(By.className("added-manually"));
    public void addElement(){
        addElementButton.click();
    }
    public void removeElement(){
        deleteButton.click();
    }
    public Integer deleteButtonQty(){
        ElementsCollection buttons = $$(By.className("added-manually"));
        return buttons.size();
    }




}
