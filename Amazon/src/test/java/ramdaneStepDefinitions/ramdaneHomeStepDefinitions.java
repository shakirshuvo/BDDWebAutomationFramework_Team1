package ramdaneStepDefinitions;

import base.CommonAPI;
import homeRamdane.HomePageRamdane;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class ramdaneHomeStepDefinitions extends CommonAPI {

    static HomePageRamdane homePageRamdane;

    @BeforeStep
    public void getInit() {
        homePageRamdane = PageFactory.initElements(driver, HomePageRamdane.class);
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }

    @Given("I am on amazon homepage")
    public void i_am_on_amazon_homepage() throws IOException {
        openBrowser("https://www.amazon.com/");
        driver.manage().window().maximize();
    }

    @When("I click amazon logo")
    public void i_click_amazon_logo() throws InterruptedException {
        homePageRamdane.logo.click();
        sleepFor(3);
    }

    @Then("I verify amazon logo with title as {string}")
    public void i_verify_amazon_logo_with_title_as(String string) {
        validateByTitle("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
    }

    @When("I click on amazonBestseller")
    public void i_click_on_amazon_bestseller() throws InterruptedException {
        homePageRamdane.bestSellerButton.click();
        sleepFor(3);
    }

    @And("I click on new releases")
    public void i_click_on_new_releases() {
        homePageRamdane.newReleaseBestSeller.click();
    }
    @Then("I verify new releases page as {string}")
    public void i_verify_new_releases_page_as(String string) {validateByTitle("Amazon.com New Releases: The best-selling new & future releases on Amazon");

    }
}
