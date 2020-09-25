package homeRamdane;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static homeRamdane.HomePageRamdaneWebElements.*;


public class HomePageRamdane extends CommonAPI {
    @FindBy(how = How.XPATH,using = logoXP)
    public WebElement logo;

    @FindBy(how = How.XPATH,using = bestSellerButtonXP)
    public WebElement bestSellerButton;
    @FindBy(how = How.XPATH,using = newReleaseBestSellerXP)
    public WebElement newReleaseBestSeller;
    @FindBy(how = How.ID,using = newReleaseBestSellerValidationID)
    public WebElement newReleaseBestSellerValidation;

    public void setLogo(){
        driver.manage().window().maximize();
    }

    public void setNewReleaseBestSeller(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=newReleaseBestSellerValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"*************test failed*************");
    }
}
