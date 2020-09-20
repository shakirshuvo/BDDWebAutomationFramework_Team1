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
//    @Given("I am on The Hartford homepage")
//    public void i_am_on_the_hartford_homepage() throws IOException {
//        openBrowser("https://www.thehartford.com/");
//        driver.manage().deleteAllCookies();
//        driver.manage().window().maximize();
//    }
//
//    @After
//    public void closeBrowser() {
//        cleanUp();
//    }
//
//    @Then("I verify page title {string}")
//    public void i_verify_page_title(String title) {
//        validateByTitle(title);
//    }
//
//    @When("I click on `Start Quote` button")
//    public void i_click_on_start_quote_button() {
//        clickOnElementByCSS(startQuoteButtonCSSWebElement);
//    }
//
//    @Then("I receive {string}")
//    public void i_receive(String url) {
//        validateByURL(url);
//    }
//
//}
