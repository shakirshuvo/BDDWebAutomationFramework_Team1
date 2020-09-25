package stepDefinitions;

import base.CommonAPI;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import nytHomeByMobin.NYTHomePageByMobin;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;

public class NYTHomePageByMobinStepDefinition extends CommonAPI{

    static NYTHomePageByMobin home;

    @BeforeStep
    public static void getInit() {
        home = PageFactory.initElements(driver, NYTHomePageByMobin.class);
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }

    @Given("User is in New York Times homepage")
    public void user_is_in_new_york_times_homepage() throws IOException {
        openBrowser("https://www.nytimes.com/");
    }

    @When("User clicks on World tab")
    public void user_clicks_on_world_tab() throws InterruptedException {
        home.checkWorldTab();
    }

    @Then("User is directed to World page")
    public void user_is_directed_to_world_page() {
        home.validateWorldTab();
    }

    @When("User clicks on US tab")
    public void userClicksOnUSTab() throws InterruptedException {
        home.checkUSTab();
    }

    @Then("User is directed to US page")
    public void userIsDirectedToUSPage() {
        home.validateUSTab();
    }

    @When("User clicks on Politics tab")
    public void userClicksOnPoliticsTab() throws InterruptedException {
        home.checkPoliticsTab();
    }

    @Then("User is directed to Politics page")
    public void userIsDirectedToPoliticsPage() {
        home.validatePoliticsTab();
    }

    @When("User clicks on NY tab")
    public void userClicksOnNYTab() throws InterruptedException {
        home.checkNYTab();
    }

    @Then("User is directed to NY page")
    public void userIsDirectedToNYPage() {
        home.validateNYTab();
    }

    @When("User clicks on Business tab")
    public void userClicksOnBusinessTab() throws InterruptedException {
        home.checkBusinessTab();
    }

    @Then("User is directed to Business page")
    public void userIsDirectedToBusinessPage() {
        home.validateBusinessTab();
    }
}
