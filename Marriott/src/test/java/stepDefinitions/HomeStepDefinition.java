package stepDefinitions;

import base.CommonAPI;
import home.MarriottHomePage;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;


import java.io.IOException;

import static home.MarriottHomePageWebElements.languageSelectorElementXpath;

public class HomeStepDefinition extends CommonAPI {

    public static MarriottHomePage marriottHomePage;

    @BeforeStep
    public static void getInit(){
        marriottHomePage = PageFactory.initElements(driver,MarriottHomePage.class);
    }

    @After
    public void closeBrowser(){
//        closeBrowser();
        cleanUp();
    }


    @Given("I am on Marriott Homepage")
    public void i_am_on_marriott_homepage() throws IOException {
        openBrowser();
    }

    @When("I click on language selector")
    public void i_click_on_language_selector() {
        clickOnElement(languageSelectorElementXpath);
    }

    @Then("I should be to verify language selector")
    public void i_should_be_to_verify_language_selector() {
       marriottHomePage.validateLanguageSelector();

    }
}
