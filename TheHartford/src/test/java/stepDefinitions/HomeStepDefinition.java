package stepDefinitions;

import base.CommonAPI;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import search.Search;

import java.io.IOException;

import static org.apache.xmlbeans.XmlBeans.getTitle;
import static search.SearchWebElements.findReportClaimXPAT;

public class HomeStepDefinition extends CommonAPI {

//    static Search search;
//    String expectedResult;
//    String actualResult;
//    @BeforeStep
//    public static void getInit() {
//        search = PageFactory.initElements(driver, Search.class);
//    }
//    @After
//    public void tearDown(Scenario scenario) {
//        if (scenario.isFailed()) {
//            // Take a screenshot...
//            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//            scenario.attach(screenshot, "image/png", "Demo1"); // ... and embed it in the report.
//        }
//        cleanUp();
//    }
//    @Given("I on The Heart Fort Homepage")
//    public void i_on_the_heart_fort_homepage() throws IOException {
//        openBrowser("https://www.thehartford.com/");
//
//    }
//    @When("I Click on Report Claim Web Element")
//    public void i_click_on_report_claim_web_element() throws InterruptedException {
//        clickOnElement(findReportClaimXPAT);
//    }
//    @Then("I Verify Report Claim page title")
//    public void i_verify_report_claim_page_title() {
//        expectedResult = "Claims Center | Insurance Claim Center | The Hartford";
//        validateByTitle(expectedResult);
//    }
//    @Given("I enter {string} in searchBox")
//    public void i_enter_in_search_box(String string) {
//        search.searchBoxCheck("Life Insurance");
//    }
//    @When("I click searchButton")
//    public void i_click_search_button() {
//        search.searchButton.click();
//    }
//    @Then("I verify {string} is appear properly")
//    public void i_verify_is_appear_properly(String string) {
//        search.validateSearchBoxCheck();
//    }
//    @Then("I verify page title as Life Insurance")
//    public void i_verify_page_title_as_life_insurance() {
//        validateByTitle("SEARCH RESULTS");
//    }
//    @When("I Click on Find Agent Web Element")
//    public void iClickOnFindAgentWebElement() {
//        search.findAnAgentCheck();
//    }
//    @Then("I Verify Find Agent page title")
//    public void iVerifyFindAgentPageTitle() {
//        search.validateFindAnAgentCheck();
//    }
//    @When("I Click on Home Web Element")
//    public void iClickOnHomeWebElement() {
//        search.setHomeElementCheck();
//    }
//    @Then("I Verify Home page title")
//    public void iVerifyHomePageTitle() {
//        search.validateSetHomeElementCheck();
//    }
//
//    @When("I Click on Business Web Element")
//    public void iClickOnBusinessWebElement() {
//        search.businessElementCheck();
//    }
//    @Then("I Verify Business page title")
//    public void iVerifyBusinessPageTitle() {
//        search.validateBusinessTab();
//    }
//    @When("I Click on Employee Benefits Web Element")
//    public void iClickOnEmployeeBenefitsWebElement() {
//        search.employeeBanifits();
//    }
//    @Then("I Verify Employee Benefits page title")
//    public void iVerifyEmployeeBenefitsPageTitle() {
//        search.validateEmpBanifits();
//    }
//    @When("I Click on The HartFord Home Image Web Element")
//    public void iClickOnTheHartFordHomeImageWebElement() {
//        search.theHartFordImage();
//    }
//    @Then("I Verify The HartFord Home Image page title")
//    public void iVerifyTheHartFordHomeImagePageTitle() {
//        search.validateHartFordImage1();
//    }
//    @When("I Click on About Us Web Element")
//    public void iClickOnAboutUsWebElement() {
//        search.findAboutUs();
//    }
//    @Then("I Verify TAbout Us page title")
//    public void iVerifyTAboutUsPageTitle() {
//        search.validateAboutUs();
//    }
//    @When("I Click on Agent and Producers Web Element")
//    public void iClickOnAgentAndProducersWebElement() {
//        search.agentProducersCheck();
//    }
//    @Then("I Verify Agent and Producers page title")
//    public void iVerifyAgentAndProducersPageTitle() {
//        search.validateAgentProducers();
//    }
//    @When("I Click on Contact Us Web Element")
//    public void iClickOnContactUsWebElement() {
//        search.contactUsCheck();
//    }
//    @Then("I Verify Contact Us page title")
//    public void iVerifyContactUsPageTitle() {
//        search.validateContactUs();
//    }
//    @When("I Click on Mobile App Web Element")
//    public void iClickOnMobileAppWebElement() {
//        search.mobileAppCheck();
//    }
//    @Then("I Verify Mobile App page title")
//    public void iVerifyMobileAppPageTitle() {
//        search.validateMobileApp();
//    }
//    @When("I Click on Small Business Web Element")
//    public void iClickOnSmallBusinessWebElement() {
//        search.smallBusinessCheck();
//    }
//    @Then("I Verify MSmall Business page title")
//    public void iVerifyMSmallBusinessPageTitle() {
//        search.validateSmallBusiness();
//    }
//
//    @When("I Click on Privacy Policy Web Element")
//    public void iClickOnPrivacyPolicyWebElement() {
//        search.privacyPolicyCheck();
//    }
//    @Then("I Verify Privacy Policy page title")
//    public void iVerifyPrivacyPolicyPageTitle() {
//        search.validatePrivacyPolicy();
//    }
//    @When("I Click on Legal Notice Web Element")
//    public void iClickOnLegalNoticeWebElement() {
//        search.legalNoticeCheck();
//    }
//    @Then("I Verify Legal Notice page title")
//    public void iVerifyLegalNoticePageTitle() {
//        search.validateLegalNotice();
//    }
//    @When("I Click on Accessibility Statement Web Element")
//    public void iClickOnAccessibilityStatementWebElement() {
//        search.accessiblityCehck();
//    }
//    @Then("I Verify Accessibility Statement page title")
//    public void iVerifyAccessibilityStatementPageTitle() {
//        search.validateAccessibilityStat();
//    }
//    @When("I Click on Producers Compensations Web Element")
//    public void iClickOnProducersCompensationsWebElement() {
//        search.producerCompendationCheck();
//    }
//    @Then("I Verify Producers Compensations page title")
//    public void iVerifyProducersCompensationsPageTitle() {
//        search.validateProdCompansation();
//    }
//    @When("I Click on EEO Web Element")
//    public void iClickOnEEOWebElement() {
//        search.eEOCheck();
//    }
//    @Then("I Verify EEO page title")
//    public void iVerifyEEOPageTitle() {
//        search.validateEEO();
//    }
//    @When("I Click on FeedBack Web Element")
//    public void iClickOnFeedBackWebElement() {
//        search.feedBackCheck();
//    }
//    @Then("I Verify FeedBack page title")
//    public void iVerifyFeedBackPageTitle() {
//        search.validateFeedBack();
//    }
//    @When("I Click on Car Insurance Web Element")
//    public void iClickOnCarInsuranceWebElement() {
//        search.carInsuranceCheck();
//    }
//    @Then("I Verify Car Insurance page title")
//    public void iVerifyCarInsurancePageTitle() {
//        search.validateCarInsurance();
//    }
//    @When("I Click on Home Insurance Web Element")
//    public void iClickOnHomeInsuranceWebElement() {
//        search.homeInsuranceCheck();
//    }
//    @Then("I Verify Home Insurance page title")
//    public void iVerifyHomeInsurancePageTitle() {
//        search.validateHomeInsurance();
//    }
}
