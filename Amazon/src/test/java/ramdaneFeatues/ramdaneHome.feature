Feature: Amazon homepage functionality check

  Background:
    Given I am on amazon homepage

  @SmokeTest
  Scenario: check amazon logo is working
    When I click amazon logo
    Then I verify amazon logo with title as "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more"

  @SmokeTest
  Scenario: check amazon amazon best seller/new releases functionality
    When I click on amazonBestseller
    And  I click on new releases
    Then I verify new releases page as "Amazon.com New Releases: The best-selling new & future releases on Amazon"


