package stepDefinitions;

import base.CommonAPI;
import home.HomePage;
import io.cucumber.java.*;
import io.cucumber.java.en.*;

import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static home.HomePageWebElements.*;

public class HomeStepDefinition extends CommonAPI {

    static HomePage homePage;
    @BeforeStep
    public static void getInit(){
        homePage= PageFactory.initElements(driver, HomePage.class);
    }
    @After
    public void closeBrowser(){
        cleanUp();
    }

    @Given("I am on Amazon Homepage")
    public void iAmOnAmazonHomepage() throws IOException {
        openBrowser();
    }


    @When("I click on Best sellers a new page appears")
    public void i_click_on_best_sellers_a_new_page_appears() {
        homePage.clickOnElement(bestSellersXPATH);
    }

    @Then("I validate the test1 by page title")
    public void i_validate_the_test1_by_page_title() {
        homePage.validateBestSellers();
    }
    @When("I click on Customer Service a new page appears")
    public void i_click_on_customer_service_a_new_page_appears() {
        homePage.clickByLinkText(customerServiceLinkTest);
    }

    @Then("I validate the test2 by page title")
    public void i_validate_the_test2_by_page_title() {
        homePage.validateCustomerService();
    }
    @When("I click on Todays Deal a new page appears")
    public void i_click_on_todays_deal_a_new_page_appears() {
        homePage.clickByLinkText(todaysDealsLinkTest);
    }

    @Then("I validate the test3 by page title")
    public void i_validate_the_test3_by_page_title() {
        homePage.validateTodaysDeals();
    }
    @When("I click on New Releases a new page appears")
    public void i_click_on_new_releases_a_new_page_appears() {
        homePage.clickByLinkText(newReleasesLinkTest);
    }

    @Then("I validate the test4 by page title")
    public void i_validate_the_test4_by_page_title() {
        homePage.validateNewReleases();
    }
    @When("I click on Find a Gift a new page appears")
    public void i_click_on_find_a_gift_a_new_page_appears() {
        homePage.clickByLinkText(find_a_giftLinkTest);
    }

    @Then("I validate the test5 by page title")
    public void i_validate_the_test5_by_page_title() {
        homePage.validatefind_a_gift();
    }
    @When("I click on Whole Foods a new page appears")
    public void i_click_on_whole_foods_a_new_page_appears() {
        homePage.clickByLinkText(wholeFoodsLinkTest);
    }

    @Then("I validate the test6 by page title")
    public void i_validate_the_test6_by_page_title() {
        homePage.validateWholeFoods();
    }
    @When("I click on Gift Cards a new page appears")
    public void i_click_on_gift_cards_a_new_page_appears() {
        homePage.clickByLinkText(giftCardsLinkTest);
    }

    @Then("I validate the test7 by page title")
    public void i_validate_the_test7_by_page_title() {
        homePage.validateGiftCards();
    }
    @When("I click on Free Shipping a new page appears")
    public void i_click_on_free_shipping_a_new_page_appears() {
        homePage.clickByLinkText(freeShippingLinkTest);
    }

    @Then("I validate the test8 by page title")
    public void i_validate_the_test8_by_page_title() {
        homePage.validateFreeShipping();
    }
    @When("I click on Registry a new page appears")
    public void i_click_on_registry_a_new_page_appears() {
        homePage.clickByLinkText(registryLinkTest);
    }

    @Then("I validate the test by9 page title")
    public void i_validate_the_test9_by_page_title() {
        homePage.validateRegistry();
    }
    @When("I click on Sell a new page appears")
    public void i_click_on_sell_a_new_page_appears() {
        homePage.clickByLinkText(sellLinkTest);
    }

    @Then("I validate the test10 by page title")
    public void i_validate_the_test10_by_page_title() {
        homePage.validateSell();
    }
    @When("I click on Coupons a new page appears")
    public void i_click_on_coupons_a_new_page_appears() {
        homePage.clickByLinkText(couponsLinkTest);
    }

    @Then("I validate the test11 by page title")
    public void i_validate_the_test11_by_page_title() {
        homePage.validateCoupons();
    }
    @When("I click on Amazon Basics a new page appears")
    public void i_click_on_amazon_basics_a_new_page_appears() {
        homePage.clickByLinkText(amazonBasicsLinkTest);
    }

    @Then("I validate the test12 by page title")
    public void i_validate_the_test12_by_page_title() {
        homePage.validateAmazonBasics();
    }
    @When("I click on Found It On Amazon a new page appears")
    public void i_click_on_found_it_on_amazon_a_new_page_appears() {
        homePage.clickByLinkText(foundItOnAmazonLinkTest);
    }

    @Then("I validate the test13 by page title")
    public void i_validate_the_test13_by_page_title() {
        homePage.validateFoundItOnAmazon();
    }
    @When("I click on Account Lists a new page appears")
    public void i_click_on_account_lists_a_new_page_appears() {
        homePage.clickOnElement(account_listsByClassName);
    }

    @Then("I validate the test14 by page title")
    public void i_validate_the_test14_by_page_title() {
        homePage.validateAccountLists();
    }
    @When("I click on Orders a new page appears")
    public void i_click_on_orders_a_new_page_appears() {
        homePage.clickOnElement(ordersByCSS);
    }

