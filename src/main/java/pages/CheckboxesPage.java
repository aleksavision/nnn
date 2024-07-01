package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.checked;
import static com.codeborne.selenide.Selenide.$;

public class CheckboxesPage {

    private SelenideElement pageTitle = $(By.tagName("h3"));

    private SelenideElement checkbox1 = $(By.xpath("(//form/input)[1]"));
    private SelenideElement checkbox2 = $(By.xpath("(//form/input)[2]"));

    public void selectCheckboxes() {
        checkbox1.click();
        checkbox2.click();
    }

    public boolean checkbox1IsMarked(){
        return checkbox1.is(checked);
    }
    public boolean checkbox2IsMarked(){
        return checkbox2.is(checked);
    }
    @Step("Getting page H3 title text...")
    public String getPageTitle(){
        return pageTitle.getText();
    }

}
