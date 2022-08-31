package test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Nam", 18, "Da Nang"));
        students.add(new Student("Thanh", 19, "Da Nang"));
        students.add(new Student("Bao", 20, "Quang Nam"));

//        writeFile("sampleObject.dat", students);
        List<Student> list = (List<Student>)readFile("sampleObject.dat");
        list.forEach(System.out::println);
    }

    public static void writeFile(String path, Object o) {
        try (ObjectOutputStream outputStream =
                     new ObjectOutputStream(
                             new FileOutputStream(path))) {
            outputStream.writeObject(o);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object readFile(String path) {
        try (ObjectInputStream input =
                     new ObjectInputStream(
                             new FileInputStream(path)
                     )) {
            return input.readObject();
        } catch (IOException|ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
