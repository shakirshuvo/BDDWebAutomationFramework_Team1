package home;


import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static home.HomeWebElements.*;

public class HomePage extends CommonAPI {
    @FindBy(how = How.XPATH,using = worldButtonXP)
    public WebElement worldButton;
    @FindBy(how = How.XPATH,using = worldValidationXP)
    public WebElement worldValidation;

    @FindBy(how = How.XPATH,using = UsButtonXP)
    public WebElement usButton;
    @FindBy(how = How.XPATH,using = usValidationXP)
    public WebElement usValidation;

    @FindBy(how = How.XPATH,using = politicsButtonXP)
    public WebElement politicsButton;
    @FindBy(how = How.XPATH,using = politicsValidationXP)
    public WebElement politicsValidation;

    @FindBy(how = How.XPATH,using = nyButtonXP)
    public WebElement nyButton;
    @FindBy(how = How.XPATH,using = nyValidationXP)
    public WebElement nyValidation;

    @FindBy(how = How.XPATH,using = businessButtonXP)
    public WebElement businessButton;
    @FindBy(how = How.XPATH,using = businessValidationXP)
    public WebElement businessValidation;

    @FindBy(how = How.XPATH,using = opinionButtonXP)
    public WebElement opinionButton;
    @FindBy(how = How.XPATH,using = opinionValidationXP)
    public WebElement opinionValidation;

    @FindBy(how = How.XPATH,using = techButtonXP)
    public WebElement techButton;
    @FindBy(how = How.XPATH,using = techValidationXP)
    public WebElement techValidation;

    @FindBy(how = How.XPATH,using = scienceButtonXP)
    public WebElement scienceButton;
    @FindBy(how = How.XPATH,using = climateXP)
    public WebElement climate;
    @FindBy(how = How.XPATH,using = climateValidationXP)
    public WebElement climateValidation;
    @FindBy(how = How.XPATH,using = spaceCosmosXP)
    public WebElement spaceCosmos;

    @FindBy(how = How.XPATH,using = healthButtonXP)
    public WebElement healthButton;
    @FindBy(how = How.XPATH,using = healthPolicyButtonXP)
    public WebElement healthPolicy;
    @FindBy(how = How.XPATH,using = globalHealthXP)
    public WebElement globalHealth;
    @FindBy(how = How.XPATH,using = theNewOldAgeXP)
    public WebElement theNewOldAge;
    @FindBy(how = How.XPATH,using = healthValidationXP)
    public WebElement healthValidation;

    @FindBy(how = How.XPATH,using = sportsButtonXP)
    public WebElement sportButton;
    @FindBy(how = How.CSS,using = baseballCSS)
    public WebElement baseball;
    @FindBy(how = How.XPATH,using = nflXP)
    public WebElement nfl;
    @FindBy(how = How.XPATH,using = soccerXP)
    public WebElement soccer;
    @FindBy(how = How.XPATH,using = nbaXP)
    public WebElement nba;
    @FindBy(how = How.XPATH,using = tennisXP)
    public WebElement tennis;
    @FindBy(how = How.XPATH,using = sportValidationXP)
    public WebElement sportValidation;

    @FindBy(how = How.XPATH,using = artsButtonXP)
    public WebElement artButton;
    @FindBy(how = How.XPATH,using = booksXP)
    public WebElement books;
    @FindBy(how = How.XPATH,using = danceXP)
    public WebElement dance;
    @FindBy(how = How.XPATH,using = moviesXP)
    public WebElement movies;
    @FindBy(how = How.XPATH,using = artsValidationClass)
    public WebElement artsValidation;

    @FindBy(how = How.XPATH,using = BooksButtonXP)
    public WebElement booksButton;
    @FindBy(how = How.CSS,using = booksReviewCSS)
    public WebElement booksReview;
    @FindBy(how = How.CSS,using = bestSellersCSS)
    public WebElement bestSeller;
    @FindBy(how = How.XPATH,using = bestSellerValidationXP)
    public WebElement bestSellerValidation;

    public void validateWorldButton(){
        driver.manage().window().maximize();
        String actualText=worldValidation.getText();
        String expectedText="World News";
        Assert.assertEquals(actualText,expectedText,"text doesn't match");
    }

    public void usValidationButton(){
        driver.manage().window().maximize();
        String actualText=usValidation.getText();
        String expectedTitle="U.S. News - The New York Times";
        Assert.assertEquals(actualText,expectedTitle,"text doesn't match");
    }

    public void politicsValidationButton(){driver.manage().window().maximize();

        String actualText=politicsButton.getText();
        String expectedText="Politics";
        Assert.assertEquals(actualText,expectedText,"text doesn't match");
    }

    public void nyValidationButton(){
        driver.manage().window().maximize();
        String actualText=nyValidation.getText();
        String expectedText="New York";
        Assert.assertEquals(actualText,expectedText,"text doesn't match");
    }

    public void BusinessValidationButton(){
        driver.manage().window().maximize();
        String actualText=businessValidation.getText();
        String expectedText="Business";
        Assert.assertEquals(actualText,expectedText,"text doesn't match");
    }

    public void opinionValidationButton(){
        driver.manage().window().maximize();
        String actualText=opinionValidation.getText();
        String expectedText ="Opinion";
        Assert.assertEquals(actualText,expectedText,"text doesn't match");
    }
    public void techValidationButton(){
        driver.manage().window().maximize();
        String actualText=techValidation.getText();
        String expectedText="Technology";
        Assert.assertEquals(actualText,expectedText,"text doesn't match");
    }
    public void climateValidation() throws InterruptedException {
        driver.manage().window().maximize();
        String actualText=climateValidation.getText();
        String expectedText="Climate and Environment";
        Assert.assertEquals(actualText,expectedText,"text doesn't match");
        sleepFor(3);
    }
    public void healthButtonValidation(String expectedText){
        driver.manage().window().maximize();
        String actualText=healthValidation.getText();
        Assert.assertEquals(actualText,expectedText,"text doesn't match");

    }
    public void sportButtonValidation(String expectedText){
        driver.manage().window().maximize();
        String actualText=sportValidation.getText();
        Assert.assertEquals(actualText,expectedText,"text doesn't match");
    }
    public void artButtonValidation(String expectedText){
        driver.manage().window().maximize();
        String actualText=artsValidation.getText();
        Assert.assertEquals(actualText,expectedText,"text doesn't match");
    }
    public void booksPageValidation(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=bestSellerValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"text doesn't match");

    }


}
