Feature: TMobile homepage tab functionality tests

  Background:
    Given User is in TMobile homepage

    #1
  @SmokeTest
    Scenario: Successful redirecting after clicking Wireless tab
    When User clicks on Wireless tab
    Then User is directed to Wireless page

     #2
  @SmokeTest
  Scenario: Successful redirecting after clicking Business tab
    When User clicks on Business tab
    Then User is directed to Business page

     #3
  @SmokeTest
  Scenario: Successful redirecting after clicking Prepaid tab
    When User clicks on Prepaid tab
    Then User is directed to Prepaid page

     #4
  @SmokeTest
  Scenario: Successful redirecting after clicking Tv tab
    When User clicks on Tv tab
    Then User is directed to Tv page

     #5
  @SmokeTest
  Scenario: Successful redirecting after clicking Banking tab
    When User clicks on Banking tab
    Then User is directed to Banking page