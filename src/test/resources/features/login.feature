Feature: login

  Scenario: successful login
    Given general user with correct credentials
    * open the login page
    When user enters correct credentials and click login button
    Then user pass to Dashboard page