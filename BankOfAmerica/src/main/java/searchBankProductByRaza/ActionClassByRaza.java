package searchBankProductByRaza;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;
import static searchBankProductByRaza.ElementsBOA.searchBoxLocator;
import static searchBankProductByRaza.ElementsBOA.searchValidationLocator;
public class ActionClassByRaza extends CommonAPI {
    static String expectedResult;
    static String actualResult;




    public static void searchProduct() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        typeOnElementNEnter(searchBoxLocator, "Checking Accounts", driver);

    }

    public static void validateSearchItems(String expectedResult) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        expectedResult = "Checking Accounts";
        actualResult = getTextByXpath(searchValidationLocator);
        System.out.println("Actual Text  ="+ actualResult);
        System.out.println("Expected Text  ="+ expectedResult);
        Assert.assertEquals(actualResult,expectedResult,"Test Failed");

    }

}
