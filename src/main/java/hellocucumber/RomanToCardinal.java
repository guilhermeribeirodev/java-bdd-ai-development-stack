package hellocucumber;

public class RomanToCardinal {
    public static int convert(String number){
        switch (number){
            case "I":
                return 1;
            case "V":
                return 5;
        }
        return 1;
    }
}
