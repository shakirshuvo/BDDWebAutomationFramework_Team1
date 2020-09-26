//package cart;
//
//import base.CommonAPI;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.testng.Assert;
//import java.util.ArrayList;
//import java.util.List;
//
////
//public class Cart extends CommonAPI {
//
//    /**
//     * This method creates a list of values from a locator.
//     *
//     * @param locator requires an class type locator.
//     * @return list of values from the locator.
//     */
//    public List<WebElement> getListOfWebElementsByClass(String locator) {
//        List<WebElement> list = new ArrayList<WebElement>();
//        list = driver.findElements(By.className(locator));
//        return list;
//    }
//
//    /**
//     * This method iterates list from the getListOfWebElementsByClass method.
//     *
//     * @param list list of values from the locator.
//     * @return items from the list of getListOfWebElementsByID method.
//     */
//    public List<String> getListOfString(List<WebElement> list) {
//        List<String> items = new ArrayList<String>();
//        for (WebElement element : list) {
//            items.add(element.getText());
//        }
//        return items;
//    }
//
//    /**
//     * This method validates that all the values (items) were iterated from the locator of the Qty drop down in cart.
//     */
//    public void validateAllDropDown() {
//        List<WebElement> element = getListOfWebElementsByClass("a-popover-wrapper");
//        List<String> listOfText = getListOfString(element);
//        for (String st : listOfText) {
//            System.out.println(st);
//        }
//        List<String> expectedMenu = listOfText;
//        Assert.assertEquals(listOfText, expectedMenu);
//    }
//
//}
