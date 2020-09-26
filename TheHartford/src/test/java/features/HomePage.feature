Feature: The Hartford Homepage Functionality Check
  Background:
    Given I am on The Hartford Homepage

  @SmokeTest
  Scenario: Car Insurance Functionality Check
    When I hover my mouse over Auto
    And I click on car insurance
    Then I validate that page by title

  @SmokeTest
  Scenario: Classic Car Insurance Functionality Check
    When I hover my mouse over Auto
    And I click on Classic Car insurance
    Then I validate that page by url

  @SmokeTest
  Scenario: Commercial Auto Insurance Functionality Check
    When I hover my mouse over Auto
    And I click on commercial auto insurance
    Then I validate that page by url of its

  @SmokeTest
  Scenario: Home Owners Insurance Functionality Check
    When I hover my mouse over Home
    And I click on Home Owners insurance
    Then I validate Home Owners by page title