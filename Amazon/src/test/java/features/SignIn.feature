Feature: Amazon Sign In functionality check

  Background:
    Given I am on Amazon homepage
    When I hover over 'Hello, Sign in' button
    And I click on 'Sign in' button under Hello, Sign in

  @SmokeTest
  Scenario: Check that user can navigate from homepage to Sign In page using title
    Then I verify page title as "Amazon Sign-In"

  @SmokeTest
  Scenario Outline: Check that an alert message is displayed when user tries to login with an invalid email
    And I enter an invalid "<email address>" on 'Email (phone for mobile accounts) field
    And I click on 'Continue' button below 'Email (phone for mobile accounts) field
    Then I verify that the "<alert message>" is displayed
    Examples:
      | email address                 | alert message                                     |
      | invalidEmail@invalidEmail.com | We cannot find an account with that email address |

  @SmokeTest
  Scenario Outline: Check that an alert message is displayed when user tries to login with an invalid phone number
    And I enter an invalid "<phone number>" on 'Email (phone for mobile accounts) field
    And I click on 'Continue' button below 'Email (phone for mobile accounts) field
    Then I verify that the "<alert message>" is displayed
    Examples:
      | phone number | alert message                                     |
      | 8399283899   | We cannot find an account with that mobile number |

  @SmokeTest
  Scenario Outline: Check that an alert message is displayed when user tries to login with an invalid password
    And I enter a valid "<email address>" on 'Email (phone for mobile accounts) field
    And I click on 'Continue' button below 'Email (phone for mobile accounts) field
    And I enter an invalid "<password>" on the 'Password' field
    And I click on 'Sign-in' button after password
    Then I verify that the "<alert message1>" or "<alert message2>" is displayed
    Examples:
      | email address            | password        | alert message1             | alert message2                                                                                                                    |
      | ciara105@xhanimatedm.com | InvalidPass123! | Your password is incorrect | To better protect your account, please re-enter your password and then enter the characters as they are shown in the image below. |

  @SmokeTest
  Scenario Outline: Check that an user can successfully log into Amazon
    And I enter a valid "<email address>" on 'Email (phone for mobile accounts) field
    And I click on 'Continue' button below 'Email (phone for mobile accounts) field
    And I enter a valid "<password>" on the Password field
    And I click on 'Sign-in' button after password
    Then I verify that "<user's name>" is displayed
    Examples:
      | email address               | password   | user's name |
      | shakir.jahangir83@gmail.com | BugBusters | Shakir      |

  @SmokeTest
  Scenario Outline: Check that two users can successfully log into Amazon consecutively
    And I enter a valid "<email address>" on 'Email (phone for mobile accounts) field
    And I click on 'Continue' button below 'Email (phone for mobile accounts) field
    And I enter a valid "<password>" on the Password field
    And I click on 'Sign-in' button after password
    Then I verify that "<user's name>" is displayed
    Examples:
      | email address               | password   | user's name |
      | shakir.jahangir83@gmail.com | BugBusters | Shakir      |
      | zarria@xhanimatedm.com      | BugBusters | Phong       |

  @SmokeTest
  Scenario Outline: Check that an alert message is displayed when user tries to login without an email or phone number
    And I click on 'Continue' button below 'Email (phone for mobile accounts) field
    Then I verify that the missing email or phone "<alert message>" is displayed
    Examples:
      | alert message                           |
      | Enter your email or mobile phone number |

  @SmokeTest
  Scenario Outline: Check that an alert message is displayed when user tries to login without a password
    And I enter a valid "<email address>" on 'Email (phone for mobile accounts) field
    And I click on 'Continue' button below 'Email (phone for mobile accounts) field
    And I click on 'Sign-in' button after password
    Then I verify that the missing password "<alert message>" is displayed
    Examples:
      | email address               | alert message       |
      | shakir.jahangir83@gmail.com | Enter your password |
