package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static home.HomeWebElementsS.*;
import static org.apache.xmlbeans.XmlBeans.getTitle;

public class HomeS extends CommonAPI {

    String actual;
    String expected;
    public void waitTimeForPageLoad(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(7000, TimeUnit.MILLISECONDS);
    }

//    @FindBy(how = How.ID, using = searchBoxById)
//    public WebElement searchBox;
//
//    public void clickSearchBox(){
//        searchBox.click();
//    }
//
//    public boolean searchBoxIsEnable(){
//        return searchBox.isEnabled();
//    }
//
//    public void verifyClickSearchBox(){
//        Assert.assertTrue(searchBoxIsEnable());
//    }
    public void validateWorld(){
        waitTimeForPageLoad();
        validateByTitle("World News - The New York Times");
    }
    public void validateUs(){
        waitTimeForPageLoad();
        validateByTitle("U.S. News - The New York Times");
    }
    public void validatePolitics(){
        validateByTitle("Politics - The New York Times");
    }
    public void validateNyNews(){
        validateByTitle("New York - The New York Times");
    }
    public void validateBusinessNews(){
        waitTimeForPageLoad();
        validateByTitle("Business - The New York Times");
    }
    public void validateOpinion(){
        waitTimeForPageLoad();
        validateByTitle("Opinion - The New York Times");
    }
    public void validateTechNews(){
        validateByTitle("Technology - The New York Times");
    }
    public void validateScienceNews(){
        validateByTitle("Science - The New York Times");
    }
    public void validateHealthNews(){
        validateByTitle("Health - The New York Times");
    }
    public void validateSportsNews(){
        validateByTitle("Sports - The New York Times");
    }
    public void validateArtsNews(){
        validateByTitle("Arts - The New York Times");
    }
    public void validateBooksNews(){
        waitTimeForPageLoad();
        validateByTitle("Books - The New York Times");
    }
    public void validateStyleNews(){
        validateByTitle("Style - The New York Times");
    }
    public void validateFoodNews(){
        validateByTitle("Food - The New York Times");
    }
    public void validateTravelNews(){
        waitTimeForPageLoad();
        validateByTitle("Travel - The New York Times");
    }
    public void validateMagazine(){
        waitTimeForPageLoad();
        validateByTitle("The New York Times Magazine - The New York Times");
    }
    public void validate_t_Magazine(){
        waitTimeForPageLoad();
        validateByTitle("T Magazine - The New York Times");
    }
    public void validateRealEstate(){
        waitTimeForPageLoad();
        validateByTitle("Real Estate - The New York Times");
    }
    public void validateVideoWebElements(){
        waitTimeForPageLoad();
        validateByTitle("Video - The New York Times");
    }
    public void validateTodaysPaper(){
        validateByText(validateTodaysPaperTextByXpath, "Today’s Paper");
    }
    public WebElement toggleMenuChecking;
    public void toggleMenuCheck(){
        clickOnElement(toggleMenuCheckingById);
    }
    public boolean toggleMenuIsEnable(){
        return toggleMenuChecking.isEnabled();
    }
    public void validateClickToggleMenu(){
        Assert.assertTrue(toggleMenuIsEnable());
    }

    public void validateLogInButton(){
        waitTimeForPageLoad();
        validateByTitle("Log in - The New York Times");
    }
    public void validateSpanishLanguage(){
        waitTimeForPageLoad();
        validateByURL("The New York Times en Español - The New York Times");
    }
    public void validateChineseLanguage(){
        waitTimeForPageLoad();
        validateByTitle("纽约时报中文网 国际纵览");
    }
    public void validateSubscribeNow(){
        waitTimeForPageLoad();
        validateByURL("https://www.nytimes.com/subscription?campaignId=79FKF&redirect_uri=https%3A%2F%2Fwww.nytimes.com%2F");
    }
}
