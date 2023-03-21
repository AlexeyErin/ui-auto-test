package page;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

import static com.codeborne.selenide.Selenide.$;

@Getter
@Component
public class FormsPage implements Page {

    private final Map<String, SelenideElement> elements = new HashMap<>() {{
        put("FormsCategoryHeader", $(By.cssSelector("#app > div > div > div.pattern-backgound.playgound-header > div")));
    }};
}
