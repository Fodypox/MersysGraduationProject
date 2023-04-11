Feature: Add-Edit-Delete document types

  Background:
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    Then User should login successfully
    Given Admin click on Setup
    When Admin click on Parameters
    And Admin click on Document Types
    Then Admin should navigate to Document Types Page


    Scenario: Add document types
      When Admin click on Add Document Icon
      And Admin fill Name field
      And Admin click on Stage dropdown menu
      And Admin select all checkboxes
      And Admin deselect all checkboxes
      When Admin click on a random document type checkbox and navigate back to the form
      And Admin add a description
      When Admin deactivates all toggles and activates a random toggle
      And Admin click on Save button
      Then Admin should see success message

