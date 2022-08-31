package ss16_io_text_file.e1_copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CopyFileText {
    public static List<Integer> readFile(String filePath) {
        List<Integer> characters = new ArrayList<>();
        File file = new File(filePath);
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            int character = reader.read();
            while (character != -1) {
                characters.add(character);
                if(character != 13 && character != 10) count++;
                character = reader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Size of file: " + count);
        return characters;
    }

    public static void writeFile(String filePath, List<Integer> characters) {
        File file = new File(filePath);
        if(file.exists()) {
            System.out.println("File already exists. What do you want: 1. Overwrite, 2. Append: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                        for (int c : characters) {
                            writer.write(c);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
                        writer.write(13);
                        for (int c : characters) {
                            writer.write(c);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
            }
        } else {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                for (int c : characters) {
                    writer.write(c);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Type file path to copy: ");
        Scanner scanner = new Scanner(System.in);
        List<Integer> characters = readFile(scanner.nextLine());

        System.out.println("Type file path to paste: ");
        String desPath = scanner.nextLine();
        writeFile(desPath, characters);
        System.out.println("Done");
    }
}
