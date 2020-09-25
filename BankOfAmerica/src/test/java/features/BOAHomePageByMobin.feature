Feature: Bank of America homepage tab functionality tests

  Background:
    Given User is in Bank of America homepage

    #1
  @SmokeTest
  Scenario: Successful redirecting after clicking Checking tab
    When User clicks on Checking tab
    Then User is directed to Checking page

     #2
  @SmokeTest
  Scenario: Successful redirecting after clicking Savings tab
    When User clicks on Savings tab
    Then User is directed to Savings page

      #3
  @SmokeTest
  Scenario: Successful redirecting after clicking Credit Card tab
    When User clicks on Credit Card tab
    Then User is directed to Credit Card page

      #4
  @SmokeTest
  Scenario: Successful redirecting after clicking Investing tab
    When User clicks on Investing tab
    Then User is directed to Investing page

      #5
  @SmokeTest
  Scenario: Successful redirecting after clicking Planning tab
    When User hover over in different places
    And clicks on Planning tab
    Then User is directed to Planning page