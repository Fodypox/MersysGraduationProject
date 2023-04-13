Feature: Position Categories

  Background: Login steps
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    Then User should login successfully

  Scenario: Add a new Position Category under Human Resources Setup
    Given Go to Position Categories under Human Resources Setup
    When I Click on Add Position Category button
    And I Enter the name for the new position category as "SDET"
    And I Click on Save button
    Then Position Category should be successfully created and displayed

  Scenario: Admin User should not be able to add same data Position Category
    Given Go to Position Categories under Human Resources Setup
    When I Click on Add Position Category button
    And I Enter the name for the new position category as "SDET"
    And I Click on Save button
    Then User should get error message The Position Category with given name already exists

  Scenario: Edit Position Category under Human Resources Setup
    Given Go to Position Categories under Human Resources Setup
    When I Type a Position Category in Name field as "SDET" and click on Search button
    And I Click on Edit button On the displayed Position Category
    And I Enter the name for the new position category as "Quality Assurance"
    And I Click on Save button
    Then Position Category should be successfully updated

  Scenario: Delete Position Category under Human Resources Setup
    Given Go to Position Categories under Human Resources Setup
    When I Type a Position Category in Name field as "Quality Assurance" and click on Search button
    And I Click on Delete button On the displayed Position Category
    And I Click on Delete button on pop up window
    Then Position Category should be successfully deleted.

  Scenario: Admin User should not be able to access deleted Position Category
    Given Go to Position Categories under Human Resources Setup
    When I Type a Position Category in Name field as "Quality Assurance" and click on Search button
    Then Warning Message "There is no data to display" should be displayed

