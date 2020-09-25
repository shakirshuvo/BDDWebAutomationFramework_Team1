package stepDefinitions;

import base.CommonAPI;
import homePageRaza.HomeDeltaRaza;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class SearchHomePageStepDefinitionRaza extends CommonAPI {

    static HomeDeltaRaza homeDeltaRaza;

    // Cucumber Hook
    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take a screenshot...
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Demo1"); // ... and embed it in the report.
        }
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }

    @BeforeStep
    public static void getInit() {
        homeDeltaRaza = PageFactory.initElements(driver, HomeDeltaRaza.class);

    }

    @Given("I am in Delta homepage")
    public void i_am_in_delta_homepage() throws IOException {
        openBrowser("https://www.delta.com/ca/en");
        driver.manage().window().maximize();

    }

    @Given("I enter {string} in searchBox")
    public void i_enter_in_search_box(String cityName) {
        homeDeltaRaza.searchBoxCheck(cityName);


    }

    @When("I click searchButton")
    public void i_click_search_button() {
        homeDeltaRaza.searchBoxClick();

    }

    @Then("I verify search {string} is appear properly")
    public void iVerifySearchIsAppearProperly(String url) {
        homeDeltaRaza.validateSearchBoxCheck(url);
    }

    /**
     *   New Scenario
     */

    @When("I Locate and Click on  {string} Displayed On HomePage")
    public void iLocateAndClickOnDisplayedOnHomePage(String locator) {
        homeDeltaRaza.clickElement(locator);
    }
    @Then("I verify  {string} is appear properly")
    public void iVerifyIsAppearProperly(String locator) {
        homeDeltaRaza.validateClickElement(locator);
    }

    /**
     *   New Scenario
     */

    @When("I Click on WebElement")
    public void iClickOnWebElement() {
        homeDeltaRaza.checkElement();
    }

    @Then("I verity that Element is Functional")
    public void iVerityThatElementIsFunctional() {
        homeDeltaRaza.validateCheckElement();
    }


    /**
     *   New Scenario
     */


    @When("I Click on CheckIn WebElement")
    public void iClickOnCheckInWebElement() {
        homeDeltaRaza.checkCheckIn();
    }

    @Then("I verity that CheckIn Element is Functional")
    public void iVerityThatCheckInElementIsFunctional() {
        homeDeltaRaza.validatecheckCheckIn();
    }

    /**
     *   New Scenario
     */

    @When("I Click on MyTrip WebElement")
    public void iClickOnMyTripWebElement() {
        homeDeltaRaza.checkMyTrip();

    }

    @Then("I verity that MyTrip Element is Functional")
    public void iVerityThatMyTripElementIsFunctional() {
        homeDeltaRaza.validatecheckMyTrip();
    }

    /**
     *   New Scenario
     */

    @When("I Click on FlightStatus WebElement")
    public void iClickOnFlightStatusWebElement() {
        homeDeltaRaza.checkFlightStatus();
    }

    @Then("I verity that FlightStatus Element is Functional")
    public void iVerityThatFlightStatusElementIsFunctional() {
        homeDeltaRaza.validateFlightStatus();
    }

    /**
     *   New Scenario
     */

    @When("I Click on SkyMiles WebElement")
    public void iClickOnSkyMilesWebElement() {

        homeDeltaRaza.checkSkyMiles();
    }
    @Then("I verity that SkyMiles Element is Functional")
    public void iVerityThatSkyMilesElementIsFunctional() {
        homeDeltaRaza.validateSkyMiles();
    }

    /**
     *  Travel Info
     */

    @When("I Click on TravelInfo WebElement")
    public void iClickOnTravelInfoWebElement() {

        homeDeltaRaza.checkTravelInfo();

    }

    @Then("I verity that TravelInfo Element is Functional")
    public void iVerityThatTravelInfoElementIsFunctional() {

        homeDeltaRaza.validateCheckTravelInfo();
    }
}
