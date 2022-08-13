package ss11_stack_queue.e1_reverse_elements;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StackReverse {
    public static void main(String[] args) {

//        Stack wStack = new Stack();
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter size of array: ");
//        int size = scanner.nextInt();
//        Integer[] numbers = new Integer[size];
//
//        for (int i = 0; i < size; i++) {
//            System.out.printf("Type element %d: ", i);
//            numbers[i] = scanner.nextInt();
//            wStack.push(numbers[i]);
//        }
//
//        System.out.println("Array before reverse: " + Arrays.toString(numbers));
//
//        for (int i = 0; i < size; i++) {
//            numbers[i] = (Integer) wStack.pop();
//        }
//
//        System.out.println("Array after reverse: " + Arrays.toString(numbers));

        Stack wStack2 = new Stack();
        String string = "Hello CodeGym Da Nang";
        String[] mWord = string.split(" ");

        System.out.println(Arrays.toString(mWord));

        for (String s : mWord) {
            wStack2.push(s);
        }

        String outp = "";
        for (int i = 0; i < mWord.length; i++) {
            mWord[i] = (String) wStack2.pop();
            outp += mWord[i];
        }

        System.out.println(outp);

    }
}
