Feature: All SwagLabs Login features

  Background: Login to SwagLabs
    Given I am on the SwagLabs login page


  Scenario Outline: Login to SwagLabs
    When I enter valid "<username>" and "<password>"
    And I click the login button
    Then I should be logged in successfully

    Examples:
      | username | password |
      | standard_user | secret_sauce |
      | problem_user | secret_sauce |
      | performance_glitch_user | secret_sauce |
      | locked_out_user | secret_sauce |