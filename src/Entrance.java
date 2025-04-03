import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrance {
    public static Scanner sc = new Scanner(System.in);

    public static void clearBuffer() {
        if (sc.hasNextLine()) {
            sc.nextLine();
        }
    }

    public static String readString(String message) {
        while (true) {
            System.out.println(message);
            String input = sc.nextLine().trim();
            if (input.matches("[A-Za-zÀ-ÖØ-öø-ÿ\\s]+")) {
                return input;
            }
                System.out.println("This is not a valid string");

        }
    }

    public static String idString(String message) {
        while (true) {
            System.out.println(message);
            String input = sc.nextLine().trim();
            if (input.matches("\\d{8}[A-Za-z]")) {
                return input;

            }
            System.out.println("Error: ID must be a number and no more than 8 digits with one letter");


        }
    }

    public static byte readByte(String message) {
        byte value = 0;

        while (true) {
            try {
                System.out.println(message);
                value = sc.nextByte();
                clearBuffer();
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Error: This isn't a Byte number. Try Again.");
                clearBuffer();
            }
        }

    }
}






