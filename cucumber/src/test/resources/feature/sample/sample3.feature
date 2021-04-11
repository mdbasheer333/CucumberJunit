@backgroundtag
Feature: Title of your feature3
  I want to use this template for my feature file

  Background: 
    Given User is on Home Page
    When User Navigate to LogIn Page
    And User enters "basheer" as user name
    And User enters "pass1234" as password
    Then login should be successfull

  @smoke
  Scenario: Apply leave functionality
    When i apply leave
    Then leave should be applied

  @regression
  Scenario: Cancel leave functionality
    When i cancel leave
    Then leave should be cancelled
