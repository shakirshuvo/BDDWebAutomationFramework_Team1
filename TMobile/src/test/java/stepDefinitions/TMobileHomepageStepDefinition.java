package stepDefinitions;

import base.CommonAPI;
import home.TMobileHomepage;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TMobileHomepageStepDefinition extends CommonAPI {

    public static TMobileHomepage tMobileHomepage;

    @BeforeStep
    public static void getInit() {
        tMobileHomepage = PageFactory.initElements(driver, TMobileHomepage.class);
    }

    @After
    public void closeBrowser() {
//        closeBrowser();
        cleanUp();
    }

    @Given("I am in the T-Mobile Homepage")
    public void iAmInTheTMobileHomepage() throws IOException {
        openBrowser("https://www.t-mobile.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @When("I click on wireless tab")
    public void i_click_on_wireless_tab() {
       tMobileHomepage.clickOnWirelessTab();
    }

    @Then("I will verify wireless tab")
    public void i_will_verify_wireless_tab() {
        tMobileHomepage.validateClickOnWirelessTab();
    }

    @When("I clicks on  business tab")
    public void iClicksOnBusinessTab() {
        tMobileHomepage.clickOnBusinessTab();
    }

    @Then("I will verify business tab")
    public void iWillVerifyBusinessTab() {
        tMobileHomepage.validateClickOnBusinessTab();
    }

    @When("I clicks on prepaid tab")
    public void iClicksOnPrepaidTab() {
        tMobileHomepage.clickOnPrePaidTab();
    }

    @Then("I will verify prepaid tab")
    public void iWillVerifyPrepaidTab() {
        tMobileHomepage.validateClickOnPrePaidTab();
    }

    @When("I clicks on tv  tab")
    public void iClicksOnTvTab() {
        tMobileHomepage.clickOnTvTab();
    }

    @Then("I will verify tv tab")
    public void iWillVerifyTvTab() {
        tMobileHomepage.validateClickOnTv();
    }

    @When("I clicks on banking tab")
    public void iClicksOnBankingTab() {
        tMobileHomepage.clickOnBankingTab();
    }

    @Then("I will verify banking tab")
    public void iWillVerifyBankingTab() {
        tMobileHomepage.validateClickOnBanking();
    }


}
