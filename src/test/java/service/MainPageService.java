package service;

import org.springframework.beans.factory.annotation.Autowired;
import page.FormsPage;
import page.MainPage;
import page.Page;

import java.util.HashMap;
import java.util.Map;

public class MainPageService extends CommonService {
    @Autowired
    private MainPage mainPage;

    @Autowired
    private FormsPage formsPage;

    public static Map<String, Class> sectionsOfMainPage = new HashMap<>();

    static {
        sectionsOfMainPage.put("FormsPageService", FormsPageService.class);
    }

    public Object getPageService(String className){
        return sectionsOfMainPage.get(className);
    }

    public void wentToFormsCategory(String categoryName) {
        getFromMap(mainPage.getElements(), categoryName).click();
    }

    public boolean isOnBasePage() {
        return checkElementVisible(mainPage, "MainPageHeader");
    }
}
