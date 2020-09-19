Feature: Marriott HomePage

  Background:
    Given I am on Marriott Homepage

    @SmokeTest
  Scenario: check language selector on homepage
    When I click on language selector
      Then I should be to verify language selector