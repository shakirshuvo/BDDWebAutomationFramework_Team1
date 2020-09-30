package stepDefinitions;

import base.CommonAPI;
import home.HomePage;
import io.cucumber.java.*;
import io.cucumber.java.en.*;

import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static home.HomePageWebElements.*;

public class HomeStepDefinition extends CommonAPI {

    static HomePage homePage;
    @BeforeStep
    public static void getInit(){
        homePage= PageFactory.initElements(driver, HomePage.class);
    }
    @After
    public void closeBrowser(){
        cleanUp();
    }

    @Given("I am on Bank of America Homepage")
    public void i_am_on_bank_of_america_homepage() throws IOException {
        openBrowser("https://www.bankofamerica.com/");
    }

    @When("I click on enroll button")
    public void i_click_on_enroll_button() {
        clickOnElement(enrollWebElementByCss);
    }

    @When("I enter invalid six digits account number in card\\/account box")
    public void i_enter_invalid_six_digits_account_number_in_card_account_box() {
        typeOnElement(cardOrAccountWebElementFieldByXpath, "123456");

    }

    @When("I enter invalid social security number in social security box")
    public void i_enter_invalid_social_security_number_in_social_security_box() {
        typeOnElement(ssnWebElementFieldByXpath, "123456789");

    }
    @When("I click on continue button")
    public void i_click_on_continue_button() {
        clickOnElement(continueButtonById);
    }

    @Then("I validate the test by the error message {string}")
    public void i_validate_the_test_by_the_error_message(String string) {
        homePage.validateElementIsDisplayed(validateByErrorMessageByXpath);

    }

    @When("I click on checking button")
    public void i_click_on_checking_button() {
        homePage.clickOnElement(checkingWebElementCSS);
    }

    @When("I click on saving button")
    public void i_click_on_saving_button() {
        homePage.clickOnElement(savingWebElementCSS);
    }

    @When("I click on CreditCard button")
    public void i_click_on_credit_card_button() {
       homePage.clickOnElement(creditCardsWebElementsCSS);
    }

    @When("I click on Home Loans button")
    public void i_click_on_home_loans_button() {
        homePage.clickOnElement(homeLoansWebElementsCSS);
    }

    @When("I click on Auto Loans button")
    public void i_click_on_auto_loans_button() {
        homePage.clickOnElement(autoLoansWebElementsCSS);
    }

    @When("I click on Investing button")
    public void i_click_on_investing_button() {
        homePage.clickOnElement(investingWebElementsCSS);
    }

    @When("I click on Better Money button")
    public void i_click_on_better_money_button() {
        homePage.clickOnElement(betterMoneyWebElementsCSS);
    }

    @When("I click on Small Business button")
    public void i_click_on_small_business_button() {
        homePage.clickOnElement(smallBusinessWebElementsID);
    }

    @When("I click on Wealth Management button")
    public void i_click_on_wealth_management_button() {
        homePage.clickOnElement(wealthManagementWebElementsXPATH);
    }


//    @When("I click on Business And Institutions button")
//    public void i_click_on_business_and_institutions_button() {
//        homePage.clickOnElement(businessAndInstitutionsWebElementsCSS);
//    }
    @When("I click on Business and Institutions button")
    public void iClickOnBusinessAndInstitutionsButton() {
        homePage.clickOnElement(businessAndInstitutionsWebElementsCSS);

    }

    @When("I click on Security button")
    public void i_click_on_security_button() {
        homePage.clickOnElement(securityWebElementsID);
    }

    @When("I click on About Us button")
    public void i_click_on_about_us_button() {
        homePage.clickOnElement(aboutUsWebElementsCSS);
    }

    @When("I click on En Espanol button")
    public void i_click_on_en_spanol_button() {
        homePage.clickOnElement(enEspanolWebElementsCSS);
    }

    @When("I click on Contact Us button")
    public void i_click_on_contact_us_button() {
        homePage.clickOnElement(contactUsWebElementsCSS);
    }

    @When("I click on Help button")
    public void i_click_on_help_button() {
        homePage.clickOnElement(helpWebElementsCSS);
    }

    @When("I click on Find Closest Location button")
    public void i_click_on_find_closest_location_loans_button() {
        homePage.clickOnElement(findClosestLocationWebElementsID);
    }

