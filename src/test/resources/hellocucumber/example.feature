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
      | XXI    | 21     |
      | XXX    | 30     |
      | L      | 50     |
      | XC     | 90     |


