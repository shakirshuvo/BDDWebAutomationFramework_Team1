package stepDefinitions;

import base.CommonAPI;
import deltaHomeByMobin.DeltaHomePageByMobin;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;

public class DeltaHomePageByMobinStepDefinition extends CommonAPI{

    static DeltaHomePageByMobin home;

    @BeforeStep
    public static void getInit() {
        home = PageFactory.initElements(driver, DeltaHomePageByMobin.class);
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }

    @Given("User is in Delta homepage")
    public void user_is_in_delta_homepage() throws IOException {
        openBrowser("https://www.delta.com/");
    }

    @When("User hover over travel info tab")
    public void user_hover_over_travel_info_tab() throws InterruptedException {
        home.checkTravleInfoDropDownTab();
    }

    @And("clicks on aircraft tab")
    public void clicks_on_aircraft_tab() {

    }

    @Then("User is directed to aircraft page")
    public void userIsDirectedToAircraftPage() {
        home.validateTravleInfoDropDownTab();
    }


    @When("User hover over Sky Miles tab")
    public void userHoverOverSkyMilesTab() throws InterruptedException {
        home.checkSkyMilesDropDownTab();
    }

    @And("clicks on Sky Miles Cruises tab")
    public void clicksOnSkyMilesCruisesTab() {

    }

    @Then("User is directed to Sky Miles Cruises page")
    public void userIsDirectedToSkyMilesCruisesPage() {
        home.validateSkyMilesDropDownTab();
    }

    @When("User hover over Need Help tab")
    public void userHoverOverNeedHelpTab() throws InterruptedException {
        home.checkNeedHelpDropDownTab();
    }

    @And("clicks on Pet Travle tab")
    public void clicksOnPetTravleTab() {

    }

    @Then("User is directed to Pet Travle page")
    public void userIsDirectedToPetTravlePage() {
        home.validateNeedHelpDropDownTab();
    }

    @When("User clicks on travle from search box")
    public void userClicksOnTravleFromSearchBox() throws InterruptedException {
        home.checkFromTab();
    }

    @And("types the travle from name")
    public void typesTheTravleFromName() {

    }

    @Then("User varivies the name visible on the search box")
    public void userVariviesTheNameVisibleOnTheSearchBox() {
        home.validateFromTab();
    }

    @When("User clicks on travle to search box")
    public void userClicksOnTravleToSearchBox() throws InterruptedException {
        home.checkToTab();
    }

    @And("types the travle to name")
    public void typesTheTravleToName() {

    }

    @Then("User varivies the destination name visible on the search box")
    public void userVariviesTheDestinationNameVisibleOnTheSearchBox() {
        home.validateToTab();
    }

    @When("User clicks on round trip to search box")
    public void userClicksOnRoundTripToSearchBox() throws InterruptedException {
        home.checkTripWay();
    }

    @And("clicks on one way")
    public void clicksOnOneWay() {

    }

    @Then("User varivies the trip type from the option")
    public void userVariviesTheTripTypeFromTheOption() {
        home.validatecheckTripWay();
    }


    @When("User clicks on Delta Calendar")
    public void userClicksOnDeltaCalendar() throws InterruptedException {
        home.checkCalendar();
    }

    @And("inserts travel dates")
    public void insertsTravelDates() {

    }

    @Then("User varivies the travel dates visible on the Calendar")
    public void userVariviesTheTravelDatesVisibleOnTheCalendar() {
        home.validateCalendar();
    }

    @When("User clicks on Traveler Number box")
    public void userClicksOnTravelerNumberBox() throws InterruptedException {
        home.checkNumberOfPassangers();
    }

    @And("inserts number of Traveler by clicking plus sign")
    public void insertsNumberOfTravelerByClickingPlusSign() {

    }

    @Then("User varivies the number of Traveler on the desired box")
    public void userVariviesTheNumberOfTravelerOnTheDesiredBox() {
        home.validateNumberOfPassangers();
    }

    @When("User checks all check boxes")
    public void userChecksAllCheckBoxes() throws InterruptedException {
        home.checkHomepageCheckBoxes();
    }

    @And("unchecks all again")
    public void unchecksAllAgain() {

    }

    @Then("User varivies the checked and unchecked boxes")
    public void userVariviesTheCheckedAndUncheckedBoxes() {
        home.validateHomepageCheckBoxes();
    }

    @When("User inserts information in required sections of Delta")
    public void userInsertsInformationInRequiredSectionsOfDelta() throws InterruptedException {
        home.testAllStepsOfBooking();
    }

    @And("clicks Next tab")
    public void clicksNextTab() {

    }

    @Then("User varivies the")
    public void userVariviesThe() {
        home.validateAllStepsOfBooking();
    }
}
