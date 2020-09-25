Feature: New york Times homePage functionality


  Background:
    Given I am in newYorkTimes homepage

  @SmokeTest
  Scenario: New york times world page functionality checked with valid data
    When  I click on worldButton
    Then  I verify page title as "World News - The New York Times"

  @SmokeTest
  Scenario: New York times US page functionality checked with valid data
    When I click on US button
    Then I verify page title1 as "The New York Times - Breaking News, World News & Multimedia"

  @SmokeTest
  Scenario: New York Times politics page functionality with valid data
    When I click on politics button
    Then I verify page title2 as "Politics - The New York Times"

  @SmokeTest
  Scenario: New York Times NY page functionality with valid data
    When  I click on NY button
    Then  I verify page Title3 as "New York - The New York Times"

  @SmokeTest
  Scenario: New York times business page functionality with valid data
    When I click business button
    Then I verify business page title as "Business - The New York Times"

  @SmokeTest
  Scenario:
    When I click opinion button
    Then I Verify opinion page title as "Opinion - The New York Times"

  @SmokeTest
  Scenario: New York times technology page functionality with valid data
    When I click technology button
    Then I verify technology page title as "Technology - The New York Times"

  @SmokeTest
  Scenario: New York times science page functionality with data
    When    I click on science button
    And     I click on climate
    And     I verify science page title as "Climate and Environment - The New York Times"
    Then    I navigate back to the science page
    And     I click on space and cosmos

  @SmokeTest
  Scenario: New York times health page functionality with data
    When I click on health button
    And  I click on health policy
    And  I click on global health
    And  I click on the new old age
    Then I verify health page title as "Health - The New York Times"

  @SmokeTest
  Scenario: New york times sport page functionality with data
    When I click on sport button
    And  I click on baseball
    And  I click on NFL
    And  I click on soccer
    And  I click on NBA
    And  I click on tennis
    Then I verify sport page title as "Sports - The New York Times"

  @SmokeTest
  Scenario: New york times Arts functionality with data
    When I click on Arts button
    And  I click on books
    And  I click on dance
    And  I click on movies
    Then I verify Arts page title as "Arts - The New York Times"

  @SmokeTest
  Scenario: New york times Books functionality with data
    When I click on Books button
    And  I click on bookReview
    And  I click on bestSeller
    Then I verify best seller page as "Best Sellers - The New York Times"

  @SmokeTest
  Scenario: New York times byTheBook functionality with data
    When I click on books button1
    And  I click on ByTheBooks
    Then I verify ByTheBooks page as "By the Book - The New York Times"

  @SmokeTest
  Scenario: New York Times crime page functionality
    When I click on books button2
    And  I click om crime button
    Then I verify crime page as "Crime - The New York Times"

  @SmokeTest
  Scenario: New York times children's book page functionality
    When I click on children's book
    Then I verify children's book page as "Children’s Books - The New York Times"

  @SmokeTest
  Scenario: New york times book review podcast page functionality
    When I click on bookReviewPodcast
    Then I verify bookReviewPodcast page as "The Book Review Podcast - The New York Times"

  @SmokeTest
  Scenario: New york times nowReadThis page functionality
    When I click on Now read this
    Then I verify NowReadThis page as "Now Read This - The New York Times"

  @SmokeTest
  Scenario: new york times style page Functionality
    When I click on style button
    And  I click on fashion button
    Then I validate fashion page as "Fashion - The New York Times"

  @SmokeTest
  Scenario: New york times love page functionality
    When I click on love button
    Then I verify love page as "Love - The New York Times"

  @SmokeTest
  Scenario: new york times self care page functionality
    When I click on self care button
    Then I validate self care as "Self-Care - The New York Times"

  @SmokeTest
  Scenario: new york times wineBeerCocktails page functionality
    When I click on food button
    And  I click on wineBeerCocktails button
    Then I verify wineBeerCocktail as "Wine, Beer & Cocktails - The New York Times"

  @SmokeTest
  Scenario: new york times restaurant review page functionality
    When I click on restaurant review
    Then I verify restaurantReview as "Food - The New York Times"

  @SmokeTest
  Scenario: new york times 36hours page functionality
    When I click on travel button
    And  I click on 36hours button
    Then I verify 36hours page as "36 Hours - The New York Times"

  @SmokeTest
  Scenario: new york times frugal traveler page functionality
    When I click on frugal travel
    Then I verify frugal travel pge  as "Frugal Traveler - The New York Times"

  @SmokeTest
  Scenario: new york times 52 places to go page functionality
    When I click on fifty two places to go button
    Then I verify fiftyTwo places to go page  as "52 Places to Go in 2020 - The New York Times"

  @SmokeTest
  Scenario: new york times design and interior page functionality
    When I click on T-magazine button
    And  I click on designInterior button
    Then I verify designInterior page as "Design & Interiors - The New York Times"

  @SmokeTest
  Scenario: new york times food page functionality
    When I click on foodMagazine button
    Then I verify foodMagazine page as "Food - The New York Times"

  @SmokeTest
  Scenario: new york times travel page functionality
    When I click on travelMagazine button
    Then I verify travelMagazine page as "Travel - The New York Times"

  @SmokeTest
  Scenario: new york times fashion and beauty page functionality
    When I click on fashionBeautyMagazine button
    Then I verify fshionBeautyMagazine page as "Fashion & Beauty - The New York Times"

  @SmokeTest
  Scenario: new york times entertainment page functionality
    When I click on entertainment button
    Then I verify entertainment page as "Entertainment - The New York Times"

  @SmokeTest
  Scenario: new york times art page functionality
    When I click on art button
    Then I verify art page as "Art - The New York Times"

  @SmokeTest
  Scenario: new york times theHighEnd page functionality
    When I click real estate button
    And  I click theHighEnd button
    Then I verify TheHighEnd page as "The High End - The New York Times"

