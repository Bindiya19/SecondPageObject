Feature: category

  @category
  Scenario Outline: As a user ,i should be able to navigated to each category page successfully
    Given I am on home page
    When I click on "<category_name>" button
    Then I should be able to verify that user navigated to "<url>" page
    Examples:
    |category_name| url|
    |Computers    |/computers|
    |Electronics  |/electronics|
    |Apparel      |/apparel    |
    |Digital downloads|/digital-downloads|
    |Books            |/books             |
    |Jewelry          |/jewelry           |
    |Gift Cards       |/gift-cards        |
