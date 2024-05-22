Feature: CheckoutAsGuest
  @checkoutAsGuest
Scenario: As a guest user I should be able to checkout successfully HTCOneM8AndroidLollipop
   Given I am on home page
    When I click on ADD TO CART Button under(HTC One M8 Android Lollipop)
    Then I click on shopping cart to checkout
    Then  I click to tick term and condition after that I click on CHECKOUT
    When I click on CHECKOUT AS GUEST
    Then I fill billing address details on checkout page after that i click on continue button
    And I select shipping method after that i click on continue button
    And I select payment method after that i click on continue button
    And I fill select payment information after that i click on continue button
    When I click confirm your order
    Then I confirm checkout completed msg
    Then I confirm is order num display
