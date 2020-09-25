Feature: New York Times homepage tab functionality tests

  Background:
    Given User is in New York Times homepage

    #1
  @SmokeTest
  Scenario: Successful redirecting after clicking World tab
    When User clicks on World tab
    Then User is directed to World page

     #2
  @SmokeTest
  Scenario: Successful redirecting after clicking US tab
    When User clicks on US tab
    Then User is directed to US page

    #3
  @SmokeTest
  Scenario: Successful redirecting after clicking Politics tab
    When User clicks on Politics tab
    Then User is directed to Politics page

    #4
  @SmokeTest
  Scenario: Successful redirecting after clicking NY tab
    When User clicks on NY tab
    Then User is directed to NY page

    #5
  @SmokeTest
  Scenario: Successful redirecting after clicking Business tab
    When User clicks on Business tab
    Then User is directed to Business page