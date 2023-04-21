Feature: Grades Functionality

  Scenario: Admin User should be able to Add Grade Levels
    Given Navigate to Campus
    And Enter username and password
    And Click on Login Button
    And User should login successfully
    When Admin clicks Setup-Parameters-Grade Levels
    And Admin clicks on the Add Grade Levels
    And Admin enters grade name, short name, order and next grade
    And Admin clicks on Save
    Then Admin filters to view all the grades
    And Admin can view the newly added grade from the list

  Scenario: Admin User should be able to Edit Grade Levels
    Given Navigate to Campus
    And Enter username and password
    And Click on Login Button
    And User should login successfully
    When Admin clicks Setup-Parameters-Grade Levels
    And Admin filters to view all the grades
    And Admin clicks on the Edit button
    And Admin updates grade name
    And Admin clicks on Save for update
    And Admin can view the newly added grade from the list

  Scenario: Admin User should be able to Delete Grade Levels
    Given Navigate to Campus
    And Enter username and password
    And Click on Login Button
    And User should login successfully
    When Admin clicks Setup-Parameters-Grade Levels
    And Admin filters to view all the grades
    And Admin clicks on the delete button
    Then Admin confirms delete

  Scenario: Admin User should not be able to activate a Deleted Grade Level
    Given Navigate to Campus
    And Enter username and password
    And Click on Login Button
    And User should login successfully
    When Admin clicks Setup-Parameters-Grade Levels
    And Admin filters to view all the grades
    Then Admin cannot view the deleted grade