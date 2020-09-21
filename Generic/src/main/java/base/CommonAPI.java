package base;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;
import reporting.ExtentManager;
import reporting.ExtentTestManager;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CommonAPI {
    //ExtentReport
    public static ExtentReports extent;

    @BeforeSuite
    public void extentSetup(ITestContext context) {
        ExtentManager.setOutputDirectory(context);
        extent = ExtentManager.getInstance();
    }

    @BeforeMethod
    public void startExtent(Method method) {
        String className = method.getDeclaringClass().getSimpleName();
        String methodName = method.getName().toLowerCase();
        ExtentTestManager.startTest(method.getName());
        ExtentTestManager.getTest().assignCategory(className);
    }

    protected String getStackTrace(Throwable t) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        t.printStackTrace(pw);
        return sw.toString();
    }

    @AfterMethod
    public void afterEachTestMethod(ITestResult result) {
        ExtentTestManager.getTest().getTest().setStartedTime(getTime(result.getStartMillis()));
        ExtentTestManager.getTest().getTest().setEndedTime(getTime(result.getEndMillis()));

        for (String group : result.getMethod().getGroups()) {
            ExtentTestManager.getTest().assignCategory(group);
        }

        if (result.getStatus() == 1) {
            ExtentTestManager.getTest().log(LogStatus.PASS, "Test Passed");
        } else if (result.getStatus() == 2) {
            ExtentTestManager.getTest().log(LogStatus.FAIL, getStackTrace(result.getThrowable()));
        } else if (result.getStatus() == 3) {
            ExtentTestManager.getTest().log(LogStatus.SKIP, "Test Skipped");
        }
        ExtentTestManager.endTest();
        extent.flush();
        if (result.getStatus() == ITestResult.FAILURE) {
            captureScreenshot(driver, result.getName());
        }
        driver.quit();
    }

    @AfterSuite
    public void generateReport() {
        extent.close();
    }


    private Date getTime(long millis) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        return calendar.getTime();
    }

    public static void captureScreenshot(WebDriver driver, String screenshotName) {
        DateFormat df = new SimpleDateFormat("(yyMMddHHmmssZ)");
        //DateFormat df = new SimpleDateFormat("(MM.dd.yyyy-HH:mma)");
        Date date = new Date();
        df.format(date);

        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file,
                    new File(System.getProperty("user.dir") + "/Screenshots/" + screenshotName + " " + df.format(date) + ".png"));
            System.out.println("Screenshot captured");
        } catch (Exception e) {
            System.out.println("Exception while taking screenshot " + e.getMessage());
        }

    }

    public static String convertToString(String st) {
        String splitString = "";
        splitString = StringUtils.join(StringUtils.splitByCharacterTypeCamelCase(st), ' ');
        return splitString;
    }

    //Browser SetUp
    public static WebDriver driver = null;
    public String browserstack_username = "mhs5";
    public String browserstack_accesskey = "dGpR3twU2pLPLgXZxmSa";
    public String saucelabs_username = "";
    public String saucelabs_accesskey = "";

