package signIn;

import base.CommonAPI;
import org.junit.Assert;
import org.openqa.selenium.By;

import static signIn.SignInWebElements.*;

public class SignIn extends CommonAPI {


    public void validateForgotYourPasswordAlert(String captcha, String alertText) {
        if (elementIsDisplayedByClass(captchaForgotYourPasswordClassWebElement) == true) {
            validateByTextByClass(captchaForgotYourPasswordClassWebElement, "Please solve this puzzle so we know you're a real person");
        } else if (elementIsDisplayedByClass(forgotYourPasswordInvalidEmailAlertClassWebElement) == true){
            validateByTextByClass(forgotYourPasswordInvalidEmailAlertClassWebElement, "We're sorry. We weren't able to identify you given the information provided.");
        }
    }
}
