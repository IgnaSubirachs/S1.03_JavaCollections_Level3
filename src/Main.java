public class Main {
    public static void main(String[] args) {
        PeopleManager manager = new PeopleManager();
        manager.readCsv("ID_list.csv");

        Menu.showMenu(manager);
    }
}