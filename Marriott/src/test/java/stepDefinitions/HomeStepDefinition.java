package stepDefinitions;

import base.CommonAPI;
import home.MarriottHomePage;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;


import java.io.IOException;

import static home.MarriottHomePageWebElements.businessMeetingsElementXpath;
import static home.MarriottHomePageWebElements.languageSelectorElementXpath;

public class HomeStepDefinition extends CommonAPI {

    public static MarriottHomePage marriottHomePage;

    @BeforeStep
    public static void getInit(){
        marriottHomePage = PageFactory.initElements(driver,MarriottHomePage.class);
    }

    @After
    public void closeBrowser(){
//        closeBrowser();
        cleanUp();
    }


    @Given("I am on Marriott Homepage")
    public void i_am_on_marriott_homepage() throws IOException {
        openBrowser("https://www.marriott.com/default.mi");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    @When("I click on language selector")
    public void i_click_on_language_selector() {
        clickOnElement(languageSelectorElementXpath);
    }

    @Then("I should be to verify language selector")
    public void i_should_be_to_verify_language_selector() {
       marriottHomePage.validateLanguageSelector();

    }
    @When("I click on Find and Reserve")
    public void i_click_on_find_and_reserve() {
       marriottHomePage.clickOnFindNReserve();
    }

    @Then("I will verify Find and Reserve")
    public void i_will_verify_find_and_reserve() {
       marriottHomePage.validateFindNReserve();
    }

    @When("I click on deals and packages")
    public void i_click_on_deals_and_packages() {
     marriottHomePage.clickOnDealsPackages();
    }

    @Then("I will verify deals and packages")
    public void i_will_verify_deals_and_packages() {
        marriottHomePage.validateClickDealsPackages();
    }

    @When("I click on meetings and events")
    public void i_click_on_meetings_and_events() {
        marriottHomePage.clickMeetingsNEvents();
    }

    @Then("I will verify meetings and events")
    public void i_will_verify_meetings_and_events() {
       marriottHomePage.validateMeetingNEvents();
    }

    @When("I will click on meetings overview")
    public void i_will_click_on_meetings_overview() {
        marriottHomePage.clickMeetingsOverview();
    }

    @Then("I will verify meetings overview")
    public void i_will_verify_meetings_overview() {
        marriottHomePage.validateMeetingNEvents();
    }

    @When("I click on business meetings")
    public void i_click_on_business_meetings() {
        marriottHomePage.clickOnBusinessMeetings();
    }

    @Then("I will verify business meetings")
    public void i_will_verify_business_meetings() {
       marriottHomePage.validateBusinessMeetings();
    }

    @When("I click on weddings")
    public void i_click_on_weddings() {
        marriottHomePage.clickOnWeddings();
    }

    @Then("I will verify weddings element")
    public void i_will_verify_weddings_element() {
        marriottHomePage.validateWeddings();
    }

    @When("I click on social events")
    public void i_click_on_social_events() {
        marriottHomePage.clickOnSocialEvents();
    }

    @Then("I will verify social events")
    public void i_will_verify_social_events() {
        marriottHomePage.validateSocialEvents();
    }

    @When("I click on group travel")
    public void i_click_on_group_travel() {
        marriottHomePage.clickOnSocialEvents();
    }

    @Then("I will verify group travel")
    public void i_will_verify_group_travel() {
        marriottHomePage.validateGroupTravel();
    }

    @When("I click on our brands")
    public void i_click_on_our_brands() {
        marriottHomePage.clickOnOurBrands();
    }

    @Then("I will verify our brands")
    public void i_will_verify_our_brands() {
       marriottHomePage.validateClickOnOurBrands();
    }

    @When("I click on ritz carlton element")
    public void i_click_on_ritz_carlton_element() {
        marriottHomePage.clickOnRitz();
    }

    @Then("I will verify ritz carlton element")
    public void i_will_verify_ritz_carlton_element() {
        marriottHomePage.validateClickOnRitz();
    }

    @When("I click on st Regis element")
    public void i_click_on_st_regis_element() {
       marriottHomePage.clickOnStRegis();
    }

    @Then("I will verify st regis element")
    public void i_will_verify_st_regis_element() {
        marriottHomePage.validateClickOnStRegis();
    }

    @When("I click on edition element")
    public void i_click_on_edition_element() {
       marriottHomePage.clickOnEdition();
    }

    @Then("I will verify edition element")
    public void i_will_verify_edition_element() {
        marriottHomePage.validateClickOnEdition();
    }

    @When("I click on w hotels")
    public void i_click_on_w_hotels() {
        marriottHomePage.clickOnWHotels();
    }

    @Then("I will verify w hotels")
    public void i_will_verify_w_hotels() {
        marriottHomePage.validateClickOnWHotels();
    }

    @When("I click on JW Marriott")
    public void i_click_on_jw_marriott() {
        marriottHomePage.clickOnJWHotels();
    }

    @Then("I will verify JW Marriott")
    public void i_will_verify_jw_marriott() {
       marriottHomePage.validateClickOnJWHotels();
    }

    @When("I click on delta hotels")
    public void i_click_on_delta_hotels() {
        marriottHomePage.clickOnDeltaHotels();
    }

    @Then("I will verify delta hotels")
    public void i_will_verify_delta_hotels() {
       marriottHomePage.validateClickOnDeltaHotels();
    }

    @When("I click on le meridien")
    public void i_click_on_le_meridien() {
       marriottHomePage.clickOnleMeridienHotels();
    }

    @Then("I will verify le meridien")
    public void i_will_verify_le_meridien() {
        marriottHomePage.validateClickOnleMeridienHotels();
    }

    @When("I click on westin hotel")
    public void i_click_on_westin_hotel() {
        marriottHomePage.clickOnWestinHotels();
    }

    @Then("I will verify westin hotel")
    public void i_will_verify_westin_hotel() {
        marriottHomePage.validateClickOnWestinHotels();
    }

    @When("I click on our credit cards element")
    public void i_click_on_our_credit_cards_element() {
        marriottHomePage.clickOnOurCreditCards();
    }

    @Then("I will verify credit cards element")
    public void i_will_verify_credit_cards_element() {
        marriottHomePage.validateClickOnOurCreditCards();
    }




}
