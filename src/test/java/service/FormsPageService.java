package service;

import org.springframework.beans.factory.annotation.Autowired;
import page.FormsPage;

public class FormsPageService extends CommonService {

    @Autowired
    private FormsPage formsPage;

    public boolean checkWeAreOnFormsPage() {
        return checkElementVisible(formsPage, "FormsCategoryHeader");
    }
}
