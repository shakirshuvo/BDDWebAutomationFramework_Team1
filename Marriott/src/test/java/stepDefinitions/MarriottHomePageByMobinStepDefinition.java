package stepDefinitions;

import base.CommonAPI;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import marriottHomeByMobin.MarriottHomePageByMobin;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;

public class MarriottHomePageByMobinStepDefinition extends CommonAPI{

    static MarriottHomePageByMobin home;

    @BeforeStep
    public static void getInit() {
        home = PageFactory.initElements(driver, MarriottHomePageByMobin.class);
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }

    @Given("User is in Marriott homepage")
    public void user_is_in_marriott_homepage() throws IOException {
       openBrowser("https://www.marriott.com/default.mi");
    }

    @When("User clicks on language tab")
    public void user_clicks_on_language_tab() {

    }

    @And("Deutsch tab")
    public void deutsch_tab() {
        home.checkDeutsch();
    }

    @Then("User is directed to the German language page")
    public void user_is_directed_to_the_german_language_page() {
        home.validateDeutsch();
    }

    @And("Espanol tab")
    public void espanolTab() {
        home.checkEspanol();
    }

    @Then("User is directed to the Spanish language page")
    public void userIsDirectedToTheSpanishLanguagePage() {
        home.validateEspanol();
    }

    @When("User clicks on destination search box")
    public void userClicksOnDestinationSearchBox() throws InterruptedException {
        home.checkDestinationBox();
    }

    @And("types the destination name")
    public void typesTheDestinationName() {
        
    }

    @Then("User varivies the name visible on the search box")
    public void userVariviesTheNameVisibleOnTheSearchBox() {
        home.validateDestinationBox();
    }

    @When("User clicks on Calendar")
    public void userClicksOnCalendar() {
        home.checkCalendar();
    }

    @And("inserts travel date")
    public void insertsTravelDate() {
        
    }

    @Then("User varivies the travel date visible on the Calendar")
    public void userVariviesTheTravelDateVisibleOnTheCalendar() {
        home.validateCalendar();
    }

    @When("User clicks on number of room box")
    public void userClicksOnNumberOfRoomBox() {
        home.checkNumberOfRooms();
    }

    @And("inserts number of rooms by clicking plus sign")
    public void insertsNumberOfRoomsByClickingPlusSign() {
        
    }

    @Then("User varivies the number of rooms on the desired box")
    public void userVariviesTheNumberOfRoomsOnTheDesiredBox() {
        home.validateNumberOfRooms();
    }

    @When("User clicks on Adult Guest Number box")
    public void userClicksOnAdultGuestNumberBox() {
        home.checkAdultGuestNumber();
    }

    @And("inserts number of Adult Guests by clicking plus sign")
    public void insertsNumberOfAdultGuestsByClickingPlusSign() {
        
    }

    @Then("User varivies the number of Adult Guest on the desired box")
    public void userVariviesTheNumberOfAdultGuestOnTheDesiredBox() {
        home.validateAdultGuestNumber();
    }

    @When("User clicks on Child Guest Number box")
    public void userClicksOnChildGuestNumberBox() {
        home.checkChildGuest();
    }

    @And("inserts number of Child Guests by clicking plus sign")
    public void insertsNumberOfChildGuestsByClickingPlusSign() {
        
    }

    @Then("User varivies the number of Child Guest on the desired box")
    public void userVariviesTheNumberOfChildGuestOnTheDesiredBox() {
        home.validateChildGuest();
    }

    @When("User clicks on Special Rate checkbox")
    public void userClicksOnSpecialRateCheckbox() {
        home.checkSpecialRate();
    }

    @Then("User varivies check mark on Special Rate checkbox")
    public void userVariviesCheckMarkOnSpecialRateCheckbox() {
        home.validateSpecialRate();
    }

    @When("User clicks on Use Point checkbox")
    public void userClicksOnUsePointCheckbox() {
        home.checkUsePointCheckBox();
    }

    @Then("User varivies check mark on Use Point checkbox")
    public void userVariviesCheckMarkOnUsePointCheckbox() {
        home.validateUsePointCheckBox();
    }

    @When("User inserts information in required sections")
    public void userInsertsInformationInRequiredSections() throws InterruptedException {
        home.checkHotelFindingProcess();
    }

    @And("clicks Find Hotel tab")
    public void clicksFindHotelTab() {
        
    }

    @Then("User varivies the")
    public void userVariviesThe() {
        home.validateHotelFindingProcess();
    }


}
