Feature: Delta homepage tab functionality tests

  Background:
    Given User is in Delta homepage

    #1
  @SmokeTest
  Scenario: Successful redirecting after clicking aircraft tab
    When User hover over travel info tab
    And clicks on aircraft tab
    Then User is directed to aircraft page

  #2
  @SmokeTest
  Scenario: Successful redirecting after clicking Sky Miles Cruises tab
    When User hover over Sky Miles tab
    And clicks on Sky Miles Cruises tab
    Then User is directed to Sky Miles Cruises page

    #3
  @SmokeTest
  Scenario: Successful redirecting after clicking Pet Travle tab
    When User hover over Need Help tab
    And clicks on Pet Travle tab
    Then User is directed to Pet Travle page

     #4
  @SmokeTest
  Scenario: Checking functionality of travle from search box
    When User clicks on travle from search box
    And types the travle from name
    Then User varivies the name visible on the search box

    #5
  @SmokeTest
  Scenario: Checking functionality of travle to search box
    When User clicks on travle to search box
    And types the travle to name
    Then User varivies the destination name visible on the search box

    #6
  @SmokeTest
  Scenario: Checking functionality of trip type
    When User clicks on round trip to search box
    And clicks on one way
    Then User varivies the trip type from the option

    #7
  @SmokeTest
  Scenario: Checking functionality of Calendar
    When User clicks on Delta Calendar
    And inserts travel dates
    Then User varivies the travel dates visible on the Calendar

     #8
  @SmokeTest
  Scenario: Checking functionality of Traveler Number box
    When User clicks on Traveler Number box
    And inserts number of Traveler by clicking plus sign
    Then User varivies the number of Traveler on the desired box

     #9
  @SmokeTest
  Scenario: Checking functionality of Delta homepage chech boxes by checking and un-checking
    When User checks all check boxes
    And unchecks all again
    Then User varivies the checked and unchecked boxes

    #10
  @SmokeTest
  Scenario: Checking full functionality of flight search
    When User inserts information in required sections of Delta
    And clicks Next tab
    Then User varivies the



