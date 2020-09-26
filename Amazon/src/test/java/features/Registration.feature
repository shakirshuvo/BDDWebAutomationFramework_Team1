#Feature: Amazon Registration functionality check
#
#  Background:
#    Given I am on Amazon homepage
#    When I hover over 'Hello, Sign in' button
#    And I click on 'Start here' link on homepage
#
#  @Registration @SmokeTest
#  Scenario Outline: Check that user can navigate to the Registration page using title
#    Then I verify page "<title>"
#    Examples:
#      | title               |
#      | Amazon Registration |
#
#  @Registration @SmokeTest
#  Scenario: Check that if user does not provide a name when registering, an alert message
#  "Enter your name" will be displayed
#    And I enter a random email address in the 'Email' field
#    And I enter a random password in the 'Password' field
#    And I Re-enter the password in the `Re-enter password` field
#    And I click on 'Create you Amazon account' button on the Registration page
#    Then I verify 'Enter your name' alert is displayed under `Your name` field
#
#  @Registration @SmokeTest
#  Scenario: Check that if user does not provide a email when registering, an alert message
#  "Enter your email" will be displayed
#    And I enter a random 'name'
#    And I enter a random password in the 'Password' field
#    And I Re-enter the password in the `Re-enter password` field
#    And I click on 'Create you Amazon account' button on the Registration page
#    Then I verify 'Enter your email' alert is displayed under `Email` field
#
#  @Registration @SmokeTest
#  Scenario Outline: Check that if user does not provide a valid email format when registering, an alert message
#  "Enter your email" will be displayed
#    And I enter a random 'name'
#    And I enter an "<invalid email>" address in the `Email` field
#    And I enter a random password in the 'Password' field
#    And I Re-enter the password in the `Re-enter password` field
#    And I click on 'Create you Amazon account' button on the Registration page
#    Then I verify "<alert>" is displayed under `Email` field
#    Examples:
#      | alert                       | invalid email  |
#      | Enter a valid email address | invalid@email. |
#
#  @Registration @SmokeTest
#  Scenario Outline: Check that if user does not provide a password when registering, an alert message
#  "Enter your password" will be displayed
#    And I enter a random 'name'
#    And I enter a random email address in the 'Email' field
#    And I click on 'Create you Amazon account' button on the Registration page
#    Then I verify "<alert>" is displayed under `Password` field
#    Examples:
#      | alert               |
#      | Enter your password |
#
#  @Registration @SmokeTest
#  Scenario Outline: Check that if user does not re-enter a password when registering, an alert message
#  "Type your password again" will be displayed
#    And I enter a random 'name'
#    And I enter a random email address in the 'Email' field
#    And I enter a random password in the 'Password' field
#    And I click on 'Create you Amazon account' button on the Registration page
#    Then I verify "<alert>" is displayed under `Re-Enter password` field
#    Examples:
#      | alert                    |
#      | Type your password again |
#
#  @Registration @SmokeTest
#  Scenario Outline: Check that if user does not provide a password that is at least 6 characters long
#  when registering, two alert messages "Passwords must be at least 6 characters." and
#  "Type your password again" will be displayed
#    And I enter a random 'name'
#    And I enter a random email address in the 'Email' field
#    And I enter a random five character long password in the 'Password' field
#    And I click on 'Create you Amazon account' button on the Registration page
#    Then I verify "<Password alert>" is displayed under `Password` field for not meeting the password criteria
#    And I verify "<Re-enter password alert>" is displayed under `Re-Enter password` field
#    Examples:
#      | Password alert                           | Re-enter password alert  |
#      | Passwords must be at least 6 characters. | Type your password again |
#
#  @Registration @SmokeTest
#  Scenario Outline: Check that if user tries to register with an email that already has been used to create an
#  account previously, an alert message "Email address already in use" will be displayed
#    And I enter a random 'name'
#    And I enter an "<email>" address that's already in use in the 'Email' field
#    And I enter a random password in the 'Password' field
#    And I Re-enter the password in the `Re-enter password` field
#    And I click on 'Create you Amazon account' button on the Registration page
#    Then I verify "<alert>" is displayed for proving an email address that's already in use
#    Examples:
#      | email                    | alert                        |
#      | ciara105@xhanimatedm.com | Email address already in use |
#
#
