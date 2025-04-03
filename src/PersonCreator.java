import java.util.ArrayList;
import java.util.List;

public class PersonCreator {
    public static void personCreator(){
        List<Person> people = new ArrayList<Person>();
        String name = Entrance.readString("Name:");
        String surname = Entrance.readString("Surname: ");
        String dni = Entrance.idString("DNI: ");
        people.add(new Person(name, surname, dni));
        System.out.println("Person added successfully.");
        FileManager.fileWriter(name, surname, dni);
    }
}
