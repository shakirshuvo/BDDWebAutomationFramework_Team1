#Feature: United Health Care homepage tab functionality tests
#
#  Background:
#    Given User is in United Health Care homepage
##  1
#  @SmokeTest
#  Scenario: Successful redirecting after clicking Medicare tab
#    When User clicks on Medicare tab
#    Then User is directed to Medicare page
##  2
#  @SmokeTest
#  Scenario: Successful redirecting after clicking ForProviders tab
#    When User clicks on ForProviders tab
#    Then User is directed to ForProviders page
##  3
#  @SmokeTest
#  Scenario: Successful redirecting after clicking ForEmployers tab
#    When User clicks on ForEmployers tab
#    Then User is directed to ForEmployers page
##   4
#  @SmokeTest
#  Scenario: Successful redirecting after clicking ForBrokers tab
#    When User clicks on ForBrokers tab
#    Then User is directed to ForBrokers page
##  5
#  @SmokeTest
#  Scenario: Successful redirecting after clicking LanguageChange tab
#    When User clicks on LanguageChange tab
#    Then User is directed to LanguageChange page
##  6
#  @SmokeTest
#  Scenario: Successful redirecting after clicking  tab
#    When User clicks on FindADoctor tab
#    Then User is directed to FindADoctor page
##  7
#  @SmokeTest
#  Scenario: Successful redirecting after clicking  tab
#    When User clicks on FindYourPlan tab
#    Then User is directed to FindYourPlan page
##  8
#  @SmokeTest
#  Scenario: Successful redirecting after clicking  tab
#    When User clicks on IndividualAndFamilyHealthPlan tab
#    Then User is directed to IndividualAndFamilyHealthPlan page
##  9
#  @SmokeTest
#  Scenario: Successful redirecting after clicking  tab
#    When User clicks on MedicareHealthPlan tab
#    Then User is directed to MedicareHealthPlan page
##  10
#  @SmokeTest
#  Scenario: Successful redirecting after clicking  tab
#    When User clicks on SmallBusinessHealthPlan tab
#    Then User is directed to SmallBusinessHealthPlan page
##  11
#  @SmokeTest
#  Scenario: Successful redirecting after clicking  tab
#    When User clicks on ShortTermInsurenceHealthPlan tab
#    Then User is directed to ShortTermInsurenceHealthPlan page
##  12
#  @SmokeTest
#  Scenario: Successful redirecting after clicking  tab
#    When User clicks on MedicaidHealthPlan tab
#    Then User is directed to MedicaidHealthPlan page
##  13
#  @SmokeTest
#  Scenario: Successful redirecting after clicking  tab
#    When User clicks on DentalHealthPlan tab
#    Then User is directed to DentalHealthPlan page
##  14
#  @SmokeTest
#  Scenario: Successful redirecting after clicking  tab
#    When User clicks on ContactUs tab
#    Then User is directed to ContactUs page
##  15
#  @SmokeTest
#  Scenario: Successful redirecting after clicking  tab
#    When User clicks on Career tab
#    Then User is directed to Career page
##  16
#  @SmokeTest
#  Scenario: Successful redirecting after clicking  tab
#    When User clicks on NewsRoom tab
#    Then User is directed to NewsRoom page
##  17
#  @SmokeTest
#  Scenario: Successful redirecting after clicking  tab
#    When User clicks on AboutUs tab
#    Then User is directed to AboutUs page
##  18
#  @SmokeTest
#  Scenario: Successful redirecting after clicking  tab
#    When User clicks on Accessibility tab
#    Then User is directed to Accessibility page
#    #  19
#  @SmokeTest
#  Scenario: Successful redirecting after clicking  tab
#    When User clicks on Legal tab
#    Then User is directed to Legal page
#    #  20
#  @SmokeTest
#  Scenario: Successful redirecting after clicking  tab
#    When User clicks on Privacy tab
#    Then User is directed to Privacy page

    #  21
#  @SmokeTest
#  Scenario: Negetiv testing for myuhc sign in with invalid user name and password
#    And User clicks on sign in tab
#    And selects Plan Through You Employer?
#    And clicks signin button
#    When User enters "Donald Trump" in user name box
#    And enters "nancyPelosi" in password box
#    And User clicks on remember me check box
#    And finally clicks Signin button
#    Then User validae signin error message

#      22
#  @SmokeTest
#  Scenario Outline: Negetive testing for myuhc registration with invalid information
#    And User clicks on registernow tab
#    When User clicks Social Security Number radio button
#    And insarts <firstName>, <lastName>, <socialSecurityNumber>, <zip>, <birthDate> and <birthYear>
#    And selects birth month
#    And clicks continue button
#    Then User validae registration error message
#
#    Examples:
#      | firstName | lastName | socialSecurityNumber | zip   | birthDate | birthYear |
#      | Jony      | Deep     | 123451               | 11470 | 12        | 1981      |
#      | Jenny     | Parker   | 123452               | 11470 | 13        | 1981      |
#      | Jamboo    | Jackson  | 123453               | 11470 | 14        | 1981      |
#      | Jojo      | Mandes   | 123454               | 11470 | 15e       | 1981      |

