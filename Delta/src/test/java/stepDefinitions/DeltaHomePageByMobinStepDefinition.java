package stepDefinitions;

import base.CommonAPI;
import deltaHomeByMobin.DeltaHomePageByMobin;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;

public class DeltaHomePageByMobinStepDefinition extends CommonAPI{

    static DeltaHomePageByMobin home;

    @BeforeStep
    public static void getInit() {
        home = PageFactory.initElements(driver, DeltaHomePageByMobin.class);
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }

    @Given("User is in Delta homepage")
    public void user_is_in_delta_homepage() throws IOException {
        openBrowser("https://www.delta.com/");
    }

    @When("User hover over travel info tab")
    public void user_hover_over_travel_info_tab() throws InterruptedException {
        home.checkTravleInfoDropDownTab();
    }

    @And("clicks on aircraft tab")
    public void clicks_on_aircraft_tab() {

    }

    @Then("User is directed to *** page")
    public void user_is_directed_to_page() {
        home.validateTravleInfoDropDownTab();
    }

}
