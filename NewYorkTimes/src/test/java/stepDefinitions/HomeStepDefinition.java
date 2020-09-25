package stepDefinitions;


import base.CommonAPI;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.support.PageFactory;
import home.HomePage;

import java.io.IOException;

public class HomeStepDefinition  extends CommonAPI {
    static HomePage homePage;

    @BeforeStep
    public void getInit(){ homePage= PageFactory.initElements(driver, HomePage.class);}

    @After
    public void closeBrowser() {
        cleanUp();
    }

    //checking the world button
    @Given("I am in newYorkTimes homepage")
    public void i_am_in_new_york_times_homepage() throws IOException {
        openBrowser("https://www.nytimes.com/");
        driver.manage().window().maximize();
    }
    @When("I click on worldButton")
    public void i_click_on_world_button() {
        homePage.worldButton.click();
    }
    @Then("I verify page title as {string}")
    public void i_verify_page_title_as(String string) {validateByTitle("World News - The New York Times");
    }

    //checking the US button
    @When("I click on US button")
    public void iClickOnUSButton() {
        homePage.usButton.click();
    }
    @Then("I verify page title1 as {string}")
    public void i_verify_page_title1_as(String string) {validateByTitle("U.S. News - The New York Times");
    }

    //checking the politics button

    @When("I click on politics button")
    public void i_click_on_politics_button() {
       homePage.politicsButton.click();
    }
    @Then("I verify page title2 as {string}")
    public void i_verify_page_title2_as(String string) {validateByTitle("Politics - The New York Times");
    }

    //checking the NY button
    @When("I click on NY button")
    public void i_click_on_ny_button() {
       homePage.nyButton.click();
    }
    @Then("I verify page Title3 as {string}")
    public void i_verify_page_title3_as(String string) {validateByTitle("New York - The New York Times");
    }
    //checking the business button
    @When("I click business button")
    public void i_click_business_button() {
        homePage.businessButton.click();
    }
    @Then("I verify business page title as {string}")
    public void i_verify_business_page_title_as(String string) {validateByTitle("Business - The New York Times");
    }
    //checking the opinion button
    @When("I click opinion button")
    public void i_click_opinion_button() {homePage.opinionButton.click();}

    @Then("I Verify opinion page title as {string}")
    public void i_verify_opinion_page_title_as(String string) {validateByTitle("Opinion - The New York Times");
    }
    //checking the technology button
    @When("I click technology button")
    public void i_click_technology_button() {homePage.techButton.click();
    }
    @Then("I verify technology page title as {string}")
    public void i_verify_technology_page_title_as(String string) {validateByTitle("Technology - The New York Times");
    }
    //checking the science page

    @When("I click on science button")
    public void i_click_on_science_button() {homePage.scienceButton.click();
    }
    @When("I click on climate")
    public void i_click_on_climate() {homePage.climate.click();
    }
    @Then("I verify science page title as {string}")
    public void i_verify_science_page_title_as(String string) throws InterruptedException {validateByTitle("Climate and Environment - The New York Times");
    sleepFor(3);
    }
    @Then("I navigate back to the science page")
    public void iNavigateBackToTheSciencePage() throws InterruptedException {
        homePage.navigateBack();
        sleepFor(3);
    }
    @And("I click on space and cosmos")
    public void iClickOnSpaceAndCosmos() throws InterruptedException {homePage.spaceCosmos.click();
    sleepFor(3);
    }

    //checking health page
    @When("I click on health button")
    public void i_click_on_health_button() throws InterruptedException {
        homePage.healthButton.click();
        sleepFor(3);
        homePage.navigateBack();
    }
    @And("I click on health policy")
    public void i_click_on_health_policy() throws InterruptedException {
        homePage.healthButton.click();
        homePage.healthPolicy.click();
        sleepFor(3);
        homePage.navigateBack();
    }
    @And("I click on global health")
    public void i_click_on_global_health() throws InterruptedException {
        homePage.globalHealth.click();
        sleepFor(3);
        homePage.navigateBack();
    }
    @And("I click on the new old age")
    public void i_click_on_the_new_old_age() throws InterruptedException {
        homePage.theNewOldAge.click();
        sleepFor(3);
        homePage.navigateBack();
    }
    @Then("I verify health page title as {string}")
    public void i_verify_health_page_title_as(String string) {validateByTitle("Health - The New York Times");
    }
    //checking the sport page

