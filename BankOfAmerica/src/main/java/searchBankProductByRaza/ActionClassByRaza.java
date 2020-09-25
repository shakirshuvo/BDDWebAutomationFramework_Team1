package searchBankProductByRaza;

import base.CommonAPI;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;
import static searchBankProductByRaza.ElementsBOARaza.searchBoxLocator;
import static searchBankProductByRaza.ElementsBOARaza.searchValidationLocator;
public class ActionClassByRaza extends CommonAPI {
    static String expectedResult;
    static String actualResult;

    public static void searchProduct() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        typeOnElementNEnter(searchBoxLocator, "Checking Accounts", driver);

    }

    public static void validateSearchItems(String expectedResult) throws InterruptedException {
        sleepFor(3);
        actualResult = getTextByXpath(searchValidationLocator);
        System.out.println("Actual Text  ="+ actualResult);
        System.out.println("Expected Text  ="+ expectedResult);
        Assert.assertEquals(actualResult,expectedResult,"Test Failed");

    }

}
