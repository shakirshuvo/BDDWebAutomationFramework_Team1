package stepDefinitions;

import base.CommonAPI;
import home.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class HomeStepDefinition extends CommonAPI {
    public static HomePage baHomepage;
    @BeforeStep
    public static void getInit(){
        baHomepage = PageFactory.initElements(driver, HomePage.class);
    }

    @After
    public void closeBrowser() {
//        closeBrowser();
        cleanUp();
    }

    @Given("I am on Bank Of America Homepage")
    public void iAmOnBankOfAmericaHomepage() throws IOException {
        openBrowser("https://www.bankofamerica.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }



    @When("I click on advantage banking element")
    public void i_click_on_advantage_banking_element() {
       baHomepage.clickOnAdvantageBanking();
    }

    @Then("I will validate the  advantage banking element")
    public void i_will_validate_the_advantage_banking_element() {
        baHomepage.validateAdvantageBanking();
    }


    @When("I click on checking solutions element")
    public void iClickOnCheckingSolutionsElement() throws InterruptedException {
        baHomepage.clickOnChecking();
        sleepFor(3);
    }

    @Then("I will validate the  checking solutions element")
    public void iWillValidateTheCheckingSolutionsElement() {
        baHomepage.validateClickOnChecking();
    }

    @When("I click on personal element")
    public void iClickOnPersonalElement() throws InterruptedException {
        baHomepage.clickOnPersonal();
    }

    @Then("I will validate the personal element")
    public void iWillValidateThePersonalElement() {
        baHomepage.validateClickOnPersonal();
    }

    @When("I click on open account element")
    public void iClickOnOpenAccountElement() throws InterruptedException {
        baHomepage.clickOpenAccount();
        sleepFor(5);
    }

    @Then("I will validate the  open account element")
    public void iWillValidateTheOpenAccountElement() {
        baHomepage.validateClickOpenAccount();
    }

    @When("I click on small business element")
    public void iClickOnSmallBusinessElement() {
        baHomepage.clickOnSmallBusiness();
    }

    @Then("I will validate the  small business element")
    public void iWillValidateTheSmallBusinessElement() {
        baHomepage.validateSmallBusinessElement();
    }

    @When("I click on wealth management element")
    public void iClickOnWealthManagementElement() {
        baHomepage.clickOnWealthMangement();
    }

    @Then("I will validate the  wealth management element")
    public void iWillValidateTheWealthManagementElement() {
        baHomepage.validateClickOnWealthManagement();
    }

    @When("I click on business institutions element")
    public void iClickOnBusinessInstitutionsElement() throws InterruptedException {
        baHomepage.clickOnBusinessInstitutions();
        sleepFor(5);
    }

    @Then("I will validate the business institutions element")
    public void iWillValidateTheBusinessInstitutionsElement() {
        baHomepage.validateClickBusinessInstitutions();
    }

    @When("I click on security element")
    public void iClickOnSecurityElement() throws InterruptedException {
        baHomepage.clickOnSecurityTab();
        sleepFor(5);
    }

    @Then("I will validate the  security element")
    public void iWillValidateTheSecurityElement() {
        baHomepage.validateClickOnSecurityTab();
    }

    @When("I click on about us element")
    public void iClickOnAboutUsElement() throws InterruptedException {
        sleepFor(5);
        baHomepage.clickOnAboutUs();
    }

    @Then("I will validate the about us element")
    public void iWillValidateTheAboutUsElement() {
        baHomepage.validateAboutUs();
    }

    @When("I click on checking element")
    public void iClickOnCheckingElement() throws InterruptedException {
        sleepFor(5);
        baHomepage.clickOnChecking();
    }

    @Then("I will validate the checking element")
    public void iWillValidateTheCheckingElement() {
        baHomepage.validateClickOnChecking();
    }
}
