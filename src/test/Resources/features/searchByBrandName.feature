Feature:searchByBrandName

  @searchByBrandName
  Scenario Outline: As a user I should able to search any product and each product title contain searched word
    Given I am on home page
    When I enter "<brandName>" in search box
    And I click on search button
    Then I should be able to see each product contain "<searchedBrand>"
    And I should verify navigated url contain searched "<word>"
    Examples:
      |brandName  |searchedBrand|word|
      |apple      |Apple        |apple|
