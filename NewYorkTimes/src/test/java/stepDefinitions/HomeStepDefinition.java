package stepDefinitions;

import base.CommonAPI;
import home.Home;
import io.cucumber.java.*;
import io.cucumber.java.en.*;

import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static home.HomeWebElements.*;

public class HomeStepDefinition extends CommonAPI {

    static Home homePage;

    @BeforeStep
    public static void getInit() {
        homePage = PageFactory.initElements(driver, Home.class);
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }
    @Given("I am on New York Times Homepage")
    public void iAmOnNewYorkTimesHomepage() throws IOException {
        openBrowser();
    }
    @When("I click on World and a new page appears")
    public void i_click_on_world_and_a_new_page_appears() {
        homePage.clickOnElement(worldByXpath);
    }
    @Then("I validate that page by page title test a")
    public void iValidateThatPageByPageTitleTestA() {
        homePage.validateWorld();
    }

    @When("I click on US and a new page appears")
    public void i_click_on_us_and_a_new_page_appears() {
        homePage.clickOnElement(USByXpath);
    }
    @Then("I validate that page by page title test b")
    public void iValidateThatPageByPageTitleTestB() {
        homePage.validateUs();
    }

    @When("I click on Politics and a new page appears")
    public void i_click_on_politics_and_a_new_page_appears() {
        homePage.clickOnElement(politicsByXpath);
    }
    @Then("I validate that page by page title test c")
    public void iValidateThatPageByPageTitleTestC(){
        homePage.validatePolitics();
    }
    @When("I click on NY News and a new page appears")
    public void i_click_on_ny_news_and_a_new_page_appears() {
        homePage.clickOnElement(nyNewsByXpath);
    }

    @Then("I validate that page by page title test d")
    public void iValidateThatPageByPageTitleTestD() {
        homePage.validateNyNews();
    }
    @When("I click on Business and a new page appears")
    public void i_click_on_business_and_a_new_page_appears() {
        homePage.clickOnElement(businessNewsByXpath);
    }

    @Then("I validate that page by page title test e")
    public void iValidateThatPageByPageTitleTestE() {
        homePage.validateBusinessNews();
    }
    @When("I click on Opinion and a new page appears")
    public void i_click_on_opinion_and_a_new_page_appears() {
        homePage.clickOnElement(opinionByXpath);
    }

    @Then("I validate that page by page title test f")
    public void iValidateThatPageByPageTitleTestF() {
        homePage.validateOpinion();
    }
    @When("I click on Tech and a new page appears")
    public void i_click_on_tech_and_a_new_page_appears() {
        homePage.clickOnElement(techNewsByXpath);
    }

    @Then("I validate that page by page title test g")
    public void iValidateThatPageByPageTitleTestG() {
        homePage.validateTechNews();
    }
    @When("I click on Science and a new page appears")
    public void i_click_on_science_and_a_new_page_appears() {
        homePage.clickOnElement(scienceNewsByXpath);
    }

    @Then("I validate that page by page title test h")
    public void iValidateThatPageByPageTitleTestH() {
        homePage.validateScienceNews();
    }
    @When("I click on Health and a new page appears")
    public void i_click_on_health_and_a_new_page_appears() {
        homePage.clickOnElement(healthNewsByXpath);
    }

    @Then("I validate that page by page title test i")
    public void iValidateThatPageByPageTitleTestI() {
        homePage.validateHealthNews();
    }
    @When("I click on Sports and a new page appears")
    public void i_click_on_sports_and_a_new_page_appears() {
        homePage.clickOnElement(sportsNewsByXpath);
    }

    @Then("I validate that page by page title test j")
    public void iValidateThatPageByPageTitleTestJ() {
        homePage.validateSportsNews();
    }
    @When("I click on Arts and a new page appears")
    public void i_click_on_arts_and_a_new_page_appears() {
        homePage.clickOnElement(artsNewsByXpath);
    }

    @Then("I validate that page by page title test k")
    public void iValidateThatPageByPageTitleTestK() {
        homePage.validateArtsNews();
    }
    @When("I click on Books and a new page appears")
    public void i_click_on_books_and_a_new_page_appears() {
        homePage.clickOnElement(booksNewsByXpath);
    }

