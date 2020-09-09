package stepDefinitions;

import base.CommonAPI;
import home.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static home.HomePageWebElements.*;

public class HomeStepDefinition extends CommonAPI {

    static HomePage homePage;

    public static void gitInit(){
        homePage = PageFactory.initElements(driver, HomePage.class);
    }


    @After
    public void closeBroser(){
        cleanUp();
    }


    @Given("I am on Delta homepage")
    public void i_am_on_delta_homepage() throws IOException {
        openBrowser();
    }

    @When("I click on Log In")
    public void i_click_on_log_in() {
        clickOnElement(loginXpathWebElement);
    }

    @Then("I verify Log In page with title")
    public void i_verify_log_in_page_with_title() {
        validateByTitle("Login");
    }

}
