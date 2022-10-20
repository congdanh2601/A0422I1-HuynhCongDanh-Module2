package final_exam_2.validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validators {
    public static boolean checkPositiveNumber(int number) {
        return number > 0;
    }

    public static boolean validateProductCode (String code) {
        String codeRegex = "^SP\\d{5}$";
        Pattern pattern = Pattern.compile(codeRegex);
        Matcher matcher = pattern.matcher(code);
        if (matcher.matches()) {
            return true;
        } else {
            System.out.println("Code must follow format SPxxxxx (with x is a number). Type again.");
            return false;
        }
    }

    public static boolean validateString(String name) {
        String nameRegex = "^[A-Z][a-z]*";
        Pattern pattern = Pattern.compile(nameRegex);
        Matcher matcher = pattern.matcher(name);
        if (matcher.matches()) {
            return true;
        } else {
            System.out.println("First letter must be in UPPERCASE");
            return false;
        }
    }

    public static boolean validateEmpty(String input) {
        String nameRegex = "^[^\\w]*";
        Pattern pattern = Pattern.compile(nameRegex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            System.out.println("Input can't be empty");
            return false;
        } else {
            return true;
        }
    }

}
