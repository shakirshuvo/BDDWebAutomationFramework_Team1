Feature: New york times search functionality check

  @SmokeTest

  Scenario:
    Given I am in new York Times homepage
    And   I click on searchButton
    And   I enter "today's news" in search field
    And   I submit search field
    Then  I verify search page title as "The New York Times - Search"
