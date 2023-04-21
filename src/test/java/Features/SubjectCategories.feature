Feature: Subject Categories

  Background: Login
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    Then User should login successfully

  Scenario: As an Admin user Add a new Subject Category under Education setup
    Given Go to Subject Categories under Education Setup
    When I Click on Add Subject Category button
    And I Enter the name for the new Subject Category as "Subject"
    And I Enter the code for the new Subject Category as "S7"
    And I Click on Save button for new Subject Category
    Then Subject Category should be successfully created and displayed on top of the list

  Scenario: Admin user should not be able to add a new Subject Category with the same data
    Given Go to Subject Categories under Education Setup
    When I Click on Add Subject Category button
    And I Enter the name for the new Subject Category as "Subject"
    And I Enter the code for the new Subject Category as "S7"
    And I Click on Save button for new Subject Category
    Then User should get error message The Subject Category with given name already exists

  Scenario:As an Admin user Edit a Subject Category under Education Setup
    Given Go to Subject Categories under Education Setup
    When I Type a Subject Category in Name field as "Subject" and click on Search button
    And I Click on Edit button On the displayed Subject Category
    And I Enter a new name for the Subject category as "New Subject"
    And I Click on Save for button for Subject Category
    Then Subject Category should be successfully updated

  Scenario: Admin user should not be able to edit a Subject Category without entering a Category code
    Given Go to Subject Categories under Education Setup
    When I Type a Subject Category in Name field as "New Subject" and click on Search button
    And I Click on the Edit button On the displayed Subject Category
    And I delete the Subject Code
    Then User should get this error message:This field is required!

  Scenario: As an Admin user Delete a Subject Category under Education Setup
    Given Go to Subject Categories under Education Setup
    When I Type a Subject Category in Name field as "New Subject" and click on Search button
    And I Click on Delete button On the displayed Subject Category
    And I Click on Delete button on Popup window
    Then Subject Category should be successfully deleted.