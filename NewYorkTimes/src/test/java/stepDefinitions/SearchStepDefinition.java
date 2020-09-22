package stepDefinitions;

import base.CommonAPI;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.PageFactory;
import search.SearchPage;

import java.io.IOException;

import static search.SearchWebElements.*;

public class SearchStepDefinition extends CommonAPI {
    static SearchPage searchPage;
    @BeforeStep
    public void getInit(){
        searchPage= PageFactory.initElements(driver,SearchPage.class);}
    @After
    public void closeBrowser(){cleanUp();}
//    @After
//    public void takeScreenShot(){takeScreenShot();}

    @Given("I am in new York Times homepage")
    public void i_am_in_new_york_times_homepage() throws IOException {
        openBrowser("https://www.nytimes.com/");
    }

    @And("I click on searchButton")
    public void i_click_on_search_button() throws InterruptedException {
        searchPage.searchButton.click();
        sleepFor(3);
    }

    @And("I enter {string} in search field")
    public void i_enter_in_search_field(String string) throws InterruptedException {typeOnElement(searchFieldWebElementXP,"today's news");
    sleepFor(2); }

    @And("I submit search field")
    public void i_submit_search_field() {submitOnElement(searchFieldWebElementXP);
    }
    @Then("I verify search page title as {string}")
    public void i_verify_search_page_title_as(String string) {validateByTitle("The New York Times - Search");

    }





}
