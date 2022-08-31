package ss16_io_text_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BiggestValueFinding {
    public static void main(String[] args) {
        System.out.print("Type file path: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        writeFile("result.txt",findMax(readFile(path)));
    }

    public static List<Integer> readFile(String filePath) {
        List<Integer> numbers = new ArrayList<>();
        File file = new File(filePath);
        final String EMPTY = "";

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = "";
            while ((line = reader.readLine()) != null) {
                if (EMPTY.equals(line.trim())) {
                    continue;
                }
                numbers.add(Integer.parseInt(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return numbers;
    }

    public static void writeFile(String filePath, int max) {
        File file = new File(filePath);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(Integer.toString(max));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int findMax (List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }
        return max;
    }
}