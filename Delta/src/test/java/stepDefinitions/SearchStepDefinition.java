package stepDefinitions;

import base.CommonAPI;
import home.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import search.Search;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class SearchStepDefinition extends CommonAPI {

    public static Search search;

    @BeforeStep
    public void getInit() {
        search = PageFactory.initElements(driver, Search.class);
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }

    @Given("I am in delta homepage homepage for search drop down options")
    public void i_am_in_delta_homepage_homepage_for_search_drop_down_options() throws IOException {
        openBrowser("https://www.delta.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @When("I click on  search button element")
    public void i_click_on_search_button_element() throws InterruptedException {
       search.clickSearchBtn();
       sleepFor(3);
    }

    @Then("I will validate the search button element")
    public void i_will_validate_the_search_button_element() {
       search.validateClickSearchBtn();
    }


    @When("I enter search words into search box  element options under search button")
    public void iEnterSearchWordsIntoSearchBoxElementOptionsUnderSearchButton() throws InterruptedException {
        search.typeInSearchBox();
        sleepFor(3);
    }

    @Then("I will validate the element search box element")
    public void iWillValidateTheElementSearchBoxElement() {
        search.validateSearchBox();
    }

    @When("I click on corona virus  element options under search button")
    public void iClickOnCoronaVirusElementOptionsUnderSearchButton() throws InterruptedException {
        search.clickOnCoronavirusTab();
        sleepFor(3);
    }

    @Then("I will validate the corona virus element")
    public void iWillValidateTheCoronaVirusElement() {
        search.validateCoronavirusTab();
    }

    @When("I click on face mask element options under search button")
    public void iClickOnFaceMaskElementOptionsUnderSearchButton() throws InterruptedException{
        search.clickOnFaceMaskTab();
        sleepFor(3);
    }

    @Then("I will validate the face mask element")
    public void iWillValidateTheFaceMaskElement()  {
        search.validateFaceMaskTab();

    }

    @When("I click on e credits element options under search button")
    public void iClickOnECreditsElementOptionsUnderSearchButton() {
        search.clickOnECreditsTab();
    }

    @Then("I will validate the e credits element")
    public void iWillValidateTheECreditsElement() throws InterruptedException {
        search.validateECreditsTab();
        sleepFor(3);
    }

    @When("I click on change flight element options under search button")
    public void iClickOnChangeFlightElementOptionsUnderSearchButton() throws InterruptedException {
        search.clickOnChangeFlightTab();
        sleepFor(3);
    }

    @Then("I will validate the change flight element under search button")
    public void iWillValidateTheChangeFlightElementUnderSearchButton() {
        search.validateChangeFlightTab();
    }

    @When("I click on  cancel flights element options under search button")
    public void iClickOnCancelFlightsElementOptionsUnderSearchButton() throws InterruptedException {
        search.clickCancelFlights();
        sleepFor(3);
    }

    @Then("I will validate the cancel flights element")
    public void iWillValidateTheCancelFlightsElement() {
        search.validateClickCancelFlights();
    }

    @When("I click on receipts element option under search button")
    public void iClickOnReceiptsElementOptionUnderSearchButton() throws InterruptedException {
        search.clickReciepts();
        sleepFor(3);
    }

    @Then("I will validate receipts the element")
    public void iWillValidateReceiptsTheElement() {
        search.validateClickReciepts();
    }

    @When("I click on  refunds element options under search button")
    public void iClickOnRefundsElementOptionsUnderSearchButton() throws InterruptedException {
        search.clickRefunds();
        sleepFor(3);
    }

    @Then("I will validate the refunds element")
    public void iWillValidateTheRefundsElement() {
        search.validateClickRefunds();
    }

    @When("I click on  baggage element options under search button")
    public void iClickOnBaggageElementOptionsUnderSearchButton() throws InterruptedException {
        search.clickBaggage();
        sleepFor(3);
    }

    @Then("I will validate the baggage element")
    public void iWillValidateTheBaggageElement() {
        search.validateClickBaggage();
    }

    @When("I click on  pets element options under search button")
    public void iClickOnPetsElementOptionsUnderSearchButton() throws InterruptedException {
        search.clickPets();
        sleepFor(3);
    }

    @Then("I will validate the pets element")
    public void iWillValidateThePetsElement() {
        search.validateClickPets();
    }
}




