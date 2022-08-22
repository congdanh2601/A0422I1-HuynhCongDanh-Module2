package ss11_stack_queue.oe1_binary_hexadecimal_convert;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;
import java.util.Stack;

public class BinaryConverter {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number in decimal: ");
        int decimal = scanner.nextInt();

        System.out.print(decimal + " in binary is: ");

        while (decimal > 0) {
            stack.push(decimal % 2);
            decimal /= 2;
        }


        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }

}
