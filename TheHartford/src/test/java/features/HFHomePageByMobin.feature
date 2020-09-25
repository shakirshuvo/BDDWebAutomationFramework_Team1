Feature: The Hartford homepage tab functionality tests

  Background:
    Given User is in The Hartford homepage

    #1
  @SmokeTest
  Scenario: Successful redirecting after clicking Car Insurance tab
    When User hover over auto tab
    And clicks on Car Insurance tab
    Then User is directed to Car Insurance page

    #2
  @SmokeTest
  Scenario: Successful redirecting after clicking Condo Insurance tab
    When User hover over Home tab
    And clicks on Condo Insurance tab
    Then User is directed to Condo Insurance page

     #3
  @SmokeTest
  Scenario: Successful redirecting after clicking Business Insurance tab
    When User hover over Business tab
    And clicks on Business Insurance tab
    Then User is directed to Business Insurance page

     #4
  @SmokeTest
  Scenario: Successful redirecting after clicking for Employers tab
    When User hover over Employee Benifits tab
    And clicks on for Employers tab
    Then User is directed to for Employers page

     #5
  @SmokeTest
  Scenario: Successful redirecting after clicking Newsroom tab
    When User hover over About tab
    And clicks on Newsroom tab
    Then User is directed to Newsroom page