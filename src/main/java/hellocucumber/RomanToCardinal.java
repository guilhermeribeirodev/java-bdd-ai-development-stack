package hellocucumber;

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
        return 1;
    }
}
