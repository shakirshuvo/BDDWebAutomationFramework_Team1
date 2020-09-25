Feature: Delta homepage tab functionality tests

  Background:
    Given User is in Delta homepage

    #1
  @SmokeTest
  Scenario: Successful redirecting after clicking aircraft tab
    When User hover over travel info tab
    And clicks on aircraft tab
    Then User is directed to *** page