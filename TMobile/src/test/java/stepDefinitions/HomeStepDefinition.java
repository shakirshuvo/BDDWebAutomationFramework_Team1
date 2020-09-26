package stepDefinitions;

import base.CommonAPI;
import homeSaumitra.HomePageSaumitra;
import io.cucumber.java.*;
import io.cucumber.java.en.*;

import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static homeSaumitra.HomePageWebElementsSaumitra.*;

public class HomeStepDefinition extends CommonAPI {

    static HomePageSaumitra homePage;

    @BeforeStep
    public static void getInit() {
        homePage = PageFactory.initElements(driver, HomePageSaumitra.class);
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }

    @Given("I am on T Mobile Homepage")
    public void i_am_on_t_mobile_homepage() throws IOException {
        openBrowser("https://www.t-mobile.com/");
    }

    @When("I hover my mouse to Phones and Devices")
    public void i_hover_my_mouse_to_phones_and_devices() {
        mouseHoverByID(phonesNDevicesByID);
    }

    @When("I click on Cellphones")
    public void i_click_on_cellphones() {
        clickOnElementByXpath(cellphonesByXpath);
    }

//    @Then("i click on New under deals tab")
//    public void i_click_on_new_under_deals_tab() {
//        clickOnElementByXpath(dealsByXpath);
//
//        clickOnElementByXpath(newDealsByXpath);
////    }
//
//
//    @Then("I validate it by text Phones")
//    public void iValidateItByTextPhones() {
//        validateByText(validatePhonesByClass,"Phones");
//    }

    @Then("I validate it by url")
    public void iValidateItByUrl() {
        validateByURL("https://www.t-mobile.com/cell-phones");
    }

    @And("I click on Tablets and Devices")
    public void iClickOnTabletsAndDevices() {
        clickOnElementByXpath(tabletsAndDevicesByXPATH);
    }

    @Then("I validate it by text")
    public void iValidateItByText() {
        validateByText(validatetabletsByText, "Tablets & devices");
    }

    @And("I click on smart watches")
    public void iClickOnSmartWatches() {
        clickOnElementByXpath(smartWatchesByXPATH);
    }

    @Then("I validate it by text smart watches")
    public void iValidateItByTextSmartWatches() {
        validateByText(validateSmartWatchesByXPATH, "Smart watches");
    }
}