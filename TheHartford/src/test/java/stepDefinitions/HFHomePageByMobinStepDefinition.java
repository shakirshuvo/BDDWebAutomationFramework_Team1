package stepDefinitions;

import base.CommonAPI;
import hfHomeByMobin.HFHomePageByMobin;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;

public class HFHomePageByMobinStepDefinition extends CommonAPI{

    static HFHomePageByMobin home;

    @BeforeStep
    public static void getInit() {
        home = PageFactory.initElements(driver, HFHomePageByMobin.class);
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }

    @Given("User is in The Hartford homepage")
    public void user_is_in_the_hartford_homepage() throws IOException {
        openBrowser("https://www.thehartford.com/");
    }

    @When("User hover over auto tab")
    public void userHoverOverAutoTab() {

    }

    @And("clicks on Car Insurance tab")
    public void clicksOnCarInsuranceTab() throws InterruptedException {
        home.checkCarInsuranceTab();
    }

    @Then("User is directed to Car Insurance page")
    public void user_is_directed_to_car_insurance_page() {
        home.validateCarInsuranceTab();
    }


    @When("User hover over Home tab")
    public void userHoverOverHomeTab() {

    }

    @And("clicks on Condo Insurance tab")
    public void clicksOnCondoInsuranceTab() throws InterruptedException {
        home.checkCondoInsuranceTab();
    }

    @Then("User is directed to Condo Insurance page")
    public void userIsDirectedToCondoInsurancePage() {
        home.validateCondoInsuranceTab();
    }

    @When("User hover over Business tab")
    public void userHoverOverBusinessTab() {

    }

    @And("clicks on Business Insurance tab")
    public void clicksOnBusinessInsuranceTab() throws InterruptedException {
        home.checkBusinessInsuranceTab();
    }

    @Then("User is directed to Business Insurance page")
    public void userIsDirectedToBusinessInsurancePage() {
        home.validateBusinessInsuranceTab();
    }

    @When("User hover over Employee Benifits tab")
    public void userHoverOverEmployeeBenifitsTab() {

    }

    @And("clicks on for Employers tab")
    public void clicksOnForEmployersTab() throws InterruptedException {
        home.checkforEmployersTab();
    }

    @Then("User is directed to for Employers page")
    public void userIsDirectedToForEmployersPage() {
        home.validateforEmployersTab();
    }

    @When("User hover over About tab")
    public void userHoverOverAboutTab() {

    }

    @And("clicks on Newsroom tab")
    public void clicksOnNewsroomTab() throws InterruptedException {
        home.checkNewsroomTab();
    }

    @Then("User is directed to Newsroom page")
    public void userIsDirectedToNewsroomPage() {
        home.validateNewsroomTab();
    }
}
