Feature: Delta HomePage search Functionality check

  Background:
    Given I am in Delta homepage

  @SmokeTest
  Scenario: Delta HomePage Elements Functionality Check
    When I Click on WebElement
    Then I verity that Element is Functional

  @SmokeTest
  Scenario: Delta HomePage Elements Functionality Check
    When I Click on CheckIn WebElement
    Then I verity that CheckIn Element is Functional

  @SmokeTest
  Scenario: Delta HomePage Elements Functionality Check
    When I Click on MyTrip WebElement
    Then I verity that MyTrip Element is Functional

  @SmokeTest
  Scenario: Delta HomePage Elements Functionality Check
    When I Click on FlightStatus WebElement
    Then I verity that FlightStatus Element is Functional

  @SmokeTest
  Scenario: Delta HomePage Elements Functionality Check
    When I Click on SkyMiles WebElement
    Then I verity that SkyMiles Element is Functional

  @SmokeTest
  Scenario: Delta HomePage Elements Functionality Check
    When I Click on TravelInfo WebElement
    Then I verity that TravelInfo Element is Functional

  @SmokeTest
  Scenario Outline:Delta SearchBox Functionality check with multiple products
And I enter "<cityName>" in searchBox
When I click searchButton
  Then I verify search "<url>" is appear properly
Examples:
| cityName  | url|
| Toronto   |https://www.delta.com/dlsearch/index.jsp?searchText=Toronto&category=allresults&%3Acq_csrf_token=undefined|
| NewYork   |https://www.delta.com/dlsearch/index.jsp?searchText=NewYork&category=allresults&%3Acq_csrf_token=undefined|
| Washington|https://www.delta.com/dlsearch/index.jsp?searchText=Washington&category=allresults&%3Acq_csrf_token=undefined|
| Vancouver |https://www.delta.com/dlsearch/index.jsp?searchText=Vancouver&category=allresults&%3Acq_csrf_token=undefined|
| Edmonton  |https://www.delta.com/dlsearch/index.jsp?searchText=Edmonton&category=allresults&%3Acq_csrf_token=undefined|


  @SmokeTest
  Scenario Outline:Delta HomePage WebElements Functionality Check
    When I Locate and Click on  "<locator>" Displayed On HomePage
    Then I verify  "<verifyLocator>" is appear properly
    Examples:
      | locator                 | verifyLocator                   |  /** this is verifying the Locators
      |//a[@id='headPrimary2']  |  //span[@id='searchType-val']   |  /** checkIn  Locator
      | //a[@id='headPrimary3'] |  //span[@id='searchOption-val'] |  /** My Trip
      | //a[@id='headPrimary4'] |  //label[@id='searchBydateLbl'] |  /** Flight Status
      | //a[@id='headSectab1']  | //a[@id='secondary-static-link-0'] | /** Travel Info




