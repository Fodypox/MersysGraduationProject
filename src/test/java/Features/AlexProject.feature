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
    # scenario N 1 is Done   \\\\\\\\\\\\\\\\\\\\\\\\\\\

  Scenario: Add new Department account negative test
    Given Open Department Categories under Setup School Setup
    When add any exist School Department
    Then should be see the warning message
    # The School Department with Alex "12345" already exists.
  # scenario N 2 is Done! ///////////////////////

  Scenario: Edit Department account
    Given Open Department Categories under Setup School Setup
    When add new School Department Account
    When edit the School Department Account
    Then should be see success edited account success message
    # scenario N 3 is  not pass yet //////////////////////////////


  Scenario: Delete Department account positive test
    Given Open Department Categories under Setup School Setup
    When add new School Department Account
    Then delete department
    Then should to see the deleted account success message
# scenario N4 is DONE //////////////////////////////////////////////////

  Scenario: for edit School Department account negative test
    Given Open Department Categories under Setup School Setup
    When add new School Department Account
    And edit the School Department Account
    Then should to see not found success message
    Then delete account

    # scenario N 5 is  /////////////////////////////////////////////
  #cant find department
