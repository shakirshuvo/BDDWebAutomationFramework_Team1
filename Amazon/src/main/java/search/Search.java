package search;

import base.CommonAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static search.SearchWebElements.*;

public class Search extends CommonAPI {

    @FindBy(how = How.XPATH, using = searchTextXpathWebElement)
    public WebElement searchText;

    public void validateSearchText(String expectedResult) {
        String actualResult = searchText.getText();
        Assert.assertEquals("search.Search Item not match", expectedResult, actualResult);
    }

}