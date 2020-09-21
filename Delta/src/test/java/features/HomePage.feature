#Feature: Delta homepage functionality check
#
#  Background:
#    Given I am on Delta homepage
#
#  @SmokeTest
#  Scenario Outline: Check that user can navigate to the Delta homepage using title
#    Then I verify page "<title>"
#    Examples:
#      | title                                                                       |
#      | Airline Tickets & Flights: Book Direct with Delta Air Lines - Official Site |
#
#  @MyTest @SmokeTest
#  Scenario Outline: Check that user can navigate to 'Certificates & eCredits' page
#    When I click on 'Need Help?' tab
#    And I click on 'Certificates & eCredits' link
#    Then I verify page "<title>"
#    Examples:
#      | title                                                                            |
#      | View or Redeem Multiple Certificates or Ecredits or Gift Cards : Delta Air Lines |