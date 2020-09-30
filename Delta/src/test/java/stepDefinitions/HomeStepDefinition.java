package stepDefinitions;

import base.CommonAPI;
import home.Home;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static home.HomePageWebElements.*;

public class HomeStepDefinition extends CommonAPI {

    static Home home;

    public static void gitInit() {
        home = PageFactory.initElements(driver, Home.class);
    }


    @After
    public void closeBrowser() {
        cleanUp();
    }


    @Given("I am on Delta homepage")
    public void i_am_on_delta_homepage() throws IOException {
        openBrowser();
        driver.manage().window().maximize();
    }

//    @When("I click on Log In")
//    public void i_click_on_log_in() {
//        clickOnElement(loginXpathWebElement);
//    }
//
//    @Then("I verify Log In page with title")
//    public void i_verify_log_in_page_with_title() {
//        validateByTitle("Login");
//    }
//
//  @Given("I am on Delta homepage")
//    public void i_am_on_delta_homepage() throws IOException, InterruptedException {
//        openBrowser();
//       driver.manage().window().maximize();
//        isPopUpWindowDisplayedByXpath(driver, canadaEnglish);
//        sleepFor(300);
//    }
//
//    @Then("I verify page {string}")
//    public void i_verify_page(String title) {
//        validateByTitle(title);
//    }
//
//    @When("I click on {string} tab")
//    public void i_click_on_tab(String string) {
//        clickOnElementByID(needHelpTabIDWebElement);
//    }
//
//    @When("I click on {string} link")
//    public void i_click_on_link(String string) {
//        clickOnElementByID(certificateAndECreditIDWebElement);
//    }
//
//    @When("I click on Need Help tab")
//    public void i_click_on_need_help_tab() {
//    clickOnElementByID(needHelpTabIDWebElement);
//    }
//
//    @When("I click on SkyMiles Help link")
//    public void i_click_on_sky_miles_help_link() {
//        clickOnElementByXpath(getSkymilesHelpXpath);
//
//    }
//    @Then("I verify pag by {string}")
//    public void i_verify_pag_by(String string) {
//        validateByTitle("SkyMiles Help : Delta Air Lines");
//    }
//    @When("I need click on Need Help tab")
//    public void i_need_click_on_need_help_tab() {
//        clickOnElementByID(needHelpTabIDWebElement);
//    }
//    @When("I click on Accessible Travel Services")
//    public void i_click_on_accessible_travel_services() {
//       clickOnElementByXpath(accessibleTravelServicesByXpath);
//    }
//
//    @Then("I verify page by {string}")
//    public void i_verify_page_by(String string) {
//        validateByTitle("Accessible Travel Services : Delta Air Lines");
//    }
//    @When("I need click on Need Help tab")
//    public void i_get_click_on_need_help_tab() {
//        clickOnElementByID(needHelpTabIDWebElement);
//    }
//
//    @When("I click on child & InfantTravel")
//    public void i_click_on_child_And_Infant_Travel(){
//    clickOnElementByXpath(childandInfandTravelByXpath);
//
//    }
//
//    @Then("I verify page by\"<title>\"")
//    public void i_verify_page_by_title() {
//validateByTitle("Children & Infant Travel Policy : Delta Air Lines");
//    }

//    @And("I again click on the  receipts")
//    public void iAgainClickOnTheReceipts() {
//        clickOnElementByXpath(getReceiptsByXpath);
//
//    }

    @When("I click on the  Need top Help tab")
    public void iClickOnTheNeedTopHelpTab() {
        clickOnElementByID(needHelpTabIDWebElement);
    }


    @Then("I  also verify page by{string}")
    public void iAlsoVerifyPageBy(String abc) {
        validateByTitle("Other Information : Delta Need Help");
    }

    @Then("I   verify page by{string}")
    public void iVerifyPageBy(String arg0) {
        validateByTitle("Airline Tickets & Flights: Book Direct with Delta Air Lines - Official Site");
    }


//    @When("I click to the  travelInfo tab")
//    public void i_click_to_the_travel_info_tab() {
//       clickOnElementByID(tripProtectionByID);
//
//    }
//
////    @And("I hoover and click on tripProtection")
////    public void i_hoover_and_click_on_trip_protection() {
////clickOnElementByID(tripProtectionByID);
////    }
//
//    @Then("I do  verify page by\"<title>\"")
//    public void i_do_verify_page_by_title() {
//        validateByTitle("Trip Protection Search: Delta Air Lines");
////    }
//    @When("I first click on the Need Help tab")
//    public void i_first_click_on_the_need_help_tab() {
//        clickOnElement( needHelpTabIDWebElement );
//    }
//
//    @When("I next click on the coronaVirus Updates")
//    public void i_next_click_on_the_corona_virus_updates() {
//      clickOnElementByXpath(coronavirusUpdatesByXpath);
//    }
//
//    @Then("I afterthat verify page by\"<title>\"")
//    public void i_afterthat_verify_page_by_title() {
//    validateByTitle("Travel Update Center: Safety & Flexibility | Delta Air Lines");
//    }
//
//
//    @When("I first click on flight status")
//    public void iFirstClickOnFlightStatus() {
//        clickOnElementByXpath(flightStatusElementXpath);
//
//    }
//
//    @Then("I verify flight status by text search by date")
//    public void iVerifyFlightStatusByTextSearchByDate() {
//        validateByText(validateFlightStatusByXpath,"Search By Date (Required)");
//    }


