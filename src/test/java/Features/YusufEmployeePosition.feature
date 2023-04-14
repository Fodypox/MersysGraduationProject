Feature: Employee Position

  Background: Login steps
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    Then User should login successfully

    Scenario: Admin User should be able to Add a New Employee Position
      Given Go to Positions under Human Resources Setup
      When I Click on Add Position button
      And I Enter the name as "Yusuf" and short name as "YA" for the new position field
      And I click on Save button
      Then Employee Position should be successfully created and displayed

  Scenario: Admin User should not be able to add same data as a New Employee Position
    Given Go to Positions under Human Resources Setup
    When I Click on Add Position button
    And I Enter the name as "Yusuf" and short name as "YA" for the new position field
    And I Click on Save button
    Then User should get error message The Position with Name already exists.

  Scenario: Admin User should be able to Edit a Employee Position
    Given Go to Positions under Human Resources Setup
    When I Type a Employee name in Name field as "Yusuf" and click on Search button
    And I Click on Edit button On the displayed Employee Position
    And I Enter the name for the new Employee Position as "YusufA"
    And I Click on Save button
    Then Employee Position should be successfully updated

  Scenario: Admin User should be able to Delete a Employee Position
    Given Go to Positions under Human Resources Setup
    When I Type a Employee name in Name field as "YusufA" and click on Search button
    And I click on Delete button On the displayed Employee Position
    And I Click on Delete button on pop up window
    Then Employee Position should be successfully deleted.

  Scenario: Admin User should not be able to access deleted a Employee Position
    Given Go to Positions under Human Resources Setup
    When I Type a Employee name in Name field as "YusufA" and click on Search button
    Then WarningMessage "There is no data to display" should be displayed