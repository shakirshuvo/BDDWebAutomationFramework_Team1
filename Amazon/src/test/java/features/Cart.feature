Feature: Amazon cart functionality check

  Background:
    Given I am on Amazon homepage
    When I enter "WD 5TB My Passport" and submit in the search field.
    And I click on the product 'WD 5TB My Passport Portable External Hard Drive, Black - WDBPKJ0050BBK-WESN'
    And I click on 'Add to Cart'

  @CartTest @SmokeTest
  Scenario: Check that user can add an item into the cart and verify it using 'Added to Cart' text
    Then I verify that the item has been added with 'Added to Cart' text

  @CartTest @SmokeTest
  Scenario: Check that user can add an item into the cart by verifying that the item exists in the cart
    And I click on cart button
    Then I verify that the item has been added by confirming that the item is displayed in the cart

  @CartTest @SmokeTest
  Scenario: Check that user can delete an item from the cart by verifying that 'Your Amazon Cart is empty'
  is displayed
    And I click on cart button
    And I click on 'Delete' button
    Then I verify that the the text 'Your Amazon Cart is empty' is displayed

  @CartTest @SmokeTest
  Scenario: Check that user can delete an item from the cart by verifying that 'Your Amazon Cart is empty'
  is displayed
    And I navigate back to previous window.
    And I click on 'Add to Cart'
    And I click on cart button
    Then I verify that for Subtotal "2 items" is displayed