    @When("I click on Schedule Appointment button")
    public void i_click_on_schedule_appointment_button() {
        homePage.clickOnElement(scheduleAppointmentWebElementsID);
    }


    @When("I click on Deals All Day button")
    public void i_click_on_deals_all_day_button() {
        homePage.clickOnElement(dealsAllDayWebElementsCSS);
    }

    @When("I click on Checking With Right Features button")
    public void i_click_on_checking_with_right_features_loans_button() {
        homePage.clickOnElement(checkingWithRightFeaturesWebElementsCSS);
    }

//    @Then("I validate the test by checking with right features is clickable")
//    public void i_validate_the_test_by_checking_with_right_features_is_clickable() {
//        homePage.verifyCheckingWithRightFeatures();
//    }
    @When("I click on Life Services button")
    public void i_click_on_life_services_button() {
        homePage.clickOnElement(lifeServicesWebElementsID);
    }


//    @Given("I click on Open Now button from bank of America Homepage")
//    public void i_click_on_open_now_button_from_bank_of_america_homepage() {
//    homePage.clickOnElementByClass(openCheckingAccountByClass);
//    }

    @When("I click on Open Now under Bank of America Advantage SafeBalance Banking® tab")
    public void i_click_on_open_now_under_bank_of_america_advantage_safe_balance_banking_tab() {
    clickOnElementByID(advantageSafeBalanceByID);
    }

    @Then("I verify the page by page url")
    public void i_verify_the_page_by_page_url() {
    validateByURL("https://www.bankofamerica.com/deposits/checking/advantage-safebalance-banking-account/before-you-apply/");
    }
//    @Given("I click on Open Now button from Homepage")
//    public void i_click_on_open_now_button_from_homepage() {
//    homePage.clickOnElementByClass(openCheckingAccountByClass);
//    }

    @When("I scroll down And a new popup window appeared")
    public void i_scroll_down_and_a_new_popup_window_appeared() {
    scrollUpDownByHeight();
    }

    @When("I click on Open Now under Bank of America Advantage Plus Banking® tab")
    public void i_click_on_open_now_under_bank_of_america_advantage_plus_banking_tab() {
    clickOnElementByID(advantagePlusByID);
    }

    @Then("A new window appears")
    public void a_new_window_appears() {
    handleNewTab(driver);
    }

    @Then("I verify the page by page its url")
    public void i_verify_the_page_by_page_its_url() {
    validateByURL("https://www.bankofamerica.com/deposits/checking/advantage-plus-banking-account/before-you-apply/");
    }
//    @Given("I click on Open Now button from bank of America Home")
//    public void i_click_on_open_now_button_from_bank_of_america_home() {
//    homePage.clickOnElementByClass(openCheckingAccountByClass);
//    }


    @When("I click on Open Now under Bank of America Advantage Relationship Banking® tab")
    public void i_click_on_open_now_under_bank_of_america_advantage_relationship_banking_tab() {
        clickOnElementByID(advantageRelationshipByID);
    }


    @Then("I verify that page by page url")
    public void i_verify_that_page_by_page_url() {
    validateByURL("https://www.bankofamerica.com/deposits/checking/advantage-relationship-banking-account/before-you-apply/");
    }


    @And("I enter invalid six digits account number {string} in card account box")
    public void iEnterInvalidSixDigitsAccountNumberInCardAccountBox(String accountNumber) {
        typeOnElementByXpath(cardOrAccountWebElementFieldByXpath, accountNumber);
    }

    @Then("I validate the test by {string}  is clickable")
    public void iValidateTheTestByIsClickable(String arg0) {
        homePage.verifyCheckingWithRightFeatures();
    }

    @Given("I click on Open Now button from bank of America Homepage")
    public void iClickOnOpenNowButtonFromBankOfAmericaHomepage() {
        clickOnElementByClass(openAccountByClass);
    }

    @Given("I click on Open Now button from Homepage")
    public void iClickOnOpenNowButtonFromHomepage() {
        clickOnElementByClass(openAccountByClass);
    }

    @Given("I click on Open Now button from bank of America Home")
    public void iClickOnOpenNowButtonFromBankOfAmericaHome() {
        clickOnElementByClass(openAccountByClass);
    }

    @When("I clicking on HomeLoans button")
    public void iClickingOnHomeLoansButton() {
        clickOnElementByCSS(homeLoansWebElementsCSS);
    }

