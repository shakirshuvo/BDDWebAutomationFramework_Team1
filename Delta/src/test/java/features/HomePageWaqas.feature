Feature:Delta world page functionality
  Background:
    Given I am in delta homepage homepage

  @SmokeTest
  Scenario: check vacations Deals element on homepage
    When I click on vacations deals Tab
    Then I will validate the vacations deals tab

  @SmokeTest
  Scenario: check  book element on homepage
    When I click on book in element
    Then I will validate the book element

  @SmokeTest
  Scenario: check my trips check In element on homepage
    When I click on  check in element
    Then I will validate the  check in element

  @SmokeTest
  Scenario: check  my trips element on homepage
    When I click on my trips element
    And I will enter My trip information
    Then I will validate the my trips element

  @SmokeTest
  Scenario: check flight status element on homepage
    When I click flight status on element
    Then I will validate the flight status element