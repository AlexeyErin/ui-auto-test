package page;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import service.FormsPageService;

import java.util.HashMap;
import java.util.Map;

import static com.codeborne.selenide.Selenide.$;

@Getter
@Component
public class MainPage implements Page {

    @Autowired
    private FormsPageService formsPageService;

    private final Map<String, SelenideElement> elements = new HashMap<>() {{
        put("ElementsCategory", $(By.cssSelector("#app > div > div > div.home-body > div > div:nth-child(1)")));
        put("FormsCategory", $(By.cssSelector("#app > div > div > div.home-body > div > div:nth-child(2)")));
        put("AlertsFramesWindowCategory", $(By.cssSelector("#app > div > div > div.home-body > div > div:nth-child(3)")));
        put("WidgetsCategory", $(By.cssSelector("#app > div > div > div.home-body > div > div:nth-child(4)")));
        put("InteractionsCategory", $(By.cssSelector("#app > div > div > div.home-body > div > div:nth-child(5)")));
        put("BookStoreApplicationCategory", $(By.cssSelector("#app > div > div > div.home-body > div > div:nth-child(6)")));
        put("MainPageHeader", $(By.cssSelector("#app > div > div > div.home-banner > a > img")));
    }};
}
