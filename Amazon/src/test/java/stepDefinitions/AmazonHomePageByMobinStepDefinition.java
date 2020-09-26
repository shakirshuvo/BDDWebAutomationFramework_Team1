package stepDefinitions;

import amazonHomeByMobin.AmazonHomePageByMobin;
import base.CommonAPI;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;

public class AmazonHomePageByMobinStepDefinition extends CommonAPI{

    static AmazonHomePageByMobin home;

    @BeforeStep
    public static void getInit() {
        home = PageFactory.initElements(driver, AmazonHomePageByMobin.class);
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }

    @Given("User is in Amazon homepage")
    public void user_is_in_amazon_homepage() throws IOException {
       openBrowser("https://www.amazon.com/");
    }

    @When("User clicks on BestSeller tab")
    public void user_clicks_on_best_seller_tab() {
        home.checkBestSeller();
    }

    @Then("User is directed to BestSeller page")
    public void user_is_directed_to_best_seller_page() {
        home.validateBestSeller();
    }

    @When("User inserts {string} in search box")
    public void userInsertsInSearchBox(String x) throws InterruptedException {
        home.checkSearchBox(x);
    }

    @And("enters submit button")
    public void entersSubmitButton() {

    }

    @Then("User varifies {string} from the search page")
    public void userVarifiesFromTheSearchPage(String y) {
        home.validateSearchBox(y);
    }


    @When("User clicks on NewReleases tab")
    public void userClicksOnNewReleasesTab() {
        home.checkNewReleases();
    }

    @Then("User is directed to NewReleases page")
    public void userIsDirectedToNewReleasesPage() {
        home.validateNewReleases();
    }

    @When("User clicks on MoversAndShakers tab")
    public void userClicksOnMoversAndShakersTab() {
        home.checkMoversAndShakers();
    }

    @Then("User is directed to MoversAndShakers page")
    public void userIsDirectedToMoversAndShakersPage() {
        home.validateMoversAndShakers();
    }

    @When("User clicks on MostWishedFor tab")
    public void userClicksOnMostWishedForTab() {
        home.checkMostWishedFor();
    }

    @Then("User is directed to MostWishedFor page")
    public void userIsDirectedToMostWishedForPage() {
        home.validateMostWishedFor();
    }

    @When("User clicks on GiftIdeas tab")
    public void userClicksOnGiftIdeasTab() {
        home.checkGiftIdeas();
    }

    @Then("User is directed to GiftIdeas page")
    public void userIsDirectedToGiftIdeasPage() {
        home.validateGiftIdeas();
    }

    @When("User clicks on CustomerService tab")
    public void userClicksOnCustomerServiceTab() {
        home.checkCustomerService();
    }

    @Then("User is directed to CustomerService page")
    public void userIsDirectedToCustomerServicePage() {
        home.validateCustomerService();
    }

    @When("User clicks on TodaysDeal tab")
    public void userClicksOnTodaysDealTab() {
        home.checkTodaysDeal();
    }

    @Then("User is directed to TodaysDeal page")
    public void userIsDirectedToTodaysDealPage() {
        home.validateTodaysDeal();
    }


    @When("User clicks on NewReleasesA tab")
    public void userClicksOnNewReleasesATab() {
        home.checkNewReleases1();
    }

    @Then("User is directed to NewReleasesA page")
    public void userIsDirectedToNewReleasesAPage() {
        home.validateNewReleases1();
    }

    @When("User clicks on NewGames tab")
    public void userClicksOnNewGamesTab() {
        home.checkNewGames();
    }

    @Then("User is directed to NewGames page")
    public void userIsDirectedToNewGamesPage() {
        home.validateNewGames();
    }

    @When("User clicks on NewPCGames tab")
    public void userClicksOnNewPCGamesTab() {
        home.checkNewPCGames();
    }

    @Then("User is directed to NewPCGames page")
    public void userIsDirectedToNewPCGamesPage() {
        home.validateNewPCGames();
    }

    @When("User clicks on NewVideoGames tab")
    public void userClicksOnNewVideoGamesTab() {
        home.checkNewVideoGames();
    }

    @Then("User is directed to NewVideoGames page")
    public void userIsDirectedToNewVideoGamesPage() {
        home.validateNewVideoGames();
    }


    @When("User clicks on NewPlayStationThree tab")
    public void userClicksOnNewPlayStationThreeTab() {
        home.checkNewPlayStation3();
    }

    @Then("User is directed to NewPlayStationThree page")
    public void userIsDirectedToNewPlayStationThreePage() {
        home.validateNewPlayStation3();
    }


    @When("User clicks on NewXboxThreeSixty tab")
    public void userClicksOnNewXboxThreeSixtyTab() {
        home.checkNewXbox360();
    }

    @Then("User is directed to NewXboxThreeSixty page")
    public void userIsDirectedToNewXboxThreeSixtyPage() {
        home.validateNewXbox360();
    }