    @Then("I verify flight Schedules by text search by date")
    public void iVerifyFlightSchedulesByTextSearchByDate() {
        validateByText(validateFlightSchduleByXpath, "Flight Status & Notifications");
    }

    @When("I click on travel info first")
    public void iClickOnTravelInfoFirst() {
        clickOnElementByID(travelInfoByID);
    }

    @And("I click on aircraft under travel info tab")
    public void iClickOnAircraftUnderTravelInfoTab() {
        clickOnElementByID(aircraftByID);
    }

    @Then("I verify aircraft by text from that page")
    public void iVerifyAircraftByTextFromThatPage() {
        validateByTitle("Delta Aircraft Seat Maps, Specs & Amenities : Delta Air Lines");
    }

    @When("I click on travel info in order to go to flight schedules")
    public void iClickOnTravelInfoInOrderToGoToFlightSchedules() {
        clickOnElementByID(travelInfoByID);
    }

    @And("then I click on flight Schedules")
    public void thenIClickOnFlightSchedules() {
        clickOnElementByID(flightScheduleByID);
    }

    @When("I need to click on travel info first")
    public void iNeedToClickOnTravelInfoFirst() {
        clickOnElementByID(travelInfoByID);

    }

    @And("I click on Airport Maps & Locations")
    public void iClickOnAirportMapsLocations() {
        clickOnElementByID(airportMapsNLocationsById);

    }

    @Then("I verify Airport Maps & Locations by text from that page")
    public void iVerifyAirportMapsLocationsByTextFromThatPage() {
        validateByText(validateAirportMapsNLocationsByCSS, "Delta & Partner Airport Locations");
    }

    @When("I   clicked towards the travel info first")
    public void iClickedTowardsTheTravelInfoFirst() {
        clickOnElementByID(travelInfoByID);
    }

    @And("I go and click on Delta vacation")
    public void iGoAndClickOnDeltaVacation() {
        clickOnElementByXpath(deltaVacationsByXpath);
    }

    @Then("I verify Delta vacation by title from that page")
    public void iVerifyDeltaVacationByTitleFromThatPage() {
        validateByTitle(validateDeltaVacationsByTitle);
    }

    @When("I then click on flight Schedule")
    public void i_then_click_on_flight_schedule() {
        clickOnElementByID(flightScheduleByID);
    }

    @When("I first click on check-in")
    public void iFirstClickOnCheckIn() {
        clickOnElementByXpath(checkInByXPATH);
    }



    @And("I put JFK in From AirPort Field")
    public void iPutJFKInFromAirPortField() {
        typeOnElement(fromAirportByClass, "JFK");
        clickOnElementByXpath(selectAirportJFKByXPATH);
    }

    @Then("I click on radio Button")
    public void iClickOnRadioButton() {
        clickOnElementByID(radioButtonById);
    }

    @And("I validate it by text Whoops! We're sorry...")
    public void iValidateItByTextWhoopsWeReSorry() {
        validateByText(validateConfirmationNumberByID, "Whoops! We're sorry, but we are unable to find a check-in eligible reservation with the information provided.");
    }

    @And("I put {string} in confirmation number required field")
    public void iPutInConfirmationNumberRequiredField(int arg0) {
        typeByXpath(confirmationNumberByXPATH, "123456");
    }

    @When("I first click on travel info module first")
    public void iFirstClickOnTravelInfoModuleFirst() {
        clickOnElementByID(travelInfoByID);
    }

    @And("I click on Board experience next")
    public void iClickOnBoardExperienceNext() {
            clickOnElementByID(onBoardExperienceByID);
    }


    @Then("I verify on board experience by title")
    public void iVerifyOnBoardExperienceByTitle() {
        validateByTitle(validateOnBoardExperienceByTitle);

    }

    @When("I first click travel info module")
    public void iFirstClickTravelInfoModule() {
        clickOnElementByID(travelInfoByID);
    }

    @And("I click on baggage next")
    public void iClickOnBaggageNext() {
        clickOnElementByXpath(baggageByXpath);
        
    }

    @Then("I verify baggage by title")
    public void iVerifyBaggageByTitle() {
        validateByTitle(validateBaggageByTitle);
    }

    @When("I first clicked on to the travel info module")
    public void iFirstClickedOnToTheTravelInfoModule() {
        clickOnElementByID(travelInfoByID);
        
    }

    @And("I click on Air line partners module")
    public void iClickOnAirLinePartnersModule() {
      clickOnElementByXpath(airlinePartnersByXpath);
    }

    @Then("I verify Airline partners by title")
    public void iVerifyAirlinePartnersByTitle() {
        validateByTitle(validateAirlinePartnersByTitle);
    }

    @When("I just first clicked on to the travel info module")
    public void iJustFirstClickedOnToTheTravelInfoModule() {
        clickOnElementByID(travelInfoByID);

    }

    @And("I click on ShopHotels module")
    public void iClickOnShopHotelsModule() {
       clickOnElementByXpath(shopHotelsByXpath);
    }

    @Then("I verify ShopHotels by title")
    public void iVerifyShopHotelsByTitle() {
        validateByTitle(validateShopHotelsByTitle);
    }


//    @When("I first click on my trips")
//    public void iFirstClickOnMyTrips() {
//   clickOnElementByClass(myTripsElementByClass);
//    }
//
//    @Then("I verify my trips by text Find Your Trip By")
//    public void iVerifyMyTripsByTextFindYourTripBy() {
//        validateByText(validateMyTripsByXpath,"Find Your Trip By");
//    }
}
