Feature: login


  Scenario Outline: incorrect login
    Given user open login page
    When user enter "<Username>" and "<Password>"
    * click login button
    Then user should receive "<Error text>"

    Examples:
      | Username        | Password     | Error text                                                                |
      | locked_out_user | secret_sauce | Epic sadface: Sorry, this user has been locked out.                       |
      | some name       | secret_sauce | Epic sadface: Username and password do not match any user in this service |
      | standard_user   | some value   | Epic sadface: Username and password do not match any user in this service |


  Scenario Outline: correct login
    Given user open login page
    When user enter "<Username>" and "<Password>"
    * click login button
    Then user pass to MainPage
    Examples:
      | Username                | Password     |  |
      | standard_user           | secret_sauce |  |
      | problem_user            | secret_sauce |  |
      | performance_glitch_user | secret_sauce |  |




