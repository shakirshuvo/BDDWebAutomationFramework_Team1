package search;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static search.SearchWebElements.*;

public class SearchPage extends CommonAPI {

    @FindBy(how = How.XPATH,using = searchButtonXP)
    public WebElement searchButton;
    @FindBy(how = How.XPATH,using = searchButtonValidationXP)
    public WebElement searchButtonValidation;
    @FindBy(how = How.XPATH,using = searchFieldWebElementXP)
    public WebElement searchFieldWebElement;

    public void searchPageVerification(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=searchButtonValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"text doesn't match");
    }

}
