package signIn;

import com.github.javafaker.Faker;

public class SignInWebElements {

    static Faker faker = new Faker();

    public static final String validEmailAddress1 = "shakir.jahangir83@gmail.com";
    public static final String validEmailAddress2 = "ciara105@xhanimatedm.com";
    public static final String invalidEmailAddressFormat = faker.name().firstName() + "@xhanimatedm";
    public static final String incorrectEmailAddress = faker.internet().safeEmailAddress();
    public static final String weCannotFindAnAccountWithThatEmailAddressAlertXpathWebElement = "//div[@id='auth-error-message-box']/div/div/ul/li/span";
    public static final String incorrectPhoneNumber = faker.phoneNumber().cellPhone();
    public static final String incorrectPhoneNumberAlertXpathWebElement = "//h4[text()='Incorrect phone number']";
    public static final String invalidEmailAddressErrorMessageXPathWebElement = "//h4[text()='There was a problem']";
    public static final String invalidPassword = "invalidPassword123";
    public static final String password = "BugBusters";
    public static final String invalidPasswordErrorMessagePartialLinkText = "//h4[text()='There was a problem']";
    public static final String helloSignInIDWebElement = "nav-link-accountList";
    public static final String signInMainCSSWebElement = ".nav-action-inner";
    public static final String emailFieldCSSWebElement = "#ap_email";
    public static final String continueButtonAfterEmailClassWebElement = "a-button-input";
    public static final String passwordFieldCSSWebElement = "#ap_password";
    public static final String signInAfterPasswordIDWebElement = "signInSubmit";
    public static final String highShakirLinkTextWebElement = "Hi, Shakir";
    public static final String recommendationForYouLinkTextWebElement = "Hi, Shakir";
    public static final String signInTitleText = "Amazon Sign-In";
    public static final String captchaXPath = "//*[@id=\"cvf-page-content\"]/p[1]";
    public static final String captchaForgotYourPasswordClassWebElement = "a-size-large";
    public static final String enterYourEmailOrMobilePhoneNumberAlertIDWebElement = "auth-email-missing-alert";
    public static final String enterYourPasswordAlertIDWebElement = "auth-password-missing-alert";
    public static final String forgotYourPasswordLinkIDWebElement = "auth-fpp-link-bottom";
    public static final String forgotYourPasswordTitleString = "Amazon Password Assistance";
    public static final String continueButtonCSSWebElement = "#continue";
    public static final String forgotYourPasswordInvalidEmailAlertClassWebElement = "a-list-item";
    public static final String alertMessageClassWebElement = "a-alert-heading";
    public static final String alertMessageFullClassWebElement = "a-list-item";
    public static final String notNowLinkIDWebElement = "ap-account-fixup-phone-skip-link";
    public static final String shakirsAmazonTextXpathWebElement = "//span[text()='Shakir']";
    public static final String usersAmazonTextClassWebElement = "nav-shortened-name";
    public static final String emailMissingAlertTextXpathWebElement = "//div[@id='auth-email-missing-alert']/div/div";
    public static final String passwordMissingAlertTextXpathWebElement = "//div[@id='auth-password-missing-alert']/div/div";

}
