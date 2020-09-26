Feature: T-Mobile homepage functionality check

  Background:
    Given I am on T Mobile Homepage

    @SmokeTest
    Scenario: Cellphone functionality check
    When I hover my mouse to Phones and Devices
    And I click on Cellphones
    Then I validate it by url

  @SmokeTest
  Scenario: Tablets and Devices functionality check
    When I hover my mouse to Phones and Devices
    And I click on Tablets and Devices
    Then I validate it by text

  @SmokeTest
  Scenario: Smart Watches functionality check
    When I hover my mouse to Phones and Devices
    And I click on smart watches
    Then I validate it by text smart watches