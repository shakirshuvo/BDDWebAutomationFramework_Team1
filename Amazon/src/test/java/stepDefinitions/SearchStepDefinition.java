package stepDefinitions;

import base.CommonAPI;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import search.Search;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static search.SearchWebElements.*;

public class SearchStepDefinition extends CommonAPI {


    static HomePage homePage;

    @BeforeStep
    public static void getInit() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }

    @Then("I verify Amazon homepage with title")
    public void i_verify_amazon_homepage_with_title() {
        validateByTitle(homePageTitleText);
    }

    @When("I click on 'Today's Deal' tab")
    public void i_click_on_today_s_deal_tab() {
        clickOnElement(todaysDealTabXpathWebElement);
    }

    @Then("I verify 'Today's Deal' with title")
    public void i_verify_today_s_deal_with_title() {
        validateByTitle(todaysDealTitleText);
    }

    @Then("I verify 'Today's Deal' with 'Deals and Promotions' text being displayed")
    public void i_verify_today_s_deal_with_deals_and_promotions_text_being_displayed() {
        elementIsDisplayed(todaysDealPromotionsTextXPathWebElement);
    }

    @When("I click on {string} tab")
    public void i_click_on_tab(String string) {
        clickOnElement(customerServiceTabXpathWebElement);
    }

    @Then("I verify {string} with with title")
    public void i_verify_with_with_title(String string) {
        validateByTitle(customerServiceTitleText);
    }

    @Then("I verify {string} with {string} text")
    public void i_verify_with_text(String string, String string2) {
        validateByText(customerServiceVerificationTextXPathWebElement, "Hello. What can we help you with?");
    }

    @When("I click on Gift Cards tab")
    public void i_click_on_gift_cards_tab() {
        clickOnElement(giftCardsTabXPathWebElement);
    }

    @Then("I verify Gift Cards tab with with title {string}")
    public void i_verify_gift_cards_tab_with_with_title(String string) {
        validateByTitle(giftCardsTitleText);
    }

    @Then("I verify Gift Cards with {string} text")
    public void i_verify_gift_cards_with_text(String string) {
        validateByText(giftCardsVerificationTextXpathWebElement, "Gift Cards");
    }

    @When("I click on Registry tab")
    public void i_click_on_registry_tab() {
        clickOnElement(registryTabXPathWebElement);
    }

    @Then("I verify Registry tab with with title {string}")
    public void i_verify_registry_tab_with_with_title(String string) {
        validateByTitle(registryTitleText);
    }

    @When("I click on Sell tab")
    public void i_click_on_sell_tab() {
        clickOnElement(sellTabXPathWebElement);
    }

    @Then("I verify Sell tab with with title {string}")
    public void i_verify_sell_tab_with_with_title(String string) {
        validateByTitle(sellTitleText);
    }

    @Then("I verify Sell tab with {string} text")
    public void i_verify_sell_tab_with_text(String string) {
        validateByText(sellVerificationTextXPathWebElement, "Become an\n" +
                "Amazon seller");
    }

    @When("I click on Music link")
    public void i_click_on_music_link() {
        clickOnElement(musicLinkXPathWebElement);
    }

    @Then("I verify Music link with with URL {string}")
    public void i_verify_music_link_with_with_url(String string) {
        validateByURL(musicURL);
    }

    @Then("I verify Music link with title {string}")
    public void i_verify_music_link_with_title(String string) {
        validateByTitle(musicTitleText);
    }

    @When("I click on Advertise Your Product link")
    public void i_click_on_advertise_your_product_link() {
        clickOnElement(advertisingLinkXPathWebElement);
    }

    @When("I verify Advertise Your Product link with title {string}")
    public void i_verify_advertise_your_product_link_with_title(String string) {
        validateByTitle(advertisingTitle);
    }

    @Then("I verify Advertise Your Product link with URL {string}")
    public void i_verify_advertise_your_product_link_with_url(String string) throws InterruptedException {
        sleepFor(3);
        validateByURL(advertisingURL);
    }

    @Then("I verify Advertise Your Product link with text {string}")
    public void i_verify_advertise_your_product_link_with_text(String string) {
        validateByText(advertisingTextXPath, "Advertise with intent");
    }

    @When("I click on Shop By Category burger button")
    public void i_click_on_shop_by_category_burger_button() {
        clickOnElement(shopByCategoryHamburgerCSSWebElement);
    }

    @When("I click on Computers")
    public void i_click_on_computers() {
        clickOnElement(computerInShopByCategoryHamburgerXpathWebElement);
    }

    @When("I click on Computers & Tablets")
    public void i_click_on_computers_tablets() {
        clickOnElement(computerAndTabletsInShopByCategoryHamburgerXpathWebElement);
    }

    @Then("I verify Computers & Tablets page with ASUS on {string} selection")
    public void i_verify_computers_tablets_page_with_asus_on_selection(String string) {
        validateByText(asusFeaturedBrandSelectionXpathWebElement, "ASUS");
    }

    @When("I click on HP checkbox from Featured Brands selection")
    public void i_click_on_hp_checkbox_from_featured_brands_selection() {
        clickOnElement(hpFeaturedBrandSelectionXpathWebElement);
    }

    @Then("I verify that HP checkbox is selected.")
    public void i_verify_that_hp_checkbox_is_selected() {
        elementIsDisplayed(hpPageTextXpathWebElement);
    }
}
