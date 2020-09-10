Feature: Amazon Registration functionality check

  Background:
    Given I am on Amazon homepage
    When I hover over 'Hello, Sign in' button
    And I click on 'Start here' link on homepage

  @SmokeTest
  Scenario Outline: Check that user can navigate to the Registration page using title
    Then I verify page "<title>"
    Examples:
      | title               |
      | Amazon Registration |

  @MyTest
  Scenario Outline: Check that if user does not provide a name when registering, an alert message
  "Enter your name" will be displayed
    And I enter a random email address in the 'Email' field
    And I enter a random password in the 'Password' field
    And I Re-enter the password in the 'Re-enter password field
    And I click on 'Create you Amazon account' button on the Registration page
    Then I verify "<alert>" is displayed
    Examples:
      | alert           |
      | Enter your name |