    @Then("I click on Mortgage tab")
    public void i_click_on_mortgage_tab() {
        clickOnElementByID(mortgageByID);
    }

    @When("I click on Apply Now")
    public void i_click_on_apply_now() {
     clickOnElementByID(mortgageApplyByID);
    }

    @Then("I validate the page by url")
    public void i_validate_the_page_by_url() {
       validateByURL("https://secure.bankofamerica.com/digital-mortgage-application/landing/#landing");
    }

    @When("I click on the Home Loans button")
    public void i_click_on_the_home_loans_button() {
      clickOnElementByCSS(homeLoansWebElementsCSS);
    }

    @When("I click on Refinance tab")
    public void i_click_on_refinance_tab() {
        clickOnElementByID(refinanceByID);
    }

    @Then("I validate the page by text")
    public void i_validate_the_page_by_text() {
        validateByText(validateMortgageRefinanceByCSS,"Mortgage Refinance");
    }

    @When("I bring my cursor upon home loans and click on it")
    public void i_bring_my_cursor_upon_home_loans_and_click_on_it() {
    clickOnElementByCSS(homeLoansWebElementsCSS);
    }

    @When("I click on Home Equity tab")
    public void i_click_on_home_equity_tab() {
    homePage.clickOnElementByID(homeEquityByID);
    }

    @Then("I validate that page by text")
    public void i_validate_that_page_by_text() {
    validateByText(validateHomeEquityByXpath, "Make the equity in your home work for you");
    }

    @When("I bring my cursor upon Credit Cards and click on it{int}")
    public void iBringMyCursorUponCreditCardsAndClickOnIt(int arg0) { clickOnElementByCSS(creditCardsWebElementsCSS);

    }
    @And("I click on Cash Rewards tab")
    public void iClickOnCashRewardsTab() {
    clickOnElementByID(cashRewardsCreditCardsByID);
    }
    @Then("I validate that page by title1")
    public void iValidateThatPageByTitle1() {
        validateByTitle("Cash Back Credit Cards & Cash Rewards Credit Cards");
    }

    @And("I click on Travel and Airline Rewards tab")
    public void iClickOnTravelAndAirlineRewardsTab() {
        clickOnElementByID(travelRewardsCardsByID);
    }
    @Then("I validate that page by title2")
    public void iValidateThatPageByTitle2() {
        validateByTitle("Travel Rewards Credit Cards: Cruise Line & Air Miles Credit Cards");
    }
    @And("I click on Lower Interest Rate Card tab")
    public void iClickOnLowerInterestRateCardTab() {
    clickOnElementByID(lowerInterestCardsByID);
    }
    @Then("I validate that page by title3")
    public void iValidateThatPageByTitle3() {
        validateByTitle("Lower Interest Rate Credit Cards from Bank of America");
    }
    @And("I click on Points Rewards Credit Cards tab")
    public void iClickOnPointsRewardsCreditCardsTab() {
    clickOnElementByID(pointsRewardsCardsByID);
    }
    @Then("I validate that page by title4")
    public void iValidateThatPageByTitle4() {
        validateByTitle("Rewards Credit Cards from Bank of America");
    }
    @And("I click on Cards to Build or Rebuild Credit tab")
    public void iClickOnCardsToBuildOrRebuildCreditTab() {
    clickOnElementByID(buildCreditCardsByID);
    }
    @Then("I validate that page by title5")
    public void iValidateThatPageByTitle5() {
        validateByTitle("Credit Cards to Help Build or Rebuild Credit");
    }
    @And("I click on Cards for students tab")
    public void iClickOnCardsForStudentsTab() {
    clickOnElementByID(cardsForStudentsByID);
    }
    @Then("I validate that page by title6")
    public void iValidateThatPageByTitle6() {
    validateByTitle("Credit Cards for College Students from Bank of America");
    }
    @And("I click on Get Mobile App tab")
    public void iClickOnGetMobileAppTab() {
    clickOnElementByID(getMobileAppByID);
    }

    @Then("I click on Get the App")
    public void iClickOnGetTheApp() {
    clickOnElementByID(getTheAppByID);
    }

    @And("I validate that page by text{int}")
    public void iValidateThatPageByText(int arg0) {
        validateByText(validateGetAppByXpath, "Get the Mobile Banking app");
    }
    @And("I click on  Manage Credit Cards Account tab")
    public void iClickOnManageCreditCardsAccountTab() {
    clickOnElementByID(manageCreditCardAccountByID);
    }

