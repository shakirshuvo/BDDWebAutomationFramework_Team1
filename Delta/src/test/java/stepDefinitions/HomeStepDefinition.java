//package stepDefinitions;
//
//import base.CommonAPI;
//import home.Home;
//import io.cucumber.java.After;
//import io.cucumber.java.BeforeStep;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.support.PageFactory;
//
//import java.io.IOException;
//
//import static home.HomeWebElements.*;
//
//public class HomeStepDefinition extends CommonAPI {
//
//    static Home home;
//
//    @BeforeStep
//    public static void getInit() {
//        home = PageFactory.initElements(driver, Home.class);
//    }
//
//    @After
//    public void closeBrowser() {
//        cleanUp();
//    }
//
//
//    @Given("I am on Delta homepage")
//    public void i_am_on_delta_homepage() throws IOException, InterruptedException {
//        openBrowser("https://www.delta.com/");
//        driver.manage().window().maximize();
//        isPopUpWindowDisplayedByXpath(driver, canadaEnglish);
//        sleepFor(300);
//    }
//
//    @Then("I verify page {string}")
//    public void i_verify_page(String title) {
//        validateByTitle(title);
//    }
//
//    @When("I click on {string} tab")
//    public void i_click_on_tab(String string) {
//        clickOnElementByID(needHelpTabIDWebElement);
//    }
//
//    @When("I click on {string} link")
//    public void i_click_on_link(String string) {
//        clickOnElementByID(certificateAndECreditIDWebElement);
//    }
//}
