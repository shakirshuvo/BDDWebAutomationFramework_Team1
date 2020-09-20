#Feature: The Hartford homepage functionality check
#
#  Background:
#    Given I am on The Hartford homepage
#
#  @HomeTest
#  Scenario: Check that user can navigate to homepage using title.
#    Then I verify page title "Business, Home & Car Insurance Quotes | The Hartford Insurance"
#
#  @HomeTest
#  Scenario Outline: Check that user will receive an error message "Enter five-digit zip code"when trying to start a
#  Auto quote in 'Get a Quote' module without providing the Zip code.
#    When I click on `Start Quote` button
#    Then I receive "<error message>"
#    Examples:
#      | error message             |
#      | Enter five-digit zip code |
