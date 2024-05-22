Feature: referAProductToFriend

  @referAProductToFriend

  Scenario: As a user I should be able to refer a product to friend by email
    Given I am on home page
    When I click on Electronics button
    Then I click Camera & photo from list
    Then I click on Leica T Mirrorless Digital Camera from display products
    When I click on Email a friend button
    And I enter friend's email
    Then I enter my email address
    And I type personal message
    Then I click on SEND EMAIL button








