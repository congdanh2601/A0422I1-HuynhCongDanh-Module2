package ss11_stack_queue.e3_map_count_appearace;

import java.util.*;

public class CountAppearance {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type a sentence: ");
        String str = scanner.nextLine();
        str = str.toLowerCase();

        String[] stringArray = str.split(" ");

        for (String element : stringArray) {
            if (treeMap.containsKey(element)) {
                treeMap.put(element, treeMap.get(element) + 1);
            } else {
                treeMap.put(element, 1);
            }
        }

        System.out.println(treeMap.entrySet());

    }
}
