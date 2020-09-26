Feature: Marriott homepage tab functionality tests

  Background:
    Given User is in Marriott homepage

    #1
  @SmokeTest
  Scenario: Successful redirecting after clicking Deutsch tab
    When User clicks on language tab
    And Deutsch tab
    Then User is directed to the German language page

    #2
  @SmokeTest
  Scenario: Successful redirecting after clicking Espanol tab
    When User clicks on language tab
    And Espanol tab
    Then User is directed to the Spanish language page

    #3
  @SmokeTest
  Scenario: Checking functionality of destination search box
    When User clicks on destination search box
    And types the destination name
    Then User varivies the name visible on the search box

    #4
  @SmokeTest
  Scenario: Checking functionality of Calendar
    When User clicks on Calendar
    And inserts travel date
    Then User varivies the travel date visible on the Calendar

     #5
  @SmokeTest
  Scenario: Checking functionality of number of room box
    When User clicks on number of room box
    And inserts number of rooms by clicking plus sign
    Then User varivies the number of rooms on the desired box

     #6
  @SmokeTest
  Scenario: Checking functionality of Adult Guest Number
    When User clicks on Adult Guest Number box
    And inserts number of Adult Guests by clicking plus sign
    Then User varivies the number of Adult Guest on the desired box

     #7
  @SmokeTest
  Scenario: Checking functionality of Child Guest Number
    When User clicks on Child Guest Number box
    And inserts number of Child Guests by clicking plus sign
    Then User varivies the number of Child Guest on the desired box

    #8
  @SmokeTest
  Scenario: Checking functionality of Special Rate
    When User clicks on Special Rate checkbox
    Then User varivies check mark on Special Rate checkbox

    #9
  @SmokeTest
  Scenario: Checking functionality of Use Point
    When User clicks on Use Point checkbox
    Then User varivies check mark on Use Point checkbox

     #10
  @SmokeTest
  Scenario: Checking full functionality of Hotel Finding
    When User inserts information in required sections
    And clicks Find Hotel tab
    Then User varivies the