    @Then("I validate the test15 by page title")
    public void i_validate_the_test15_by_page_title() {
        homePage.validateOrders();
    }
    @When("I click on Try Prime a new page appears")
    public void i_click_on_try_prime_a_new_page_appears() {
        homePage.clickOnElement(tryPrimeByClassName);
    }

    @Then("I validate the test16 by page title")
    public void i_validate_the_test16_by_page_title() {
        homePage.validateTryPrimes();
    }
    @When("I click on Cart a new page appears")
    public void i_click_on_cart_a_new_page_appears() {
        homePage.clickOnElement(cartByClassName);
    }

    @Then("I validate the test17 by page title")
    public void i_validate_the_test17_by_page_title() {
        homePage.validateCart();
    }
    @When("I click on Select Your Address a new page appears")
    public void i_click_on_select_your_address_a_new_page_appears() {
        homePage.clickOnElement(selectYourAddressID);
    }

    @Then("I validate the test18 by page title")
    public void i_validate_the_test18_by_page_title() {
        homePage.validateSelectYourAddress();
    }
    @When("I click on Careers a new page appears")
    public void i_click_on_careers_a_new_page_appears() {
        homePage.clickByLinkText(careersByLinkTest);
    }

    @Then("I validate the test19 by page title")
    public void i_validate_the_test19_by_page_title() {
        homePage.validateCareers();
    }
    @When("I click on Blog a new page appears")
    public void i_click_on_blog_a_new_page_appears() {
        homePage.clickByLinkText(blogByLinkTest);
    }

    @Then("I validate the test20 by page title")
    public void i_validate_the_test20_by_page_title() {
        homePage.validateBlog();
    }
    @When("I click on Amazon Devices a new page appears")
    public void i_click_on_amazon_devices_a_new_page_appears() {
        homePage.clickByLinkText(amazonDevicesByLinkTest);
    }

    @Then("I validate the test21 by page title")
    public void i_validate_the_test21_by_page_title() {
        homePage.validateAmazonDevices();
    }
    @When("I click on Press Center a new page appears")
    public void i_click_on_press_center_a_new_page_appears() {
        homePage.clickOnElement(pressCenterByCustomXPATH);
    }

    @Then("I validate the test22 by page title")
    public void i_validate_the_test22_by_page_title() {
        homePage.validatepressCenter();
    }
    @When("I click on Amazon Tours a new page appears")
    public void i_click_on_amazon_tours_a_new_page_appears() {
        homePage.clickOnElement(amazonToursByCustomXPATH);
    }

    @When("I validate the test23 by page title")
    public void i_validate_the_test23_by_page_title() {
        homePage.validateAmazonTours();
    }
    @When("I click on Sell On Amazon a new page appears")
    public void i_click_on_sell_on_amazon_a_new_page_appears() {
        homePage.clickOnElement(sellOnAmazonXPATH);
    }

    @When("I validate the test24 by page title")
    public void i_validate_the_test24_by_page_title() {
        homePage.validateSellOnAmazon();
    }
    @When("I click on Become Affiliate a new page appears")
    public void i_click_on_become_affiliate_a_new_page_appears() {
        homePage.clickByLinkText(becomeAffiliateByLinkTest);
    }

    @When("I validate the test25 by page title")
    public void i_validate_the_test25_by_page_title() {
        homePage.validateBecomeAffiliate();
    }
    @When("I click on Advertise Products a new page appears")
    public void i_click_on_advertise_products_a_new_page_appears() {
        homePage.clickByLinkText(advertiseProductsByLinkTest);
    }

    @When("I validate the test26 by page title")
    public void i_validate_the_test26_by_page_title() {
        homePage.validateAdvertiseProducts();
    }
    @When("I click on Amazon Store Card a new page appears")
    public void i_click_on_amazon_store_card_a_new_page_appears() {
        homePage.clickByLinkText(amazonStoreCardLinkTest);
    }

    @When("I validate the test27 by page title")
    public void i_validate_the_test27_by_page_title() {
        homePage.validateAmazonStoreCard();
    }
    @When("I click on Shop With Points a new page appears")
    public void i_click_on_shop_with_points_a_new_page_appears() {
        homePage.clickByLinkText(shopWithPointsLinkTest);
    }

    @When("I validate the test28 by page title")
    public void i_validate_the_test28_by_page_title() {
        homePage.validateShopWithPoints();
    }
    @When("I click on Currency Converter a new page appears")
    public void i_click_on_currency_converter_a_new_page_appears() {
        homePage.clickByLinkText(currencyConverterByLinkTest);
    }

    @When("I validate the test29 by page title")
    public void i_validate_the_test29_by_page_title() {
        homePage.validateCurrencyConverter();
    }
    @When("I click on Credit Card Market Place a new page appears")
    public void i_click_on_credit_card_market_place_a_new_page_appears() {
        homePage.clickOnElement(creditCardMarketPlaceXPATH);
    }

    @When("I validate the test30 by page title")
    public void i_validate_the_test30_by_page_title() {
        homePage.validateCreditCardMarketPlace();
    }


}
