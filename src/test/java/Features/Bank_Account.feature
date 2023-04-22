Feature: Add Edit Delete

  Background:
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    Then User should login successfully

  @SmokeTest
  Scenario: Add new bank account positive test
    Given Open Bank Account ander Parameters Setup
    When I add new Bank Account
    Then I should to see the added account success message
    Then delete account
    # scenario N 1 is DONE \\\\\\\\\\\\\\\\\\\\\\\\\\\/

  Scenario: Add new bank account negative test
    Given Open Bank Account ander Parameters Setup
    When I add any exist Bank Account
    Then I should be see the warning message
    # The Bank Account with IBAN "PA78" already exists.
    Then delete account
  # scenario N 2 is DONE ///////////////////////


  Scenario: Edit bank account
    Given Open Bank Account ander Parameters Setup
    When I add new Bank Account
    When I edit the Bank Account
    Then I should be see success edited account success message
    Then delete updated account
    # scenario N 3 is DONE ///////////////////////


  Scenario: Delete bank account positive test
    Given Open Bank Account ander Parameters Setup
    When I add new Bank Account
    Then delete account
    Then I should to see the deleted account success message
# scenario N4 is DONE ////////////////////////////////////////////////

  Scenario: Search for deleted account negative test
    Given Open Bank Account ander Parameters Setup
    When I add new Bank Account
    Then delete account
    When I try to search deleted bank account
    Then I should to see not found success message
    # scenario N 5 is DONE /////////////////////////////////////////////