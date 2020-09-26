Feature: T-Mobile homepage functionality

  Background:
    Given I am in the T-Mobile Homepage

    @SmokeTest
  Scenario: check wireless tab
    When I click on wireless tab
    Then I will verify wireless tab

  @SmokeTest
  Scenario: check business tab
    When I clicks on  business tab
    Then I will verify business tab

  @SmokeTest
  Scenario: check prepaid tab
    When I clicks on prepaid tab
    Then I will verify prepaid tab

  @SmokeTest
  Scenario: check tv  tab
    When I clicks on tv  tab
    Then I will verify tv tab

  @SmokeTest
  Scenario: check banking  tab
    When I clicks on banking tab
    Then I will verify banking tab