import java.util.Comparator;
import java.util.List;

public class Sort {


    public static void nameSort(List<Person> nameList){
        if(nameList.isEmpty()){
            System.out.println("The list is empty");
            return;
        }nameList.sort(new Comparator<Person>() {
           @Override
           public int compare(Person o1, Person o2) {
               return o1.getName().compareTo(o2.getName());
           }
        });
        printHeader();
        for(Person person : nameList){
            System.out.println(person);
        }
    }
    public static void reverseNameSort(List<Person> nameList){
        if(nameList.isEmpty()){
            System.out.println("The list is empty");
            return;
        }nameList.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o2, Person o1) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        printHeader();
        for(Person person : nameList){
            System.out.println(person);
        }
    }

    public static void surnameSort(List<Person> surnameList){
        if(surnameList.isEmpty()){
            System.out.println("The list is empty");
            return;
        }surnameList.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getSurname().compareTo(o2.getSurname());
            }
        });
        printHeader();
        for(Person person : surnameList){
            System.out.println(person);
        }
    }

    public static void reverseSurnameSort(List<Person> surnameList){
        if(surnameList.isEmpty()){
            System.out.println("The list is empty");
            return;
        }surnameList.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o2, Person o1) {
                return o1.getSurname().compareTo(o2.getSurname());
            }
        });
        printHeader();
        for(Person person : surnameList){
            System.out.println(person);
        }
    }
    public static void idSort(List<Person> idList){
        if(idList.isEmpty()){
            System.out.println("The list is empty");
            return;
        }
        idList.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getDni().compareTo(o2.getDni());
            }
        });
        printHeader();
        for(Person person : idList){
            System.out.println(person);
        }
    }

    public static void reverseidSort(List<Person> idList){
        if(idList.isEmpty()){
            System.out.println("The list is empty");
            return;
        }
        idList.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o2, Person o1) {
                return o1.getDni().compareTo(o2.getDni());
            }
        });
        printHeader();
        for(Person person : idList){
            System.out.println(person);
        }
    }

    private static void printHeader() {
        System.out.printf("%-15s %-20s %-10s\n", "___Name___", "____Surname____", "__DNI__");
    }
}


