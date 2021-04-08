Feature: Login with valid credentials

  As customer I want to be able to login to application providing valid credentials

  Scenario Outline: Login to app
    Given the app login page is open
    When the user enters correct <username> and <password>
    Then the user is logged in

    Examples:
      | username      | password     |
      | standard_user | secret_sauce |
      | problem_user  | secret_sauce |