package ss19_string_regex.e1_class_name_validation;

import javafx.scene.transform.Scale;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameValidation {
    public static void main(String[] args) {
        String regexClassName = "^[ACP]\\d{4}[GHIKLM]$";
        Pattern pattern = Pattern.compile(regexClassName);

        System.out.print("Type a class name: ");
        Scanner scanner = new Scanner(System.in);
        Matcher matcher = pattern.matcher(scanner.nextLine());

        System.out.println("Class name is " + matcher.matches());
    }
}
