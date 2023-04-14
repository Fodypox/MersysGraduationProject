Feature: Human Resources Functionality


  Background:
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    And User should login successfully


  Scenario: Adding Attestation
    Given Admin should go to Human Resources -> Setup -> Attestations
    When Admin clicks Add Attestation button
    And Admin gives a new name
    And Admin clicks Save button
    Then Verify Attestation Added Successfully message should be displayed


  Scenario: Editing Attestation
    Given Admin should go to Human Resources -> Setup -> Attestations
    When Admin is searching for the specific Attestation
    And Admin clicks Edit button
    And Admin edits the name
    Then Verify Attestation successfully updated green message should be displayed


  Scenario:  Deleting Attestation
    Given Admin should go to Human Resources -> Setup -> Attestations
    When Admin is looking for the edited Attestation
    And Admin clicks Delete button
    And Admin clicks confirm Delete button
    Then Verify Attestation Deleted Successfully red-message should be displayed


  Scenario: Adding the same Attestation (negative TC)
    Given Admin should go to Human Resources -> Setup -> Attestations
    And Admin gives the name which already exists
    And Admin clicks Save button
    Then Verify The Attestation with [name] is already added Error message should be displayed







