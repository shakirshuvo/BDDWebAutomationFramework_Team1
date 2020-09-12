package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static home.HomeWebElements.*;
import static org.apache.xmlbeans.XmlBeans.getTitle;

public class Home extends CommonAPI {

    String actual;
    String expected;

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
        actual= driver.getTitle();
        System.out.println(actual);
        expected=getTitle();
        Assert.assertEquals(actual, expected, "failed");
    }
    public void validateUs(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected=getTitle();
        Assert.assertEquals(actual, expected, "failed");
    }
    public void validatePolitics(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected=getTitle();
        Assert.assertEquals(actual, expected, "failed");
    }
    public void validateNyNews(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected=getTitle();
        Assert.assertEquals(actual, expected, "failed");
    }
    public void validateBusinessNews(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected=getTitle();
        Assert.assertEquals(actual, expected, "failed");
    }
    public void validateOpinion(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected=getTitle();
        Assert.assertEquals(actual, expected, "failed");
    }
    public void validateTechNews(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected=getTitle();
        Assert.assertEquals(actual, expected, "failed");
    }
    public void validateScienceNews(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected=getTitle();
        Assert.assertEquals(actual, expected, "failed");
    }
    public void validateHealthNews(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected=getTitle();
        Assert.assertEquals(actual, expected, "failed");
    }
    public void validateSportsNews(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected=getTitle();
        Assert.assertEquals(actual, expected, "failed");
    }
    public void validateArtsNews(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected=getTitle();
        Assert.assertEquals(actual, expected, "failed");
    }
    public void validateBooksNews(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected=getTitle();
        Assert.assertEquals(actual, expected, "failed");
    }
    public void validateStyleNews(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected=getTitle();
        Assert.assertEquals(actual, expected, "failed");
    }
    public void validateFoodNews(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected=getTitle();
        Assert.assertEquals(actual, expected, "failed");
    }
    public void validateTravelNews(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected=getTitle();
        Assert.assertEquals(actual, expected, "failed");
    }
    public void validateMagazine(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected=getTitle();
        Assert.assertEquals(actual, expected, "failed");
    }
    public void validate_t_Magazine(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected=getTitle();
        Assert.assertEquals(actual, expected, "failed");
    }
    public void validateRealEstate(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected=getTitle();
        Assert.assertEquals(actual, expected, "failed");
    }
    public void validateVideoWebElements(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected=getTitle();
        Assert.assertEquals(actual, expected, "failed");
    }
    public void validateTodaysPaper(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected=getTitle();
        Assert.assertEquals(actual, expected, "failed");
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
        actual= driver.getTitle();
        System.out.println(actual);
        expected=getTitle();
        Assert.assertEquals(actual, expected, "failed");
    }
    public void validateSpanishLanguage(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected=getTitle();
        Assert.assertEquals(actual, expected, "failed");
    }
    public void validateChineseLanguage(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected=getTitle();
        Assert.assertEquals(actual, expected, "failed");
    }
    public void validateSubscribeNow(){
        actual= driver.getTitle();
        System.out.println(actual);
        expected=getTitle();
        Assert.assertEquals(actual, expected, "failed");
    }
}
