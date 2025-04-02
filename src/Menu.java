import java.util.Comparator;
import java.util.Scanner;

public class Menu {

    public static void showMenu(PeopleManager manager) {
        Scanner sc = new Scanner(System.in);
        int option;

        do {
            showOptions();
            option = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (option) {
                case 1 -> {
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Surname: ");
                    String surname = sc.nextLine();
                    System.out.print("DNI: ");
                    String dni = sc.nextLine();
                    manager.addPerson(new Person(name, surname, dni));
                    System.out.println("Person added successfully.");
                }
                case 2 -> showSorted(manager, "name", true);
                case 3 -> showSorted(manager, "name", false);
                case 4 -> showSorted(manager, "surname", true);
                case 5 -> showSorted(manager, "surname", false);
                case 6 -> showSorted(manager, "dni", true);
                case 7 -> showSorted(manager, "dni", false);
                case 0 -> System.out.println("Exiting program...");
                default -> System.out.println("Invalid option.");
            }
        } while (option != 0);
    }

    private static void showOptions() {
        System.out.println("\n--- MENU ---");
        System.out.println("1.- Add a person.");
        System.out.println("2.- Show people sorted by name (A-Z).");
        System.out.println("3.- Show people sorted by name (Z-A).");
        System.out.println("4.- Show people sorted by surname (A-Z).");
        System.out.println("5.- Show people sorted by surname (Z-A).");
        System.out.println("6.- Show people sorted by ID (1-9).");
        System.out.println("7.- Show people sorted by ID (9-1).");
        System.out.println("0.- Exit.");
        System.out.print("Choose an option: ");
    }

    private static void showSorted(PeopleManager manager, String field, boolean ascending) {
        printHeader();

        Comparator<Person> comparator = switch (field) {
            case "name" -> Comparator.comparing(Person::getName, String.CASE_INSENSITIVE_ORDER);
            case "surname" -> Comparator.comparing(Person::getSurname, String.CASE_INSENSITIVE_ORDER);
            case "dni" -> Comparator.comparing(Person::getDni, String.CASE_INSENSITIVE_ORDER);
            default -> null;
        };

        if (comparator == null) {
            System.out.println("Invalid field.");
            return;
        }

        if (!ascending) {
            comparator = comparator.reversed();
        }

        manager.getPeople().stream()
                .sorted(comparator)
                .forEach(System.out::println);
    }

    private static void printHeader() {
        System.out.printf("%-15s %-20s %-10s\n", "___Name___", "____Surname____", "__DNI__");
    }
}
