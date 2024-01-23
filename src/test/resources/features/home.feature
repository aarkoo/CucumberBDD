Feature: home feature

  Scenario Outline: Home page login
    Given I am logged in after entering "<name>" and "<password>"
    And I click on home button
    When I click on shop now button

    Examples: 
      | name                | password   |
      | aakashh92@gmail.com | Abcdefgh1@ |
