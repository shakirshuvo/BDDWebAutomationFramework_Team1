Feature: Bank Of America Search functionality check

  Background:
    Given I am on Bank Of America homepage

  @SearchTest @SmokeTest
  Scenario Outline: Bank Of America search field functionality check with two items
    When I enter "<ProductName>" and submit in the search field.
    Then I verify items with ProductName Displayed.
    Examples:
      | ProductName     |
      | Saving Account  |
      | Checking Account|
      | Credit Cards    |



  @pending
  Scenario Outline:Delta HomePage WebElements Functionality Check
    When I Locate and Click on  "<locator>" Displayed On HomePage
    Then I verify  "<verifyLocator>" is appear properly
    Examples:
      | locator                 | verifyLocator                   |  /** this is verifying the Locators
      |//a[@id='headPrimary2']  |  //span[@id='searchType-val']   |  /** checkIn  Locator
      | //a[@id='headPrimary3'] |  //span[@id='searchOption-val'] |  /** My Trip
      | //a[@id='headPrimary4'] |  //label[@id='searchBydateLbl'] |  /** Flight Status
      | //a[@id='headSectab1']  | //a[@id='secondary-static-link-0'] | /** Travel Info
