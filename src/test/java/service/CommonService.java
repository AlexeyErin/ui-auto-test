package service;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.springframework.stereotype.Service;
import page.Page;

import java.util.Map;
@Service
public abstract class CommonService {

    public SelenideElement getFromMap(Map<String, SelenideElement> map, String elementName){
        return map.get(elementName);
    }

    public void inputText(Page page, String filed, String incomingText){
        getFromMap(page.getElements(), filed).setValue(incomingText);
    }

    public void clickButton(Page page, String button){
        getFromMap(page.getElements(), button).click();
    }

    public String getText(Page page, String element){
        return getFromMap(page.getElements(), element).getText();
    }

    public boolean checkElementVisible(Page page, String element){
        return getFromMap(page.getElements(), element).shouldBe(Condition.visible).isDisplayed();
    }
}
