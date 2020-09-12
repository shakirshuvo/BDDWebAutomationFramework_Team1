package getAQuoteAuto;

import base.CommonAPI;

import static getAQuoteAuto.GetAQuoteAutoWebElements.*;

public class GetAQuoteAuto extends CommonAPI {

    public void cancelOrValidateText(String text) {
        if (elementIsDisplayedByID(closeWeHaveSavedYourQuotesID) == true) {
            clickOnElement(closeWeHaveSavedYourQuotesID);
        } else if (elementIsDisplayedByClass(thanksMessageXpathWebElement) == true){
            validateByText(thanksMessageXpathWebElement, text);
        }
    }
}
