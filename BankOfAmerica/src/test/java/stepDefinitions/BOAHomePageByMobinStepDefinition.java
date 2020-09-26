package stepDefinitions;

import base.CommonAPI;
import boaHomeByMobin.BOAHomePageByMobin;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;

public class BOAHomePageByMobinStepDefinition extends CommonAPI{

    static BOAHomePageByMobin home;

    @BeforeStep
    public static void getInit() {
        home = PageFactory.initElements(driver, BOAHomePageByMobin.class);
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }

    @Given("User is in Bank of America homepage")
    public void user_is_in_bank_of_america_homepage() throws IOException {
        openBrowser("https://www.bankofamerica.com/");
    }

    @When("User clicks on Checking tab")
    public void user_clicks_on_checking_tab() {
        home.checkCheckingTab();
    }

    @Then("User is directed to Checking page")
    public void user_is_directed_to_checking_page() {
        home.validateCheckingTab();
    }

    @When("User clicks on Savings tab")
    public void userClicksOnSavingsTab() {
        home.checkSavingsTab();
    }

    @Then("User is directed to Savings page")
    public void userIsDirectedToSavingsPage() {
        home.validateSavingsTab();
    }

    @When("User clicks on Credit Card tab")
    public void userClicksOnCreditCardTab() {
        home.checkCreditCardTab();
    }

    @Then("User is directed to Credit Card page")
    public void userIsDirectedToCreditCardPage() {
        home.validateCreditCardTab();
    }

    @When("User clicks on Investing tab")
    public void userClicksOnInvestingTab() {
        home.checkInvestingTab();
    }

    @Then("User is directed to Investing page")
    public void userIsDirectedToInvestingPage() {
        home.validateInvestingTab();
    }

    @When("User hover over in different places")
    public void userHoverOverInDifferentPlaces() throws InterruptedException {
        
    }

    @And("clicks on Planning tab")
    public void clicksOnPlanningTab() throws InterruptedException {
        home.checkPlanningTab();
    }

    @Then("User is directed to Planning page")
    public void userIsDirectedToPlanningPage() {
        home.validatePlanningTab();
    }

    @And("clicks on PrepAndFilling tab")
    public void clicksOnPrepAndFillingTab() throws InterruptedException {
        home.checkPrepAndFillingTab();
    }

    @Then("User is directed to PrepAndFilling page")
    public void userIsDirectedToPrepAndFillingPage() {
        home.validatePrepAndFillingTab();
    }

    @And("clicks on WorkPayAndBenifits tab")
    public void clicksOnWorkPayAndBenifitsTab() throws InterruptedException {
        home.checkWorkPayAndBenifitsTab();
    }

    @Then("User is directed to WorkPayAndBenifits page")
    public void userIsDirectedToWorkPayAndBenifitsPage() {
        home.validateWorkPayAndBenifitsTab();
    }

    @And("clicks on HowBanksWork tab")
    public void clicksOnHowBanksWorkTab() throws InterruptedException {
        home.checkHowBanksWorkTab();
    }

    @Then("User is directed to HowBanksWork page")
    public void userIsDirectedToHowBanksWorkPage() {
        home.validateHowBanksWorkTab();
    }

    @And("clicks on ManagingBankAccounts tab")
    public void clicksOnManagingBankAccountsTab() throws InterruptedException {
        home.checkManagingBankAccountsTab();
    }

    @Then("User is directed to ManagingBankAccounts page")
    public void userIsDirectedToManagingBankAccountsPage() {
        home.validateManagingBankAccountsTab();
    }

    @And("clicks on TeachingKidsAboutMoney tab")
    public void clicksOnTeachingKidsAboutMoneyTab() throws InterruptedException {
        home.checkTeachingKidsAboutMoneyTab();
    }

    @Then("User is directed to TeachingKidsAboutMoney page")
    public void userIsDirectedToTeachingKidsAboutMoneyPage() {
        home.validateTeachingKidsAboutMoneyTab();
    }

    @And("clicks on ChoosingACreditCard tab")
    public void clicksOnChoosingACreditCardTab() throws InterruptedException {
        home.checkChoosingACreditCardTab();
    }

    @Then("User is directed to ChoosingACreditCard page")
    public void userIsDirectedToChoosingACreditCardPage() {
        home.validateChoosingACreditCardTab();
    }

    @And("clicks on CreditReport tab")
    public void clicksOnCreditReportTab() throws InterruptedException {
        home.checkCreditReportTab();
    }

    @Then("User is directed to creditReport page")
    public void userIsDirectedToCreditReportPage() {
        home.validateCreditReportTab();
    }

    @And("clicks on CreditScore tab")
    public void clicksOnCreditScoreTab() throws InterruptedException {
        home.checkCreditScoreTab();
    }

    @Then("User is directed to CreditScore page")
    public void userIsDirectedToCreditScorePage() {
        home.validateCreditScoreTab();
    }

    @And("clicks on HowCreditCardWorks tab")
    public void clicksOnHowCreditCardWorksTab() throws InterruptedException {
        home.checkHowCreditCardWorksTab();
    }

    @Then("User is directed to HowCreditCardWorks page")
    public void userIsDirectedToHowCreditCardWorksPage() {
        home.validateHowCreditCardWorksTab();
    }

    @And("clicks on ManageingCreditCards tab")
    public void clicksOnManageingCreditCardsTab() throws InterruptedException {
        home.checkManageingCreditCardsTab();
    }

    @Then("User is directed to ManageingCreditCards page")
    public void userIsDirectedToManageingCreditCardsPage() {
        home.validateManageingCreditCardsTab();
    }
}