    @When("User clicks on NewNintendoDS tab")
    public void userClicksOnNewNintendoDSTab() {
        home.checkNewNintendoDS();
    }

    @Then("User is directed to NewNintendoDS page")
    public void userIsDirectedToNewNintendoDSPage() {
        home.validateNewNintendoDS();
    }

    @When("User clicks on NewWii tab")
    public void userClicksOnNewWiiTab() {
        home.checkNewWii();
    }

    @Then("User is directed to NewWii page")
    public void userIsDirectedToNewWiiPage() {
        home.validateNewWii();
    }

    @When("User clicks on NewWiiU tab")
    public void userClicksOnNewWiiUTab() {
        home.checkNewWiiU();
    }

    @Then("User is directed to NewWiiU page")
    public void userIsDirectedToNewWiiUPage() {
        home.validateNewWiiU();
    }

    @When("User clicks on NewPlayStationVista tab")
    public void userClicksOnNewPlayStationVistaTab() {
        home.checkNewPlayStationVista();
    }

    @Then("User is directed to NewPlayStationVista page")
    public void userIsDirectedToNewPlayStationVistaPage() {
        home.validateNewPlayStationVista();
    }

    @When("User clicks on NewNintendoThreeDS tab")
    public void userClicksOnNewNintendoThreeDSTab() {
        home.checkNewNintendo3DS();
    }

    @Then("User is directed to NewNintendoThreeDS page")
    public void userIsDirectedToNewNintendoThreeDSPage() {
        home.validateNewNintendo3DS();
    }

    @When("User clicks on NewXboxOne tab")
    public void userClicksOnNewXboxOneTab() {
        home.checkNewXboxOne();
    }

    @Then("User is directed to NewXboxOne page")
    public void userIsDirectedToNewXboxOnePage() {
        home.validateNewXboxOne();
    }

    @When("User clicks on NewPlayStationFour tab")
    public void userClicksOnNewPlayStationFourTab() {
        home.checkNewPlayStation4();
    }

    @Then("User is directed to NewPlayStationFour page")
    public void userIsDirectedToNewPlayStationFourPage() {
        home.validateNewPlayStation4();
    }

    @When("User clicks on NewSonyPSP tab")
    public void userClicksOnNewSonyPSPTab() {
        home.checkNewSonyPSP();
    }

    @Then("User is directed to NewSonyPSP page")
    public void userIsDirectedToNewSonyPSPPage() {
        home.validateNewSonyPSP();
    }

    @When("User clicks on MacGames tab")
    public void userClicksOnMacGamesTab() {
        home.checkMacGames();
    }

    @Then("User is directed to MacGames page")
    public void userIsDirectedToMacGamesPage() {
        home.validateMacGames();
    }

    @When("User clicks on NewNintendoSwitch tab")
    public void userClicksOnNewNintendoSwitchTab() {
        home.checkNewNintendoSwitch();
    }

    @Then("User is directed to NewNintendoSwitch page")
    public void userIsDirectedToNewNintendoSwitchPage() {
        home.validateNewNintendoSwitch();
    }

    @When("User clicks on MoreSystems tab")
    public void userClicksOnMoreSystemsTab() {
        home.checkMoreSystems();
    }

    @Then("User is directed to MoreSystems page")
    public void userIsDirectedToMoreSystemsPage() {
        home.validateMoreSystems();
    }

    @When("User clicks on Microconsoles tab")
    public void userClicksOnMicroconsolesTab() {
        home.checkMicroconsoles();
    }

    @Then("User is directed to Microconsoles page")
    public void userIsDirectedToMicroconsolesPage() {
        home.validateMicroconsoles();
    }

    @When("User clicks on FindAGift tab")
    public void userClicksOnFindAGiftTab() {
        home.checkFindAGift();
    }

    @Then("User is directed to FindAGift page")
    public void userIsDirectedToFindAGiftPage() {
        home.validateFindAGift();
    }

    @When("User clicks on WholeFood tab")
    public void userClicksOnWholeFoodTab() {
        home.checkWholeFood();
    }

    @Then("User is directed to WholeFood page")
    public void userIsDirectedToWholeFoodPage() {
        home.validateWholeFood();
    }

    @When("User clicks on WholeFoodBeverages tab")
    public void userClicksOnWholeFoodBeveragesTab() {
        home.checkWholeFoodBeverages();
    }

    @Then("User is directed to WholeFoodBeverages page")
    public void userIsDirectedToWholeFoodBeveragesPage() {
        home.validateWholeFoodBeverages();
    }

    @When("User clicks on GiftCards tab")
    public void userClicksOnGiftCardsTab() {
        home.checkGiftCards();
    }

    @Then("User is directed to GiftCards page")
    public void userIsDirectedToGiftCardsPage() {
        home.validateGiftCards();
    }
}