    @Then("I validate that page by its text")
    public void iValidateThatPageByItsText() {
        validateByText(validateManageCreditCardByID, "Manage Your Credit Card Account");
    }

    @And("I click on  Find a Credit Card quickly tab")
    public void iClickOnFindACreditCardQuicklyTab() {
        clickOnElementByXpath(findCreditCardQuicklyByXpath);
    }

    @Then("I validate Find credit card page by its text")
    public void iValidateFindCreditCardPageByItsText() {
        validateByText(validateFindCreditCardByCSS, "Check for customized offers");
    }

    @When("I bring my cursor upon Auto Loans and click on it{int}")
    public void iBringMyCursorUponAutoLoansAndClickOnIt(int arg0) {
        clickOnElementByCSS(autoLoansWebElementsCSS);
    }

    @And("I click on  Apply Now tab in here")
    public void iClickOnApplyNowTabInHere() {
        clickOnElementByID(applyNowUnderAutoLoansByID);
    }

    @When("I click on apply now from new link")
    public void iClickOnApplyNowFromNewLink() {
        clickOnElementByID(applyNowUnderNewPageByID);
    }

    @Then("I validate that new page by its title")
    public void iValidateThatNewPageByItsTitle() {
        validateByTitle("Your Application");
    }

    @And("I click on  Auto loans rate Account tab")
    public void iClickOnAutoLoansRateAccountTab() {
    clickOnElementByID(autoLoanRatesByID);
    }

    @Then("I validate that new loan rate page by its title")
    public void iValidateThatNewLoanRatePageByItsTitle() {
    validateByTitle("Auto Loan Rates from Bank of America");
    }

    @And("I click on  Auto Loan Calculator Account tab")
    public void iClickOnAutoLoanCalculatorAccountTab() {
    clickOnElementByID(autoLoanApplicationByID);
    }

    @Then("I clear input in total loan amount field and type {int} in it")
    public void iClearInputInTotalLoanAmountFieldAndTypeInIt(int arg0) {
    clearInputFieldID(autoLoanTotalLoanAmountByID);
    typeOnInputField(autoLoanTotalLoanAmountByID, "15000");
    }

    @And("I clear input in terms months field and type {int} in it")
    public void iClearInputInTermsMonthsFieldAndTypeInIt(int arg0) {
    clearInputFieldID(autoLoanTermsInMonthsByID);
    typeOnInputField(autoLoanTermsInMonthsByID, "36");
    }

    @And("I clear input in interest rates field and type {int} in it")
    public void iClearInputInInterestRatesFieldAndTypeInIt(int arg0) {
    clearInputFieldID(autoLoanInterestRateFieldByID);
    typeOnInputField(autoLoanInterestRateFieldByID,"5");
    }

    @When("I click on calculate payment button")
    public void iClickOnCalculatePaymentButton() {
    clickOnElementByID(autoLoanCalculatePaymentByID);
    }

    @Then("I validate by text")
    public void iValidateByText() {
        validateByText(validateLoanCalculatorByID, "450");
    }


    @When("I bring my cursor upon Credit Cards and click on it")
    public void iBringMyCursorUponCreditCardsAndClickOnIt() {
        clickOnElementByCSS(creditCardsWebElementsCSS);
    }

    @Then("I validate that page by title Cash Rewards")
    public void iValidateThatPageByTitleCashRewards() {
        validateByTitle("Cash Back Credit Cards & Cash Rewards Credit Cards");
    }

    @Then("I validate that page by title Travel Rewards")
    public void iValidateThatPageByTitleTravelRewards() {
    validateByTitle("Travel Rewards Credit Cards: Cruise Line & Air Miles Credit Cards");
    }

    @Then("I validate that page by title Lower Interest")
    public void iValidateThatPageByTitleLowerInterest() {
    validateByTitle("Lower Interest Rate Credit Cards from Bank of America");
    }


    @Then("I validate that page by title Points Rewards")
    public void iValidateThatPageByTitlePointsRewards() {
    validateByTitle("Rewards Credit Cards from Bank of America");
    }

    @Then("I validate that page by title Cards to build")
    public void iValidateThatPageByTitleCardsToBuild() {
    validateByTitle("Credit Cards to Help Build or Rebuild Credit");
    }