    @When("I click on sport button")
    public void i_click_on_sport_button() throws InterruptedException {
        homePage.sportButton.click();
        sleepFor(3);
    }
    @And("I click on baseball")
    public void i_click_on_baseball() throws InterruptedException {
        homePage.baseball.click();
        sleepFor(3);
        homePage.navigateBack();
    }
    @And("I click on NFL")
    public void i_click_on_nfl() throws InterruptedException {
        homePage.nfl.click();
        sleepFor(3);
        homePage.navigateBack();
    }
    @And("I click on NBA")
    public void i_click_on_nba() throws InterruptedException {
        homePage.nba.click();
        sleepFor(3);
        homePage.navigateBack();
    }
    @And("I click on tennis")
    public void i_click_on_tennis() throws InterruptedException {
        homePage.tennis.click();
        sleepFor(3);
        homePage.navigateBack();
    }
    @And("I click on soccer")
    public void iClickOnSoccer() throws InterruptedException {
        homePage.soccer.click();
        sleepFor(3);
        homePage.navigateBack();
    }
    @Then("I verify sport page title as {string}")
    public void i_verify_sport_page_title_as(String string) {validateByTitle("Sports - The New York Times");
    }
    //checking Arts page

    @When("I click on Arts button")
    public void i_click_on_arts_button() throws InterruptedException {
        homePage.artButton.click();
        sleepFor(3);
    }
    @When("I click on books")
    public void i_click_on_books() throws InterruptedException {
        homePage.books.click();
        sleepFor(3);
        homePage.navigateBack();
    }
    @When("I click on dance")
    public void i_click_on_dance() throws InterruptedException {
        homePage.dance.click();
        sleepFor(3);
        homePage.navigateBack();
    }
    @When("I click on movies")
    public void i_click_on_movies() throws InterruptedException {
        homePage.movies.click();
        sleepFor(3);
        homePage.navigateBack();
    }
    @Then("I verify Arts page title as {string}")
    public void iVerifyArtsPageTitleAs(String arg0) {validateByTitle("Arts - The New York Times");
    }

    //checking the books page

    @When("I click on Books button")
    public void i_click_on_books_button() throws InterruptedException {
        homePage.booksButton.click();
        sleepFor(3);
    }
    @And("I click on bookReview")
    public void i_click_on_book_review() throws InterruptedException {
        homePage.booksReview.click();
        sleepFor(3);
    }
    @And("I click on bestSeller")
    public void iClickOnBestSeller() throws InterruptedException {
        homePage.bestSeller.click();
        sleepFor(3);
    }
    @Then("I verify best seller page as {string}")
    public void i_verify_best_seller_page_as(String string){validateByTitle("Best Sellers - The New York Times");

    }
    //check ByTheBook page

    @When("I click on books button1")
    public void i_click_on_books_button1() throws InterruptedException {
        homePage.booksButton.click();
        sleepFor(3);
    }
    @And("I click on ByTheBooks")
    public void i_click_on_by_the_books() throws InterruptedException {
        homePage.byTheBook.click();
        sleepFor(3);
    }
    @Then("I verify ByTheBooks page as {string}")
    public void i_verify_by_the_books_page_as(String string) throws InterruptedException {validateByTitle("By the Book - The New York Times");
    sleepFor(3);
    }
    // check the crime page
    @When("I click on books button2")
    public void i_click_on_books_button2() throws InterruptedException {
        homePage.booksButton2.click();
        sleepFor(3);
    }
    @And("I click om crime button")
    public void i_click_om_crime_button() throws InterruptedException {
        homePage.crimeButton.click();
        sleepFor(3);
    }
    @Then("I verify crime page as {string}")
    public void i_verify_crime_page_as(String string) {validateByTitle("Crime - The New York Times");

    }
    // check children's book page
    @When("I click on children's book")
    public void i_click_on_children_s_book() throws InterruptedException {
        homePage.booksButton.click();
        sleepFor(3);
        homePage.childrenBookButton.click();
        sleepFor(3);
    }
    @Then("I verify children's book page as {string}")
    public void i_verify_children_s_book_page_as(String string) {validateByTitle("Children’s Books - The New York Times");
    }

    // check bookReviewPodcast page
    @When("I click on bookReviewPodcast")
    public void i_click_on_book_review_podcast() throws InterruptedException {
        homePage.booksButton.click();
        sleepFor(3);
        homePage.booksReviewPodcast.click();
    }
    @Then("I verify bookReviewPodcast page as {string}")
    public void i_verify_book_review_podcast_page_as(String string) {validateByTitle("The Book Review Podcast - The New York Times");
    }
    // check Now Read This
    @When("I click on Now read this")
    public void i_click_on_now_read_this() throws InterruptedException {
        homePage.booksButton.click();
        sleepFor(3);
        homePage.nowReadThisButton.click();
        sleepFor(3);
    }
    @Then("I verify NowReadThis page as {string}")
    public void i_verify_now_read_this_page_as(String string) {validateByTitle("Now Read This - The New York Times");
    }

