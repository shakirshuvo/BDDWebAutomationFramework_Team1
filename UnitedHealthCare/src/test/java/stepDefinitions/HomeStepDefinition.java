package stepDefinitions;

import base.CommonAPI;
import home.Homepage;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;

import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class HomeStepDefinition extends CommonAPI {

    static Homepage home;

    @BeforeStep
    public static void getInit() {
        home = PageFactory.initElements(driver, Homepage.class);
    }

    @After
    public void closeBrowser() {

        cleanUp();
    }


    @Given("User is in United Health Care homepage")
    public void user_is_in_united_health_care_homepage() throws IOException {
        openBrowser("https://www.uhc.com");
        driver.manage().window().maximize();
    }

    @When("User clicks on Medicare tab")
    public void user_clicks_on_medicare_tab() {
        home.checkMedicare();
    }

    @Then("User is directed to Medicare page")
    public void user_is_directed_to_medicare_page() {
        home.validateMedicare();
    }

    @When("User clicks on ForProviders tab")
    public void user_clicks_on_for_providers_tab() {
        home.checkForProviders();
    }

    @Then("User is directed to ForProviders page")
    public void user_is_directed_to_for_providers_page() {
        home.validateForProviders();
    }

    @When("User clicks on ForEmployers tab")
    public void user_clicks_on_for_employers_tab() {
        home.checkForEmployers();
    }

    @Then("User is directed to ForEmployers page")
    public void user_is_directed_to_for_employers_page() {
        home.validateForEmployers();
    }

    @When("User clicks on ForBrokers tab")
    public void user_clicks_on_for_brokers_tab() {
        home.checkForBrokers();
    }

    @Then("User is directed to ForBrokers page")
    public void user_is_directed_to_for_brokers_page() {
        home.validateForBrokers();
    }

    @When("User clicks on LanguageChange tab")
    public void user_clicks_on_language_change_tab() {
        home.checkLanguageChange();
    }

    @Then("User is directed to LanguageChange page")
    public void user_is_directed_to_language_change_page() {
        home.validateLanguageChange();
    }

    @When("User clicks on FindADoctor tab")
    public void user_clicks_on_find_a_doctor_tab() {
        home.checkFindADoctor();
    }

    @Then("User is directed to FindADoctor page")
    public void user_is_directed_to_find_a_doctor_page() {
        home.validateFindADoctor();
    }

    @When("User clicks on FindYourPlan tab")
    public void user_clicks_on_find_your_plan_tab() {
        home.checkFindYourPlan();
    }

    @Then("User is directed to FindYourPlan page")
    public void user_is_directed_to_find_your_plan_page() {
        home.validateFindYourPlan();
    }

    @When("User clicks on IndividualAndFamilyHealthPlan tab")
    public void userClicksOnIndividualAndFamilyHealthPlanTab() {
        home.checkIndividualAndFamilyHealthPlan();
    }

    @Then("User is directed to IndividualAndFamilyHealthPlan page")
    public void userIsDirectedToIndividualAndFamilyHealthPlanPage() {
        home.validateIndividualAndFamilyHealthPlan();
    }

    @When("User clicks on MedicareHealthPlan tab")
    public void userClicksOnMedicareHealthPlanTab() {
        home.checkMedicareHealthPlan();
    }

    @Then("User is directed to MedicareHealthPlan page")
    public void userIsDirectedToMedicareHealthPlanPage() {
        home.validateMedicareHealthPlan();
    }

    @When("User clicks on SmallBusinessHealthPlan tab")
    public void userClicksOnSmallBusinessHealthPlanTab() {
        home.checkSmallBusinessHealthPlan();
    }

    @Then("User is directed to SmallBusinessHealthPlan page")
    public void userIsDirectedToSmallBusinessHealthPlanPage() {
        home.validateSmallBusinessHealthPlan();
    }

    @When("User clicks on ShortTermInsurenceHealthPlan tab")
    public void userClicksOnShortTermInsurenceHealthPlanTab() {
        home.checkShortTermInsurenceHealthPlan();
    }

    @Then("User is directed to ShortTermInsurenceHealthPlan page")
    public void userIsDirectedToShortTermInsurenceHealthPlanPage() {
        home.validateShortTermInsurenceHealthPlan();
    }

    @When("User clicks on MedicaidHealthPlan tab")
    public void userClicksOnMedicaidHealthPlanTab() {
        home.checkMedicaidHealthPlan();
    }

    @Then("User is directed to MedicaidHealthPlan page")
    public void userIsDirectedToMedicaidHealthPlanPage() {
        home.validateMedicaidHealthPlan();
    }

    @When("User clicks on DentalHealthPlan tab")
    public void userClicksOnDentalHealthPlanTab() {
        home.checkDentalHealthPlan();
    }

    @Then("User is directed to DentalHealthPlan page")
    public void userIsDirectedToDentalHealthPlanPage() {
        home.validateDentalHealthPlan();
    }

    @When("User clicks on ContactUs tab")
    public void userClicksOnContactUsTab() {
        home.checkContactUs();
    }

    @Then("User is directed to ContactUs page")
    public void userIsDirectedToContactUsPage() {
        home.validateContactUs();
    }

    @When("User clicks on Career tab")
    public void userClicksOnCareerTab() {
        home.checkCareer();
    }

    @Then("User is directed to Career page")
    public void userIsDirectedToCareerPage() {
        home.validateCareer();
    }

    @When("User clicks on NewsRoom tab")
    public void userClicksOnNewsRoomTab() {
        home.checkNewsRoom();
    }

    @Then("User is directed to NewsRoom page")
    public void userIsDirectedToNewsRoomPage() {
        home.validateNewsRoom();
    }

    @When("User clicks on AboutUs tab")
    public void userClicksOnAboutUsTab() {
        home.checkAboutUs();
    }

    @Then("User is directed to AboutUs page")
    public void userIsDirectedToAboutUsPage() {
        home.validateAboutUs();
    }

    @When("User clicks on Accessibility tab")
    public void userClicksOnAccessibilityTab() {
        home.checkAccessibility();
    }

    @Then("User is directed to Accessibility page")
    public void userIsDirectedToAccessibilityPage() {
        home.validateAccessibility();
    }

    @When("User clicks on Legal tab")
    public void userClicksOnLegalTab() {
        home.checkLegal();
    }

    @Then("User is directed to Legal page")
    public void userIsDirectedToLegalPage() {
        home.validateLegal();
    }

    @When("User clicks on Privacy tab")
    public void userClicksOnPrivacyTab() {
        home.checkPrivacy();
    }

    @Then("User is directed to Privacy page")
    public void userIsDirectedToPrivacyPage() {
        home.validatePrivacy();
    }


    @And("User clicks on sign in tab")
    public void userClicksOnSignInTab() throws InterruptedException {
        home.clickSignInButton();
    }


    @And("selects Plan Through You Employer?")
    public void selectsPlanThroughYouEmployer() throws InterruptedException {
//        home.clickMyuhcSignIn();
    }

    @And("clicks signin button")
    public void clicksSigninButton() {
        home.clickMyuhcSignInButton();
    }

    @When("User enters {string} in user name box")
    public void userEntersInUserNameBox(String x) {
        home.insertMyuhcUserName(x);
    }

    @And("enters {string} in password box")
    public void entersInPasswordBox(String y) {
        home.insertMyuhcPassword(y);
    }

    @And("User clicks on remember me check box")
    public void userClicksOnRememberMeCheckBox() {
        home.checkMyuhcRememberMeCheckBox();
    }

    @And("finally clicks Signin button")
    public void finallyClicksSigninButton() throws InterruptedException {
        home.clickMyuhcSignInSubmitButton();
        sleepFor(5);
    }

    @Then("User validae signin error message")
    public void userValidaeSigninErrorMessage() {
        home.validateMyuhcSigninError();
    }


    @And("User goes to myuhc page from signin tab")
    public void userGoesToMyuhcPageFromSigninTab() throws InterruptedException {
        home.clickSignInButton();
    }

    @And("User clicks on registernow tab")
    public void userClicksOnRegisternowTab() {
        home.clickRegisterNowButton();

    }

    @When("User clicks Social Security Number radio button")
    public void userClicksSocialSecurityNumberRadioButton() throws InterruptedException {
        home.clickSSNRadioButton();
        sleepFor(5);
    }

    @And("insarts {string}, {string}, {string}, {string}, {string} and {string}")
    public void insartsAnd(String firstName, String lastName, String socialSecurityNumber, String zip, String birthDate, String birthYear) throws InterruptedException {
        home.insertRegistratinInformation(firstName, lastName, socialSecurityNumber, zip, birthDate, birthYear);
    }

    @And("selects birth month")
    public void selectsBirthMonth() {
        home.selectBirthMonth();
    }

    @And("clicks continue button")
    public void clicksContinueButton() throws InterruptedException {
        sleepFor(5);
        home.clickMyuhcRegistrationSubmitButton();
        sleepFor(8);
    }

    @Then("User validae registration error message")
    public void userValidaeRegistrationErrorMessage() {
        home.validateMyuhcRegistrationError();
    }



}
