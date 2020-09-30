Feature: Delta homepage functionality check

  Background:
    Given I am on Delta homepage

#  @MyTest @SmokeTest
  Scenario Outline: Check that user can navigate to the Delta homepage using title
    Then I verify page "<title>"
    Examples:
      | title                                                                       |
      | Airline Tickets & Flights: Book Direct with Delta Air Lines - Official Site |

#  @MyTest @SmokeTest
#  Scenario Outline: Check that user can navigate to 'Certificates & eCredits' page
#    When I click on 'Need Help?' tab
#    And I click on 'Certificates & eCredits' link
#   Then I verify page "<title>"
#    Examples:
#      | title                                                                            |
#      | View or Redeem Multiple Certificates or Ecredits or Gift Cards : Delta Air Lines |
#
#
#
#
#Feature: Delta home functionality check
#
#  @SmokeTest
#  Scenario: Delta Sign In functionality check with valid data
#    Given I am on Delta homepage
#    When I click on Log In
#    Then I verify Log In page with title
#@SmokeTest
#  Scenario: Check that user can navigate to 'SkyMiles Help' page
#    When I click on Need Help tab
#    And I click on SkyMiles Help link
#    Then I verify pag by "<title>"
#@SmokeTest
#  Scenario: Check that user can navigate to 'Accessible Travel Services' page
#    When I need click on Need Help tab
#    And I click on Accessible Travel Services
#    Then I verify page by "<title>"
#  @pending @SmokeTest
#  Scenario: Check that user can navigate to 'child & InfantTravel' page
#    When I click on Need Help tab
#    And I click on child & InfantTravel
#    Then I verify page by"<title>"
#
#  @MyTest
#  Scenario: Check that user can navigate to receipts page
#    When I click on the  Need top Help tab
#    And I again click on the  receipts
#    Then I  also verify page by"<title>"
#  @MyTest
#  Scenario: Make sure  that user can navigate supportingYouThroughYourTravelJourney page
#    Then I   verify page by"<title>"
#  @MyTest
#  Scenario: make a look that a user can navigate to travelInfo page
#    When I click to the  travelInfo tab
##    And I hoover and click on tripProtection
#    Then I do  verify page by"<title>"
#
#  @MyTest
#  Scenario: To make sure  that user can navigate to coronaVirus Updates
#    When I first click on the Need Help tab
#    And I next click on the coronaVirus Updates
#    Then I afterthat verify page by"<title>"
#  @MyTest
#  Scenario: To make sure user can check flight status
#    When I first click on flight status
#    Then I verify flight status by text search by date
#  @MyTest
#  Scenario: To make sure user can check my trips
#    When I first click on my trips
#    Then I verify my trips by text Find Your Trip

  @MyTest
  Scenario: To make sure user can check Travel Info
    When I click on travel info first
    And I then click on flight Schedule
    Then I verify flight Schedules by text search by date

  @MyTest
  Scenario: To make sure user can check AirCraft module under Travel info
    When I click on travel info first
    And I click on aircraft under travel info tab
    Then I verify aircraft by text from that page
  @MyTest
  Scenario: To make sure user can check Airport Maps and Location
    When I need to click on travel info first
    And I click on Airport Maps & Locations
    Then I verify Airport Maps & Locations by text from that page
  @MyTest
  Scenario: To make sure user can check Delta vacation
    When I   clicked towards the travel info first
    And I go and click on Delta vacation
    Then I verify Delta vacation by title from that page

    @MyTest
    Scenario: To make sure user can use check-in module
      When I first click on check-in
      And I put '123456' in confirmation number required field
      And I put JFK in From AirPort Field
      Then I click on radio Button
      And I validate it by text Whoops! We're sorry...

      @MyTest
      Scenario:To make sure user can use On board Experience  module
        When I first click on travel info module first
        And I click on Board experience next
        Then I verify on board experience by title

        @MyTest
        Scenario: To make sure user can use On Baggage  module
          When I first click travel info module
          And I click on baggage next
          Then I verify baggage by title

          @MyTest
          Scenario: To make sure user can use On Airline Partners  module
            When I first clicked on to the travel info module
            And I click on Air line partners module
            Then I verify Airline partners by title

            @MyTest
            Scenario: To make sure user can use On ShopHotels module
              When I just first clicked on to the travel info module
              And I click on ShopHotels module
              Then I verify ShopHotels by title
          @MyTest
          Scenario: To make sure user can use On ShopHotels module
            When I just first clicked on to the travel info module
            And I click on ShopHotels module
            Then I verify ShopHotels by title



