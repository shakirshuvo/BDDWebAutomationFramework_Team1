Feature: Amazon homepage tab functionality tests

  Background:
    Given User is in Amazon homepage

    #1
  @SmokeTest
  Scenario: Successful redirecting after clicking BestSeller tab
    When User clicks on BestSeller tab
    Then User is directed to BestSeller page