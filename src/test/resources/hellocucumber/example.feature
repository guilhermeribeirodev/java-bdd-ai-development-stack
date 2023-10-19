Feature: A Roman to Cardinal numbers converter

  Scenario Outline: Convert a single digit number
    Given "<number>" to be converted as cardinal
    When it gets converted
    Then the cardinal result is "<result>"

    Examples:
      | number | result |
      | I      | 1      |
      | III    | 3      |
      | IV     | 4      |
      | V      | 5      |


  Scenario: Format validation
    Given the roman input "A" is not valid
    Then the error is displayed