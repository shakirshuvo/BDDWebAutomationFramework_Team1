Feature: Amazon homepage tab functionality tests

  Background:
    Given User is in Amazon homepage

    #1
  @SmokeTest
  Scenario: Amazon homepage search box functionality check
    When User inserts "hat" in search box
    And enters submit button
    Then User varifies "hat" from the search page

    #2
  @SmokeTest
  Scenario: Successful redirecting after clicking BestSeller tab
    When User clicks on BestSeller tab
    Then User is directed to BestSeller page

    #3
  @SmokeTest
  Scenario: Successful redirecting after clicking NewReleases tab
    When User clicks on NewReleases tab
    Then User is directed to NewReleases page

    #4
  @SmokeTest
  Scenario: Successful redirecting after clicking MoversAndShakers tab
    When User clicks on MoversAndShakers tab
    Then User is directed to MoversAndShakers page

    #5
  @SmokeTest
  Scenario: Successful redirecting after clicking MostWishedFor tab
    When User clicks on MostWishedFor tab
    Then User is directed to MostWishedFor page

    #6
  @SmokeTest
  Scenario: Successful redirecting after clicking GiftIdeas tab
    When User clicks on GiftIdeas tab
    Then User is directed to GiftIdeas page

    #7
  @SmokeTest
  Scenario: Successful redirecting after clicking CustomerService tab
    When User clicks on CustomerService tab
    Then User is directed to CustomerService page

    #8
  @SmokeTest
  Scenario: Successful redirecting after clicking TodaysDeal tab
    When User clicks on TodaysDeal tab
    Then User is directed to TodaysDeal page

    #9
  @SmokeTest
  Scenario: Successful redirecting after clicking NewReleasesA tab
    When User clicks on NewReleasesA tab
    Then User is directed to NewReleasesA page

    #10
  @SmokeTest
  Scenario: Successful redirecting after clicking NewGames tab
    When User clicks on NewGames tab
    Then User is directed to NewGames page

    #12
  @SmokeTest
  Scenario: Successful redirecting after clicking NewPCGames tab
    When User clicks on NewPCGames tab
    Then User is directed to NewPCGames page

    #13
  @SmokeTest
  Scenario: Successful redirecting after clicking NewVideoGames tab
    When User clicks on NewVideoGames tab
    Then User is directed to NewVideoGames page

    #14
  @SmokeTest
  Scenario: Successful redirecting after clicking NewPlayStationThree tab
    When User clicks on NewPlayStationThree tab
    Then User is directed to NewPlayStationThree page

    #15
  @SmokeTest
  Scenario: Successful redirecting after clicking NewXbox360 tab
    When User clicks on NewXboxThreeSixty tab
    Then User is directed to NewXboxThreeSixty page

    #16
  @SmokeTest
  Scenario: Successful redirecting after clicking NewNintendoDS tab
    When User clicks on NewNintendoDS tab
    Then User is directed to NewNintendoDS page

    #17
  @SmokeTest
  Scenario: Successful redirecting after clicking NewWii tab
    When User clicks on NewWii tab
    Then User is directed to NewWii page

    #18
  @SmokeTest
  Scenario: Successful redirecting after clicking NewWiiU tab
    When User clicks on NewWiiU tab
    Then User is directed to NewWiiU page

    #19
  @SmokeTest
  Scenario: Successful redirecting after clicking NewPlayStationVista tab
    When User clicks on NewPlayStationVista tab
    Then User is directed to NewPlayStationVista page

    #20
  @SmokeTest
  Scenario: Successful redirecting after clicking NewNintendo3DS tab
    When User clicks on NewNintendoThreeDS tab
    Then User is directed to NewNintendoThreeDS page

    #21
  @SmokeTest
  Scenario: Successful redirecting after clicking NewXboxOne tab
    When User clicks on NewXboxOne tab
    Then User is directed to NewXboxOne page

    #22
  @SmokeTest
  Scenario: Successful redirecting after clicking NewPlayStation4 tab
    When User clicks on NewPlayStationFour tab
    Then User is directed to NewPlayStationFour page

    #23
  @SmokeTest
  Scenario: Successful redirecting after clicking NewSonyPSP tab
    When User clicks on NewSonyPSP tab
    Then User is directed to NewSonyPSP page

    #24
  @SmokeTest
  Scenario: Successful redirecting after clicking MacGames tab
    When User clicks on MacGames tab
    Then User is directed to MacGames page

    #25
  @SmokeTest
  Scenario: Successful redirecting after clicking NewNintendoSwitch tab
    When User clicks on NewNintendoSwitch tab
    Then User is directed to NewNintendoSwitch page

    #26
  @SmokeTest
  Scenario: Successful redirecting after clicking MoreSystems tab
    When User clicks on MoreSystems tab
    Then User is directed to MoreSystems page

    #27
  @SmokeTest
  Scenario: Successful redirecting after clicking Microconsoles tab
    When User clicks on Microconsoles tab
    Then User is directed to Microconsoles page

    #28
  @SmokeTest
  Scenario: Successful redirecting after clicking FindAGift tab
    When User clicks on FindAGift tab
    Then User is directed to FindAGift page

    #29
  @SmokeTest
  Scenario: Successful redirecting after clicking WholeFood tab
    When User clicks on WholeFood tab
    Then User is directed to WholeFood page

    #30
  @SmokeTest
  Scenario: Successful redirecting after clicking WholeFoodBeverages tab
    When User clicks on WholeFoodBeverages tab
    Then User is directed to WholeFoodBeverages page

    #31
  @SmokeTest
  Scenario: Successful redirecting after clicking GiftCards tab
    When User clicks on GiftCards tab
    Then User is directed to GiftCards page
