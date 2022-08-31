package ss16_io_text_file.e2_read_csv_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CsvFileReading {
    public static void main(String[] args) {
        File file = new File("nations.csv");
        List<Nation> nationList = new ArrayList<>();

        if(file.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                String[] fields = new String[3];
                while ((line = reader.readLine()) != null) {
                    fields = line.split(",");
                    Nation nation = new Nation(Integer.parseInt(fields[0]), fields[1], fields[2]);
                    nationList.add(nation);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        } else System.out.println("File is not exist.");

        for (Nation nation : nationList) {
            System.out.println(nation);
        }

    }
}
