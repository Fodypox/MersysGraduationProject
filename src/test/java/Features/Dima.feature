Feature: Position Categories

  Background:
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    Then User should login successfully

                                  #1
  Scenario: Admin User should be able to Add  School Locations
    When  Admin click Setup button
    When Admin click School Setup  button
    When Admin click Locations button
    When Admin click Add Location.  +
    When Admin writes name, short name, Location Type, Capacity
    When Admin click Save button
#    Then Admin will see success message: "location successfully created."

                                  #2
  Scenario: 1 Admin User should be able to Add  School Locations
    When  Admin click Setup button
    When Admin click School Setup  button
    When Admin click Locations button
    When Admin click Add Location.  +
    When Admin writes name, short name, Location Type, Capacity
    When Admin click Save button
#    Then Admin will see  message: "The School Location with Name "Dima" already exists."

                                  #3

  Scenario: Admin User should be able to Edit  School Locations
    When  Admin click Setup button
    When  Admin click School Setup  button
    When  Admin click Locations button
    When Admin click Edit Location
    When  Admin writes other name
    When Admin click Save button
#    Then Admin will see success message: "location successfully updated"


                                    #4

  Scenario: Admin User should be able to  Delete School Locations
    When  Admin click Setup button
    When  Admin click School Setup  button
    When  Admin click Locations button
    When Admin click Delete button
#    Then Admin will see success message: "location successfully Delete"


                                     #5
  Scenario:
    When  Admin click Setup button
    When Admin click School Setup  button
    When Admin click Locations button
    When Admin click Add Location.  +
    When Admin writes  short name, Location Type, Capacity
#    Then Admin will see success message: " This field cannot be left blank!"






