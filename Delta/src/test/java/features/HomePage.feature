Feature: Delta homepage functionality check

  Background:
    Given I am on Delta homepage

#  @MyTest @SmokeTest
  Scenario Outline: Check that user can navigate to the Delta homepage using title
    Then I verify page "<title>"
    Examples:
      | title                                                                       |
      | Airline Tickets & Flights: Book Direct with Delta Air Lines - Official Site |

  @MyTest @SmokeTest
  Scenario Outline: Check that user can navigate to 'Certificates & eCredits' page
    When I click on 'Need Help?' tab
    And I click on 'Certificates & eCredits' link
    Then I verify page "<title>"
    Examples:
      | title                                                                            |
      | View or Redeem Multiple Certificates or Ecredits or Gift Cards : Delta Air Lines |




#Feature: Delta home functionality check

#  @SmokeTest
#  Scenario: Delta Sign In functionality check with valid data
#    Given I am on Delta homepage
#    When I click on Log In
#    Then I verify Log In page with title
@SmokeTest
  Scenario: Check that user can navigate to 'SkyMiles Help' page
    When I click on Need Help tab
    And I click on SkyMiles Help link
    Then I verify pag by "<title>"
@SmokeTest
  Scenario: Check that user can navigate to 'Accessible Travel Services' page
    When I need click on Need Help tab
    And I click on Accessible Travel Services
    Then I verify page by "<title>"
  @SmokeTest
  Scenario: Check that user can navigate to 'child & InfantTravel' page
    When I click on Need Help tab
    And I click on child & InfantTravel
    Then I verify page by"<title>"