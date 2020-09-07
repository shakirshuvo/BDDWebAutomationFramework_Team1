Feature: Amazon search functionality check

  @SmokeTest
  Scenario: Amazon search field functionality check with valid data
    Given I am on Amazon homepage
    And I enter "Hand Sanitizer" in search field
    When I submit search field
    Then I verify page title as "Amazon.ca : hand sanitizers"