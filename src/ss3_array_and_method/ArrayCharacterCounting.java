package ss3_array_and_method;

import java.util.Scanner;

public class ArrayCharacterCounting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "I'm learning at CodeGym DN";
        System.out.println(str);
        String inputStr;

        do {
            System.out.print("Type 1 any character: ");
            inputStr = scanner.nextLine();
            if (inputStr.length() != 1) {
                System.out.print("Invalid input. Please type 1 any character: ");
                inputStr = scanner.nextLine();
            }
        } while (inputStr.length() != 1);
        char c = inputStr.charAt(0);

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }

        System.out.println(c + " appears " + count + " time(s) in \"" + str + "\"");
    }
}
