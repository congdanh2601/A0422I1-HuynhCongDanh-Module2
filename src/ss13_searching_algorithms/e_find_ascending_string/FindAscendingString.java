package ss13_searching_algorithms.e_find_ascending_string;

import java.util.Scanner;

public class FindAscendingString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type a string: ");
        String inputString = scanner.nextLine();
        String outputString = "";
        int ascii = 0;

        for (char c : inputString.toCharArray()) {
            if (c > ascii) {
                outputString += c;
                ascii = c;
            }
        }

        System.out.println(outputString);
    }
}
