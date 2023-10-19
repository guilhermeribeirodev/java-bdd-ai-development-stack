Feature: A Roman to Cardinal numbers converter

  Scenario Outline: Convert a single digit number
    Given "<number>" to be converted as cardinal
    When it gets converted
    Then the cardinal result is "<result>"

    Examples:
      | number | result |
      | V      | 5      |