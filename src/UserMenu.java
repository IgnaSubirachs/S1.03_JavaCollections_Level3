import java.util.Comparator;
import java.util.Scanner;

public class Menu {

    public static void showMenu(FileManager manager) {
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
                case 2 -> Sort.showSorted(manager, "name", true);
                case 3 -> Sort.showSorted(manager, "name", false);
                case 4 -> Sort.showSorted(manager, "surname", true);
                case 5 -> Sort.showSorted(manager, "surname", false);
                case 6 -> Sort.showSorted(manager, "dni", true);
                case 7 -> Sort.showSorted(manager, "dni", false);
                case 0 -> System.out.println("Exiting program, see you soon...");
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
}


