Feature: Title of your feature4
  I want to use this template for my feature file

  @docstr
  Scenario: Approve leave functionality
    Given User is on Home Page
    When User Navigate to LogIn Page
    And User enters "basheer" as user name
    And User enters "pass1234" as password
    Then login should be successfull
    When i approve any leave
    """
    dhjsahdsajdhsakjdh
    oiruiewrwekjrnekwr
    nsdyiuyeueuuwqyeuq
    pjahuwuqywuhvfpfdi
    """
    Then leave should be approved
