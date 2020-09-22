Feature: Bank Of America Search functionality check

  Background:
    Given I am on Bank Of America homepage

  @SearchTest @SmokeTest
  Scenario Outline: Bank Of America search field functionality check with two items
    When I enter "<ProductName>" and submit in the search field.
    Then I verify items with "<pageTitle>".
    Examples:
      | ProductName     |
      | Saving Account  |
      | Checking Account|
      | Credit Cards    |