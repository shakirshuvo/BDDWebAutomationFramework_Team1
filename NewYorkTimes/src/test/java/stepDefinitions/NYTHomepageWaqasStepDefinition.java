package stepDefinitions;


import base.CommonAPI;
import home.NYTHomePageWaqas;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class NYTHomepageWaqasStepDefinition  extends CommonAPI {
    static NYTHomePageWaqas homePage;

    @BeforeStep
    public void getInit() {
        homePage = PageFactory.initElements(driver, NYTHomePageWaqas.class);
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }


    @Given("I am in newYorkTimes homepage")
    public void i_am_in_new_york_times_homepage() throws IOException {
        openBrowser("https://www.nytimes.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("I click on the search icon")
    public void iClickOnTheSearchIcon() {
        homePage.clickOnSearchIcon();
    }

    @And("I type the search word into the search box")
    public void iTypeTheSearchWordIntoTheSearchBox() throws InterruptedException {
        sleepFor(1);
        homePage.typeIntoSearchBox();
    }

    @And("I click on the search submit button")
    public void iClickOnTheSearchSubmitButton() throws InterruptedException {
        sleepFor(3);
        homePage.clickOnSearchSubmitBtn();
    }

    @Then("I verify search box using search result text")
    public void iVerifySearchBoxUsingSearchResultText() {
        homePage.validateSearchBoxFunctionality();
    }

    @When("I click on worldButton")
    public void i_click_on_world_button() {
        homePage.clickOnWorldTab();
    }

    @Then("I verify page title as {string}")
    public void i_verify_page_title_as(String string) throws InterruptedException {
        sleepFor(2);
        homePage.validateClickOnWorldTab();
    }

    @Then("I verify using the page title for USA")
    public void iVerifyUsingThePageTitle() throws InterruptedException {
        sleepFor(2);
        homePage.validateClickOnUsaTab();
    }

    @When("I click on US Tab")
    public void iClickOnUSTab() {
        homePage.clickOnUsaTab();
    }

    @When("I click on politics tab")
    public void iClickOnPoliticsTab() {
        homePage.clickOnPoliticsTab();
    }

    @When("I click on NY tab")
    public void iClickOnNYTab() {
        homePage.clickOnNYTab();
    }

    @When("I click on business tab")
    public void iClickOnBusinessTab() {
        homePage.clickOnBusinessTab();
    }

    @When("I click on opinion tab")
    public void iClickOnOpinionTab() {
        homePage.clickOnOpinionTab();
    }

    @When("I click on tech tab")
    public void iClickOnTechTab() {
        homePage.clickOnTechTab();
    }

    @When("I click on science tab")
    public void iClickOnScienceTab() {
        homePage.clickOnScienceTab();
    }

    @When("I click on health tab")
    public void iClickOnHealthTab() {homePage.clickOnHealthTab();
    }

    @When("I click on sports tab")
    public void iClickOnSportsTab() {homePage.clickOnSports();
    }

    @When("I click on arts tab")
    public void iClickOnArtsTab() {homePage.clickOnArtsTab();
    }

//    @Then("I verify using the current url for arts tab")
//    public void iVerifyUsingTheCurrentUrl() {homePage.validateClickOnArtsTab();
//    }

    @When("I click on books tab")
    public void iClickOnBooksTab() {homePage.clickOnBooksTab();
    }

    @When("I click on style tab")
    public void iClickOnStyleTab() {homePage.clickOnStyleTab();
    }

    @When("I click on food tab")
    public void iClickOnFoodTab() {homePage.clickOnFoodTab();
    }

    @When("I click on  travel tab")
    public void iClickOnTravelTab() {homePage.clickOnTravelTab();
    }

    @When("I click on magazine tab")
    public void iClickOnMagazineTab() {homePage.clickOnMagazine();
    }

    @When("I click on T Magazine tab")
    public void iClickOnTMagazineTab() {homePage.clickOnTMagazine();
    }

    @When("I click on real estate tab")
    public void iClickOnRealEstateTab() {homePage.clickOnRealEstateTab();
    }

    @When("I click on video tab")
    public void iClickOnVideoTab() {homePage.clickOnVideoTab();
    }

    @Then("I verify using the page title for USA tab")
    public void iVerifyUsingThePageTitleForUSATab() throws InterruptedException {
        sleepFor(2);
        homePage.validateClickOnUsaTab();

    }

    @Then("I verify using the page title for politics tab")
    public void iVerifyUsingThePageTitleForPoliticsTab() throws InterruptedException {sleepFor(2);
    homePage.validateClickOnPoliticsTab();
    }

    @Then("I verify using the page title for NY tab")
    public void iVerifyUsingThePageTitleForNYTab() throws InterruptedException {
        sleepFor(2);
        homePage.validateClickOnNYTab();
    }

    @Then("I verify using the page title for business tab")
    public void iVerifyUsingThePageTitleForBusinessTab() throws InterruptedException {
        sleepFor(2);
        homePage.validateClickOnBusinessTab();
    }

    @Then("I verify using the page title for opinion tab")
    public void iVerifyUsingThePageTitleForOpinionTab() throws InterruptedException {
        sleepFor(2);
        homePage.validateClickOnOpinionTab();
    }

    @Then("I verify using the page title for tech tab")
    public void iVerifyUsingThePageTitleForTechTab() throws InterruptedException {
        sleepFor(2);
        homePage.validateClickOnTechTab();
    }

    @Then("I verify using the page title for science tab")
    public void iVerifyUsingThePageTitleForScienceTab() throws InterruptedException {
        sleepFor(2);
        homePage.validateClickOnScienceTab();
    }

    @Then("I verify using the page title for health tab")
    public void iVerifyUsingThePageTitleForHealthTab() throws InterruptedException {
        sleepFor(2);
        homePage.validateClickOnHealthTab();
    }

    @Then("I verify using the page title for sports tab")
    public void iVerifyUsingThePageTitleForSportsTab() throws InterruptedException {
        sleepFor(2);
        homePage.validateClickOnSportsTab();
    }

    @Then("I verify using the current url for arts tab")
    public void iVerifyUsingTheCurrentUrlForArtsTab() throws InterruptedException {
        sleepFor(2);
        homePage.validateClickOnArtsTab();
    }

    @Then("I verify using the current url for books tab")
    public void iVerifyUsingTheCurrentUrlForBooksTab() throws InterruptedException {
        sleepFor(2);
        homePage.validateClickOnBooksTab();
    }

    @Then("I verify using the current url for style tab")
    public void iVerifyUsingTheCurrentUrlForStyleTab() throws InterruptedException {
        sleepFor(2);
        homePage.validateClickOnStyleTab();
    }


    @Then("I verify using the current url for food tab")
    public void iVerifyUsingTheCurrentUrlForFoodTab() throws InterruptedException {
        sleepFor(2);
        homePage.validateClickOnFoodTab();
    }

    @Then("I verify using the current url for travel tab")
    public void iVerifyUsingTheCurrentUrlForTravelTab() throws InterruptedException {
        sleepFor(2);
        homePage.validateClickOnTravelTab();
    }

    @Then("I verify using the current url for magazine tab")
    public void iVerifyUsingTheCurrentUrlForMagazineTab() throws InterruptedException {
        sleepFor(2);
        homePage.validateClickOnMagazineTab();
    }

    @Then("I verify using the current url for TMagazine")
    public void iVerifyUsingTheCurrentUrlForTMagazine() throws InterruptedException {
        sleepFor(2);
        homePage.clickOnTMagazine();
    }

    @Then("I verify using the current url for real estate tab")
    public void iVerifyUsingTheCurrentUrlForRealEstateTab() throws InterruptedException {
        sleepFor(2);
        homePage.validateClickOnRealEstateTab();
    }

    @Then("I verify using the current url for video tab")
    public void iVerifyUsingTheCurrentUrlForVideoTab() throws InterruptedException {
        sleepFor(2);
        homePage.validateClickOnVideoTab();
    }




    @And("I enter <keyword> into search box")
    public void iEnterKeywordIntoSearchBox() {
        homePage.typeIntoSearchBox();
    }


    @And("I will click on search submit button")
    public void iWillClickOnSearchSubmitButton() {
        homePage.clickOnSearchSubmitBtn();
    }

    @Then("I will verify the  search <results>")
    public void iWillVerifyTheSearchResults() {
        homePage.validateSearchBoxFunctionality();
    }
}