import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PeopleManager {
    private List<Person> people;

    public PeopleManager() {
        people = new ArrayList<>();
    }

    public void readCsv(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
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
    }

    public List<Person> getPeople() {
        return people;
    }

    public void addPerson(Person person) {
        people.add(person);
    }
}