    //check fashion page
    @When("I click on style button")
    public void i_click_on_style_button() throws InterruptedException {
        homePage.styleButton.click();
        sleepFor(2);
    }
    @And("I click on fashion button")
    public void i_click_on_fashion_button() throws InterruptedException {
        homePage.fashionButton.click();
        sleepFor(3);
    }
    @Then("I validate fashion page as {string}")
    public void i_validate_fashion_page_as(String string) {validateByTitle("Fashion - The New York Times");
    }
    //check the love page
    @When("I click on love button")
    public void i_click_on_love_button() throws InterruptedException {
        homePage.styleButton.click();
        sleepFor(3);
        homePage.loveButton.click();
        sleepFor(3);
    }
    @Then("I verify love page as {string}")
    public void i_verify_love_page_as(String string) {validateByTitle("Love - The New York Times");
    }

    //check the self care
    @When("I click on self care button")
    public void i_click_on_self_care_button() throws InterruptedException {
        homePage.styleButton.click();
        sleepFor(3);
        homePage.selfCareButton.click();
        sleepFor(3);
    }
    @Then("I validate self care as {string}")
    public void i_validate_self_care_as(String string) {validateByTitle("Self-Care - The New York Times");
    }

    //check the wine beer cocktail page
    @When("I click on food button")
    public void iClickOnFoodButton() throws InterruptedException {
        homePage.foodButton.click();
        sleepFor(3);
    }
    @And("I click on wineBeerCocktails button")
    public void i_click_on_wine_beer_cocktails_button() throws InterruptedException {
        homePage.wineBeerCocktail.click();
        sleepFor(3);
    }
    @Then("I verify wineBeerCocktail as {string}")
    public void i_verify_wine_beer_cocktail_as(String string) {validateByTitle("Wine, Beer & Cocktails - The New York Times");
    }
    //check the restaurant page review
    @When("I click on restaurant review")
    public void i_click_on_restaurant_review() throws InterruptedException {
        homePage.foodButton.click();
        sleepFor(3);
        homePage.restaurantReview.click();
        sleepFor(2);
    }
    @Then("I verify restaurantReview as {string}")
    public void i_verify_restaurant_review_as(String string) {validateByTitle("Food - The New York Times");
    }
    //checking 36hours page
    @When("I click on travel button")
    public void i_click_on_travel_button() throws InterruptedException {
        homePage.travelButton.click();
        sleepFor(2);
    }
    @When("I click on 36hours button")
    public void i_click_on_36hours_button() throws InterruptedException {
        homePage.thirtySixHours.click();
        sleepFor(2);
    }
    @Then("I verify 36hours page as {string}")
    public void i_verify_36hours_page_as(String string) {validateByTitle("36 Hours - The New York Times");
    }
    //checking frugal traveler
    @When("I click on frugal travel")
    public void i_click_on_frugal_travel() throws InterruptedException {
        homePage.travelButton.click();
        sleepFor(2);
        homePage.frugalTraveler.click();
        sleepFor(2);
    }
    @Then("I verify frugal travel pge  as {string}")
    public void i_verify_frugal_travel_pge_as(String string) {validateByTitle("Frugal Traveler - The New York Times");
    }
    //check 52 places to go
    @When("I click on fifty two places to go button")
    public void i_click_on_fifty_two_places_to_go_button() throws InterruptedException {
        homePage.travelButton.click();
        sleepFor(2);
        homePage.fiftyTwoPlacesToGo.click();
        sleepFor(2);
    }
    @Then("I verify fiftyTwo places to go page  as {string}")
    public void i_verify_fifty_two_places_to_go_page_as(String string) throws InterruptedException {validateByTitle("52 Places to Go in 2020 - The New York Times");
    sleepFor(3);
    }
    //check design and interior
    @When("I click on T-magazine button")
    public void i_click_on_t_magazine_button() throws InterruptedException {
        homePage.tMagazine.click();
        sleepFor(3);
    }
    @And("I click on designInterior button")
    public void i_click_on_design_interior_button() throws InterruptedException {
        homePage.designInterior.click();
        sleepFor(3);
    }
    @Then("I verify designInterior page as {string}")
    public void i_verify_design_interior_page_as(String string) {validateByTitle("Design & Interiors - The New York Times");
    }
    // check the food magazine page
    @When("I click on foodMagazine button")
    public void i_click_on_food_magazine_button() throws InterruptedException {
        homePage.tMagazine.click();sleepFor(3);
        homePage.foodMagazine.click();sleepFor(3);
    }
    @Then("I verify foodMagazine page as {string}")
    public void i_verify_food_magazine_page_as(String string) {validateByTitle("Food - The New York Times");
    }
    //check travel magazine page
    @When("I click on travelMagazine button")
    public void i_click_on_travel_magazine_button() throws InterruptedException {
        homePage.tMagazine.click();sleepFor(3);
        homePage.travelMagazine.click();sleepFor(3);
    }
    @Then("I verify travelMagazine page as {string}")
    public void i_verify_travel_magazine_page_as(String string) throws InterruptedException {validateByTitle("Travel - The New York Times");
    sleepFor(2);
    }
    //check fashion and beauty page
    @When("I click on fashionBeautyMagazine button")
    public void i_click_on_fashion_beauty_magazine_button() throws InterruptedException {
        homePage.tMagazine.click();sleepFor(3);
        homePage.fashionBeauty.click();sleepFor(3);
    }
    @Then("I verify fshionBeautyMagazine page as {string}")
    public void i_verify_fshion_beauty_magazine_page_as(String string) {validateByTitle("Fashion & Beauty - The New York Times");
    }
    //check entertainment page
    @When("I click on entertainment button")
    public void i_click_on_entertainment_button() throws InterruptedException {
        homePage.tMagazine.click();sleepFor(2);
        homePage.entertainment.click();sleepFor(2);
    }
    @Then("I verify entertainment page as {string}")
    public void i_verify_entertainment_page_as(String string) {validateByTitle("Entertainment - The New York Times");
    }
    //check art page
    @When("I click on art button")
    public void i_click_on_art_button() throws InterruptedException {
        homePage.tMagazine.click();sleepFor(2);
        homePage.art.click();sleepFor(2);
    }
    @Then("I verify art page as {string}")
    public void i_verify_art_page_as(String string) throws InterruptedException {validateByTitle("Art - The New York Times");
    sleepFor(2);
    }
    //check the high end page
    @When("I click real estate button")
    public void i_click_real_estate_button() throws InterruptedException {
        homePage.realEstate.click();sleepFor(3);
    }
    @When("I click theHighEnd button")
    public void i_click_the_high_end_button() throws InterruptedException {
        homePage.theHighEnd.click();sleepFor(3);
    }
    @Then("I verify TheHighEnd page as {string}")
    public void i_verify_the_high_end_page_as(String string) throws InterruptedException {validateByTitle("The High End - The New York Times");
    sleepFor(2);
    }
    //check the find a home page
    @When("I click a home button")
    public void iClickAHomeButton() throws InterruptedException {
        homePage.realEstate.click();
        sleepFor(2);
        homePage.findHome.click();sleepFor(2);
        homePage.searchField.click();
    }
    @And("I enter {string} in the searchField")
    public void iEnterInTheSearchField(String arg0) {typeOnElement("searchFieldXP","11214");

    }
    @And("I submit my search")
    public void iSubmitMySearch() throws InterruptedException {
        homePage.searchField.submit();
        sleepFor(3);
    }

