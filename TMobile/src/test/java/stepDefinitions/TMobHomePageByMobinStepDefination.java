package stepDefinitions;

import base.CommonAPI;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import tMobileHomeByMobin.TMobHomePageByMobin;

import java.io.IOException;

public class TMobHomePageByMobinStepDefination extends CommonAPI {

    static TMobHomePageByMobin home;

    @BeforeStep
    public static void getInit() {
        home = PageFactory.initElements(driver, TMobHomePageByMobin.class);
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }

    @Given("User is in TMobile homepage")
    public void user_is_in_t_mobile_homepage() throws IOException {
        openBrowser("https://www.t-mobile.com/");
        driver.manage().window().maximize();
    }

    @When("User clicks on Wireless tab")
    public void user_clicks_on_wireless_tab() throws InterruptedException {
       home.checkWirelessTab();
    }

    @Then("User is directed to Wireless page")
    public void user_is_directed_to_wireless_page() {

        home.validateWirelessTab();
    }

    @When("User clicks on Business tab")
    public void userClicksOnBusinessTab() throws InterruptedException {
        home.checkBusinessTab();
    }

    @Then("User is directed to Business page")
    public void userIsDirectedToBusinessPage() {
        home.validateBusinessTab();
    }

    @When("User clicks on Prepaid tab")
    public void userClicksOnPrepaidTab() throws InterruptedException {
        home.checkPrepaidTab();
    }

    @Then("User is directed to Prepaid page")
    public void userIsDirectedToPrepaidPage() {
        home.validatePrepaidTab();
    }

    @When("User clicks on Tv tab")
    public void userClicksOnTvTab() throws InterruptedException {
        home.checkTvTab();
    }

    @Then("User is directed to Tv page")
    public void userIsDirectedToTvPage() {
        home.validateTvTab();
    }

    @When("User clicks on Banking tab")
    public void userClicksOnBankingTab() throws InterruptedException {
        home.checkBankingTab();
    }

    @Then("User is directed to Banking page")
    public void userIsDirectedToBankingPage() {
        home.validateBankingTab();
    }
}