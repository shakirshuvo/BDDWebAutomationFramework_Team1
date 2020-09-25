package stepDefinitions;

import base.CommonAPI;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import searchBankProductByRaza.Search;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static searchBankProductByRaza.ActionClassByRaza.validateSearchItems;
import static searchBankProductByRaza.ElementsBOARaza.searchBoxLocator;

public class SearchBOAStepDefinitionByRaza extends CommonAPI {

    static Search search;
    String expectedResult;
    String actualResult;

    @BeforeStep
    public static void getInit() {
        search = PageFactory.initElements(driver, Search.class);
    }
    @After
    public void closeBrowser() {
        cleanUp();
    }


    @Given("I am on Bank Of America homepage")
    public void i_am_on_bank_of_america_homepage() throws IOException {
        openBrowser("https://www.bankofamerica.com/");
        driver.manage().window().maximize();
    }

    @When("I enter {string} and submit in the search field.")
    public void i_enter_and_submit_in_the_search_field(String item) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        typeOnElementNEnter(searchBoxLocator, item);
         expectedResult = item;
    }

    @Then("I verify items with {string}.")
    public void iVerifyItemsWith(String item) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        validateSearchItems(expectedResult);

    }
}
