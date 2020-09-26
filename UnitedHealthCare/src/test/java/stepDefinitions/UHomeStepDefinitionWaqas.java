package stepDefinitions;

import base.CommonAPI;
import home.UHomePageWaqas;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class UHomeStepDefinitionWaqas extends CommonAPI {
    public static UHomePageWaqas homePageWaqas;

    @BeforeStep
    public static void getInit() {
        homePageWaqas = PageFactory.initElements(driver, UHomePageWaqas.class);
    }

    @After
    public void closeBrowser() {

        cleanUp();
    }

    @Given("User is on United Health Care homepage")
    public void user_is_on_united_health_care_homepage() throws IOException {
        openBrowser("https://www.uhc.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }




    @When("I click on brokers element")
    public void iClickOnBrokersElement() {
        homePageWaqas.clickOnBrokers();
    }

    @Then("I will verify brokers tab element")
    public void iWillVerifyBrokersTabElement() {
        homePageWaqas.validateClickOnBrokers();
    }

    @When("I click on search button  element")
    public void iClickOnSearchButtonElement() throws InterruptedException {
        homePageWaqas.clickOnSearchButton();
    }

    @Then("I will verify search button element")
    public void iWillVerifySearchButtonElement() {
        homePageWaqas.validateSearch();
    }

    @When("I click on medicare element")
    public void iClickOnMedicareElement() {
        homePageWaqas.clickOnMedicare();
    }

    @Then("I will verify medicare element")
    public void iWillVerifyMedicareElement() {
        homePageWaqas.validateClickOnMedicare();
    }

    @When("I click on for providers element")
    public void iClickOnForProvidersElement() {
        homePageWaqas.clickOnForProviders();
    }

    @Then("I will verify  for providers element")
    public void iWillVerifyForProvidersElement() {
        homePageWaqas.validateClickOnForProviders();
    }

    @When("I click on for employers element")
    public void iClickOnForEmployersElement() {
        homePageWaqas.clickOnForEmployersTab();
    }

    @Then("I will verify  for employers element")
    public void iWillVerifyForEmployersElement() {
        homePageWaqas.validateClickOnForEmployers();
    }

    @When("I click on for insurance element")
    public void iClickOnForInsuranceElement() {
        homePageWaqas.clickOnInsuranceTab();
    }

    @Then("I will verify for insurance  element")
    public void iWillVerifyForInsuranceElement() {
        homePageWaqas.validateClickOnInsuranceTab();
    }

    @When("I click on business element")
    public void iClickOnBusinessElement() {
        homePageWaqas.clickOnAllBusinessTab();
    }

    @Then("I will verify  business element")
    public void iWillVerifyBusinessElement() {
        homePageWaqas.validateAllBusinessTab();
    }

    @When("I click on small business element")
    public void iClickOnSmallBusinessElement() {
        homePageWaqas.clickOnSmallBusiness();
    }

    @Then("I will verify  small business element")
    public void iWillVerifySmallBusinessElement() {
        homePageWaqas.validateClickSmallBuiness();
    }

    @When("I click on national accounts element")
    public void iClickOnNationalAccountsElement() {
        homePageWaqas.clickOnNationalAccounts();
    }

    @Then("I will verify national accounts element")
    public void iWillVerifyNationalAccountsElement() {
        homePageWaqas.validateClickNationalAccounts();
    }

    @When("I click on group retiree element")
    public void iClickOnGroupRetireeElement() {
        homePageWaqas.clickOnGroupRetiree();
    }

    @Then("I will verify group retiree element")
    public void iWillVerifyGroupRetireeElement() {
        homePageWaqas.validateClickGroupRetiree();
    }
}
