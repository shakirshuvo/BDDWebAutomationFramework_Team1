Feature: Marriott HomePage

  Background:
    Given I am on Marriott Homepage

    @SmokeTest
  Scenario: check language selector on homepage
    When I click on language selector
      Then I should be to verify language selector

      @SmokeTest
      Scenario: check Find & Reserve element on homepage
        When I click on Find and Reserve
        Then I will verify Find and Reserve


  @SmokeTest
  Scenario: check deals and packages on homepage
    When I click on deals and packages
    Then I will verify deals and packages



  @SmokeTest
  Scenario: check meetings and events element on homepage
    When I click on meetings and events
    Then I will verify meetings and events

  @SmokeTest
  Scenario: check meetings and events overview under meetings and events element on homepage
    When I click on meetings and events
    And I will click on meetings overview
    Then I will verify meetings overview

  @SmokeTest
  Scenario: check business meetings under meetings and events element on homepage
    When I click on meetings and events
    And I click on business meetings
    Then I will verify business meetings

  @SmokeTest
  Scenario: check weddings under meetings and events element on homepage
    When I click on meetings and events
    And I click on weddings
    Then I will verify weddings element

  @SmokeTest
  Scenario: check  social events under meetings and events element on homepage
    When I click on meetings and events
    And I click on social events
    Then I will verify social events

  @SmokeTest
  Scenario: check group travel under meetings and events element on homepage
    When I click on meetings and events
    And I click on group travel
    Then I will verify group travel


  @SmokeTest
  Scenario: check our brands element on homepage
    When I click on our brands
    Then I will verify our brands

  @SmokeTest
  Scenario: check ritz carlton element under our brands on homepage
    When I click on meetings and events
    And I click on ritz carlton element
    Then I will verify ritz carlton element

  @SmokeTest
  Scenario: check st Regis element under our brands on homepage
    When I click on meetings and events
    And I click on st Regis element
    Then I will verify st regis element

  @SmokeTest
  Scenario: check Edition element under our brands on homepage
    When I click on meetings and events
    And I click on edition element
    Then I will verify edition element

  @SmokeTest
  Scenario: check w hotels element under our brands on homepage
    When I click on meetings and events
    And I click on w hotels
    Then I will verify w hotels

  @SmokeTest
  Scenario: check JW Marriott element under our brands on homepage
    When I click on meetings and events
    And I click on JW Marriott
    Then I will verify JW Marriott

  @SmokeTest
  Scenario: check delta hotels element under our brands on homepage
    When I click on meetings and events
    And I click on delta hotels
    Then I will verify delta hotels

  @SmokeTest
  Scenario: check le Meridien element under our brands on homepage
    When I click on meetings and events
    And I click on le meridien
    Then I will verify le meridien

  @SmokeTest
  Scenario: check westin hotel element under our brands on homepage
    When I click on meetings and events
    And I click on westin hotel
    Then I will verify westin hotel

  @SmokeTest
  Scenario: check  our credit cards element on homepage
    When I click on our credit cards element
    Then I will verify credit cards element

