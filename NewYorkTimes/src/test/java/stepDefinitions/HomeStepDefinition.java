package stepDefinitions;


import base.CommonAPI;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import home.HomePage;

import java.io.IOException;

public class HomeStepDefinition  extends CommonAPI {
    static HomePage homePage;

    @BeforeStep
    public void getInit(){ homePage= PageFactory.initElements(driver, HomePage.class);}

    @After
    public void closeBrowser() {
        cleanUp();
    }

    //checking the world button
    @Given("I am in newYorkTimes homepage")
    public void i_am_in_new_york_times_homepage() throws IOException {
        openBrowser();
    }
    @When("I click on worldButton")
    public void i_click_on_world_button() {
        homePage.worldButton.click();
    }
    @Then("I verify page title as {string}")
    public void i_verify_page_title_as(String string) {validateByTitle("World News - The New York Times");
    }

    //checking the US button
    @When("I click on US button")
    public void iClickOnUSButton() {
        homePage.usButton.click();
    }
    @Then("I verify page title1 as {string}")
    public void i_verify_page_title1_as(String string) {validateByTitle("U.S. News - The New York Times");
    }

    //checking the politics button

    @When("I click on politics button")
    public void i_click_on_politics_button() {
       homePage.politicsButton.click();
    }
    @Then("I verify page title2 as {string}")
    public void i_verify_page_title2_as(String string) {validateByTitle("Politics - The New York Times");
    }

    //checking the NY button
    @When("I click on NY button")
    public void i_click_on_ny_button() {
       homePage.nyButton.click();
    }
    @Then("I verify page Title3 as {string}")
    public void i_verify_page_title3_as(String string) {validateByTitle("New York - The New York Times");
    }
    //checking the business button
    @When("I click business button")
    public void i_click_business_button() {
        homePage.businessButton.click();
    }
    @Then("I verify business page title as {string}")
    public void i_verify_business_page_title_as(String string) {validateByTitle("Business - The New York Times");
    }
    //checking the opinion button
    @When("I click opinion button")
    public void i_click_opinion_button() {homePage.opinionButton.click();}

    @Then("I Verify opinion page title as {string}")
    public void i_verify_opinion_page_title_as(String string) {validateByTitle("Opinion - The New York Times");
    }
    //checking the technology button
    @When("I click technology button")
    public void i_click_technology_button() {homePage.techButton.click();
    }
    @Then("I verify technology page title as {string}")
    public void i_verify_technology_page_title_as(String string) {validateByTitle("Technology - The New York Times");
    }
    //checking the science page

    @When("I click on science button")
    public void i_click_on_science_button() {homePage.scienceButton.click();
    }
    @When("I click on climate")
    public void i_click_on_climate() {homePage.climate.click();
    }
    @Then("I verify science page title as {string}")
    public void i_verify_science_page_title_as(String string) throws InterruptedException {validateByTitle("Climate and Environment - The New York Times");
    sleepFor(3);
    }
    @Then("I navigate back to the science page")
    public void iNavigateBackToTheSciencePage() throws InterruptedException {
        homePage.navigateBack();
        sleepFor(3);
    }
    @And("I click on space and cosmos")
    public void iClickOnSpaceAndCosmos() throws InterruptedException {homePage.spaceCosmos.click();
    sleepFor(3);
    }

    //checking health page
    @When("I click on health button")
    public void i_click_on_health_button() throws InterruptedException {
        homePage.healthButton.click();
        sleepFor(3);
        homePage.navigateBack();
    }
    @And("I click on health policy")
    public void i_click_on_health_policy() throws InterruptedException {
        homePage.healthButton.click();
        homePage.healthPolicy.click();
        sleepFor(3);
        homePage.navigateBack();
    }
    @And("I click on global health")
    public void i_click_on_global_health() throws InterruptedException {
        homePage.globalHealth.click();
        sleepFor(3);
        homePage.navigateBack();
    }
    @And("I click on the new old age")
    public void i_click_on_the_new_old_age() throws InterruptedException {
        homePage.theNewOldAge.click();
        sleepFor(3);
        homePage.navigateBack();
    }
    @Then("I verify health page title as {string}")
    public void i_verify_health_page_title_as(String string) {validateByTitle("Health - The New York Times");
    }
    //checking the sport page

    @When("I click on sport button")
    public void i_click_on_sport_button() throws InterruptedException {
        homePage.sportButton.click();
        sleepFor(3);
    }
    @And("I click on baseball")
    public void i_click_on_baseball() throws InterruptedException {
        homePage.baseball.click();
        sleepFor(3);
        homePage.navigateBack();
    }
    @And("I click on NFL")
    public void i_click_on_nfl() throws InterruptedException {
        homePage.nfl.click();
        sleepFor(3);
        homePage.navigateBack();
    }
    @And("I click on NBA")
    public void i_click_on_nba() throws InterruptedException {
        homePage.nba.click();
        sleepFor(3);
        homePage.navigateBack();
    }
    @And("I click on tennis")
    public void i_click_on_tennis() throws InterruptedException {
        homePage.tennis.click();
        sleepFor(3);
        homePage.navigateBack();
    }
    @And("I click on soccer")
    public void iClickOnSoccer() throws InterruptedException {
        homePage.soccer.click();
        sleepFor(3);
        homePage.navigateBack();
    }
    @Then("I verify sport page title as {string}")
    public void i_verify_sport_page_title_as(String string) {validateByTitle("Sports - The New York Times");
    }
    //checking Arts page

    @When("I click on Arts button")
    public void i_click_on_arts_button() throws InterruptedException {
        homePage.artButton.click();
        sleepFor(3);
    }
    @When("I click on books")
    public void i_click_on_books() throws InterruptedException {
        homePage.books.click();
        sleepFor(3);
        homePage.navigateBack();
    }
    @When("I click on dance")
    public void i_click_on_dance() throws InterruptedException {
        homePage.dance.click();
        sleepFor(3);
        homePage.navigateBack();
    }
    @When("I click on movies")
    public void i_click_on_movies() throws InterruptedException {
        homePage.movies.click();
        sleepFor(3);
        homePage.navigateBack();
    }
    @Then("I verify Arts page title as {string}")
    public void iVerifyArtsPageTitleAs(String arg0) {validateByTitle("Arts - The New York Times");
    }

    //checking the books page

    @When("I click on Books button")
    public void i_click_on_books_button() throws InterruptedException {
        homePage.booksButton.click();
        sleepFor(3);
    }
    @And("I click on bookReview")
    public void i_click_on_book_review() throws InterruptedException {
        homePage.booksReview.click();
        sleepFor(3);
    }
    @And("I click on bestSeller")
    public void iClickOnBestSeller() throws InterruptedException {
        homePage.bestSeller.click();
        sleepFor(3);
    }
    @Then("I verify best seller page as {string}")
    public void i_verify_best_seller_page_as(String string){validateByTitle("Best Sellers - The New York Times");

    }


}

