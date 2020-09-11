package stepDefinitions;

import base.CommonAPI;
import home.Home;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static home.HomePageWebElements.*;
import static home.Home.*;
public class HomeStepDefinition extends CommonAPI {

    static Home home;

    public static void gitInit(){
        home = PageFactory.initElements(driver, Home.class);
    }


    @After
    public void closeBroser(){
        cleanUp();
    }


    @Given("I am on Delta homepage")
    public void i_am_on_delta_homepage() throws IOException {
        openBrowser();
        driver.manage().window().maximize();
    }

    @When("I click on Log In")
    public void i_click_on_log_in() {
        clickOnElement(loginXpathWebElement);
    }

    @Then("I verify Log In page with title")
    public void i_verify_log_in_page_with_title() {
        validateByTitle("Login");
    }

//    @Given("I am on Delta homepage")
//    public void i_am_on_delta_homepage() throws IOException, InterruptedException {
//        openBrowser();
//        driver.manage().window().maximize();
//        isPopUpWindowDisplayedByXpath(driver, canadaEnglish);
//        sleepFor(300);
//    }

    @Then("I verify page {string}")
    public void i_verify_page(String title) {
        validateByTitle(title);
    }

    @When("I click on {string} tab")
    public void i_click_on_tab(String string) {
        clickOnElementByID(needHelpTabIDWebElement);
    }

    @When("I click on {string} link")
    public void i_click_on_link(String string) {
        clickOnElementByID(certificateAndECreditIDWebElement);
    }

    @When("I click on Need Help tab")
    public void i_click_on_need_help_tab() {
    clickOnElementByID(needHelpTabIDWebElement);
    }

    @When("I click on SkyMiles Help link")
    public void i_click_on_sky_miles_help_link() {
        clickOnElementByXpath(getSkymilesHelpXpath);

    }
    @Then("I verify pag by {string}")
    public void i_verify_pag_by(String string) {
        validateByTitle("SkyMiles Help : Delta Air Lines");
    }
    @When("I need click on Need Help tab")
    public void i_need_click_on_need_help_tab() {
        clickOnElementByID(needHelpTabIDWebElement);
    }
    @When("I click on Accessible Travel Services")
    public void i_click_on_accessible_travel_services() {
       clickOnElementByXpath(accessibleTravelServicesByXpath);
    }

    @Then("I verify page by {string}")
    public void i_verify_page_by(String string) {
        validateByTitle("Accessible Travel Services : Delta Air Lines");
    }
    @When("I need click on Need Help tab")
    public void i_get_click_on_need_help_tab() {
        clickOnElementByID(needHelpTabIDWebElement);
    }

    @When("I click on child & InfantTravel")
    public void i__click_on_child_And_Infant_Travel(){
    clickOnElementByXpath(childandInfandTravelByXpath);

    }

    @Then("I verify page by\"<title>\"")
    public void i_verify_page_by_title() {
validateByTitle("Children & Infant Travel Policy : Delta Air Lines");
    }

}
