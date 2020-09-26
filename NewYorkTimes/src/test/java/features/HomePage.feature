#Feature: New york Times world page functionality
#  New york Times US page functionality
#  New york Times politics page functionality
#  New york times NY page functionality
#  New york times business page functionality
#  New york times opinion page functionality
#  New york times technology page functionality
#  New york times science page functionality
#  New york times health page functionality
#  New york times sport page functionality
#  New york times arts page functionality
#  New york Books page functionality
#  New york times page by the book functionality
#  New York times page crime functionality
#  New York times page children's book functionality
#  New york times page nowReadThis functionality
#  New york times page style functionality
#  New york times page fashion functionality
#  New york times page love functionality
#  New york times page self care functionality
#  New york times food page functionality
#
#
#  Background:
#    Given I am in newYorkTimes homepage
#
#  @SmokeTest
#  Scenario: New york times world page functionality checked with valid data
#    When  I click on worldButton
#    Then  I verify page title as "World News - The New York Times"
#
#  @SmokeTest
#  Scenario: New York times US page functionality checked with valid data
#    When I click on US button
#    Then I verify page title1 as "The New York Times - Breaking News, World News & Multimedia"
#
#  @SmokeTest
#  Scenario: New York Times politics page functionality with valid data
#    When I click on politics button
#    Then I verify page title2 as "Politics - The New York Times"
#
#  @SmokeTest
#  Scenario: New York Times NY page functionality with valid data
#    When  I click on NY button
#    Then  I verify page Title3 as "New York - The New York Times"
#
#  @SmokeTest
#  Scenario: New York times business page functionality with valid data
#    When I click business button
#    Then I verify business page title as "Business - The New York Times"
#
#  @SmokeTest
#  Scenario:
#    When I click opinion button
#    Then I Verify opinion page title as "Opinion - The New York Times"
#
#  @SmokeTest
#  Scenario: New York times technology page functionality with valid data
#    When I click technology button
#    Then I verify technology page title as "Technology - The New York Times"
#
#  @SmokeTest
#  Scenario: New York times science page functionality with data
#    When    I click on science button
#    And     I click on climate
#    And     I verify science page title as "Climate and Environment - The New York Times"
#    Then    I navigate back to the science page
#    And     I click on space and cosmos
#
#  @SmokeTest
#  Scenario: New York times health page functionality with data
#    When I click on health button
#    And  I click on health policy
#    And  I click on global health
#    And  I click on the new old age
#    Then I verify health page title as "Health - The New York Times"
#
#  @SmokeTest
#  Scenario: New york times sport page functionality with data
#    When I click on sport button
#    And  I click on baseball
#    And  I click on NFL
#    And  I click on soccer
#    And  I click on NBA
#    And  I click on tennis
#    Then I verify sport page title as "Sports - The New York Times"
#
#  @SmokeTest
#  Scenario: New york times Arts functionality with data
#    When I click on Arts button
#    And  I click on books
#    And  I click on dance
#    And  I click on movies
#    Then I verify Arts page title as "Arts - The New York Times"
#
#  @SmokeTest
#  Scenario: New york times Books functionality with data
#    When I click on Books button
#    And  I click on bookReview
#    And  I click on bestSeller
#    Then I verify best seller page as "Best Sellers - The New York Times"
#
#  @SmokeTest
#  Scenario: New York times byTheBook functionality with data
#    When I click on books button1
#    And  I click on ByTheBooks
#    Then I verify ByTheBooks page as "By the Book - The New York Times"
#
#  @SmokeTest
#  Scenario: New York Times crime page functionality
#    When I click on books button2
#    And  I click om crime button
#    Then I verify crime page as "Crime - The New York Times"
#
#  @SmokeTest
#  Scenario: New York times children's book page functionality
#    When I click on children's book
#    Then I verify children's book page as "Children’s Books - The New York Times"
#
#  @SmokeTest
#  Scenario: New york times book review podcast page functionality
#    When I click on bookReviewPodcast
#    Then I verify bookReviewPodcast page as "The Book Review Podcast - The New York Times"
#
#  @SmokeTest
#  Scenario: New york times nowReadThis page functionality
#    When I click on Now read this
#    Then I verify NowReadThis page as "Now Read This - The New York Times"
#
#  @SmokeTest
#  Scenario: new york times style page Functionality
#    When I click on style button
#    And  I click on fashion button
#    Then I validate fashion page as "Fashion - The New York Times"
#
#  @SmokeTest
#  Scenario: New york times love page functionality
#    When I click on love button
#    Then I verify love page as "Love - The New York Times"
#
#  @SmokeTest
#  Scenario: new york times self care page functionality
#    When I click on self care button
#    Then I validate self care as "Self-Care - The New York Times"
#
#  @SmokeTest
#  Scenario: new york times wineBeerCocktails page functionality
#    When I click on food button
#    And  I click on wineBeerCocktails button
#    Then I verify wineBeerCocktail as "Wine, Beer & Cocktails - The New York Times"
#
#
#
#
#
#
#
#
