package ss11_stack_queue.oe2_check_palindrome_by_queue;

import java.util.*;

public class PalindromeQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type a string: ");

        String str = scanner.nextLine();
        str = str.toLowerCase();
        Stack strReverse = new Stack();
        Queue strOriginal = new LinkedList();

        for (int i = 0; i < str.length(); i++) {
            strReverse.push(str.charAt(i));
            strOriginal.add(str.charAt(i));
        }

        while(!strReverse.isEmpty()) {
            if(strReverse.pop() != strOriginal.remove()) {
                break;
            }
        }

        if(strReverse.isEmpty()) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }
    }
}
