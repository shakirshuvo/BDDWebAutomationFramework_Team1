package homeSaumitra;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.List;

import static homeSaumitra.HomePageWebElementsS.*;



public class HomePageS extends CommonAPI {

    String expected;
    String actual;

    String expectedResult;

    public void validateBestSellers(){
        actual= driver.getTitle();
        expected="Amazon.com Best Sellers: The most popular items on Amazon";
        Assert.assertEquals(actual, expected, "failed");
    }
    public void validateCustomerService(){
        actual= driver.getTitle();
        expected= "\n"+"Amazon.com Help: Help & Customer Service";
        Assert.assertEquals(actual, expected, "failed");
    }

    public void validateTodaysDeals(){
        actual= driver.getTitle();
        expected="\n" + "\n" + " Gold Box Deals | Today's Deals - Amazon.com\n";
        Assert.assertEquals(actual, expected, "failed");
    }
    public void validateNewReleases(){
        actual= driver.getTitle();
        expected="Amazon.com New Releases: The best-selling new & future releases on Amazon";
        Assert.assertEquals(actual, expected, "failed");
    }
    public void validatefind_a_gift(){
        actual= driver.getTitle();
        expected="Gifts for Everyone | Amazon.com Gift Finder";
        Assert.assertEquals(actual, expected, "failed");
    }
    public void validateWholeFoods(){
        actual= driver.getTitle();
        expected="Whole Foods Market @ Amazon.com";
        Assert.assertEquals(actual, expected, "failed");
    }
    public void validateGiftCards(){
        actual= driver.getTitle();
        expected="Amazon.com Gift Cards";
        Assert.assertEquals(actual, expected, "failed");
    }
    public void validateFreeShipping(){
        actual= driver.getTitle();
        expected="Amazon.com: : FREE Shipping by Amazon";
        Assert.assertEquals(actual, expected, "failed");
    }
    public void validateRegistry(){
        actual= driver.getTitle();
        expected="Amazon.com: : Registry";
        Assert.assertEquals(actual, expected, "failed");
    }
    public void validateSell(){
        actual= driver.getTitle();
        expected="Amazon.com: Sell Products Online with Selling on Amazon.";
        Assert.assertEquals(actual, expected, "failed");
    }
    public void validateCoupons(){
        actual= driver.getTitle();
        expected="Amazon.com: Coupons";
        Assert.assertEquals(actual, expected, "failed");
    }
    public void validateAmazonBasics(){
        actual= driver.getTitle();
        expected="Amazon.com: AmazonBasics: AmazonBasics";
        Assert.assertEquals(actual, expected, "failed");
    }
    public void validateFoundItOnAmazon(){
        actual= driver.getTitle();
        expected="#FoundItOnAmazon";
        Assert.assertEquals(actual, expected, "failed");
    }
    public void validateAccountLists(){
        actual= driver.getTitle();
        expected="\"\";\n";
        Assert.assertEquals(actual, expected, "failed");
    }
    public void validateOrders(){
        actual= driver.getTitle();
        expected="order:amazon";
        Assert.assertEquals(actual, expected, "failed");
    }
    public void validateTryPrimes(){
        actual= driver.getTitle();
        expected="Amazon.com: Amazon Prime";
        Assert.assertEquals(actual, expected, "failed");
    }
    public void validateCart(){
        actual= driver.getTitle();
        expected="Amazon.com Shopping Cart";
        Assert.assertEquals(actual, expected, "failed");
    }
    public void validateSelectYourAddress(){
        actual= driver.getTitle();
        expected="negative testing";
        Assert.assertEquals(actual, expected, "failed");
    }
    public void validateCareers(){
        actual= driver.getTitle();
        expected="Amazon.jobs: Help us build Earthâ€™s most customer-centric company.";
        Assert.assertEquals(actual, expected, "failed");
    }
    public void validateBlog(){
        actual= driver.getTitle();
        expected="Day One: The Amazon Blog";
        Assert.assertEquals(actual, expected, "failed");
    }
    public void validateAmazonDevices(){
        actual= driver.getTitle();
        expected="Amazon Devices - Official Site - Kindle, Fire, Echo devices";
        Assert.assertEquals(actual, expected, "failed");
    }
    public void validatepressCenter(){
        actual= driver.getTitle();
        expected="Press center | Amazon.com, Inc. - Press Room";
        Assert.assertEquals(actual, expected, "failed");
    }
    public void validateAmazonTours(){
        actual= driver.getTitle();
        expected="Amazon Fulfillment: Book a Warehouse Tour";
        Assert.assertEquals(actual, expected, "failed");
    }
    public void validateSellOnAmazon(){
        actual= driver.getTitle();
        expected="Sell on Amazon | Build Your Ecommerce Business";
        Assert.assertEquals(actual, expected, "failed");
    }
    public void validateBecomeAffiliate(){
        actual= driver.getTitle();
        expected="Amazon.com Associates Central";
        Assert.assertEquals(actual, expected, "failed");
    }
    public void validateAdvertiseProducts(){
        actual= driver.getTitle();
        expected="Amazon Advertising: Online advertising on Amazon";
        Assert.assertEquals(actual, expected, "failed");
    }
    public void validateAmazonStoreCard(){
        actual= driver.getTitle();
        expected="Amazon Sign-In";
        Assert.assertEquals(actual, expected, "failed");
    }
    public void validateShopWithPoints(){
        actual= driver.getTitle();
        expected="Amazon.com: Credit & Payment Cards";
        Assert.assertEquals(actual, expected, "failed");
    }
    public void validateCurrencyConverter(){
        actual= driver.getTitle();
        expected="Amazon.com: Amazon Currency Converter";
        Assert.assertEquals(actual, expected, "failed");
    }
    public void validateCreditCardMarketPlace(){
        actual= driver.getTitle();
        expected="Credit Cards and Payment Cards: Compare and Review at Amazon.com";
        Assert.assertEquals(actual, expected, "failed");
    }

}
