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

}