    @Then("I verify findHome page as {string}")
    public void i_verify_find_home_page_as(String string) {validateByTitle("Find a Home - NYTimes.com");
    }
    // check africa page
    @When("I click on Africa button")
    public void i_click_on_africa_button() throws InterruptedException {
        homePage.worldButton.click();
        sleepFor(2);
        homePage.africa.click();
        sleepFor(2);
    }
    @Then("I verify africa page as {string}")
    public void i_verify_africa_page_as(String string) {validateByTitle("Africa - The New York Times");
    }
    //check africa search field
    @When("I click on Africa search button")
    public void i_click_on_africa_search_button() throws InterruptedException {
        homePage.worldButton.click();sleepFor(2);
        homePage.africa.click();sleepFor(2);
    }

    @When("I enter animals on search field")
    public void i_enter_animals_on_search_field() throws InterruptedException {
        homePage.searchField.click();sleepFor(2);
    }
    @Then("I verify result displayed as {string}")
    public void i_verify_result_displayed_as(String string) {typeOnElement("africaSearchFieldXP","animals");
    }
    //check americas page
    @When("I click on americas button")
    public void i_click_on_americas_button() throws InterruptedException {
        homePage.worldButton.click();sleepFor(2);
        homePage.america.click();sleepFor(2);
    }
    @Then("I verify americas page as {string}")
    public void i_verify_americas_page_as(String string) {validateByTitle("Americas - The New York Times");
    }
    //check asia page
    @When("I click on asia button")
    public void i_click_on_asia_button() throws InterruptedException {
        homePage.worldButton.click();sleepFor(2);
        homePage.asia.click();sleepFor(2);
    }
    @Then("I verify asia page as {string}")
    public void i_verify_asia_page_as(String string) {validateByTitle("Asia Pacific - The New York Times");
    }
    //check australia page
    @When("I click on australia button")
    public void i_click_on_australia_button() throws InterruptedException {
        homePage.worldButton.click();sleepFor(2);
        homePage.australia.click();sleepFor(2);
    }
    @Then("I verify australia page as {string}")
    public void i_verify_australia_page_as(String string) {validateByTitle("Australia/New Zealand - The New York Times");
    }
    //check canada page
    @When("I click on canada button")
    public void i_click_on_canada_button() throws InterruptedException {
        homePage.worldButton.click();sleepFor(2);
        homePage.canada.click();sleepFor(2);
    }
    @Then("I verify canada page as {string}")
    public void i_verify_canada_page_as(String string) {validateByTitle("Canada - The New York Times");
    }
    //check europe page
    @When("I click on europe button")
    public void i_click_on_europe_button() throws InterruptedException {
        homePage.worldButton.click();sleepFor(2);
        homePage.europe.click();sleepFor(2);
    }
    @Then("I verify europe page as {string}")
    public void i_verify_europe_page_as(String string) {validateByTitle("Europe - The New York Times");
    }
    //check middle east page
    @When("I click on middleEast button")
    public void i_click_on_middle_east_button() throws InterruptedException {
        homePage.worldButton.click();sleepFor(2);
        homePage.middleEast.click();sleepFor(2);
    }
    @Then("I verify middleEast page as {string}")
    public void i_verify_middle_east_page_as(String string) {validateByTitle("Middle East - The New York Times");
    }
    // check dealBook on tech under business page
    @When("I click on tech button")
    public void i_click_on_tech_button() throws InterruptedException {
        homePage.businessButton.click();sleepFor(2);
        homePage.tech.click();sleepFor(2);
    }
    @When("I click on dealBook")
    public void i_click_on_deal_book() throws InterruptedException {
        homePage.dealBook.click();sleepFor(2);
    }
    @Then("I verify tech  page as {string}")
    public void i_verify_tech_page_as(String string) {validateByTitle("Business - NYTimes.com");
    }
    //check market page
    @When("I click on markets button")
    public void i_click_on_markets_button() throws InterruptedException {
        homePage.businessButton.click();sleepFor(2);
        homePage.tech.click();sleepFor(2);
        homePage.market.click();
    }
    @Then("I verify markets page as {string}")
    public void i_verify_markets_page_as(String string) {validateByTitle("Business - NYTimes.com");
    }
    //check economy page
    @When("I click on economy button")
    public void i_click_on_economy_button() throws InterruptedException {
        homePage.businessButton.click();sleepFor(2);
        homePage.tech.click();sleepFor(2);
        homePage.economy.click();
    }
    @Then("I verify economy page as {string}")
    public void i_verify_economy_page_as(String string) {validateByTitle("Economy - The New York Times");
    }
    // check energy page
    @When("I click on energy button")
    public void i_click_on_energy_button() throws InterruptedException {
        homePage.businessButton.click();sleepFor(2);
        homePage.tech.click();sleepFor(2);
        homePage.energy.click();
    }

