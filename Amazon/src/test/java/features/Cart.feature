Feature: Amazon cart functionality check

  Background:
    Given I am on Amazon homepage

  @SmokeTest
  Scenario: Check that user can add an item into the cart and verify it using 'Added to Cart' text
    When I enter "WD 5TB My Passport" and submit in the search field.
    And I click on the product 'WD 5TB My Passport Portable External Hard Drive, Black - WDBPKJ0050BBK-WESN'
    And I click on 'Add to Cart'
    Then I verify that the item has been added with 'Added to Cart' text

  @SmokeTest
  Scenario: Check that user can add an item into the cart by verifying that the item exists in the cart
    When I enter "WD 5TB My Passport" and submit in the search field.
    And I click on the product 'WD 5TB My Passport Portable External Hard Drive, Black - WDBPKJ0050BBK-WESN'
    And I click on 'Add to Cart'
    And I click on cart button
    Then I verify that the item has been added by confirming that the item is displayed in the cart

  @SmokeTest
  Scenario: Check that user can delete an item from the cart by verifying that 'Your Amazon Cart is empty'
    is displayed
    When I enter "WD 5TB My Passport" and submit in the search field.
    And I click on the product 'WD 5TB My Passport Portable External Hard Drive, Black - WDBPKJ0050BBK-WESN'
    And I click on 'Add to Cart'
    And I click on cart button
    And I click on 'Delete' button
    Then I verify that the the text 'Your Amazon Cart is empty' is displayed

  @MyTest
  Scenario: Check that user can delete an item from the cart by verifying that 'Your Amazon Cart is empty'
  is displayed
    When I enter "WD 5TB My Passport" and submit in the search field.
    And I click on the product 'WD 5TB My Passport Portable External Hard Drive, Black - WDBPKJ0050BBK-WESN'
    And I click on 'Add to Cart'
    And I navigate back to previous window.
    And I click on 'Add to Cart'
    And I click on cart button
    Then I verify that the the text, Subtotal (2 items):, is displayed