package boaHomeByMobin;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static boaHomeByMobin.BOAHomePageWebElementsByMobin.*;

public class BOAHomePageByMobin extends CommonAPI {

    // @FindBy(how = How.XPATH, using = destinationFromXPath) public WebElement destinationFrom;

    @FindBy(how = How.XPATH, using = checkingTabXPath) public WebElement checkingTab;
    @FindBy(how = How.XPATH, using = studentBankingTabXPath) public WebElement studentBankingTab;
    @FindBy(how = How.XPATH, using = savingsTabXPath) public WebElement savingsTab;
    @FindBy(how = How.XPATH, using = mobileBankingTabXPath) public WebElement mobileBankingTab;
    @FindBy(how = How.XPATH, using = creditCardTabXPath) public WebElement creditCardTab;
    @FindBy(how = How.XPATH, using = travelAndRewardCardTabXPath) public WebElement travelAndRewardCardTab;
    @FindBy(how = How.XPATH, using = investingTabXPath) public WebElement investingTab;
    @FindBy(how = How.XPATH, using = buildYourPortfolioTabXPath) public WebElement buildYourPortfolioTab;
    @FindBy(how = How.XPATH, using = betterMoneyHabbitTabXPath) public WebElement betterMoneyHabbitTab;
    @FindBy(how = How.XPATH, using = retirementBetterMoneyHabbitTabXPath) public WebElement retirementBetterMoneyHabbitTabX;
    @FindBy(how = How.XPATH, using = creditBMHTXPath) public WebElement creditBMHT;
    @FindBy(how = How.XPATH, using = debtBMHTXPath) public WebElement debtBMHT;
    @FindBy(how = How.XPATH, using = savingAndBudgetingBMHTXPath) public WebElement savingAndBudgetingBMHT;
    @FindBy(how = How.XPATH, using = homeownershipBMHTXPath) public WebElement homeownershipBMHT;
    @FindBy(how = How.XPATH, using = autoBMHTXPath) public WebElement autoBMHT;
    @FindBy(how = How.XPATH, using = retirementBMHTXPath) public WebElement retirementBMHT;
    @FindBy(how = How.XPATH, using = collegeBMHTXPath) public WebElement collegeBMHT;
    @FindBy(how = How.XPATH, using = privacyAndSecurityBMHTXPath) public WebElement privacyAndSecurityBMHT;
    @FindBy(how = How.XPATH, using = personalBankingBMHTXPath) public WebElement personalBankingBMHT;
    @FindBy(how = How.XPATH, using = taxAndIncomeBMHTXPath) public WebElement taxAndIncomeBMHT;
    @FindBy(how = How.XPATH, using = planningBMHTXPath) public WebElement planningBMHT;


//    // Action Method
//    public void checkSkyMilesDropDownTab() throws InterruptedException {
//        mouseHoverByXpath(skyMilesXPath);
//        skyMilesCruises.click();
//    }
//
//    // Validation Method
//    public void validateSkyMilesDropDownTab(){
//        String actualResult = getCurrentPageUrl();
//        String expectedResult = "https://www.";
//        Assert.assertEquals(actualResult,expectedResult,"Test failed");
//    }
    //*********************************************

    // Action Method
    public void checkCheckingTab() {
        checkingTab.click();
        studentBankingTab.click();
    }

    // Validation Method
    public void validateCheckingTab(){
        String actualResult = getCurrentPageUrl();
        String expectedResult = "https://www.bankofamerica.com/student-banking/";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkSavingsTab() {
        savingsTab.click();
        mobileBankingTab.click();
    }

    // Validation Method
    public void validateSavingsTab(){
        String actualResult = getCurrentPageUrl();
        String expectedResult = "https://www.bankofamerica.com/online-banking/mobile-and-online-banking-features/";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkCreditCardTab() {
        creditCardTab.click();
        travelAndRewardCardTab.click();
    }

    // Validation Method
    public void validateCreditCardTab(){
        String actualResult = getCurrentPageUrl();
        String expectedResult = "https://www.bankofamerica.com/credit-cards/travel-credit-cards/";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkInvestingTab() {
        investingTab.click();
        buildYourPortfolioTab.click();
    }

    // Validation Method
    public void validateInvestingTab(){
        String actualResult = getCurrentPageUrl();
        String expectedResult = "https://www.merrilledge.com/investing/online-trading?src_cd=bac_hp_nav_mesd";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************

    // Action Method
    public void checkPlanningTab() throws InterruptedException {
        sleepFor(1);
        betterMoneyHabbitTab.click();
        sleepFor(1);
        retirementBetterMoneyHabbitTabX.click();
        sleepFor(1);
        mouseHoverByXpath(creditBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(debtBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(savingAndBudgetingBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(homeownershipBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(autoBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(retirementBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(collegeBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(privacyAndSecurityBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(personalBankingBMHTXPath);
        sleepFor(3);
        mouseHoverByXpath(taxAndIncomeBMHTXPath);
        sleepFor(3);
        planningBMHT.click();
    }

    // Validation Method
    public void validatePlanningTab(){
        String actualResult = getCurrentPageUrl();
        String expectedResult = "https://bettermoneyhabits.bankofamerica.com/en/taxes-income?subTopicId=planning";
        Assert.assertEquals(actualResult,expectedResult,"Test failed");
    }
    //*********************************************


}
