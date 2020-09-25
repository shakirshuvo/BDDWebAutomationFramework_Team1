package stepDefinitions;

import base.CommonAPI;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import logIn.LogInPage;
import org.openqa.selenium.support.PageFactory;

public class LogInStepDefinition extends CommonAPI {
    static LogInPage logInPage;
    @BeforeStep
    public void getInit(){
        logInPage= PageFactory.initElements(driver,LogInPage.class);
    }
    @After
    public void closeBrowser() {
        cleanUp();
    }



//    @When("I click on LogIn function")
//    public void i_click_on_log_in_function() throws InterruptedException {
//        logInPage.logInFunction.click();
//        sleepFor(3);
//    }
//    @And("I enter my email address in the {string} field")
//    public void i_enter_my_email_address_in_the_field(String string) throws InterruptedException {typeByXpath("emailFieldXP","ram@selenium.com");
//    sleepFor(3);
//    }
//    @And("I enter my password in the {string} field")
//    public void i_enter_my_password_in_the_field(String string) throws InterruptedException {typeByXpath("passWordFieldXP","123456");
//    sleepFor(3);
//    }
//    @And("I click in log in button")
//    public void i_click_in_log_in_button() throws InterruptedException {
//        logInPage.logInButton.click();
//        sleepFor(3);
//    }
//    @Then("I verify {string} is displayed")
//    public void i_verify_is_displayed(String string) {validateByTitle("Log in - The New York Times");
//
//    }
}
