import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    private static String csvFile = "ID_list.csv";


    public static List<Person> readCsv() {
        List<Person> people = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                if (fields.length == 3) {
                    String name = fields[0].trim();
                    String surname = fields[1].trim();
                    String dni = fields[2].trim();
                    people.add(new Person(name, surname, dni));
                }
            }
            System.out.println("File read successfully.");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return people;
    }


    public static void fileWriter(String name, String surname, String dni) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile, true))) {
            bw.write(String.join(",", name, surname, dni));
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error saving score: " + e.getMessage());
        }
    }
}


