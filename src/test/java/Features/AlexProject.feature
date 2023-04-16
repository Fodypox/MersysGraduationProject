Feature: Add Edit Delete School Department categories

  Background: Login steps
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    Then User should login successfully

  Scenario: Add new Department account positive test
    Given Open Department Categories under Setup School Setup
    When add new School Department Account
    Then should to see the added account success message
    Then delete account
    # scenario N 1 is DONE \\\\\\\\\\\\\\\\\\\\\\\\\\\/

  Scenario: Add new Department account negative test
    Given Open Department Categories under Setup School Setup
    When add any exist School Department
    Then should be see the warning message
    # The School Department with Alex "12345" already exists.
    Then delete account
  # scenario N 2 is DONE ///////////////////////

  Scenario: Edit Department account
    Given Open Department Categories under Setup School Setup
    When add new School Department Account
    When edit the School Department Account
    Then should be see success edited account success message
    Then delete updated account
    # scenario N 3 is DONE /////////////////////////


  Scenario: Delete Department account positive test
    Given Open Department Categories under Setup School Setup
    When add new School Department Account
    Then delete account
    Then should to see the deleted account success message
# scenario N4 is DONE //////////////////////////////////////////////////

  Scenario: Search for deleted School Department account negative test
    Given Open Department Categories under Setup School Setup
    When add new School Department Account
    Then delete account
    When try to search deleted School Department account
    Then should to see not found success message
    # scenario N 5 is DONE /////////////////////////////////////////////
