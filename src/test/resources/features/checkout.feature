Feature: checkout

  Scenario: successful checkout
    Given user open login page
    * successful login with "standard_user" and "secret_sauce"
    * user pass to MainPage
    When user go to checkoutPage
    * user successful checkout with "first name" and "last name" and "postal code"
    Then checkout complete

