package test;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Test {
    public static void main(String[] args) {

        List list = new LinkedList();
        list.add("a");
        list.add("b");
        list.add("d");
        list.add("c");
        list.remove("d");
        System.out.println(list);

//        11 \d Số bất kỳ, viết ngắn gọn cho [0-9]
//
//        12 \D Ký tự không phải là số, viết ngắn gon cho [^0-9]
//
//        13 \s Ký tự khoảng trắng, viết ngắn gọn cho [ \t\n\x0b\r\f]
//
//        14 \S Ký tự không phải khoản trắng, viết ngắn gọn cho [^\s]
//
//        15 \w Ký tự chữ, viết ngắn gọn cho [a-zA-Z_0-9]
//
//        16 \W Ký tự không phải chữ, viết ngắn gọn cho [^\w]
//
//        17 \S+ Một số ký tự không phải khoảng trắng (Một hoặc nhiều)
//
//        18 \b Ký tự thuộc a-z hoặc A-Z hoặc 0-9 hoặc _, viết ngắn gọn cho [a-zA-Z0-9_].

//        do {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Pls enter date of birth: ");
//            String dateAsString = scanner.nextLine();
//            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
//            simpleDateFormat.setLenient(false);
//            try {
//                Date dateOfBirth = simpleDateFormat.parse(dateAsString);
//                if ((new Date()).before(dateOfBirth)) {
//                    System.out.println("ngay sinh phai be hon ngay hien tai");
//                    continue;
//                }
//                break;
//            } catch (ParseException e) {
//                System.out.println("Ngay sinh phai nhap dung format dd/MM/yyyy");
//            }
//        } while (true);

//        public static void writeFileWithResource(String path, List<Student> studentList, boolean append) {
//            try (BufferedWriter writer = new BufferedWriter(
//                    new FileWriter(path, append))){
//                for (Student student: studentList) {
//                    // tsv, csv
//                    writer.write(student.getName() + DELIMITER
//                            + student.getAge() + DELIMITER
//                            + student.getAddress());
//                    writer.newLine();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//
//        public static List<Student> getStudentFromFile(String path) {
//            List<Student> students = new ArrayList<>();
//            try (BufferedReader reader = new BufferedReader(new FileReader(path))){
//                String temp;
//                while ((temp = reader.readLine()) != null) {
//                    if (EMPTY.equals(temp.trim())) {
//                        continue;
//                    }
//                    String[] result = temp.split(DELIMITER);
//                    if (result.length != 3) {
//                        continue;
//                    }
//                    String name = result[0];
//                    int age = Integer.parseInt(result[1]);
//                    String address = result[2];
//                    students.add(new Student(name, age, address));
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//            return students;
//        }
    }
}