//    public void openBrowser(String url, String os) throws IOException {
////        setUp(false, "browserstack", "windows", "10", "chrome-options", "85", url);
////        setUp(false, "browserstack", "windows", "10", "chrome-options", "85", "https://www.amazon.com/");
//        String mac = "OS X";
//        String windows = "Windows";
//        if (os.equalsIgnoreCase(mac)) {
//            setUp(false, "browserstack", "OS X", "10", "chrome-options", "85", url);
//
//        } else if (os.equalsIgnoreCase(windows)) {
//            setUp(false, "browserstack", "windows", "10", "chrome-options", "85", url);
//
//        }
//
//    }

    public void openBrowser(String url) throws IOException {
        String mac = "OS X";
        String windows = "windows";

        try {
            setUp(false, "browserstack", "windows", "10", "chrome-options", "85", url);
        } catch (Exception e) {
            System.out.println("Let's try Mac");
            setUp(false, "browserstack", "OS X", "catalina", "chrome-options", "85", url);
        }
    }


    @Parameters({"useCloudEnv", "cloudEnvName", "os", "os_version", "browserName", "browserVersion", "url"})
    @BeforeMethod
    public void setUp(@Optional("false") boolean useCloudEnv, @Optional("false") String cloudEnvName,
                      @Optional("windows") String os, @Optional("10") String os_version, @Optional("chrome-options") String browserName, @Optional("34")
                              String browserVersion, @Optional("https://www.google.com") String url) throws IOException {

        if (useCloudEnv == true) {
            if (cloudEnvName.equalsIgnoreCase("browserstack")) {
                getCloudDriver(cloudEnvName, browserstack_username, browserstack_accesskey, os, os_version, browserName, browserVersion);
            } else if (cloudEnvName.equalsIgnoreCase("saucelabs")) {
                getCloudDriver(cloudEnvName, saucelabs_username, saucelabs_accesskey, os, os_version, browserName, browserVersion);
            }
        } else {
            getLocalDriver(os, browserName);
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        driver.get(url);
        //driver.manage().window().maximize();
    }

    public WebDriver getLocalDriver(@Optional("mac") String OS, String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {
            if (OS.equalsIgnoreCase("OS X")) {
                System.setProperty("webdriver.chrome.driver", "../Generic/BrowserDriver/mac/chromedriver");
            } else if (OS.equalsIgnoreCase("Windows")) {
                System.setProperty("webdriver.chrome.driver", "../Generic/BrowserDriver/windows/chromedriver.exe");
            }
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("chrome-options")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications");
            if (OS.equalsIgnoreCase("OS X")) {
                System.setProperty("webdriver.chrome.driver", "../Generic/BrowserDriver/mac/chromedriver");
            } else if (OS.equalsIgnoreCase("Windows")) {
                System.setProperty("webdriver.chrome.driver", "../Generic/BrowserDriver/windows/chromedriver.exe");
            }
            driver = new ChromeDriver(options);
        } else if (browserName.equalsIgnoreCase("firefox")) {
            if (OS.equalsIgnoreCase("OS X")) {
                System.setProperty("webdriver.gecko.driver", "../Generic/BrowserDriver/mac/geckodriver");
            } else if (OS.equalsIgnoreCase("Windows")) {
                System.setProperty("webdriver.gecko.driver", "../Generic/BrowserDriver/windows/geckodriver.exe");
            }
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", "../Generic/BrowserDriver/windows/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }
        return driver;
    }

    public WebDriver getCloudDriver(String envName, String envUsername, String envAccessKey, String os, String os_version, String browserName,
                                    String browserVersion) throws IOException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("browser", browserName);
        cap.setCapability("browser_version", browserVersion);
        cap.setCapability("os", os);
        cap.setCapability("os_version", os_version);

        if (envName.equalsIgnoreCase("Saucelabs")) {
            //resolution for Saucelabs
            driver = new RemoteWebDriver(new URL("http://" + envUsername + ":" + envAccessKey +
                    "@ondemand.saucelabs.com:80/wd/hub"), cap);
        } else if (envName.equalsIgnoreCase("Browserstack")) {
            cap.setCapability("resolution", "1024x768");
            driver = new RemoteWebDriver(new URL("http://" + envUsername + ":" + envAccessKey +
                    "@hub-cloud.browserstack.com/wd/hub"), cap);
        }
        return driver;
    }

    @AfterMethod(alwaysRun = true)
    public void cleanUp() {
        //driver.close();
        driver.quit();
    }


    //helper methods

    public void clickOnElementByID(String locator) {
        driver.findElement(By.id(locator)).click();
    }

    public void clickOnElementByXpath(String locator) {
        driver.findElement(By.xpath(locator)).click();
    }

    public void clickOnElementByCSS(String locator) {
        driver.findElement(By.cssSelector(locator)).click();
    }

    public void clickOnElementByClass(String locator) {
        driver.findElement(By.className(locator)).click();
    }

    public void clickOnElement(String locator) {
        try {
            driver.findElement(By.xpath(locator)).click();
        } catch (Exception ex) {
            try {
                driver.findElement(By.cssSelector(locator)).click();
            } catch (Exception ex2) {
                try {
                    driver.findElement(By.id(locator)).click();
                } catch (Exception ex3) {
                    try {
                        driver.findElement(By.className(locator)).click();
                    } catch (Exception ex4) {
                        try {
                            driver.findElement(By.linkText(locator)).click();
                        } catch (Exception ex5) {

                        }
                    }
                }
            }
        }
    }

    public void typeOnElementByCSS(String locator, String value) {
        driver.findElement(By.cssSelector(locator)).sendKeys(value);
    }

    public void typeOnElementByXpath(String locator, String value) {
        driver.findElement(By.xpath(locator)).sendKeys(value);
    }

    public void typeOnElement(String locator, String value) {
        try {
            driver.findElement(By.id(locator)).sendKeys(value);
        } catch (Exception ex) {
            try {
                driver.findElement(By.xpath(locator)).sendKeys(value);
            } catch (Exception ex2) {
                try {
                    driver.findElement(By.cssSelector(locator)).sendKeys(value);
                } catch (Exception ex3) {
                    driver.findElement(By.className(locator)).sendKeys(value);
                }
            }
        }
    }

    public static void typeOnElementNEnterByID(String locator, String value) {
        driver.findElement(By.id(locator)).sendKeys(value, Keys.ENTER);
    }

    public static void typeOnElementNEnter(String locator, String value) {
        try {
            driver.findElement(By.xpath(locator)).sendKeys(value, Keys.ENTER);
        } catch (Exception ex1) {
            try {
                System.out.println("First Attempt was not successful");
                driver.findElement(By.id(locator)).sendKeys(value, Keys.ENTER);
            } catch (Exception ex2) {
                try {
                    System.out.println("Second Attempt was not successful");
                    driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
                } catch (Exception ex3) {
                    System.out.println("Third Attempt was not successful");
                    driver.findElement(By.name(locator)).sendKeys(value, Keys.ENTER);
                }
            }
        }
    }

    public static void typeOnElementNEnter(String locator, String value, WebDriver driver1) {
        try {
            driver1.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
        } catch (Exception ex1) {
            try {
                System.out.println("First Attempt was not successful");
                driver1.findElement(By.id(locator)).sendKeys(value, Keys.ENTER);
            } catch (Exception ex2) {
                try {
                    System.out.println("Second Attempt was not successful");
                    driver1.findElement(By.name(locator)).sendKeys(value, Keys.ENTER);
                } catch (Exception ex3) {
                    System.out.println("Third Attempt was not successful");
                    driver1.findElement(By.xpath(locator)).sendKeys(value, Keys.ENTER);
                }
            }
        }
    }

    public void submitOnElementByID(String locator) {
        driver.findElement(By.id(locator)).submit();
    }

    public void submitOnElement(String locator) {
        try {
            driver.findElement(By.xpath(locator)).submit();
        } catch (Exception ex) {
            try {
                driver.findElement(By.id(locator)).submit();
            } catch (Exception ex2) {
                try {
                    driver.findElement(By.cssSelector(locator)).submit();
                } catch (Exception ex3) {
                    driver.findElement(By.className(locator)).submit();
                }
            }
        }
    }

    public void clearInputFieldID(String locator) {
        driver.findElement(By.id(locator)).clear();
    }

    public void clearInputFieldCSS(String locator) {
        driver.findElement(By.cssSelector(locator)).clear();
    }

    public void clearInputBoxByWebElement(WebElement webElement) {
        webElement.clear();
    }

    public void navigateBack() {
        driver.navigate().back();
    }

    public static void clickOnElement(String locator, WebDriver driver1) {
        try {
            driver1.findElement(By.cssSelector(locator)).click();
        } catch (Exception ex1) {
            try {
                driver1.findElement(By.xpath(locator)).click();
            } catch (Exception ex2) {
                driver1.findElement(By.id(locator)).click();
            }
        }
    }

    public void typeOnInputField(String locator, String value) {
        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(value);
        } catch (Exception ex) {
            driver.findElement(By.id(locator)).sendKeys(value);
        }

    }

    public void typeByCss(String locator, String value) {
        driver.findElement(By.cssSelector(locator)).sendKeys(value);
    }

    public void typeByCssNEnter(String locator, String value) {
        driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
    }

    public void typeByXpath(String locator, String value) {
        driver.findElement(By.xpath(locator)).sendKeys(value);
    }

    public void takeEnterKeys(String locator) {
        driver.findElement(By.cssSelector(locator)).sendKeys(Keys.ENTER);
    }

    public List<WebElement> getListOfWebElementsById(String locator) {
        List<WebElement> list = new ArrayList<WebElement>();
        list = driver.findElements(By.id(locator));
        return list;
    }

    public static List<String> getTextFromWebElements(String locator) {
        List<WebElement> element = new ArrayList<WebElement>();
        List<String> text = new ArrayList<String>();
        element = driver.findElements(By.cssSelector(locator));
        for (WebElement web : element) {
            String st = web.getText();
            text.add(st);
        }
        return text;
    }

    public static List<String> getTextFromWebElements(String locator, WebDriver driver1) {
        List<WebElement> element = new ArrayList<WebElement>();
        List<String> text = new ArrayList<String>();
        element = driver1.findElements(By.cssSelector(locator));
        for (WebElement web : element) {
            String st = web.getText();
            text.add(st);
        }

        return text;
    }

    public static List<WebElement> getListOfWebElementsByCss(String locator) {
        List<WebElement> list = new ArrayList<WebElement>();
        list = driver.findElements(By.cssSelector(locator));
        return list;
    }

    public static List<WebElement> getListOfWebElementsByCss(String locator, WebDriver driver1) {
        List<WebElement> list = new ArrayList<WebElement>();
        list = driver1.findElements(By.cssSelector(locator));
        return list;
    }

    public List<WebElement> getListOfWebElementsByXpath(String locator) {
        List<WebElement> list = new ArrayList<WebElement>();
        list = driver.findElements(By.xpath(locator));
        return list;
    }

    public String getCurrentPageUrl() {
        String url = driver.getCurrentUrl();
        return url;
    }

    public void navigateForward() {
        driver.navigate().forward();
    }

    public String getTextByCss(String locator) {
        String st = driver.findElement(By.cssSelector(locator)).getText();
        return st;
    }

    public String getTextByXpath(String locator) {
        String st = driver.findElement(By.xpath(locator)).getText();
        return st;
    }

    public String getTextById(String locator) {
        return driver.findElement(By.id(locator)).getText();
    }

    public String getTextByName(String locator) {
        String st = driver.findElement(By.name(locator)).getText();
        return st;
    }

    public List<String> getListOfString(List<WebElement> list) {
        List<String> items = new ArrayList<String>();
        for (WebElement element : list) {
            items.add(element.getText());
        }
        return items;
    }

    public void selectOptionByVisibleTextByWebElement(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }

    public void selectOptionByVisibleTextByID(String element, String text) {
        Select select = new Select(driver.findElement(By.id(element)));
        select.selectByVisibleText(text);
    }

    public void selectOptionByVisibleText(String element, String text) {
        try {
            Select select = new Select(driver.findElement(By.cssSelector(element)));
            select.selectByVisibleText(text);
        } catch (Exception ex1) {
            try {
                System.out.println("First Attempt was not successful");
                Select select = new Select(driver.findElement(By.xpath(element)));
                select.selectByVisibleText(text);
            } catch (Exception ex2) {
                try {
                    System.out.println("Second Attempt was not successful");
                    Select select = new Select(driver.findElement(By.id(element)));
                    select.selectByVisibleText(text);
                } catch (Exception ex3) {
                    System.out.println("Third Attempt was not successful");
                    Select select = new Select(driver.findElement(By.className(element)));
                    select.selectByVisibleText(text);
                }
            }
        }
    }

    public void selectOptionByValue(String element, String value) {
        try {
            Select vehicleYear = new Select(driver.findElement(By.cssSelector(element)));
            vehicleYear.selectByValue(value);
        } catch (Exception ex1) {
            try {
                System.out.println("First Attempt was not successful");
                Select vehicleYear = new Select(driver.findElement(By.xpath(element)));
                vehicleYear.selectByValue(value);
            } catch (Exception ex2) {
                try {
                    System.out.println("Second Attempt was not successful");
                    Select vehicleYear = new Select(driver.findElement(By.id(element)));
                    vehicleYear.selectByValue(value);
                } catch (Exception ex3) {
                    System.out.println("Third Attempt was not successful");
                    Select vehicleYear = new Select(driver.findElement(By.className(element)));
                    vehicleYear.selectByValue(value);
                }
            }
        }
    }

    public void selectOptionByIndexByXpath(String element, int indexNumber) {
        Select select = new Select(driver.findElement(By.xpath(element)));
        select.selectByIndex(indexNumber);
    }

    public void selectOptionByIndex(String element, int indexNumber) {
        try {
            Select select = new Select(driver.findElement(By.xpath(element)));
            select.selectByIndex(indexNumber);
        } catch (Exception ex1) {
            try {
                System.out.println("First Attempt was not successful");
                Select select = new Select(driver.findElement(By.cssSelector(element)));
                select.selectByIndex(indexNumber);
            } catch (Exception ex2) {
                try {
                    System.out.println("Second Attempt was not successful");
                    Select select = new Select(driver.findElement(By.id(element)));
                    select.selectByIndex(indexNumber);
                } catch (Exception ex3) {
                    System.out.println("Third Attempt was not successful");
                    Select select = new Select(driver.findElement(By.className(element)));
                    select.selectByIndex(indexNumber);
                }
            }
        }
    }

    public static void sleepFor(int sec) throws InterruptedException {
        Thread.sleep(sec * 1000);
    }

    public void mouseHoverByCSS(String locator) {
        try {
            WebElement element = driver.findElement(By.cssSelector(locator));
            Actions action = new Actions(driver);
            Actions hover = action.moveToElement(element);
        } catch (Exception ex) {
            System.out.println("First attempt has been done, This is second try");
            WebElement element = driver.findElement(By.cssSelector(locator));
            Actions action = new Actions(driver);
            action.moveToElement(element).perform();
        }
    }

