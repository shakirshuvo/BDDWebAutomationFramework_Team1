package stepDefinitions;

import base.CommonAPI;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import search.Search;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static search.SearchWebElements.*;

public class SearchStepDefinition extends CommonAPI {

    static Search search;

    @BeforeStep
    public static void getInit() {
        search = PageFactory.initElements(driver, Search.class);
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }

    @Given("I am on Amazon homepage")
    public void i_am_on_amazon_homepage() throws IOException {
        openBrowser();
    }

    @Given("I enter {string} in search field")
    public void i_enter_in_search_field(String string) {
        typeOnElement(searchFieldIDWebElement, "Hand Sanitizer");
    }

    @When("I submit search field")
    public void i_submit_search_field() {
        submitOnElement(searchFieldIDWebElement);
    }

    @Then("I verify page title as {string}")
    public void i_verify_page_title_as(String string) {
        validateByTitle("Amazon.com : Hand Sanitizer");
    }

    @When("I enter {string} and submit in the search field.")
    public void i_enter_and_submit_in_the_search_field(String item) {
        typeOnElementNEnter(searchFieldIDWebElement, item);
    }

    @Then("I verify items with {string}.")
    public void i_verify_items_with(String title) {
        validateByTitle(title);
    }
}
