package stepDefinitions;

import base.CommonAPI;
import home.HartfordHomePageWaqas;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class HartfordHomePageWaqasStepDefinition extends CommonAPI {

    public static HartfordHomePageWaqas hartfordHomePageWaqas;

    @BeforeStep
    public static void getInit() {
        hartfordHomePageWaqas = PageFactory.initElements(driver, HartfordHomePageWaqas.class);
    }

    @After
    public void closeBrowser() {
//        closeBrowser();
        cleanUp();
    }

    @Given("I am on Hartford Homepage")
    public void iAmOnHartfordHomepage() throws IOException {
        openBrowser("https://www.thehartford.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @When("I click on Auto Tab")
    public void iClickOnAutoTab() {
        hartfordHomePageWaqas.clickOnAutoTab();
    }

    @Then("I will validate the auto tab")
    public void iWillValidateTheAutoTab() {
        hartfordHomePageWaqas.validateClickOnAuto();
    }

    @When("I Click on Home Web Element Tab")
    public void iClickOnHomeWebElementTab() {
        hartfordHomePageWaqas.clickOnHomeTab();
    }

    @Then("I will validate the Home tab")
    public void iWillValidateTheHomeTab() {
        hartfordHomePageWaqas.validateClickOnHomeTab();
    }

    @When("I Click on Business Web Element Tab")
    public void iClickOnBusinessWebElementTab() {
        hartfordHomePageWaqas.clickOnBusinessTab();
    }

    @Then("I will validate the business element tab")
    public void iWillValidateTheBusinessElementTab() {
        hartfordHomePageWaqas.validateClickOnBusinessTab();
    }

    @When("I Click on Employee Benefits Web Element")
    public void iClickOnEmployeeBenefitsWebElement() {
        hartfordHomePageWaqas.clickOnEmployeeBenefits();
    }

    @Then("I will validate the Employee benefits tab")
    public void iWillValidateTheEmployeeBenefitsTab() {
        hartfordHomePageWaqas.validateClickOnEmployeeBenefits();
    }

    @When("I Click on About Us Web Element")
    public void iClickOnAboutUsWebElement() {
        hartfordHomePageWaqas.clickOnAboutUsTab();
    }

    @Then("I will validate the About Us element")
    public void iWillValidateTheAboutUsElement() {
        hartfordHomePageWaqas.validateClickOnAboutUsTab();
    }

    @When("I Mouseover on Home Web Element")
    public void iMouseoverOnHomeWebElement() {
        hartfordHomePageWaqas.homeTabMouseOver();
    }

    @Then("I will validate the Hometab mouseover")
    public void iWillValidateTheHometabMouseover() {
        hartfordHomePageWaqas.validateHomeTabMouseOver();
    }





    @When("I Click on Renters Insurance Web Element")
    public void iClickOnRentersInsuranceWebElement() {
        hartfordHomePageWaqas.clickOnRentersInsurance();
    }

    @Then("I will validate the Renters Insurance element")
    public void iWillValidateTheRentersInsuranceElement() {
        hartfordHomePageWaqas.validateRentersInsurance();
    }

    @When("I Click on Flood Insurance Web Element")
    public void iClickOnFloodInsuranceWebElement() {
        hartfordHomePageWaqas.clickOnFloodInsurance();
    }

    @Then("I will validate the Flood Insurance element")
    public void iWillValidateTheFloodInsuranceElement() {
        hartfordHomePageWaqas.validateFloodInsurance();
    }

    @When("I Click on Umbrella Insurance Web Element")
    public void iClickOnUmbrellaInsuranceWebElement() {
        hartfordHomePageWaqas.clickOnUmbrellaInsurance();
    }

    @Then("I will validate the Umbrella Insurance element")
    public void iWillValidateTheUmbrellaInsuranceElement() {
        hartfordHomePageWaqas.validateUmbrellaInsurance();
    }

    @When("I Click on Classic car Web Element")
    public void iClickOnClassicCarWebElement() {
        hartfordHomePageWaqas.clickOnClassicCarInsurance();
    }

    @Then("I will validate the Classic Car element")
    public void iWillValidateTheClassicCarElement() {
        hartfordHomePageWaqas.validateClassicCarInsurance();
    }

    @When("I Click on All Vehicles Web Element")
    public void iClickOnAllVehiclesWebElement() {
        hartfordHomePageWaqas.clickOnAllVehiclesInsurance();
    }

    @Then("I will validate the All Vehicles element")
    public void iWillValidateTheAllVehiclesElement() {
        hartfordHomePageWaqas.validateAllVehiclesInsurance();
    }

    @When("I Click on Homeowners Web Element")
    public void iClickOnHomeownersWebElement() {
        hartfordHomePageWaqas.clickOnAllHomeOwners();
    }

    @Then("I will validate the Homeowners element")
    public void iWillValidateTheHomeownersElement() {
        hartfordHomePageWaqas.validateClickOnHomeOwners();
    }

    @When("I Click on Business Owners Web Element")
    public void iClickOnBusinessOwnersWebElement() {
        hartfordHomePageWaqas.clickOnBusinessOwnersPolicy();
    }

    @Then("I will validate the Business Owners Policy element")
    public void iWillValidateTheBusinessOwnersPolicyElement() {
        hartfordHomePageWaqas.validateClickOnBusinessOwnersPolicy();
    }

    @When("I Click on General Liability Insurance Web Element")
    public void iClickOnGeneralLiabilityInsuranceWebElement() {
        hartfordHomePageWaqas.clickOnGeneralLiability();
    }

    @Then("I will validate the General Liability Insurance element")
    public void iWillValidateTheGeneralLiabilityInsuranceElement() {
        hartfordHomePageWaqas.validateClickOnGeneralLiability();
    }

    @When("I Click on Workers Compensation Web Element")
    public void iClickOnWorkersCompensationWebElement() {
        hartfordHomePageWaqas.clickOnWorkersCompensation();
    }

    @Then("I will validate the Workers Compensation element")
    public void iWillValidateTheWorkersCompensationElement() {
        hartfordHomePageWaqas.validateClickOnWorkersCompensation();
    }

    @When("I Click on Commercial auto insurance Web Element")
    public void iClickOnCommercialAutoInsuranceWebElement() {
        hartfordHomePageWaqas.clickOnCommercialAutoInsurance();
    }

    @Then("I will validate the Commercial auto insurance element")
    public void iWillValidateTheCommercialAutoInsuranceElement() {
        hartfordHomePageWaqas.validateClickOnCommercialAutoInsurance();
    }

    @When("I Click on For Employers Web Element")
    public void iClickOnForEmployersWebElement() {
        hartfordHomePageWaqas.clickOnForEmployers();
    }

    @Then("I will validate the For Employers element")
    public void iWillValidateTheForEmployersElement() {
        hartfordHomePageWaqas.validateClickOnForEmployers();
    }

    @When("I Click on Benefit Plans Web Element")
    public void iClickOnBenefitPlansWebElement() {
        hartfordHomePageWaqas.clickOnBenefitPlans();
    }

    @Then("I will validate the benefit plans element")
    public void iWillValidateTheBenefitPlansElement() {
        hartfordHomePageWaqas.validateClickOnBenefitPlans();
    }

    @When("I Click on Absence Management Web Element")
    public void iClickOnAbsenceManagementWebElement() {
        hartfordHomePageWaqas.clickOnAbsenceManagement();
    }

    @Then("I will validate the Absence Management element")
    public void iWillValidateTheAbsenceManagementElement() {
        hartfordHomePageWaqas.validateClickOnAbsenceManagement();
    }

    @When("I Click on Industry Solutions Web Element")
    public void iClickOnIndustrySolutionsWebElement() {
        hartfordHomePageWaqas.clickOnIndustrySolutions();
    }

    @Then("I will validate the Industry Solutions element")
    public void iWillValidateTheIndustrySolutionsElement() {
        hartfordHomePageWaqas.validateClickOnIndustrySolutions();
    }

    @When("I Click on Insurance for Employees Web Element")
    public void iClickOnInsuranceForEmployeesWebElement() {
        hartfordHomePageWaqas.clickOnInsuranceForEmployees();
    }

    @Then("I will validate the Insurance for Employees element")
    public void iWillValidateTheInsuranceForEmployeesElement() {
    hartfordHomePageWaqas.validateClickOnInsuranceForEmployees();
    }

    @When("I Click on Value Added Services Web Element")
    public void iClickOnValueAddedServicesWebElement() {
        hartfordHomePageWaqas.clickOnValueAddedServices();
    }

    @Then("I will validate the Value Added Services element")
    public void iWillValidateTheValueAddedServicesElement() {
        hartfordHomePageWaqas.validateClickOnValueAddedServices();
    }

    @When("I Click on Start a Claim Web Element")
    public void iClickOnStartAClaimWebElement() {
        hartfordHomePageWaqas.clickOnStartAClaim();
    }

    @Then("I will validate the Start a Claim element")
    public void iWillValidateTheStartAClaimElement() {
        hartfordHomePageWaqas.validateClickOnStartAClaim();
    }

    @When("I Click on State Guide Web Element")
    public void iClickOnStateGuideWebElement() {
        hartfordHomePageWaqas.clickOnStateGuide();
    }

    @Then("I will validate the State Guide element")
    public void iWillValidateTheStateGuideElement() {
        hartfordHomePageWaqas.validateClickOnStateGuide();
    }

    @When("I Click on For Agents and Producers Web Element")
    public void iClickOnForAgentsAndProducersWebElement() {
        hartfordHomePageWaqas.clickOnForAgentsNProducers();
    }

    @Then("I will validate the For Agents and Producers element")
    public void iWillValidateTheForAgentsAndProducersElement() {
        hartfordHomePageWaqas.validateClickOnForAgentsNProducers();
    }

    @When("I Click on Resources Web Element")
    public void iClickOnResourcesWebElement() {
        hartfordHomePageWaqas.clickOnResources();
    }

    @Then("I will validate the Resources element")
    public void iWillValidateTheResourcesElement() {
        hartfordHomePageWaqas.validateClickOnResources();
    }

    @When("I Click on Benefit Technology Partners Web Element")
    public void iClickOnBenefitTechnologyPartnersWebElement() {
        hartfordHomePageWaqas.clickOnBenefitsTechnology();
    }

    @Then("I will validate the Benefit Technology Partners element")
    public void iWillValidateTheBenefitTechnologyPartnersElement() {
        hartfordHomePageWaqas.validateClickOnBenefitsTechnology();
    }


}
