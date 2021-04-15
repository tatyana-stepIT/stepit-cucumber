@Regression
Feature: Login with valid credentials

  As customer I want to be able to login to application providing valid credentials

  @Login @ABC-123 @Start
  Scenario Outline: Login to app
    Given the app login page is open
    When the user enters correct <username> and <password>
    Then the user is logged in

    Examples:
      | username      | password     |
      | standard_user | secret_sauce |
      | problem_user  | secret_sauce |

    @Smoke
    Examples:
      | username      | password     |
      | standard_user | secret_sauce |

  @Checkout @Stop
  Scenario Outline: Add product to cart
    Given the app is on products page
    When the user adds <product> to cart
    Then the cart counter is updated by 2

    @Smoke
    Examples:
      | product           |
      | Sauce Labs Onesie |
