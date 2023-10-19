Feature: A Roman to Cardinal numbers converter

  Scenario: Convert a single digit number
    Given "V" to be converted as cardinal
    When it gets converted
    Then the scenario passes
