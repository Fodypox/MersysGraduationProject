Feature: Add-Edit-Delete document types

  Background: Login as Admin and navigate to the Document Types Page
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
    When Admin fill description field with "This is a description"
    Then Admin should see error message
    And Admin fill Name field with "sercanAddDocumentTest"
    When Admin click on Stage dropdown menu
    And Admin select all checkboxes
    And Admin deselect all checkboxes
    When Admin click on a random document type checkbox and navigate back to the form
    And Admin fill description field with "This is a description"
    When Admin deactivates all toggles and activates a random toggle
    And Admin click on Save button
    Then Admin should see success message

  Scenario: Edit Document Types
    When Admin type "sercanAddDocumentTest" on the search field
    And Admin click on Search button
    And Admin click on Edit icon
    When Admin edit document name field with "sercanEditDocumentTest"
    And Admin click on Stage dropdown menu again
    And Admin select all checkboxes
    And Admin deselect all checkboxes
    And Admin click on a random document type checkbox and navigate back to the form
    And Admin edit Description field with "This is an updated description"
    And Admin click on Save button
    Then Admin should see success message

  Scenario: Delete Document Types
    When Admin type "sercanEditDocumentTest" on the search field
    And Admin click on Search button
    When Admin click on Delete icon
    And  Admin click on Delete button
    Then Admin should see success message
    When Admin type "sercanEditDocumentTest" on the search field
    And Admin click on Search button
    Then Admin should not be able to see the deleted document type