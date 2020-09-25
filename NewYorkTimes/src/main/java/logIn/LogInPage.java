package logIn;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static logIn.LogInPageWebElements.*;

public class LogInPage extends CommonAPI {
    @FindBy(how = How.XPATH,using = logInFunctionXP)
    public WebElement logInFunction;
    @FindBy(how = How.XPATH,using = emailFieldXP)
    public WebElement emailField;
    @FindBy(how = How.XPATH,using = passWordFieldXP)
    public WebElement passWorldField;
    @FindBy(how = How.CLASS_NAME,using = logInButtonClass)
    public WebElement logInButton;
    @FindBy(how = How.XPATH,using = fakeLogInValidationXP)
    public WebElement fakeLogInValidation;

    public void setLogInFunction(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=fakeLogInValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"*************test failed**************");

    }
}
