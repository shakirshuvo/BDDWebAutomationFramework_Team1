Feature: New york Times world page functionality
  Background:
    Given I am in newYorkTimes homepage

#    @SmokeTest
#      Scenario Outline: Search key words in the search box
#      When I click on the search icon
#       And I enter <keywords> into search box
#      And I will click on search submit button
#      Then I will verify the  search <results>
#      Examples:
#      |keyword | results|
#      | Pakistan       | Pakistan   |
#      | Bangladesh     | Bangladesh |
#      | Switzerland    | Switzerland|

  @SmokeTest
  Scenario: check NY times search functionality
    When  I click on the search icon
    And   I type the search word into the search box
    And  I click on the search submit button
    Then  I verify search box using search result text

  @SmokeTest
  Scenario: check world news tab functionality
    When  I click on worldButton
    Then  I verify page title as "World News - The New York Times"

  @SmokeTest
  Scenario: check USA tab functionality
    When  I click on US Tab
    Then  I verify using the page title for USA tab
  @SmokeTest
  Scenario: check politics tab functionality
    When  I click on politics tab
    Then  I verify using the page title for politics tab

  @SmokeTest
  Scenario: check NY tab functionality
    When  I click on NY tab
    Then  I verify using the page title for NY tab
  @SmokeTest
  Scenario: check business tab functionality
    When  I click on business tab
    Then  I verify using the page title for business tab

  @SmokeTest
  Scenario: check opinion tab functionality
    When  I click on opinion tab
    Then  I verify using the page title for opinion tab

  @SmokeTest
  Scenario: check tech tab functionality
    When  I click on tech tab
    Then  I verify using the page title for tech tab

  @SmokeTest
  Scenario: check science tab functionality
    When  I click on science tab
    Then  I verify using the page title for science tab

  @SmokeTest
  Scenario: check health tab functionality
    When  I click on health tab
    Then  I verify using the page title for health tab

  @SmokeTest
  Scenario: check sports tab functionality
    When  I click on sports tab
    Then  I verify using the page title for sports tab

  @SmokeTest
  Scenario: check arts tab functionality
    When  I click on arts tab
    Then  I verify using the current url for arts tab

  @SmokeTest
  Scenario: check books tab functionality
    When  I click on books tab
    Then  I verify using the current url for books tab

  @SmokeTest
  Scenario: check  style tab functionality
    When  I click on style tab
    Then  I verify using the current url for style tab

  @SmokeTest
  Scenario: check food tab functionality
    When  I click on food tab
    Then  I verify using the current url for food tab

  @SmokeTest
  Scenario: check travel tab functionality
    When  I click on  travel tab
    Then  I verify using the current url for travel tab

  @SmokeTest
  Scenario: check magazine tab functionality
    When  I click on magazine tab
    Then  I verify using the current url for magazine tab

  @SmokeTest
  Scenario: check TMagazine tab functionality
    When  I click on T Magazine tab
    Then  I verify using the current url for TMagazine

  @SmokeTest
  Scenario: check real estate tab functionality
    When  I click on real estate tab
    Then  I verify using the current url for real estate tab

  @SmokeTest
  Scenario: check video tab functionality
    When  I click on video tab
    Then  I verify using the current url for video tab