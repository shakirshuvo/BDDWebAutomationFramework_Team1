package stepDefinitions;//package stepDefinitions;

import base.CommonAPI;
import home.MarriottHomePage;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;


import java.io.IOException;

import static home.MarriottHomePageWebElements.languageSelectorElementXpath;

public class WeddingsStepDefinition extends CommonAPI {

    public static MarriottHomePage marriottHomePage;

    @BeforeStep
    public static void getInit() {
        marriottHomePage = PageFactory.initElements(driver, MarriottHomePage.class);

    }

    @After
    public void closeBrowser() {
//        closeBrowser();
        cleanUp();
    }

    @Given("I am on Marriott Homepage for Weddings")
    public void iAmOnMarriottHomepageForWeddings() throws IOException {
        openBrowser("https:www.marriott.com/default.mi");
        driver.manage().window().maximize();
    }
//    @Given("I am on Marriott Homepage")
//    public void i_am_on_marriott_homepage() throws IOException {
//
//       }
//    @Given("I clicked on meetings and events")
//    public void i_clicked_on_meetings_and_events() {
//        marriottHomePage.clickMeetingsNEvents();
////
//    }
//    @Given("I have clicked on Weddings Tab")
//    public void i_Have_Clicked_On_Weddings_Tab() {
//        marriottHomePage.clickOnWeddings();
//    }



    @When("I click on Planning tab")
    public void i_click_on_planning_tab() {
        marriottHomePage.clickOnPlanning();
    }

    @Then("I will verify the planning tab using page title")
    public void i_will_verify_the_planning_tab_using_page_title() throws InterruptedException {
        marriottHomePage.validateClickPlanning();
    }



}