    @Then("I verify energy page as {string}")
    public void i_verify_energy_page_as(String string) {validateByTitle("Energy & Environment - The New York Times");
    }
    //check media page
    @When("I click on media button")
    public void i_click_on_media_button() throws InterruptedException {
        homePage.businessButton.click();sleepFor(2);
        homePage.tech.click();sleepFor(2);
        homePage.media.click();
    }
    @Then("I verify media page as {string}")
    public void i_verify_media_page_as(String string) {validateByTitle("Media - The New York Times");
    }
    //check personal Tech
    @When("I click on personalTech button")
    public void i_click_on_personal_tech_button() throws InterruptedException {
        homePage.businessButton.click();sleepFor(2);
        homePage.tech.click();sleepFor(2);
        homePage.personalTech.click();
    }
    @Then("I verify personalTech page as {string}")
    public void i_verify_personal_tech_page_as(String string) {validateByTitle("Personal Technology - The New York Times");
    }
    //check entrepreneur ship
    @When("I click on entrepreneurShip button")
    public void i_click_on_entrepreneur_ship_button() throws InterruptedException {
        homePage.businessButton.click();sleepFor(2);
        homePage.tech.click();sleepFor(2);
        homePage.entrepreneur.click();
    }
    @Then("I verify entrepreneurShip page as {string}")
    public void i_verify_entrepreneur_ship_page_as(String string) {validateByTitle("Entrepreneurship - The New York Times");
    }
    //check your money page
    @When("I click on yourMoney button")
    public void i_click_on_your_money_button() throws InterruptedException {
        homePage.businessButton.click();sleepFor(2);
        homePage.tech.click();sleepFor(2);
        homePage.yourMoney.click();
    }
    @Then("I verify yourMoney page as {string}")
    public void i_verify_your_money_page_as(String string) {validateByTitle("Your Money - The New York Times");
    }
    //check frank bruni page
    @When("I click on columnists button")
    public void i_click_on_columnists_button() throws InterruptedException {
        homePage.opinionButton.click();sleepFor(2);
        homePage.clumnists.click();sleepFor(2);
    }
    @And("I click on frank bruni")
    public void i_click_on_frank_bruni() throws InterruptedException {
        homePage.frankBruni.click();sleepFor(2);
    }
    @Then("I verify  frank bruni page as {string}")
    public void i_verify_frank_bruni_page_as(String string) {validateByTitle("Frank Bruni - The New York Times");
    }
    // check CharlesMBlow page
    @When("I click on CharlesMBlow button")
    public void i_click_on_charles_m_blow_button() throws InterruptedException {
        homePage.opinionButton.click();sleepFor(2);
        homePage.clumnists.click();sleepFor(2);
        homePage.charlesMblow.click();
    }
    @Then("I verify Charles M. Blow page as {string}")
    public void i_verify_charles_m_blow_page_as(String string) {validateByTitle("Charles M. Blow - The New York Times");

    }
    //check Jamelle Bouie page
    @When("I click on Jamelle Bouie button")
    public void i_click_on_jamelle_bouie_button() throws InterruptedException {
        homePage.opinionButton.click();sleepFor(2);
        homePage.clumnists.click();sleepFor(2);
        homePage.jamelle.click();
    }
    @Then("I verify Jamelle Bouie page as {string}")
    public void i_verify_jamelle_bouie_page_as(String string) {validateByTitle("Jamelle Bouie - The New York Times");
    }
    // check david brook page
    @When("I click on david brooks button")
    public void i_click_on_david_brooks_button() throws InterruptedException {
        homePage.opinionButton.click();sleepFor(2);
        homePage.clumnists.click();sleepFor(2);
        homePage.davidBrook.click();
    }
    @Then("I verify david brooks page as {string}")
    public void i_verify_david_brooks_page_as(String string) {validateByTitle("David Brooks - The New York Times");
    }
    //check roger cohen
    @When("I click on Roger Cohen button")
    public void i_click_on_roger_cohen_button() throws InterruptedException {
        homePage.opinionButton.click();sleepFor(2);
        homePage.clumnists.click();sleepFor(2);
        homePage.roger.click();
    }
    @Then("I verify Roger Cohen page as {string}")
    public void i_verify_roger_cohen_page_as(String string) {validateByTitle("Roger Cohen - The New York Times");

    }
    //check gail collins
    @When("I click on gail collins button")
    public void i_click_on_gail_collins_button() throws InterruptedException {
        homePage.opinionButton.click();sleepFor(2);
        homePage.clumnists.click();sleepFor(2);
        homePage.gailCollins.click();
    }
    @Then("I verify gail collins page as {string}")
    public void i_verify_gail_collins_page_as(String string) {validateByTitle("Gail Collins - The New York Times");
    }
    //check Ross Douthat page
    @When("I click on Ross Douthat button")
    public void i_click_on_ross_douthat_button() throws InterruptedException {
        homePage.opinionButton.click();sleepFor(2);
        homePage.clumnists.click();sleepFor(2);
        homePage.rossDouthat.click();
    }
    @Then("I verify Ross Douthat page as {string}")
    public void i_verify_ross_douthat_page_as(String string) {validateByTitle("Ross Douthat - The New York Times");
    }
    //check Maureen Dowd page

