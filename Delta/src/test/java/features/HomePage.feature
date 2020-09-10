Feature: Delta home functionality check

  @SmokeTest
  Scenario: Delta Sign In functionality check with valid data
    Given I am on Delta homepage
    When I click on Log In
    Then I verify Log In page with title
Feature:Delta HomePage Functionality check
  Delta search functionality
  Delta login functionality

#  Background:
    Given I am in delta homepage

  @SmokeTest @Regression
  Scenario: delta SearchBox Functionality check with valid data
    And I enter Cancel or Refund Flight In searchBox
    When I click searchButton
    Then I verify Cancel or Refund FlightIs appear properly
    And I verify page title as Hand sanitizer

    But I should not see BuyTicket is appear
    And I verify Cancel or Refund FlightIs
  Scenario: Delta SearchBox Functionality check with valid data1
    And I enter "Cancel or Refund Flight" in searchBox
    When I click searchButton
    Then I verify "\"Cancel or Refund Flight1\"" is appear properly
    And I verify page title as Cancel or Refund Flight

  @pending
  Scenario: Delta SearchBox Functionality check with valid data2
    And I enter "Hand Sanitizer" in searchBox
    When I click searchButton
    Then I verify "\"Hand Sanitizer\"" is appear properly
    And I verify page title as Hand sanitizer

  @pending
  Scenario: Amazon SearchBox Functionality check with valid data3
    And I enter "Hand Sanitizer" in searchBox1
    When I click searchButton1
    Then I verify "\"Hand Sanitizer\"" is appear properly1
    And I verify page title as Hand sanitizer1
  @pending
  Scenario: Delta  SearchBox Functionality check with valid data3
    And I enter "Cancel or Refund Flight" in searchBox1
    When I click searchButton1
    Then I verify "\"Cancel or Refund Flight\"" is appear properly1
    And I verify page title as Cancel or Refund Flight1


  Scenario Outline:Delta SearchBox Functionality check with multiple WebElements
    And I enter "<WebElements>" in searchBox
    When I click searchButton
    Then I verify "<WebElements>" is appear properly
    And I verify page title as "<TravelInfo>"
    Examples:
      | WebElementsName   | verifyProduct         | pageTitle                   |
      | Book              | \"Book \"             |   Delta.com : Book          |
      | CHEEK-IN          | \" CHEEK-IN \"        | Delta.com : CHEEK-IN        |
      | MY TRIPS          | \"MY TRIPS  \"        |Delta.com:  MY TRIPS         |
      | FLIGHT STATUS     | \"FLIGHT STATUS\"     | Delta.com : FLIGHT STATUS   |
      | TRAVEL INFO       | \"TRAVEL INFO \"      | Delta.com : TRAVEL INFO     |
