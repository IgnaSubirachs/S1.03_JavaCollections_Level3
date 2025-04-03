import java.util.List;

public class UserMenu {

    public static void showMenu() {
        int option;

        do {
           List<Person> list1=  FileManager.readCsv();
            showOptions();
            option = Entrance.readByte("Please choose one of the next option:");

            switch (option) {
                case 1 -> PersonCreator.personCreator();
                case 2 -> Sort.nameSort(list1);
                case 3 -> Sort.reverseNameSort(list1);
                case 4 -> Sort.surnameSort(list1);
                case 5 -> Sort.reverseSurnameSort(list1);
                case 6 -> Sort.idSort(list1);
                case 7 -> Sort.reverseidSort(list1);
                case 0 -> System.out.println("Exiting program, see you soon...");
                default -> System.out.println("Invalid option.");
            }
        } while (option != 0);
    }

    private static void showOptions() {
        System.out.println("\n--- MENU ---");
        System.out.println("Choose an option: ");
        System.out.println("1.- Add a person.");
        System.out.println("2.- Show people sorted by name (A-Z).");
        System.out.println("3.- Show people sorted by name (Z-A).");
        System.out.println("4.- Show people sorted by surname (A-Z).");
        System.out.println("5.- Show people sorted by surname (Z-A).");
        System.out.println("6.- Show people sorted by ID (1-9).");
        System.out.println("7.- Show people sorted by ID (9-1).");
        System.out.println("0.- Exit.");

    }
}


