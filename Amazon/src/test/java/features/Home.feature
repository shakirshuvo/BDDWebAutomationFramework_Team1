Feature: Amazon homepage functionality check

  @MyTest
  Scenario: Check that Amazon homepage loads using title
    Given I am on Amazon homepage
    Then I verify Amazon homepage with title