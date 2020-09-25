package home;


import base.CommonAPI;
import com.mysql.cj.util.DnsSrv;
import org.hamcrest.xml.HasXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.HashMap;

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

    @FindBy(how = How.XPATH,using =BooksButton1XP)
    public WebElement BooksButton1;
    @FindBy(how = How.CSS,using = byTheBookCSS)
    public WebElement byTheBook;
    @FindBy(how = How.XPATH,using = byTheBookVerificationXP)
    public WebElement byTheBookVerification;

    @FindBy(how = How.XPATH,using = BooksButton2XP)
    public WebElement booksButton2;
    @FindBy(how = How.XPATH,using = crimeButtonXP)
    public WebElement crimeButton;
    @FindBy(how = How.XPATH,using = crimePageValidationXP)
    public WebElement crimePageValidation;

    @FindBy(how = How.XPATH,using = childrenBookButtonXP)
    public WebElement childrenBookButton;
    @FindBy(how = How.XPATH,using = childrenBookValidationXP)
    public WebElement childrenBookValidation;

    @FindBy(how = How.XPATH,using = booksReviewPodcastXP)
    public WebElement booksReviewPodcast;
    @FindBy(how = How.XPATH,using = booksReviewPodcastValidationXP)
    public WebElement booksReviewPodcastValidation;

    @FindBy(how = How.CSS,using = nowReadThisButtonCSS)
    public WebElement nowReadThisButton;
    @FindBy(how = How.XPATH,using = NowReadThisValidationXP)
    public WebElement NowReadThisValidation;

    @FindBy(how = How.XPATH,using = styleButtonXP)
    public WebElement styleButton;
    @FindBy(how = How.CSS,using = fashionButtonCSS)
    public WebElement fashionButton;
    @FindBy(how = How.CLASS_NAME,using = fashionButtonValidationClass)
    public WebElement fashionButtonValidation;

    @FindBy(how = How.CSS,using = loveButtonCSS)
    public WebElement loveButton;
    @FindBy(how = How.CLASS_NAME,using = loveButtonValidationClass)
    public WebElement loveButtonValidation;

    @FindBy(how = How.CSS,using = selfCareButtonCSS)
    public WebElement selfCareButton;
    @FindBy(how = How.CLASS_NAME,using = selfCareValidationClass)
    public WebElement selfCareValidation;

    @FindBy(how = How.XPATH,using = foodButtonXP)
    public WebElement foodButton;
    @FindBy(how = How.CSS,using = wineBeerCocktailCSS)
    public WebElement wineBeerCocktail;
    @FindBy(how = How.CLASS_NAME,using = wineBeerCocktailValidationClass)
    public WebElement wineBeerCocktailValidation;

    @FindBy(how = How.CSS,using = restaurantReviewCSS)
    public WebElement restaurantReview;
    @FindBy(how = How.CSS,using = restaurantReviewValidationCSS)
    public WebElement restaurantReviewValidation;

    @FindBy(how = How.XPATH,using = travelButtonXP)
    public WebElement travelButton;
    @FindBy(how = How.CSS,using =thirtySixHoursCSS)
    public WebElement thirtySixHours;
    @FindBy(how = How.CSS,using = thirtySixHoursValidationCSS)
    public WebElement thirtySixHoursValidation;

    @FindBy(how = How.CSS,using = frugalTravelerCSS)
    public WebElement frugalTraveler;
    @FindBy(how = How.XPATH,using = frugalTravelerValidationXP)
    public WebElement frugalTravelerValidation;

    @FindBy(how = How.CSS,using = fiftyTwoPlacesToGoCSS)
    public WebElement fiftyTwoPlacesToGo;
    @FindBy(how = How.XPATH,using = fiftyTwoPlacesToGoValidationXP)
    public WebElement fiftyTwoPlacesToGoValidation;

    @FindBy(how = How.XPATH,using = tMagazineXP)
    public WebElement tMagazine;
    @FindBy(how = How.XPATH,using = designInteriorXP)
    public WebElement designInterior;
    @FindBy(how = How.XPATH,using = designInteriorValidationXP)
    public WebElement designInteriorValidation;

    @FindBy(how = How.XPATH,using = foodMagazineXP)
    public WebElement foodMagazine;
    @FindBy(how = How.XPATH,using = foodMagazineValidationXP)
    public WebElement foodMagazineValidation;

    @FindBy(how = How.XPATH,using = travelMagazineXP)
    public WebElement travelMagazine;
    @FindBy(how = How.XPATH,using = travelMagazineValidationXP)
    public WebElement travelMagazineValidation;

    @FindBy(how = How.XPATH,using = fashionBeautyXP)
    public WebElement fashionBeauty;
    @FindBy(how =How.XPATH,using = fashionBeautyValidationXP)
    public WebElement fashionBeautyValidation;

    @FindBy(how = How.XPATH,using = entertainmentXP)
    public WebElement entertainment;
    @FindBy(how = How.XPATH,using = entertainmentValidationXP)
    public WebElement entertainmentValidation;

    @FindBy(how = How.XPATH,using = artXP)
    public WebElement art;
    @FindBy(how = How.XPATH,using = artValidationXP)
    public WebElement artValidation;

    @FindBy(how = How.XPATH,using = realEstateButtonXP)
    public WebElement realEstate;
    @FindBy(how = How.XPATH,using = theHighEndXP)
    public WebElement theHighEnd;
    @FindBy(how = How.XPATH,using = theHighEndValidationXP)
    public WebElement theHighEndValidation;

    @FindBy(how = How.XPATH,using = findHomeXP)
    public WebElement findHome;
    @FindBy(how = How.XPATH,using = searchFieldXP)
    public WebElement searchField;
    @FindBy(how = How.XPATH,using = findHomeValidationXP)
    public WebElement findHomeValidation;

    @FindBy(how = How.XPATH,using = africaXP)
    public WebElement africa;
    @FindBy(how = How.XPATH,using = africaValidationXP)
    public WebElement africaValidation;

    @FindBy(how = How.XPATH,using = africaSearchFieldXP)
    public WebElement africaSearchField;

    @FindBy(how = How.XPATH,using = americasXP)
    public WebElement america;
    @FindBy(how = How.XPATH,using = americasValidationXP)
    public WebElement americasValidation;

    @FindBy(how = How.XPATH,using = asiaXP)
    public WebElement asia;
    @FindBy(how = How.XPATH,using = asiaValidationXP)
    public WebElement asiaValidation;

    @FindBy(how = How.XPATH,using = australiaXP)
    public WebElement australia;
    @FindBy(how = How.XPATH,using = australiaValidationXP)
    public WebElement australiaValidation;

    @FindBy(how = How.XPATH,using = canadaXP)
    public WebElement canada;
    @FindBy(how = How.XPATH,using = canadaValidationXP)
    public WebElement canadaValidation;

    @FindBy(how = How.XPATH,using = europeXP)
    public WebElement europe;
    @FindBy(how = How.XPATH,using = europeValidationXP)
    public WebElement europeValidation;

    @FindBy(how = How.XPATH,using = middleEastXP)
    public WebElement middleEast;
    @FindBy(how = How.XPATH,using = middleEastValidationXP)
    public WebElement middleEastValidation;

    @FindBy(how = How.XPATH,using = techXP)
    public WebElement tech;
    @FindBy(how = How.XPATH,using = dealBookXP)
    public WebElement dealBook;
    @FindBy(how = How.XPATH,using = dealBookValidationXP)
    public WebElement dealBookValidation;

    @FindBy(how = How.XPATH,using = marketXP)
    public WebElement market;
    @FindBy(how = How.XPATH,using = marketValidationXP)
    public WebElement marketValidation;

    @FindBy(how = How.XPATH,using = economyXP)
    public WebElement economy;
    @FindBy(how = How.XPATH,using = economyValidationXP)
    public WebElement economyValidation;

    @FindBy(how = How.XPATH,using = energyXP)
    public WebElement energy;
    @FindBy(how = How.XPATH,using = energyValidationXP)
    public WebElement energyValidation;

    @FindBy(how = How.XPATH,using = mediaXP)
    public WebElement media;
    @FindBy(how = How.XPATH,using = mediaValidationXP)
    public WebElement mediaValidation;

    @FindBy(how = How.XPATH,using = personalTechXP)
    public WebElement personalTech;
    @FindBy(how = How.XPATH,using = personalTechValidationXP)
    public WebElement personalTechValidation;

    @FindBy(how = How.XPATH,using = entrepreneurXP)
    public WebElement entrepreneur;
    @FindBy(how = How.XPATH,using = entrepreneurValidationXP)
    public WebElement entrepreneurValidation;

    @FindBy(how = How.XPATH,using = yourMoneyXP)
    public WebElement yourMoney;
    @FindBy(how = How.XPATH,using = yourMoneyValidationXP)
    public WebElement yourMoneyValidation;

    @FindBy(how = How.XPATH,using = clumnistsXP)
    public WebElement clumnists;
    @FindBy(how = How.XPATH,using = clumnistsValidationXP)
    public WebElement clumnistsValidation;
    @FindBy(how = How.XPATH,using = frankBruniXP)
    public WebElement frankBruni;

    @FindBy(how = How.XPATH,using = charlesMblowXP)
    public WebElement charlesMblow;
    @FindBy(how = How.XPATH,using = charlesMblowValidationXP)
    public WebElement charlesMblowValidation;

    @FindBy(how = How.XPATH,using = jamelleXP)
    public WebElement jamelle;
    @FindBy(how = How.XPATH,using = jamelleValidationXP)
    public WebElement jamelleValidation;

    @FindBy(how = How.XPATH,using = davidBrookXP)
    public WebElement davidBrook;
    @FindBy(how = How.XPATH,using = davidBrooksValidationXP)
    public WebElement davidBrooksValidation;

    @FindBy(how = How.XPATH,using = rogerXP)
    public WebElement roger;
    @FindBy(how = How.XPATH,using = rogerValidationXP)
    public WebElement rogerValidation;

    @FindBy(how = How.XPATH,using = gailCollinsXP)
    public WebElement gailCollins;
    @FindBy(how = How.XPATH,using = gailCollinsValidationXP)
    public WebElement gailCollinsValidation;

    @FindBy(how = How.XPATH,using = rossDouthatXP)
    public WebElement rossDouthat;
    @FindBy(how = How.XPATH,using = rossDouthatValidationXP)
    public WebElement rossDouthatValidation;

    @FindBy(how = How.XPATH,using = maureenDowdXP)
    public WebElement maureenDowd;
    @FindBy(how = How.XPATH,using = maureenDowdValidationXP)
    public WebElement maureenDowdValidation;

    @FindBy(how = How.XPATH,using = thomasXP)
    public WebElement thomas;
    @FindBy(how = How.XPATH,using = thomasValidationXP)
    public WebElement thomasValidation;

    @FindBy(how = How.XPATH,using = michelleXP)
    public WebElement michelle;
    @FindBy(how = How.XPATH,using = michelleValidationXP)
    public WebElement michelleValidation;

    @FindBy(how = How.XPATH,using = nicholasXP)
    public WebElement nicholas;
    @FindBy(how = How.XPATH,using = nicholasValidationXP)
    public WebElement nicholasValidation;

    @FindBy(how = How.XPATH,using = paulXP)
    public WebElement paul;
    @FindBy(how = How.XPATH,using = paulValidationXP)
    public WebElement paulValidation;

    @FindBy(how = How.XPATH,using = ferhadXP)
    public WebElement ferhad;
    @FindBy(how = How.XPATH,using = ferhadValidationXP)
    public WebElement ferhadValidation;

    @FindBy(how = How.XPATH,using = jenniferXP)
    public WebElement jennifer;
    @FindBy(how = How.XPATH,using = jenniferValidationXP)
    public WebElement jenniferValidation;

    @FindBy(how = How.XPATH,using = bretXP)
    public WebElement bret;
    @FindBy(how = How.XPATH,using = bretValidationXP)
    public WebElement bretValidation;

    @FindBy(how = How.XPATH,using = seriesXP)
    public WebElement series;
    @FindBy(how = How.XPATH,using = disabilityXP)
    public WebElement disability;
    @FindBy(how = How.XPATH,using = disabilityValidationXP)
    public WebElement disabilityValidation;

    @FindBy(how = How.XPATH,using = fixesXP)
    public WebElement fixes;
    @FindBy(how = How.XPATH,using = fixesValidationXP)
    public WebElement fixesValidation;

    @FindBy(how = How.XPATH,using = onCampusXP)
    public WebElement onCampus;
    @FindBy(how = How.XPATH,using = onCampusValidationXP)
    public WebElement onCampusValidation;

    @FindBy(how = How.XPATH,using = redCenturyXP)
    public WebElement redCentury;
    @FindBy(how = How.XPATH,using = redCenturyValidationXP)
    public WebElement redCenturyValidation;

    @FindBy(how = How.XPATH,using = sportingXP)
    public WebElement sporting;
    @FindBy(how = How.XPATH,using = sportingValidationXP)
    public WebElement sportingValidation;

    @FindBy(how = How.XPATH,using = theStoneXP)
    public WebElement theStone;
    @FindBy(how = How.XPATH,using = theStoneValidationXP)
    public WebElement theStoneValidation;

    @FindBy(how = How.XPATH,using = vietnamXP)
    public WebElement vietnam;
    @FindBy(how = How.XPATH,using = vietnamValidationXP)
    public WebElement vietnamValidation;

    @FindBy(how = How.XPATH,using = editorialXP)
    public WebElement editorial;
    @FindBy(how = How.XPATH,using = editorialValidationXP)
    public WebElement editorialValidation;

    @FindBy(how = How.XPATH,using = opedXP)
    public WebElement oped;
    @FindBy(how = How.XPATH,using = opedValidationXP)
    public WebElement opedValidation;

    @FindBy(how = How.XPATH,using = lettersXP)
    public WebElement letters;
    @FindBy(how = How.XPATH,using = lettersValidationXP)
    public WebElement lettersValidation;

    @FindBy(how = How.XPATH,using = sundayReviewXP)
    public WebElement sundayReview;
    @FindBy(how = How.XPATH,using = sundayReviewValidationXP)
    public WebElement sundayReviewValidation;

    @FindBy(how = How.XPATH,using = videoXP)
    public WebElement video;

    @FindBy(how = How.XPATH,using = genderSocietyXP)
    public WebElement genderSociety;
    @FindBy(how = How.XPATH,using = genderSocietyValidationXP)
    public WebElement genderSocietyValidation;

    @FindBy(how = How.XPATH,using = opinionPoliticsXP)
    public WebElement opinionPolitics;
    @FindBy(how = How.XPATH,using = opinionPoliticsValidationXP)
    public WebElement opinionPoliticsValidation;

    @FindBy(how = How.XPATH,using = opinionWorldXP)
    public WebElement opinionWorld;
    @FindBy(how = How.XPATH,using = opinionWorldValidationXP)
    public WebElement opinionWorldValidation;

    @FindBy(how = How.XPATH,using = opinionBusinessXP)
    public WebElement opinionBusiness;
    @FindBy(how = How.XPATH,using = opinionBusinessValidationXP)
    public WebElement opinionBusinessValidation;

    @FindBy(how = How.XPATH,using = opinionTechXP)
    public WebElement opinionTech;
    @FindBy(how = How.XPATH,using = opinionTechValidationXP)
    public WebElement opinionTechValidation;

    @FindBy(how = How.XPATH,using = opinionEnvironmentXP)
    public WebElement opinionEnvironment;
    @FindBy(how = How.XPATH,using = opinionEnvironmentValidationXP)
    public WebElement opinionEnvironmentValidation;

    @FindBy(how = How.XPATH,using = opinionHealthXP)
    public WebElement opinionHealth;
    @FindBy(how = How.XPATH,using = opinionHealthValidationXP)
    public WebElement opinionHealthValidation;

    @FindBy(how = How.XPATH,using = opinionCultureXP)
    public WebElement opinionCulture;
    @FindBy(how = How.XPATH,using = opinionCultureValidationXP)
    public WebElement opinionCultureValidation;


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
    public void setByTheBookVerification(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=byTheBookVerification.getText();
        Assert.assertEquals(actualResult,expectedResult,"*******test failed**********");
    }
    public void setCrimePageValidation(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=crimePageValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"*********test failed*******");
    }
    public void setChildrenBookValidation(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=childrenBookValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"*********test failed*******");
    }
    public void setBooksReviewPodcast(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=booksReviewPodcastValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"**********result failed**********");
    }
    public void setNowReadThisValidation(String expectedResult){
        driver.manage().window().maximize();
        String actualResult= NowReadThisValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"********test failed*********");
    }
    public void setFashionButtonValidation(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=fashionButtonValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"**********test failed**********");
    }
    public void setLoveButtonValidation(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=loveButtonValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"********test failed********");
    }
    public void setSelfCareValidation(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=selfCareValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"*********result failed*********");
    }
    public void setWineBeerCocktailValidation(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=wineBeerCocktailValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"*******test failed**********");
    }
    public void setRestaurantReview(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=restaurantReviewValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"*************test failed************");
    }
    public void setThirtySixHours(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=thirtySixHoursValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"*************test Failed***********");
    }
    public void setFrugalTraveler(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=frugalTravelerValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"**********test failed**********");
    }
    public void setFiftyTwoPlacesToGo(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=fiftyTwoPlacesToGoValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"***********test failed**********");
    }
    public void setDesignInterior(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=designInteriorValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"*******test failed***********");
    }
    public void setFoodMagazine(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=foodMagazineValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"************test failed**********");
    }
    public void setTravelMagazine(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=travelMagazineValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"*************test failed**************");
    }
    public void setFashionBeauty(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=fashionBeautyValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"************test failed**********");
    }
    public void setEntertainment(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=entertainmentValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"********test failed*********");
    }
    public void setArt(String expectedResult){
        driver.manage().window().maximize();
        String actualRest=artValidation.getText();
        Assert.assertEquals(actualRest,expectedResult,"***********result failed***********");
    }
    public void setRealEstate(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=theHighEndValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"**************test failed************");
    }
    public void setFindHome(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=findHomeValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"**********test failed*********");
    }
    public void setAfrica(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=africaValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"************test failed*************");
    }
    public void setAmerica(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=americasValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"************test failed*************");

    }
    public void setAsia(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=asiaValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"************test failed*************");
    }
    public void setAustralia(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=australiaValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"************test failed*************");
    }
    public void setCanada(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=canadaValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"************test failed*************");
    }
    public void setEurope(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=europeValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"************test failed*************");
    }
    //check middle east page
    public void setMiddleEast(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=middleEastValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"************test failed*************");
    }
    //check dealBook page
    public void setDealBook(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=dealBookValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"************test failed*************");
    }
    public void setMarket(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=marketValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"************test failed*************");
    }
    public void setEconomy(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=economyValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"************test failed*************");
    }
    public void setEnergy(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=energyValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"************test failed*************");
    }
    public void setMedia(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=mediaValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"************test failed*************");
    }
    public void setPersonalTech(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=personalTechValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"************test failed*************");
    }
    public void setEntrepreneur(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=entrepreneurValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"************test failed*************");
    }
    public void setYourMoney(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=yourMoneyValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"************test failed*************");
    }
    public void setClumnists(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=clumnistsValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"************test failed*************");
    }
    public void setCharlesMblow(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=charlesMblowValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"************test failed*************");
    }
    public void setJamelle(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=jamelleValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"************test failed*************");
    }
    public void setDavidBrook(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=davidBrooksValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"************test failed*************");
    }
    public void setRoger(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=rogerValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"************test failed*************");
    }
    public void setGailCollins(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=gailCollinsValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"************test failed*************");
    }
    public void setRossDouthat(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=rossDouthatValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"************test failed*************");
    }
    public void setMaureenDowd(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=maureenDowdValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"************test failed*************");
    }
    public void setThomas(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=thomasValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"************test failed*************");
    }
    public void setMichelle(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=michelleValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"************test failed*************");
    }
    public void setNicholas(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=nicholasValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"************test failed*************");
    }
    public void setPaul(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=paulValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"************test failed*************");
    }
    public void setFerhad(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=ferhadValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"************test failed*************");
    }
    public void setJennifer(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=jenniferValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"************test failed*************");
    }
    public void setBret(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=bretValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"************test failed*************");
    }
    public void setDisability(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=disabilityValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"************test failed*************");
    }
    public void setFixes(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=fixesValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"************test failed*************");
    }
    public void setOnCampus(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=onCampusValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"************test failed*************");
    }
    public void setRedCentury(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=redCenturyValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"************test failed*************");
    }
    public void setSporting(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=sportingValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"************test failed*************");
    }
    public void setTheStone(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=theStoneValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"************test failed*************");
    }
    public void setVietnam(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=vietnamValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"************test failed*************");
    }
    public void setEditorial(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=editorialValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"************test failed*************");
    }
    public void setOped(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=opedValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"************test failed*************");
    }
    public void setLetters(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=lettersValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"************test failed*************");
    }
    public void setSundayReview(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=sundayReviewValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"************test failed*************");
    }
    public void setVideo(String expectedResult){
        driver.manage().window().maximize();
//        String actualResult=sundayReviewValidation.getText();
//        Assert.assertEquals(actualResult,expectedResult,"************test failed*************");
    }
    public void setGenderSociety(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=genderSocietyValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"************test failed*************");
    }
    public void setOpinionPolitics(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=opinionPoliticsValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"************test failed*************");
    }
    public void setOpinionWorld(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=opinionWorldValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"************test failed*************");
    }
    public void setOpinionBusiness(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=opinionBusinessValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"************test failed*************");
    }
    public void setOpinionTech(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=opinionTechValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"************test failed*************");
    }
    public void setOpinionEnvironment(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=opinionEnvironmentValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"************test failed*************");
    }
    public void setOpinionHealth(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=opinionHealthValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"************test failed*************");
    }
    public void setOpinionCulture(String expectedResult){
        driver.manage().window().maximize();
        String actualResult=opinionCultureValidation.getText();
        Assert.assertEquals(actualResult,expectedResult,"************test failed*************");
    }




}
