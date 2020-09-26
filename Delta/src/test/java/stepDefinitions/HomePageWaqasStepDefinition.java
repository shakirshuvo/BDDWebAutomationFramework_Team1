package stepDefinitions;

import base.CommonAPI;
import home.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class HomePageWaqasStepDefinition extends  CommonAPI {
    static HomePage deltaHomePage;

    @BeforeStep
    public void getInit() {
        deltaHomePage = PageFactory.initElements(driver, HomePage.class);
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }


    @Given("I am in delta homepage homepage")
    public void i_am_in_delta_homepage_homepage() throws IOException {
        openBrowser("https://www.delta.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @When("I click on vacations deals Tab")
    public void i_click_on_vacations_deals_tab() throws InterruptedException {
        deltaHomePage.clickOnVaccationDeals();

    }

    @Then("I will validate the vacations deals tab")
    public void i_will_validate_the_vacations_deals_tab() {
       deltaHomePage.validateClickOnVaccationDeals();
    }


    @When("I click on book in element")
    public void iClickOnBookInElement() throws InterruptedException {
        deltaHomePage.clicKOnBook();
    }

    @Then("I will validate the book element")
    public void iWillValidateTheBookElement() {
        deltaHomePage.validateClickOnBook();
    }

    @When("I click on  check in element")
    public void iClickOnCheckInElement() {
        deltaHomePage.clickCheckIn();
    }

    @Then("I will validate the  check in element")
    public void iWillValidateTheCheckInElement() {
        deltaHomePage.validateClickCheckIn();
    }

    @When("I click on my trips element")
    public void iClickOnMyTripsElement() throws InterruptedException {
        deltaHomePage.clickMyTrips();
        sleepFor(2);
    }

    @And("I will enter My trip information")
    public void iWillEnterMyTripInformation() throws InterruptedException {
        deltaHomePage.enterMyTripInfo();
    }

    @Then("I will validate the my trips element")
    public void iWillValidateTheMyTripsElement() {
        deltaHomePage.validateMyTrips();
    }

    @When("I click flight status on element")
    public void iClickFlightStatusOnElement() throws InterruptedException {
        deltaHomePage.clickFlightStatus();
    }

    @Then("I will validate the flight status element")
    public void iWillValidateTheFlightStatusElement() {
        deltaHomePage.validateClickFlightStatus();
    }


}