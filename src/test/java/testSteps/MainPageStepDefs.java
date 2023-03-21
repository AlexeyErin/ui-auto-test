package testSteps;

import appConfig.DriverConfig;
import appConfig.PropertiesConf;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.impl.Waiter;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import service.FormsPageService;
import service.MainPageService;

@ContextConfiguration(classes = {DriverConfig.class})
public class MainPageStepDefs {

    @Given("User open main page")
    public void checkWeAreOnMainPage() {
        Assert.assertTrue(mainPageService.isOnBasePage());
    }

    @When("User click on {string}")
    public void wentToSection(String sectionName) {
        mainPageService.wentToFormsCategory(sectionName);
    }

    @Then("User relocate to {string}")
    public void checkWeAreOnChoosenSection(String className){
        if(className.equals(FormsPageService.class.getName())){
            formsPageService.checkWeAreOnFormsPage();
        }
    }

    @Autowired
    private PropertiesConf config;

    @Autowired
    private MainPageService mainPageService;

    @Autowired
    private FormsPageService formsPageService;

    public MainPageStepDefs() {
    }

    @Before
    public void before() {
        Selenide.open(config.getWeb().getBaseUrl());
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }
}