    @When("I click on Maureen Dowd button")
    public void i_click_on_maureen_dowd_button() throws InterruptedException {
        homePage.opinionButton.click();sleepFor(2);
        homePage.clumnists.click();sleepFor(2);
        homePage.maureenDowd.click();
    }
    @Then("I verify Maureen Dowd page as {string}")
    public void i_verify_maureen_dowd_page_as(String string) {validateByTitle("Maureen Dowd - The New York Times");
    }
    //check thomas page
    @When("I click on Thomas L. Friedman button")
    public void i_click_on_thomas_l_friedman_button() throws InterruptedException {
        homePage.opinionButton.click();sleepFor(2);
        homePage.clumnists.click();sleepFor(2);
        homePage.thomas.click();
    }
    @Then("I verify Thomas L. Friedman page as {string}")
    public void i_verify_thomas_l_friedman_page_as(String string) {validateByTitle("Thomas L. Friedman - The New York Times");
    }
    //check michell page
    @When("I click on Michelle Goldberg button")
    public void i_click_on_michelle_goldberg_button() throws InterruptedException {
        homePage.opinionButton.click();sleepFor(2);
        homePage.clumnists.click();sleepFor(2);
        homePage.michelle.click();
    }
    @Then("I verify Michelle Goldberg page as {string}")
    public void i_verify_michelle_goldberg_page_as(String string) {validateByTitle("Michelle Goldberg - The New York Times");
    }
    //check Nicholas Kristof page
    @When("I click on Nicholas Kristof button")
    public void i_click_on_nicholas_kristof_button() throws InterruptedException {
        homePage.opinionButton.click();sleepFor(2);
        homePage.clumnists.click();sleepFor(2);
        homePage.nicholas.click();
    }
    @Then("I verify Nicholas Kristof page as {string}")
    public void i_verify_nicholas_kristof_page_as(String string) {validateByTitle("Nicholas Kristof - The New York Times");
    }
    // check Paul Krugman
    @When("I click on Paul Krugman button")
    public void i_click_on_paul_krugman_button() throws InterruptedException {
        homePage.opinionButton.click();sleepFor(2);
        homePage.clumnists.click();sleepFor(2);
        homePage.paul.click();
    }
    @Then("I verify Paul Krugman page as {string}")
    public void i_verify_paul_krugman_page_as(String string) {validateByTitle("Paul Krugman - The New York Times");
    }
    //check ferhad
    @When("I click on Farhad Manjoo button")
    public void i_click_on_farhad_manjoo_button() throws InterruptedException {
        homePage.opinionButton.click();sleepFor(2);
        homePage.clumnists.click();sleepFor(2);
        homePage.ferhad.click();
    }
    @Then("I verify Farhad Manjoo page as {string}")
    public void i_verify_farhad_manjoo_page_as(String string) {validateByTitle("Farhad Manjoo - The New York Times");
    }
    //check jennifer page
    @When("I click on Jennifer Senior button")
    public void i_click_on_jennifer_senior_button() throws InterruptedException {
        homePage.opinionButton.click();sleepFor(2);
        homePage.clumnists.click();sleepFor(2);
        homePage.jennifer.click();
    }
    @Then("I verify Jennifer Senior page as {string}")
    public void i_verify_jennifer_senior_page_as(String string) {validateByTitle("Jennifer Senior - The New York Times");
    }
    //check bret page
    @When("I click on Bret Stephens button")
    public void i_click_on_bret_stephens_button() throws InterruptedException {
        homePage.opinionButton.click();sleepFor(2);
        homePage.clumnists.click();sleepFor(2);
        homePage.bret.click();
    }
    @Then("I verify Bret Stephens page as {string}")
    public void i_verify_bret_stephens_page_as(String string) {validateByTitle("Bret Stephens - The New York Times");
    }
    // check series /disability

