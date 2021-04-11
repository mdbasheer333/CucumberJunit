Feature: Title of your feature2
  I want to use this template for my feature file

	@smoke
  Scenario: Successful Login with Valid Credentials data
    Given User is on Home Page
    When User Navigate to LogIn Page
    And User enters "basheer" as user name
    And User enters "pass1234" as password

	@regression
  Scenario Outline: Successful Login with Valid Credentials multiple times
    Given User is on Home Page
    When User Navigate to LogIn Page
    And User enters "<userid>" as user name
    And User enters "<password>" as password

    Examples: 
      | userid     | password |
      | testuser_1 | Test@151 |
      | testuser_2 | Test@152 |
      | testuser_3 | Test@153 |
