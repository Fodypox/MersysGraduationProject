Feature: Discounts Functionality
  Scenario: Discounts tab can not be found under setup
    Given Navigate to Campus
    And Enter username and password
    And Click on Login Button
    And User should login successfully
    When Admin clicks Setup
    Then Admin cannot find Discounts tab under Setup