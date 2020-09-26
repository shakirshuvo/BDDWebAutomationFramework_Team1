#Feature: Amazon homepage functionality check
#
#  Background:
#    Given I am on Amazon homepage
#
#  @HomeTest @SmokeTest
#  Scenario: Check that Amazon homepage loads using title
#    Then I verify Amazon homepage with title
#
#  @HomeTest @SmokeTest
#  Scenario: Check that 'Today's Deal' tab is functional using title
#    When I click on 'Today's Deal' tab
#    Then I verify 'Today's Deal' with title
#
#  @HomeTest @SmokeTest
#  Scenario: Check that 'Today's Deal' tab is functional using 'Deals and Promotions' text
#      When I click on 'Today's Deal' tab
#      Then I verify 'Today's Deal' with 'Deals and Promotions' text being displayed
#
#  @HomeTest @SmokeTest
#  Scenario: Check that 'Customer Service' tab is functional using title
#    When I click on 'Customer Service' tab
#    Then I verify 'Customer Service' with with title
#    And I verify 'Customer Service' with 'Hello. What can we help you with?' text
#
#  @HomeTest @SmokeTest
#  Scenario: Check that 'Gift Cards' tab is functional using title and text
#    When I click on Gift Cards tab
#    Then I verify Gift Cards tab with with title 'Amazon.com Gift Cards'
#    And I verify Gift Cards with 'Hello. What can we help you with?' text
#
#  @HomeTest @SmokeTest
#  Scenario: Check that 'Registry' tab is functional using title
#    When I click on Registry tab
#    Then I verify Registry tab with with title 'Amazon.com: : Registry'
#
#  @HomeTest @SmokeTest
#  Scenario: Check that 'Sell' tab is functional using title
#    When I click on Sell tab
#    Then I verify Sell tab with with title 'Amazon.com: Sell Products Online with Selling on Amazon.'
#    And I verify Sell tab with 'Become an Amazon seller' text
#
#  @HomeTest @SmokeTest
#  Scenario: Check that 'Music' link is functional using URL and title
#    When I click on Music link
#    Then I verify Music link with with URL 'https://music.amazon.com/home?ref=dm_aff_amz_com'
#    And I verify Music link with title 'Amazon Music Unlimited - Stream 60 million songs online now.'
#
#  @HomeTest @SmokeTest
#  Scenario: Check that 'Advertise Your Product' link is functional using title, URL, and text
#    When I click on Advertise Your Product link
#    Then I verify Advertise Your Product link with title 'Amazon Advertising: Online advertising on Amazon'
#    And I verify Advertise Your Product link with URL 'https://advertising.amazon.com/'
#    And I verify Advertise Your Product link with text 'Amazon Music Unlimited - Stream 60 million songs online now.'
#
#  @HomeTest @SmokeTest
#  Scenario: Check that user can navigate to 'Computers & Tablets' page using 'Shop By Category' burger button
#    When I click on Shop By Category burger button
#    And I click on Computers
#    And I click on Computers & Tablets
#    Then I verify Computers & Tablets page with ASUS on 'Featured Brand' selection
#
#  @HomeTest @SmokeTest
#  Scenario: Check that user can navigate to 'Computers & Tablets' page and select 'HP' from 'Featured Brands' selection.
#    When I click on Shop By Category burger button
#    And I click on Computers
#    And I click on Computers & Tablets
#    And I click on HP checkbox from Featured Brands selection
#    Then I verify that HP checkbox is selected.