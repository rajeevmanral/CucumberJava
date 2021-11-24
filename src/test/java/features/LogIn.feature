Feature: Test login functionality

  Scenario Outline: Test login functionality
    Given browser is open
    And user is on login page
    When user enters "<username>" and "<password>"
    And user clicks on login
    Then user is navigated to the home page
    Examples:
      |username  |password|
      |Rajeev    |12345   |
      |Peter     |12345   |