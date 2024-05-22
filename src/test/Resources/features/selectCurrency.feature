Feature: ChangeCurrencyAsSelect
  @selectCurrency
  Scenario Outline: I should able to see correct currency when I change
    Given I am on home page
    When I select "<currency>" from option
    Then Each product contain "<currencySymbol>" symbol
    Examples:
    |currency|currencySymbol|
    |Euro    |€              |
    |US Dollar  |$              |