#  @SmokeTest
#  Scenario: new york times find a home page functionality
#    When I click a home button
#    And  I enter "11214" in the searchField
#    And  I submit my search
#    Then I verify findHome page as "Find a Home - NYTimes.com"

  @SmokeTest
  Scenario: new york times world/africa page functionality
    When  I click on Africa button
    Then I verify africa page as "Africa - The New York Times"

#  @SmokeTest
#  Scenario: africa search field functionality
#    When  I click on Africa search button
#    And   I enter animals on search field
#    Then I verify result displayed as "567 results for animals sorted by"

  @SmokeTest
  Scenario: new york times world/americas page functionality
    When  I click on americas button
    Then  I verify americas page as "Americas - The New York Times"

  @SmokeTest
  Scenario: new york times world/Asia page functionality
    When  I click on asia button
    Then  I verify asia page as "Asia Pacific - The New York Times"

  @SmokeTest
  Scenario: new york times world/australia page functionality
    When  I click on australia button
    Then  I verify australia page as "Australia/New Zealand - The New York Times"

  @SmokeTest
  Scenario: new york times world/canada page functionality
    When  I click on canada button
    Then  I verify canada page as "Canada - The New York Times"

  @SmokeTest
  Scenario: new york times world/europe page functionality
    When  I click on europe button
    Then  I verify europe page as "Europe - The New York Times"

  @SmokeTest
  Scenario: new york times world/middleEast page functionality
    When  I click on middleEast button
    Then  I verify middleEast page as "Middle East - The New York Times"

  @SmokeTest
  Scenario: new york times business/tech/dealBook page functionality
    When  I click on tech button
    And   I click on dealBook
    Then  I verify tech  page as "DealBook - The New York Times"

  @SmokeTest
  Scenario: new york times business/tech/markets page functionality
    When  I click on markets button
    Then  I verify markets page as "Business - NYTimes.com"

  @SmokeTest
  Scenario: new york times business/tech/economy page functionality
    When  I click on economy button
    Then  I verify economy page as "Economy - The New York Times"

  @SmokeTest
  Scenario: new york times business/tech/energy page functionality
    When  I click on energy button
    Then  I verify energy page as "Energy & Environment - The New York Times"

  @SmokeTest
  Scenario: new york times business/tech/media page functionality
    When  I click on media button
    Then  I verify media page as "Media - The New York Times"

  @SmokeTest
  Scenario: new york times business/tech/personalTech page functionality
    When  I click on personalTech button
    Then  I verify personalTech page as "Personal Technology - The New York Times"

  @SmokeTest
  Scenario: new york times business/tech/entrepreneur ship page functionality
    When  I click on entrepreneurShip button
    Then  I verify entrepreneurShip page as "Entrepreneurship - The New York Times"

  @SmokeTest
  Scenario: new york times business/tech/yourMoney ship page functionality
    When  I click on yourMoney button
    Then  I verify yourMoney page as "Your Money - The New York Times"

  @SmokeTest
  Scenario: new york times opinion/columnist/ frank bruni page functionality
    When  I click on columnists button
    And   I click on frank bruni
    Then  I verify  frank bruni page as "Frank Bruni - The New York Times"

  @SmokeTest
  Scenario: new york times opinion/columunist/Charles M. Blow page functionality
    When  I click on CharlesMBlow button
    Then  I verify Charles M. Blow page as "Charles M. Blow - The New York Times"

  @SmokeTest
  Scenario: new york times opinion/columunist/JamelleBouie page functionality
    When  I click on Jamelle Bouie button
    Then  I verify Jamelle Bouie page as "Jamelle Bouie - The New York Times"

  @SmokeTest
  Scenario: new york times opinion/columunist/david brooks page functionality
    When  I click on david brooks button
    Then  I verify david brooks page as "David Brooks - The New York Times"

  @SmokeTest
  Scenario: new york times opinion/columunist/Roger Cohen page functionality
    When  I click on Roger Cohen button
    Then  I verify Roger Cohen page as "Roger Cohen - The New York Times"

  @SmokeTest
  Scenario: new york times opinion/columunist/gail collins page functionality
    When  I click on gail collins button
    Then  I verify gail collins page as "Gail Collins - The New York Times"

  @SmokeTest
  Scenario: new york times opinion/columunist/Ross Douthat page functionality
    When  I click on Ross Douthat button
    Then  I verify Ross Douthat page as "Ross Douthat - The New York Times"

  @SmokeTest
  Scenario: new york times opinion/columunist/Maureen Dowd page functionality
    When  I click on Maureen Dowd button
    Then  I verify Maureen Dowd page as "Maureen Dowd - The New York Times"

  @SmokeTest
  Scenario: new york times opinion/columunist/Thomas L. Friedman page functionality
    When  I click on Thomas L. Friedman button
    Then  I verify Thomas L. Friedman page as "Thomas L. Friedman - The New York Times"

  @SmokeTest
  Scenario: new york times opinion/columunist/Michelle Goldberg page functionality
    When  I click on Michelle Goldberg button
    Then  I verify Michelle Goldberg page as "Michelle Goldberg - The New York Times"

  @SmokeTest
  Scenario: new york times opinion/columunist/Nicholas Kristof page functionality
    When  I click on Nicholas Kristof button
    Then  I verify Nicholas Kristof page as "Nicholas Kristof - The New York Times"

  @SmokeTest
  Scenario: new york times opinion/columunist/Paul Krugman page functionality
    When  I click on Paul Krugman button
    Then  I verify Paul Krugman page as "Paul Krugman - The New York Times"

  @SmokeTest
  Scenario: new york times opinion/columunist/Farhad Manjoo page functionality
    When  I click on Farhad Manjoo button
    Then  I verify Farhad Manjoo page as "Farhad Manjoo - The New York Times"

  @SmokeTest
  Scenario: new york times opinion/columunist/Jennifer Senior page functionality
    When  I click on Jennifer Senior button
    Then  I verify Jennifer Senior page as "Jennifer Senior - The New York Times"

  @SmokeTest
  Scenario: new york times opinion/columunist/Bret Stephens page functionality
    When  I click on Bret Stephens button
    Then  I verify Bret Stephens page as "Bret Stephens - The New York Times"

  @SmokeTest
  Scenario: new york times opinion/series/disability
    When I click on series button
    And  I click on disability
    Then I verify disability  page as "Disability - The New York Times"

  @SmokeTest
  Scenario: new york times opinion/series/fixes
    When I click on fixes button
    Then I verify fixes page as "Fixes - The New York Times"

  @SmokeTest
  Scenario: new york times opinion/series/on campus
    When I click on onCampus button
    Then I verify on campus page as "On Campus - The New York Times"

  @SmokeTest
  Scenario: new york times opinion/series/red century
    When I click on red century button
    Then I verify red century page as "Red Century - The New York Times"

  @SmokeTest
  Scenario: new york times opinion/series/sporting
    When I click on sporting button
    Then I verify sporting page as "Sporting - The New York Times"

  @SmokeTest
  Scenario: new york times opinion/series/the stone
    When I click on the stone button
    Then I verify the stone page as "The Stone - The New York Times"

  @SmokeTest
  Scenario: new york times opinion/series/vietnam
    When I click on vietnam button
    Then I verify vietnam page as "Vietnam '67 - The New York Times"

  @SmokeTest
  Scenario: new york times opinion/editorial
    When I click on editorial button
    Then I verify editorial page as "Editorials - The New York Times"

  @SmokeTest
  Scenario: new york times opinion/OPED
    When I click on OPED button
    Then I verify OPED page as "Contributors - The New York Times"

  @SmokeTest
  Scenario: new york  opinion/letters
    When I click on letters button
    Then I verify letters page as "Letters to the Editor - The New York Times"

  @SmokeTest
  Scenario: new york  opinion/sunday review
    When I click on sundayReview button
    Then I verify sundayReview page as "Sunday Review - The New York Times"

  @SmokeTest
  Scenario: new york  opinion/video
    When I click on video button
    Then I verify video page as "https://www.nytimes.com/video/opinion"

  @SmokeTest
  Scenario: new york  opinion/gender and society
    When I click on gender and society button
    Then I verify gender and society page as "Gender & Society - The New York Times"

  @SmokeTest
  Scenario: new york  opinion/politics
    When I click on OpinionPolitics button
    Then I verify OpinionPolitics page as "Politics | Opinion - The New York Times"

  @SmokeTest
  Scenario: new york  opinion/opinionWorld
    When I click on opinionWorld button
    Then I verify opinionWorld page as "The World - The New York Times"

  @SmokeTest
  Scenario: new york  opinion/opinionBusiness
    When I click on opinionBusiness button
    Then I verify opinionBusiness page as "Business & Economics - The New York Times"

  @SmokeTest
  Scenario: new york  opinion/opinionTech
    When I click on opinionTech button
    Then I verify opinionTech page as "Opinion | Technology - The New York Times"

  @SmokeTest
  Scenario: new york  opinion/opinionEnvironment
    When I click on opinionEnvironment button
    Then I verify opinionEnvironment page as "Environment - The New York Times"

  @SmokeTest
  Scenario: new york  opinion/opinionHealth
    When I click on opinionHealth button
    Then I verify opinionHealth page as "Health and Wellness - The New York Times"

  @SmokeTest
  Scenario: new york  opinion/opinionCulture
    When I click on opinionCulture button
    Then I verify opinionCulture page as "Culture - The New York Times"










