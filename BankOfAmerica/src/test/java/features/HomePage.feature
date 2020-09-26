Feature: Bank of America homepage functionality check

  Background:
    Given I am on Bank of America Homepage

  @SmokeTest
  Scenario: Check that user receives an error message when put invalid enrollment information
    When I click on enroll button
    And I enter invalid six digits account number "123456" in card account box
    And I enter invalid social security number in social security box
    And I click on continue button
    Then I validate the test by the error message "We're unable to complete your request at this time."

  @SmokeTest
  Scenario: Checking functionality check
    When I click on checking button
    Then I validate the test by text a

  @SmokeTest
  Scenario: Saving functionality check
    When I click on saving button
    Then I validate the page by text b

  @SmokeTest
  Scenario: Credit Cards functionality check
    When I click on CreditCard button
    Then I validate the page by text c

  @SmokeTest
  Scenario: Home Loans functionality check
    When I click on Home Loans button
    Then I validate the page by text d

  @SmokeTest
  Scenario: Auto Loans functionality check
    When I click on Auto Loans button
    Then I validate the page by text e

  @SmokeTest
  Scenario: Investing functionality check
    When I click on Investing button
    Then I validate the page by text f

  @SmokeTest
  Scenario: Better Money functionality check
    When I click on Better Money button
    Then I validate the page by text g

  @SmokeTest
  Scenario: Small Business functionality check
    When I click on Small Business button
    Then I validate the page by title h

  @SmokeTest
  Scenario: Wealth Management functionality check
    When I click on Wealth Management button
    Then I validate the page by title i

  @SmokeTest
  Scenario: Business and Institutions functionality check
    When I click on Business and Institutions button
    Then I validate the page by title j

  @SmokeTest
  Scenario: Security functionality check
    When I click on Security button
    Then I validate the page by title k

  @SmokeTest
  Scenario: About Us functionality check
    When I click on About Us button
    Then I validate the page by title l

  @SmokeTest
  Scenario: En Espanol functionality check
    When I click on En Espanol button
    Then I validate the page by page url m

  @SmokeTest
  Scenario: Contact Us functionality check
    When I click on Contact Us button
    Then I validate the page by page url n

  @SmokeTest
  Scenario: Help functionality check
    When I click on Help button
    Then I validate the page by page url o

  @SmokeTest
  Scenario: Find Closest Location  functionality check
    When I click on Find Closest Location button
    Then I validate the page by page url p

  @SmokeTest
  Scenario: Schedule Appointment functionality check
    When I click on Schedule Appointment button
    Then I validate the page by page url q

  @SmokeTest
  Scenario: Deals All Day functionality check
    When I click on Deals All Day button
    Then I validate the page by page url r

  @SmokeTest
  Scenario: Checking With Right Features  functionality check
    When I click on Checking With Right Features button
    Then I validate the test by text Expect more from your checking account s

  @SmokeTest
  Scenario: Life Services functionality check
    When I click on Life Services button
    Then I validate test by life services title t

  @SmokeTest
  Scenario: Open Checking Account option check from homepage
    When I click on Open Now button from Homepage
    And I click on Open Now under Bank of America Advantage SafeBalance Banking® tab
    And I verify the page by page url

  @SmokeTest
  Scenario: Open Checking Account option second from homepage
    When I click on Open Now button from Homepage
    And I click on Open Now under Bank of America Advantage Plus Banking® tab
    And I verify the page by page its url

  @SmokeTest
  Scenario: Open Checking Account option third from homepage
    When I click on Open Now button from Homepage
    And I click on Open Now under Bank of America Advantage Relationship Banking® tab
    And I verify that page by page url

  @SmokeTest
  Scenario: Mortgage functionality check from under Home Loans tab
    When I clicking on HomeLoans button
    Then I click on Mortgage tab
    When I click on Apply Now
    Then I validate the page by url

  @SmokeTest
  Scenario: Refinance functionality check from under Home Loans tab
    When I clicking on HomeLoans button
    And I click on Refinance tab
    Then I validate the page by text

  @SmokeTest
  Scenario: Home Equity functionality check from under Home Loans tab
    When I clicking on HomeLoans button
    And I click on Home Equity tab
    Then I validate that page by text

  @SmokeTest
  Scenario : Cash Rewards Credit Cards functionality check from under Credit Cards tab
    When I bring my cursor upon Credit Cards and click on it
    And I click on Cash Rewards tab
    Then I validate that page by title Cash Rewards

  @SmokeTest
  Scenario : Travel Rewards Credit Cards functionality check from under Credit Cards tab
    When I bring my cursor upon Credit Cards and click on it
    And I click on Travel and Airline Rewards tab
    Then I validate that page by title Travel Rewards

  @SmokeTest
  Scenario : Lower Interest Rate Credit Cards functionality check from under Credit Cards tab
    When I bring my cursor upon Credit Cards and click on it
    And I click on Lower Interest Rate Card tab
    Then I validate that page by title Lower Interest

  @SmokeTest
  Scenario : Points Rewards Credit Cards functionality check from under Credit Cards tab
    When I bring my cursor upon Credit Cards and click on it
    And I click on Points Rewards Credit Cards tab
    Then I validate that page by title Points Rewards

  @SmokeTest
  Scenario : Cards to Build or Rebuild Credit Cards functionality check from under Credit Cards tab
    When I bring my cursor upon Credit Cards and click on it
    And I click on Cards to Build or Rebuild Credit tab
    Then I validate that page by title Cards to build

  @SmokeTest
  Scenario : Cards for students functionality check from under Credit Cards tab
    When I bring my cursor upon Credit Cards and click on it
    And I click on Cards for students tab
    Then I validate that page by title Cards for Students

  @SmokeTest
  Scenario : Mobile App functionality check from under Credit Cards tab
    When I bring my cursor upon Credit Cards and click on it
    And I click on Get Mobile App tab
    Then I click on Get the App
    And I validate that page by text

  @SmokeTest
  Scenario : Manage Credit Cards account functionality check from under Credit Cards tab
    When I bring my cursor upon Credit Cards and click on it
    And I click on  Manage Credit Cards Account tab
    Then I validate that page by its text

  @SmokeTest
  Scenario : Find A quick Credit card functionality check from under Credit Cards tab
    When I bring my cursor upon Credit Cards and click on it
    And I click on  Find a Credit Card quickly tab
    Then I validate Find credit card page by its text

  @SmokeTest
  Scenario : Under Auto Loans Apply Now functionality check
    When I bring my cursor upon Auto Loans and click on it
    And I click on  Apply Now tab in here
    When I click on apply now from new link
    Then I validate that new page by its title

  @SmokeTest
  Scenario : Under Auto Loans Auto loans rate functionality check
    When I bring my cursor upon Auto Loans and click on it
    And I click on  Auto loans rate Account tab
    Then I validate that new loan rate page by its title

  @SmokeTest
  Scenario : Under Auto Loans Auto Loan Calculator functionality check
    When I bring my cursor upon Auto Loans and click on it
    And I click on  Auto Loan Calculator Account tab
    Then I clear input in total loan amount field and type 15000 in it
    And I clear input in terms months field and type 36 in it
    And I clear input in interest rates field and type 5 in it
    When I click on calculate payment button
    Then I validate by text