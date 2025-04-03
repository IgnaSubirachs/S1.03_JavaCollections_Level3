import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrance {
    public static Scanner sc = new Scanner(System.in);

    public static void clearBuffer() {
        if (sc.hasNextLine()) {
            sc.nextLine();
        }
    }

    public static String readString(String message) throws InvalidStringException {
        System.out.println(message);
        String input = sc.nextLine();
        if (!input.matches("[A-Za-zÀ-ÖØ-öø-ÿ\\s]+")) {
            throw new InvalidStringException();
        } else {
            return input;
        }
    }
    public static String idString(String message) throws InvalidStringException {
        System.out.println(message);
        String input = sc.nextLine();
        if (!input.matches("\\d{8}[A-Z]")) {
            throw new InvalidStringException();
        } else {
            return input;
        }
    }

    public static byte readByte(String message) {
        byte value = 0;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.println(message);
                value = sc.nextByte();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: This isn't a Byte number. Try Again.");
                sc.nextLine(); // Clear buffer
            }
        }

        return value;
    }
}






