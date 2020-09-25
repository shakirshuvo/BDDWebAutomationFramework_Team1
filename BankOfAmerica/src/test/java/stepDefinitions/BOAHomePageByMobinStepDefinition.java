package stepDefinitions;

import base.CommonAPI;
import boaHomeByMobin.BOAHomePageByMobin;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;

public class BOAHomePageByMobinStepDefinition extends CommonAPI{

    static BOAHomePageByMobin home;

    @BeforeStep
    public static void getInit() {
        home = PageFactory.initElements(driver, BOAHomePageByMobin.class);
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }

    @Given("User is in Bank of America homepage")
    public void user_is_in_bank_of_america_homepage() throws IOException {
        openBrowser("https://www.bankofamerica.com/");
    }

    @When("User clicks on Checking tab")
    public void user_clicks_on_checking_tab() {
        home.checkCheckingTab();
    }

    @Then("User is directed to Checking page")
    public void user_is_directed_to_checking_page() {
        home.validateCheckingTab();
    }

    @When("User clicks on Savings tab")
    public void userClicksOnSavingsTab() {
        home.checkSavingsTab();
    }

    @Then("User is directed to Savings page")
    public void userIsDirectedToSavingsPage() {
        home.validateSavingsTab();
    }

    @When("User clicks on Credit Card tab")
    public void userClicksOnCreditCardTab() {
        home.checkCreditCardTab();
    }

    @Then("User is directed to Credit Card page")
    public void userIsDirectedToCreditCardPage() {
        home.validateCreditCardTab();
    }

    @When("User clicks on Investing tab")
    public void userClicksOnInvestingTab() {
        home.checkInvestingTab();
    }

    @Then("User is directed to Investing page")
    public void userIsDirectedToInvestingPage() {
        home.validateInvestingTab();
    }

    @When("User hover over in different places")
    public void userHoverOverInDifferentPlaces() throws InterruptedException {
        home.checkPlanningTab();
    }

    @And("clicks on Planning tab")
    public void clicksOnPlanningTab() {

    }

    @Then("User is directed to Planning page")
    public void userIsDirectedToPlanningPage() {
        home.validatePlanningTab();
    }
}
