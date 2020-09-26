package home;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static home.HomePageWebElements.*;


public class HomePage extends CommonAPI {


    public void validateElementIsDisplayed(String element){
        driver.findElement(By.xpath(element)).isDisplayed();
        driver.findElement(By.cssSelector(element)).isDisplayed();
        driver.findElement(By.id(element)).isDisplayed();
        driver.findElement(By.className(element)).isDisplayed();
        driver.findElement(By.linkText(element)).isDisplayed();
    }

    public WebElement checking;

    //public void clickChecking(){
       // checking.click();
    //}

    public boolean checkingIsEnable(){
        return checking.isEnabled();
    }

    public void verifyClickChecking(){
        Assert.assertTrue(checkingIsEnable());
    }
    public WebElement saving;

//    public void clickSaving(){
//        saving.click();
//    }
    public boolean savingIsEnable(){
        return saving.isEnabled();
    }

    public void verifyClickSaving(){
        Assert.assertTrue(checkingIsEnable());
    }

    public WebElement creditCards;

//    public void clickCreditCards(){
//        creditCards.click();
//    }
    public boolean creditCardsIsEnable(){
        return creditCards.isEnabled();
    }
    public void verifyClickCreditCards(){
        Assert.assertTrue(creditCardsIsEnable());
    }
    public WebElement homeLoans;
//    public void clickHomeLoans(){
//        homeLoans.click();
//    }
    public boolean homeLoansIsEnable(){
        return homeLoans.isEnabled();
    }
    public void verifyHomeLoans(){
        Assert.assertTrue(homeLoansIsEnable());
    }
    public WebElement autoLoans;
//    public void clickAutoLoans(){
//        autoLoans.click();
//    }
    public boolean autoLoansIsEnable(){
        return autoLoans.isEnabled();
    }
    public void verifyAutoLoans(){
        Assert.assertTrue(autoLoansIsEnable());
    }
    public WebElement investing;
//    public void clickInvesting(){
//        investing.click();
//    }
    public boolean investingIsEnable(){
        return investing.isEnabled();
    }
    public void verifyInvesting(){
        Assert.assertTrue(investingIsEnable());
    }
    public WebElement betterMoney;
//    public void clickBetterMoney(){
//        betterMoney.click();
//    }
    public boolean betterMoneyIsEnable(){
        return betterMoney.isEnabled();
    }
    public void verifyBetterMoney(){
        Assert.assertTrue(betterMoneyIsEnable());
    }
    public WebElement smallBusiness;
//    public void clickSmallBusiness(){
//        smallBusiness.click();
//    }
    public boolean smallBusinessIsEnable(){
        return smallBusiness.isEnabled();
    }
    public void verifySmallBusiness(){
        Assert.assertTrue(smallBusinessIsEnable());
    }
    public WebElement wealthManagement;
//    public void clickWealthManagement(){
//        wealthManagement.click();
//    }
    public boolean wealthManagementIsEnable(){
        return wealthManagement.isEnabled();
    }
    public void verifyWealthManagement(){
        Assert.assertTrue(wealthManagementIsEnable());
    }
    public WebElement businessAndInstitutions;
//    public void clickBusinessAndInstitutions(){
//        businessAndInstitutions.click();
//    }
    public boolean businessAndInstitutionsIsEnable(){
        return businessAndInstitutions.isEnabled();
    }
    public void verifyBusinessAndInstitutions(){
        Assert.assertTrue(businessAndInstitutionsIsEnable());
    }
    public WebElement security;
//    public void clickSecurity(){
//        security.click();
//    }
    public boolean securityIsEnable(){
        return security.isEnabled();
    }
    public void verifySecurity(){
        Assert.assertTrue(securityIsEnable());
    }
    public WebElement aboutUs;
//    public void clickAboutUs(){
//        aboutUs.click();
//    }
    public boolean aboutUsIsEnable(){
        return aboutUs.isEnabled();
    }
    public void verifyAboutUs(){
        Assert.assertTrue(aboutUsIsEnable());
    }
    public WebElement enEspanol;
//    public void clickEnEspanol(){
//        enEspanol.click();
//    }
    public boolean enEspanolIsEnable(){
        return enEspanol.isEnabled();
    }
    public void verifyEnEspanol(){
        Assert.assertTrue(enEspanolIsEnable());
    }
    public WebElement contactUs;
//    public void clickContactUs(){
//        contactUs.click();
//    }
    public boolean contactUsIsEnable(){
        return contactUs.isEnabled();
    }
    public void verifyContactUs(){
        Assert.assertTrue(contactUsIsEnable());
    }
    public WebElement help;
//    public void clickHelp(){
//        help.click();
//    }
    public boolean helpIsEnable(){
        return help.isEnabled();
    }
    public void verifyHelp(){
        Assert.assertTrue(helpIsEnable());
    }
    public WebElement findClosestLocation;
//    public void clickFindClosest(){
//        findClosestLocation.click();
//    }
    public boolean findClosestLocationIsEnable(){
        return findClosestLocation.isEnabled();
    }
    public void verifyFindClosestLocation(){
        Assert.assertTrue(helpIsEnable());
    }
    public WebElement scheduleAppointment;
//    public void clickScheduleAppointment(){
//        scheduleAppointment.click();
//    }
    public boolean scheduleAppointmentIsEnable(){
        return scheduleAppointment.isEnabled();
    }
    public void verifyScheduleAppointment(){
        Assert.assertTrue(scheduleAppointmentIsEnable());
    }
    public WebElement dealsAllDay;
//    public void clickDealsAllDay(){
//        dealsAllDay.click();
//    }
    public boolean dealsAllDayIsEnable(){
        return dealsAllDay.isEnabled();
    }
    public void verifyDealsAllDay(){
        Assert.assertTrue(dealsAllDayIsEnable());
    }
    public WebElement checkingWithRightFeatures;
//    public void clickcheckingWithRightFeatures(){
//        checkingWithRightFeatures.click();
//    }
    public boolean checkingWithRightFeaturesIsEnable(){
        return checkingWithRightFeatures.isEnabled();
    }
    public void verifyCheckingWithRightFeatures(){
        Assert.assertTrue(checkingWithRightFeaturesIsEnable());
    }
    public WebElement lifeServices;
//    public void clickLifeServices(){
//        lifeServices.click();
//    }
    public boolean lifeServicesIsEnable(){
        return lifeServices.isEnabled();
    }
    public void verifyLifeServices(){
        Assert.assertTrue(lifeServicesIsEnable());
    }
}
