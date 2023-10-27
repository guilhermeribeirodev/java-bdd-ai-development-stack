package hellocucumber;

import java.util.HashMap;

public class RomanToCardinal {
    public static int convert(String number){
        switch (number){
            case "I":
                return 1;
            case "III":
                return 3;
            case "IV":
                return 4;
            case "V":
                return 5;
        }
        return 0;
    }

    public static int romanToInteger(String s) {
        // Create a HashMap to map Roman numerals to their integer values.
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        // Iterate through the characters in the Roman numeral string.
        for (int charIndex = s.length() - 1; charIndex >= 0; charIndex--) {
            char currentChar = s.charAt(charIndex);
            int currentValue = romanMap.get(currentChar) != null ?  romanMap.get(currentChar) : 0;

            if(currentValue == 0){

            }

            // If the current value is smaller than the previous value, subtract it.
            if (currentValue < prevValue) {
                result -= currentValue;
            }
            // Otherwise, add it to the result.
            else {
                result += currentValue;
            }

            // Update the previous value for the next iteration.
            prevValue = currentValue;
        }

        return result;
    }
}
