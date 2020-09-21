#Feature: The Hartford 'Get a Quote Auto' functionality check
#
#  Background:
#    Given I am on The Hartford homepage
#    When I enter a valid zip code on the Auto Zip Code field
#    And I click on Start Quote button
#
#  @GetAQuoteAutoTest
#  Scenario Outline: Check that user can navigate to Get a Quote Auto page using the welcome message.
#    Then I verify page "<welcome message>"
#    Examples:
#      | welcome message                                                                                |
#      | Welcome! Let's start with some basic info to make sure you receive a quick and accurate quote. |
#
#  @GetAQuoteAutoTest
#  Scenario Outline: Check that user can fill out 'About You' form. After filling out the form, the user
#  should be able to see 'Need Help? 1-800-333-9238'on the following page.
#    And I enter a "<first name>" on `First Name` field
#    And I enter a "<last name>" on `Last Name` field
#    And I enter a "<street address>" on the `Street Address` field
#    And I enter a "<suite>" number on `Apt or Suite` field
#    And I enter a "<date of birth>" on the `Date of Birth` field
#    And I click on `Next: Add Your Vehicle` button
#    Then I verify thank you text
#    Examples:
#      | first name | last name | street address      | suite | date of birth |
#      | Shakir     | Jahangir  | 1604 Spring Hill Rd | 302   | 03/16/1983    |
#
#  @GetAQuoteAutoTest @MyTest
#  Scenario Outline: Check that "Please enter a valid first name" alert is triggered for not entering a first name
#  when filling out the 'About You' form.
#    And I enter a "<last name>" on `Last Name` field
#    And I enter a "<street address>" on the `Street Address` field
#    And I enter a "<suite>" number on `Apt or Suite` field
#    And I enter a "<date of birth>" on the `Date of Birth` field
#    And I click on `Next: Add Your Vehicle` button
#    Then I verify "<error message>"
#    Examples:
#      | first name | last name | street address      | suite | date of birth | error message                   |
#      | Shakir     | Jahangir  | 1604 Spring Hill Rd | 302   | 03/16/1983    | Please enter a valid first name |