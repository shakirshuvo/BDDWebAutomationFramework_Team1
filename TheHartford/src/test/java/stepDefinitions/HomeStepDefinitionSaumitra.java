package stepDefinitions;

import base.CommonAPI;
import homeSaumitra.HomeSaumitra;
import io.cucumber.java.*;
import io.cucumber.java.en.*;

import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static homeSaumitra.HomeWebElementsSaumitra.*;

public class HomeStepDefinitionSaumitra extends CommonAPI {

    static HomeSaumitra homePage;

    @BeforeStep
    public static void getInit() {
        homePage = PageFactory.initElements(driver, HomeSaumitra.class);
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }

    @Given("I am on The Hartford Homepage")
    public void i_am_on_the_hartford_homepage() throws IOException {
        openBrowser("https://www.thehartford.com/");
    }

    @When("I hover my mouse over Auto")
    public void i_hover_my_mouse_over_auto() {
    mouseHoverByXpath(autoByXpath);
    }

    @When("I click on car insurance")
    public void i_click_on_car_insurance() {
    clickOnElementByXpath(carInsuranceByXpath);
    }

    @Then("I validate that page by title")
    public void i_validate_that_page_by_title() {
    validateByTitle("AARP® Auto Insurance | AARP Car Insurance Quote | The Hartford");
    }


    @And("I click on Classic Car insurance")
    public void iClickOnClassicCarInsurance() {
        clickOnElementByXpath(classicCarInsuranceByXPATH);
    }

    @Then("I validate that page by url")
    public void iValidateThatPageByUrl() {
        validateByURL("https://www.thehartford.com/aarp/car-insurance/classic-car");
    }

    @And("I click on commercial auto insurance")
    public void iClickOnCommercialAutoInsurance() {
        clickOnElementByXpath(commercialAutoInsuranceByXPATH);
    }

    @Then("I validate that page by url of its")
    public void iValidateThatPageByUrlOfIts() {
        validateByURL("https://www.thehartford.com/commercial-auto-insurance");
    }

    @When("I hover my mouse over Home")
    public void iHoverMyMouseOverHome() {
        clickOnElementByXpath(homeByXpath);
    }

    @And("I click on Home Owners insurance")
    public void iClickOnHomeOwnersInsurance() {
        clickOnElement(homeOwnersInsuranceByLinkText);
    }

    @Then("I validate Home Owners by page title")
    public void iValidateHomeOwnersByPageTitle() {
        validateByTitle("AARP® Homeowners Insurance | AARP Home Insurance | The Hartford");
    }
}
