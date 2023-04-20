Feature: Nationalities feature under Parameter

  Background:
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    Then User should login successfully

    Scenario:Validate as an Admin User I should be able to add new nationalities in Nationalities
      And I click on the set up
      And I click on the parameters
      And I click on Nationalities
      And I click on the add nationality button
      And I write new nationality name
      And I click save button
      Then User should be see success message about adding new nationality

      Scenario: Validate Admin User should not be able to add same data nationalities in Nationalities
        And I click on the set up
        And I click on the parameters
        And I click on Nationalities
        And I click on the add nationality button
        And I added the same Nationality name
        And I click save button
        Then User will see unsuccessful message about name already exist

        Scenario: Validate Admin User should be able to Edit Nationality
          And I click on the set up
          And I click on the parameters
          And I click on Nationalities
          And I write Nationality name on the name text box to search
          And I click search button
          And I click edit button
          And I change name
          And I click save button
          Then User  will see success message about updating

          Scenario: Validate Admin User should be able to Delete Nationality
            And I click on the set up
            And I click on the parameters
            And I click on Nationalities
            And I write Nationality name on the name text box to search
            And I click search button
            And I click delete button
            And I will see delete confirmation dialog box and click delete button
            Then User will see success message about delete

            Scenario: Validate Admin User should not be able to access deleted Nationalities
              And I click on the set up
              And I click on the parameters
              And I click on Nationalities
              And I write Nationality name on the name text box to search
              And I click search button
              Then User will see unsuccessful message no data display