    @When("I click on series button")
    public void i_click_on_series_button() throws InterruptedException {
        homePage.opinionButton.click();sleepFor(2);
        homePage.series.click();sleepFor(2);
    }
    @When("I click on disability")
    public void i_click_on_disability() throws InterruptedException {
        homePage.disability.click();sleepFor(2);
    }
    @Then("I verify disability  page as {string}")
    public void i_verify_disability_page_as(String string) {validateByTitle("Disability - The New York Times");
    }
    //check fixes page
    @When("I click on fixes button")
    public void i_click_on_fixes_button() throws InterruptedException {
        homePage.opinionButton.click();sleepFor(2);
        homePage.series.click();sleepFor(2);
        homePage.fixes.click();
    }
    @Then("I verify fixes page as {string}")
    public void i_verify_fixes_page_as(String string) {validateByTitle("Fixes - The New York Times");
    }
    //check on campus page
    @When("I click on onCampus button")
    public void i_click_on_on_campus_button() throws InterruptedException {
        homePage.opinionButton.click();sleepFor(2);
        homePage.series.click();sleepFor(2);
        homePage.onCampus.click();
    }
    @Then("I verify on campus page as {string}")
    public void i_verify_on_campus_page_as(String string) {validateByTitle("On Campus - The New York Times");
    }
    //check red century page
    @When("I click on red century button")
    public void i_click_on_red_century_button() throws InterruptedException {
        homePage.opinionButton.click();sleepFor(2);
        homePage.series.click();sleepFor(2);
        homePage.redCentury.click();
    }
    @Then("I verify red century page as {string}")
    public void i_verify_red_century_page_as(String string) {validateByTitle("Red Century - The New York Times");
    }
    //check sporting page
    @When("I click on sporting button")
    public void i_click_on_sporting_button() throws InterruptedException {
        homePage.opinionButton.click();sleepFor(2);
        homePage.series.click();sleepFor(2);
        homePage.sporting.click();
    }
    @Then("I verify sporting page as {string}")
    public void i_verify_sporting_page_as(String string) {validateByTitle("Sporting - The New York Times");
    }
    // che the stone page
    @When("I click on the stone button")
    public void i_click_on_the_stone_button() throws InterruptedException {
        homePage.opinionButton.click();sleepFor(2);
        homePage.series.click();sleepFor(2);
        homePage.theStone.click();
    }
    @Then("I verify the stone page as {string}")
    public void i_verify_the_stone_page_as(String string) {validateByTitle("The Stone - The New York Times");
    }
    //check vietnam page
    @When("I click on vietnam button")
    public void i_click_on_vietnam_button() throws InterruptedException {
        homePage.opinionButton.click();sleepFor(2);
        homePage.series.click();sleepFor(2);
        homePage.vietnam.click();
    }
    @Then("I verify vietnam page as {string}")
    public void i_verify_vietnam_page_as(String string) {validateByTitle("Vietnam '67 - The New York Times");
    }
    //check editorial page
    @When("I click on editorial button")
    public void i_click_on_editorial_button() throws InterruptedException {
        homePage.opinionButton.click();sleepFor(2);
        homePage.editorial.click();sleepFor(2);
    }
    @Then("I verify editorial page as {string}")
    public void i_verify_editorial_page_as(String string) {validateByTitle("Editorials - The New York Times");
    }
    //check check the OPED page
    @When("I click on OPED button")
    public void i_click_on_oped_button() throws InterruptedException {
        homePage.opinionButton.click();sleepFor(2);
        homePage.oped.click();
    }
    @Then("I verify OPED page as {string}")
    public void i_verify_oped_page_as(String string) {validateByTitle("Contributors - The New York Times");
    }
    //check letter to the editor
    @When("I click on letters button")
    public void i_click_on_letters_button() throws InterruptedException {
        homePage.opinionButton.click();sleepFor(2);
        homePage.letters.click();
    }
    @Then("I verify letters page as {string}")
    public void i_verify_letters_page_as(String string) {validateByTitle("Letters to the Editor - The New York Times");
    }
    @When("I click on sundayReview button")
    public void i_click_on_sunday_review_button() throws InterruptedException {
        homePage.opinionButton.click();sleepFor(2);
        homePage.sundayReview.click();
    }
    @Then("I verify sundayReview page as {string}")
    public void i_verify_sunday_review_page_as(String string) {validateByTitle("Sunday Review - The New York Times");

    }
    @When("I click on video button")
    public void i_click_on_video_button() throws InterruptedException {
        homePage.opinionButton.click();sleepFor(2);
        homePage.video.click();
    }
    @Then("I verify video page as {string}")
    public void i_verify_video_page_as(String string) {validateByURL("https://www.nytimes.com/video/opinion");
    }

