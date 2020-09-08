package stepDefinitions;

import base.CommonAPI;
import home.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.PageFactory;

public class HomeStepDefinition extends CommonAPI {

    static HomePage homePage;

    @BeforeStep
    public static void getInit() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }

    @Then("I verify Amazon homepage with title")
    public void i_verify_amazon_homepage_with_title() {
        validateByTitle("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
    }
}