    @Then("I validate that page by title Cards for Students")
    public void iValidateThatPageByTitleCardsForStudents() {
        validateByTitle("Credit Cards for College Students from Bank of America");
    }

    @When("I bring my cursor upon Auto Loans and click on it")
    public void iBringMyCursorUponAutoLoansAndClickOnIt() {
        clickOnElement(autoLoansWebElementsCSS);
    }

    @Then("I validate the test by text a")
    public void iValidateTheTestByTextA() {
        homePage.validateElementIsDisplayed(validateCheckingByTextByXpath);
    }

    @Then("I validate the page by text b")
    public void iValidateThePageByTextB() {
        homePage.validateElementIsDisplayed(validateSavingByTextByXpath);
    }

    @Then("I validate the page by text c")
    public void iValidateThePageByTextC() {
        homePage.validateElementIsDisplayed(validateCreditCardsByTextByXpath);
    }

    @Then("I validate the page by text d")
    public void iValidateThePageByTextD() {
        homePage.validateElementIsDisplayed(validateHomeLoansByTextByXpath);
    }

    @Then("I validate the page by text e")
    public void iValidateThePageByTextE() {
        homePage.validateElementIsDisplayed(validateAutoLoansByTextByXpath);
    }

    @Then("I validate the page by text f")
    public void iValidateThePageByTextF() {
        homePage.validateElementIsDisplayed(validateInvestingByTextByXpath);
    }

    @Then("I validate the page by text g")
    public void iValidateThePageByTextG() {
        homePage.validateElementIsDisplayed(validateBetterMoneyByTextByXpath);
    }

    @Then("I validate the page by title h")
    public void iValidateThePageByTitleH() {
        validateByTitle("Small Business Banking, Credit Cards & Loans – Bank of America");
    }

    @Then("I validate the page by title i")
    public void iValidateThePageByTitleI() {
        validateByTitle("Wealth Management Services & Wealth Planning from Bank of America | Merrill Lynch");
    }

    @Then("I validate the page by title j")
    public void iValidateThePageByTitleJ() {
        validateByTitle("Bank of America Merrill Lynch is Now Bank of America & BofA Securities");
    }

    @Then("I validate the page by title k")
    public void iValidateThePageByTitleK() {
        validateByTitle("Privacy & Security Center at Bank of America");
    }

    @Then("I validate the page by title l")
    public void iValidateThePageByTitleL() {
        validateByTitle("About Bank of America- Our People, Our Passion, Our Purpose");
    }

    @Then("I validate the page by page url m")
    public void iValidateThePageByPageUrlM() {
        validateByURL("https://www.bankofamerica.com/es/");
    }

    @Then("I validate the page by page url n")
    public void iValidateThePageByPageUrlN() {
        validateByURL("https://www.bankofamerica.com/customer-service/contact-us/?request_locale=en_US");
    }

    @Then("I validate the page by page url o")
    public void iValidateThePageByPageUrlO() {
        validateByURL("https://www.bankofamerica.com/help/overview/?request_locale=en_US");
    }

    @Then("I validate the page by page url p")
    public void iValidateThePageByPageUrlP() {
        validateByURL("https://locators.bankofamerica.com/");
    }

    @Then("I validate the page by page url q")
    public void iValidateThePageByPageUrlQ() {
        validateByURL("https://secure.bankofamerica.com/secure-mycommunications/public/appointments/?marketingCode=NEWHP_ECHMPG");
    }

    @Then("I validate the page by page url r")
    public void iValidateThePageByPageUrlR() {
        validateByURL("https://secure.bankofamerica.com/login/sign-in/signOnV2Screen.go?reason=cbdavaialablecash&SortedBy=ExpiringSoon&cm_sp=OLB-BankAmeriDeals-Offers-_-BankAmeriDeals-_-DZT1QUOU01_Highlights_NH_BAMD_IconUpdate_G3_dealsAllDayHLCta&channel=desktop&screen=Deals:Entry&version=7.1.0");
    }

    @Then("I validate the test by text Expect more from your checking account s")
    public void iValidateTheTestByTextExpectMoreFromYourCheckingAccountS() {
        homePage.validateElementIsDisplayed(validateCheckingWithRightFeaturesByTextByClass);
    }

    @Then("I validate test by life services title t")
    public void iValidateTestByLifeServicesTitleT() {
        validateByTitle("Support Before, During and After Financial Life Events");
    }
}