    @When("I click on gender and society button")
    public void i_click_on_gender_and_society_button() throws InterruptedException {
        homePage.opinionButton.click();sleepFor(2);
        homePage.genderSociety.click();
    }
    @Then("I verify gender and society page as {string}")
    public void i_verify_gender_and_society_page_as(String string) {validateByTitle("Gender & Society - The New York Times");
    }

    @When("I click on OpinionPolitics button")
    public void i_click_on_opinion_politics_button() throws InterruptedException {
        homePage.opinionButton.click();sleepFor(2);
        homePage.opinionPolitics.click();
    }
    @Then("I verify OpinionPolitics page as {string}")
    public void i_verify_opinion_politics_page_as(String string) {validateByTitle("Politics | Opinion - The New York Times");

    }
    @When("I click on opinionWorld button")
    public void i_click_on_opinion_world_button() throws InterruptedException {
        homePage.opinionButton.click();sleepFor(2);
        homePage.opinionWorld.click();
    }
    @Then("I verify opinionWorld page as {string}")
    public void i_verify_opinion_world_page_as(String string) {validateByTitle("The World - The New York Times");
    }

    @When("I click on opinionBusiness button")
    public void i_click_on_opinion_business_button() throws InterruptedException {
        homePage.opinionButton.click();sleepFor(2);
        homePage.opinionBusiness.click();
    }
    @Then("I verify opinionBusiness page as {string}")
    public void i_verify_opinion_business_page_as(String string) {validateByTitle("Business & Economics - The New York Times");
    }

    @When("I click on opinionTech button")
    public void i_click_on_opinion_tech_button() throws InterruptedException {
        homePage.opinionButton.click();sleepFor(2);
        homePage.opinionTech.click();
    }
    @Then("I verify opinionTech page as {string}")
    public void i_verify_opinion_tech_page_as(String string) {validateByTitle("Opinion | Technology - The New York Times");

    }
    @When("I click on opinionEnvironment button")
    public void i_click_on_opinion_environment_button() throws InterruptedException {
        homePage.opinionButton.click();sleepFor(2);
        homePage.opinionEnvironment.click();
    }
    @Then("I verify opinionEnvironment page as {string}")
    public void i_verify_opinion_environment_page_as(String string) {validateByTitle("Environment - The New York Times");

    }
    @When("I click on opinionHealth button")
    public void i_click_on_opinion_health_button() throws InterruptedException {
        homePage.opinionButton.click();sleepFor(2);
        homePage.opinionHealth.click();
    }
    @Then("I verify opinionHealth page as {string}")
    public void i_verify_opinion_health_page_as(String string) {validateByTitle("Health and Wellness - The New York Times");

    }
    @When("I click on opinionCulture button")
    public void i_click_on_opinion_culture_button() throws InterruptedException {
        homePage.opinionButton.click();sleepFor(2);
        homePage.opinionCulture.click();
    }
    @Then("I verify opinionCulture page as {string}")
    public void i_verify_opinion_culture_page_as(String string) {validateByTitle("Culture - The New York Times");

    }



}

