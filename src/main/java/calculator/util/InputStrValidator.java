package calculator.util;

import java.util.List;
import java.util.regex.Pattern;

public class InputStrValidator {
    private InputStrValidator() {
    }

    public static boolean isEmptyOrNull(String inputStr) {
        return ("".equals(inputStr) || inputStr == null);
    }

    public static boolean isHasOnlyOneNumber(String inputStr) {
        return InputStrValidator.isNumber(inputStr);
    }

    public static void checkValidNumbers(List<String> splitStrings) {
        boolean result = splitStrings.stream()
                .allMatch(InputStrValidator::isNumber);
        if (!result) {
            throw new RuntimeException();
        }
    }

    private static boolean isNumber(String inputStr) {
        String pattern = "^[0-9]*$";
        return Pattern.matches(pattern, inputStr);
    }
}