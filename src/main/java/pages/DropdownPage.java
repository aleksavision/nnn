package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DropdownPage {
    private SelenideElement dropdown = $(By.xpath("//select"));

    public void selectOption(){
        dropdown.selectOption(2);
    }
    public String getSelectedOption(){
        return dropdown.getSelectedOption().getText();
    }
    public String getVisibleOption(){
        return dropdown.getText();
    }


}
