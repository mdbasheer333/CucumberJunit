
Feature: Title of your feature1
  I want to use this template for my feature file

  @smoke
  Scenario: Title of your scenario
    Given I want to write a step with precondition
    And some other precondition
    When I complete action
    And some other action
    And yet another action
    Then I validate the outcomes
    And check more outcomes
    And i pass 10 to the stepdef
 
 @critical
  Scenario: Successful Login with Valid Credentials
    Given User is on Home Page
    When User Navigate to LogIn Page
    And User enters Credentials to LogIn
      | userid     | password |
      | testuser_1 | Test@151 |
      | testuser_2 | Test@152 |
      | testuser_3 | Test@153 |
    Then Message displayed Login Successfully