//    public void mouseHoverByXpath(String locator) {
//        try {
//            WebElement element = driver.findElement(By.xpath(locator));
//            Actions action = new Actions(driver);
//            Actions hover = action.moveToElement(element);
//        } catch (Exception ex) {
//            System.out.println("First attempt has been done, This is second try");
//            WebElement element = driver.findElement(By.xpath(locator));
//            Actions action = new Actions(driver);
//            action.moveToElement(element).perform();
//        }
//    }

    public void mouseHoverByXpath(String locator) {
        WebElement element = driver.findElement(By.xpath(locator));
        Actions actions = new Actions(driver);
        WebElement features = element;
        actions.moveToElement(features).build().perform();
    }

    public void mouseHoverByID(String locator) {
        WebElement element = driver.findElement(By.id(locator));
        Actions actions = new Actions(driver);
        WebElement features = element;
        actions.moveToElement(features).build().perform();
    }

    //handling Alert
    public void okAlert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void cancelAlert() {
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

    //iFrame Handle
    public void iframeHandle(WebElement element) {
        driver.switchTo().frame(element);
    }

    public void goBackToHomeWindow() {
        driver.switchTo().defaultContent();
    }

    //get Links
    public void getLinks(String locator) {
        driver.findElement(By.linkText(locator)).findElement(By.tagName("a")).getText();
    }

    //Taking Screen shots
    public void takeScreenShot() throws IOException {
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        //FileUtils.copyFile(file, new File("screenShots.png"));
    }

    //Synchronization
    public void waitUntilClickAble(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void waitUntilVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void waitUntilSelectable(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        boolean element = wait.until(ExpectedConditions.elementToBeSelected(locator));
    }

    public void upLoadFile(String locator, String path) {
        driver.findElement(By.cssSelector(locator)).sendKeys(path);
        /* path example to upload a file/image
           path= "C:\\Users\\rrt\\Pictures\\ds1.png";
         */
    }

    public void keysInput(String locator) {
        driver.findElement(By.cssSelector(locator)).sendKeys(Keys.ENTER);
    }

    //Handling New Tabs
    public static WebDriver handleNewTab(WebDriver driver1) {
        String oldTab = driver1.getWindowHandle();
        List<String> newTabs = new ArrayList<String>(driver1.getWindowHandles());
        newTabs.remove(oldTab);
        driver1.switchTo().window(newTabs.get(0));
        return driver1;
    }

    public static boolean isPopUpWindowDisplayed(WebDriver driver1, String locator) {
        boolean value = driver1.findElement(By.cssSelector(locator)).isDisplayed();
        return value;
    }

    public static boolean isPopUpWindowDisplayedByXpath(WebDriver driver1, String locator) {
        boolean value = driver1.findElement(By.xpath(locator)).isDisplayed();
        return value;
    }


    public void typeOnInputBox(String locator, String value) {
        try {
            driver.findElement(By.id(locator)).sendKeys(value, Keys.ENTER);
        } catch (Exception ex1) {
            System.out.println("ID locator didn't work");
        }
        try {
            driver.findElement(By.name(locator)).sendKeys(value, Keys.ENTER);
        } catch (Exception ex2) {
            System.out.println("Name locator didn't work");
        }
        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
        } catch (Exception ex3) {
            System.out.println("CSS locator didn't work");
        }
    }

    //Validate by title
    public void validateByTitle(String title) {
        Assert.assertEquals(title, driver.getTitle());
    }

    //Validate by text
    public void validateByTextByID(String element, String text) {
        Assert.assertEquals(text, driver.findElement(By.id(element)).getText());
    }

    public void validateByTextByClass(String element, String text) {
        Assert.assertEquals(text, driver.findElement(By.className(element)).getText());
    }

    public void validateByTwoTextByClass(String element, String text1, String text2) {
        if (text1 == driver.findElement(By.className(element)).getText()) {
            Assert.assertEquals(text1, driver.findElement(By.className(element)).getText());
        } else if (text2 == driver.findElement(By.className(element)).getText()) {
            Assert.assertEquals(text2, driver.findElement(By.className(element)).getText());
        }
    }


    public void validateByText(String element, String text) {
        try {
            Assert.assertEquals(text, driver.findElement(By.xpath(element)).getText());
        } catch (Exception ex) {
            try {
                Assert.assertEquals(text, driver.findElement(By.id(element)).getText());
            } catch (Exception ex2) {
                try {
                    Assert.assertEquals(text, driver.findElement(By.cssSelector(element)).getText());
                } catch (Exception ex3) {
                    Assert.assertEquals(text, driver.findElement(By.name(element)).getText());
                }
            }
        }
    }

    //Validate by URL
    public void validateByURL(String url) {
        Assert.assertEquals(url, driver.getCurrentUrl());
    }

    public boolean elementIsDisplayedByID(String element) {
        driver.findElement(By.id(element)).isDisplayed();
        return true;
    }

    public boolean elementIsDisplayedByClass(String element) {
        driver.findElement(By.className(element)).isDisplayed();
        return true;
    }

    public boolean elementIsDisplayed(String element) {
        try {
            driver.findElement(By.xpath(element)).isDisplayed();
        } catch (Exception ex1) {
            try {
                System.out.println("First Attempt was not successful");
                driver.findElement(By.id(element)).isDisplayed();
            } catch (Exception ex2) {
                try {
                    System.out.println("Second Attempt was not successful");
                    driver.findElement(By.cssSelector(element)).isDisplayed();
                } catch (Exception ex3) {
                    System.out.println("Third Attempt was not successful");
                    driver.findElement(By.className(element)).isDisplayed();
                }
            }
        }
        return true;
    }

    public boolean elementIsSelected(String element) {
        try {
            driver.findElement(By.xpath(element)).isSelected();
        } catch (Exception ex1) {
            try {
                System.out.println("First Attempt was not successful");
                driver.findElement(By.id(element)).isSelected();
            } catch (Exception ex2) {
                try {
                    System.out.println("Second Attempt was not successful");
                    driver.findElement(By.cssSelector(element)).isSelected();
                } catch (Exception ex3) {
                    System.out.println("Third Attempt was not successful");
                    driver.findElement(By.className(element)).isSelected();
                }
            }
        }
        return true;
    }

    public boolean elementIsEnabled(String element) {
        try {
            driver.findElement(By.xpath(element)).isEnabled();
        } catch (Exception ex1) {
            try {
                System.out.println("First Attempt was not successful");
                driver.findElement(By.id(element)).isEnabled();
            } catch (Exception ex2) {
                try {
                    System.out.println("Second Attempt was not successful");
                    driver.findElement(By.cssSelector(element)).isEnabled();
                } catch (Exception ex3) {
                    System.out.println("Third Attempt was not successful");
                    driver.findElement(By.className(element)).isEnabled();
                }
            }
        }
        return true;
    }


    // Customer Made Helper Methods for Amex.com
    public void brokenLink() throws IOException {
        //Step:1-->Get the list of all the links and images
        List<WebElement> linkslist = driver.findElements(By.tagName("a"));
        linkslist.addAll(driver.findElements(By.tagName("img")));

        System.out.println("Total number of links and images--------->>> " + linkslist.size());

        List<WebElement> activeLinks = new ArrayList<WebElement>();
        //Step:2-->Iterate linksList: exclude all links/images which does not have any href attribute
        for (int i = 0; i < linkslist.size(); i++) {
            //System.out.println(linkslist.get(i).getAttribute("href"));
            if (linkslist.get(i).getAttribute("href") != null && (!linkslist.get(i).getAttribute("href").contains("javascript") && (!linkslist.get(i).getAttribute("href").contains("mailto")))) {
                activeLinks.add(linkslist.get(i));
            }
        }
        System.out.println("Total number of active links and images-------->>> " + activeLinks.size());

        //Step:3--> Check the href url, with http connection api
        for (int j = 0; j < activeLinks.size(); j++) {

            HttpURLConnection connection = (HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href")).openConnection();

            connection.connect();
            String response = connection.getResponseMessage();
            connection.disconnect();
            System.out.println(activeLinks.get(j).getAttribute("href") + "--------->>> " + response);
        }
    }

    public void inputValueInTextBoxByWebElement(WebElement webElement, String value) {

        webElement.sendKeys(value + Keys.ENTER);

    }

    public String getTextByWebElement(WebElement webElement) {
        String text = webElement.getText();
        return text;
    }

    public static void scrollUpDownByHeight() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }


}