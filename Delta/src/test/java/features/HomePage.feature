Feature: Delta home functionality check

  @SmokeTest
  Scenario: Delta Sign In functionality check with valid data
    Given I am on Delta homepage
    When I click on Log In
    Then I verify Log In page with title