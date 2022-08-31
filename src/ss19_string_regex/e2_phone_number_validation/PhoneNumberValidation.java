package ss19_string_regex.e2_phone_number_validation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidation {
    public static void main(String[] args) {
        String phoneRegex = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";
        Pattern pattern = Pattern.compile(phoneRegex);

        System.out.print("Type a phone number with pattern (xx)-(0xxxxxxxxx): ");
        Scanner scanner = new Scanner(System.in);
        Matcher matcher = pattern.matcher(scanner.nextLine());

        System.out.println("Phone number is " + matcher.matches());
    }
}
