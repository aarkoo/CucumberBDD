Feature: LOgin feature

  @Smoke
  Scenario Outline: Verify that user is able to login
    Given I am on login page
    When I enter "<name>" and "<password>"
    And I click on login btn
    Then user is on home page

    Examples: 
      | name                | password   |
      | aakashh92@gmail.com | Abcdefgh1@ |
