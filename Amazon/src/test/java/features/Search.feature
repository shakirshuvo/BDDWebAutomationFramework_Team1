Feature: Amazon search functionality check

  Background:
    Given I am on Amazon homepage

  @SmokeTest
  Scenario: Amazon search field functionality check with one item using title
    And I enter "Hand Sanitizer" in search field
    When I submit search field
    Then I verify page title as "Amazon.com : hand sanitizers"

  @SmokeTest
  Scenario Outline: Amazon search field functionality check with two items
    When I enter "<itemName>" and submit in the search field.
    Then I verify items with "<pageTitle>".
    Examples:
      | itemName                 | pageTitle                             |
      | Matcha Green Tea         | Amazon.com : Matcha Green Tea         |
      | Rage Against The Machine | Amazon.com : Rage Against The Machine |