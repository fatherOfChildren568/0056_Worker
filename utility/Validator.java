package utility;

public class Validator {

    // private constructor
    private Validator() {

    }

    // check input limit in range
    public static boolean isLimitInRange(int input, int min, int max) {
        return input >= min && input <= max;
    }

    public static boolean isValidInt(int input) {
        return input > 0;
    }

    public static boolean isValidString(String input) {
        return !input.isEmpty();
    }

    public static boolean isValiDoulbe(double input) {
        return input > 0;
    }

    
}