    @Then("I validate that page by page title test l")
    public void iValidateThatPageByPageTitleTestL() {
        homePage.validateBooksNews();
    }
    @When("I click on Style and a new page appears")
    public void i_click_on_style_and_a_new_page_appears() {
        homePage.clickOnElement(styleNewsByXpath);
    }

    @Then("I validate that page by page title test m")
    public void iValidateThatPageByPageTitleTestM() {
        homePage.validateStyleNews();
    }
    @When("I click on Food and a new page appears")
    public void i_click_on_food_and_a_new_page_appears() {
        homePage.clickOnElement(foodNewsByXpath);
    }

    @Then("I validate that page by page title test n")
    public void iValidateThatPageByPageTitleTestN() {
        homePage.validateFoodNews();
    }
    @When("I click on Travel and a new page appears")
    public void i_click_on_travel_and_a_new_page_appears() {
        homePage.clickOnElement(travelNewsByXpath);
    }

    @Then("I validate that page by page title test o")
    public void iValidateThatPageByPageTitleTestO() {
        homePage.validateTravelNews();
    }
    @When("I click on Magazine and a new page appears")
    public void i_click_on_magazine_and_a_new_page_appears() {
        homePage.clickOnElement(magazineByXpath);
    }

    @Then("I validate that page by page title test p")
    public void iValidateThatPageByPageTitleTestP() {
        homePage.validateMagazine();
    }
    @When("I click on T Magazine and a new page appears")
    public void i_click_on_t_magazine_and_a_new_page_appears() {
        homePage.clickOnElement(t_MagazineByXpath);
    }

    @Then("I validate that page by page title test q")
    public void iValidateThatPageByPageTitleTestQ() {
        homePage.validate_t_Magazine();
    }
    @When("I click on Real Estate and a new page appears")
    public void i_click_on_real_estate_and_a_new_page_appears() {
        homePage.clickOnElement(realEstateNewsByXpath);
    }

    @Then("I validate that page by page title test r")
    public void iValidateThatPageByPageTitleTestR() {
        homePage.validateRealEstate();
    }
    @When("I click on Video and a new page appears")
    public void i_click_on_video_and_a_new_page_appears() {
        homePage.clickOnElement(videoWebElementsByXpath);
    }

    @Then("I validate that page by page title test s")
    public void iValidateThatPageByPageTitleTestS() {
        homePage.validateVideoWebElements();
    }
    @When("I click on Todays Paper and a new page appears")
    public void i_click_on_todays_paper_and_a_new_page_appears() {
        homePage.clickOnElement(todaysPaperByClassName);
    }

    @Then("I validate that page by page title test t")
    public void iValidateThatPageByPageTitleTestT() {
        homePage.validateTodaysPaper();
    }
    @When("I click on Toggle Menu and a new page appears")
    public void i_click_on_toggle_menu_and_a_new_page_appears() {
        homePage.clickOnElement(toggleMenuCheckingById);
    }

    @Then("I validate that page by page title test u")
    public void iValidateThatPageByPageTitleTestU() {
        homePage.validateClickToggleMenu();
    }
    @When("I click on Login Button and a new page appears")
    public void i_click_on_login_button_and_a_new_page_appears() {
        homePage.clickOnElement(logInButtonByXpath);
    }

    @Then("I validate that page by page title test v")
    public void iValidateThatPageByPageTitleTestV() {
        homePage.validateLogInButton();
    }
    @When("I click on Espanol and a new page appears")
    public void i_click_on_espanol_and_a_new_page_appears() {
        homePage.clickByLinkText(spanishLanguageByLinkTest);
    }

    @Then("I validate that page by page title test w")
    public void iValidateThatPageByPageTitleTestW() {
        homePage.validateSpanishLanguage();
    }
    @When("I click on 中文 and a new page appears")
    public void i_click_on_中文_and_a_new_page_appears() {
        homePage.clickByLinkText(chineseLanguageByLinkTest);
    }

    @Then("I validate that page by page title test x")
    public void iValidateThatPageByPageTitleTestX() {
        homePage.validateChineseLanguage();
    }
    @When("I click on Subscribe Now and a new page appears")
    public void i_click_on_subscribe_now_and_a_new_page_appears() {
        homePage.clickByName(subscribeNowByName);
    }

    @Then("I validate that page by page title test y")
    public void iValidateThatPageByPageTitleTestY() {
        homePage.validateSubscribeNow();
    }


}