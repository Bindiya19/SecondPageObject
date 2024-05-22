Feature: NewReleaseCommentSuccessfully

  @newReleaseComment

  Scenario: When I click on DETAILS button undernopCommercenewrelease I should be able to comment successfully and see the comment  added in List at last
    Given I am on home page
    When I click on DETAILS under nopCommerce new release!
    And I type title in Title box after I type comment in Comment box click on NEW COMMENT
    And I verify new comment msg after that compare text msg
    Then I verify my comment show in list in last



