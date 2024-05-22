Feature: Register

  @register
  Scenario: As a user I should be able to register successfully
    Given I am on home page
    And I click on register button
    When I enter registration details
    Then I should be able to register successfully
