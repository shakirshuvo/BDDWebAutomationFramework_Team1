Feature: Delta Homepage Functionality Check
  Background:
    Given I am on Delta Homepage

  @SmokeTest
  Scenario: Check-In functionality check
    When I click on Check-In
    And I click on Confirmation number required and put 123456 as value
    And I click on From Airport and put JFK as value
    Then I select JFK New York,Kennedy NY
    And I click on radio button to submit
    Then I validate it by text

  @SmokeTest
  Scenario: Book-In functionality check from delta homepage Book tab
    When I click on Book
    And I click on From and put 123456 as value
    And I click on From Airport and put JFK as value
    Then I select JFK New York,Kennedy NY
    And I click on radio button to submit
    Then I validate it by text