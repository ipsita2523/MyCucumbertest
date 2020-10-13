Feature: EDreams various types of bookings

  Scenario: As an user i want to search hotels in EDreams
    Given I am navigated to EDreams
    When I choose hotel booking tab
    And I provide hotel booking information
    Then I should be able to view list of available hotels