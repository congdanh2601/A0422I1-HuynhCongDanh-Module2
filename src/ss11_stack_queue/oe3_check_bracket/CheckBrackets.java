package ss11_stack_queue.oe3_check_bracket;

import java.util.Scanner;
import java.util.Stack;

public class CheckBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type an expression: ");
        String expression = scanner.nextLine();

        if(checkBrackets(expression)) {
            System.out.print("Well");
        } else {
            System.out.print("Not well");
        }

    }

    public static boolean checkBrackets(String expression) {
        Stack<Character> bStack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            if(expression.charAt(i) == '(') {
                bStack.push(expression.charAt(i));
            }
            if(expression.charAt(i) == ')') {
                if(bStack.isEmpty()) {
                    return false;
                }
                bStack.pop();
            }
        }
        if(bStack.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }
}
