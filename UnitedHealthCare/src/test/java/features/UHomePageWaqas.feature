Feature: United Health Care homepage  functionality

  Background:
    Given User is on United Health Care homepage

    @SmokeTest
    Scenario: check brokers tab element
      When I click on brokers element
      Then I will verify brokers tab element

  @SmokeTest
  Scenario: check serach box element
    When I click on search button  element
    Then I will verify search button element

  @SmokeTest
  Scenario: check medicare tab element
    When I click on medicare element
    Then I will verify medicare element

  @SmokeTest
  Scenario: check for providers element
    When I click on for providers element
    Then I will verify  for providers element

  @SmokeTest
  Scenario: check for employers element
    When I click on for employers element
    Then I will verify  for employers element

  @SmokeTest
  Scenario: check for insurance element
    When I click on for insurance element
    Then I will verify for insurance  element

  @SmokeTest
  Scenario: check business element
    When I click on business element
    Then I will verify  business element

  @SmokeTest
  Scenario: check small business element
    When I click on small business element
    Then I will verify  small business element

  @SmokeTest
  Scenario: check national accounts element
    When I click on national accounts element
    Then I will verify national accounts element

  @SmokeTest
  Scenario: check group retiree element
    When I click on group retiree element
    Then I will verify group retiree element