package sprint1Tasca_S104Nivell1_1;


import java.util.Scanner;

class LibraryEntry {
    private static final Scanner sc = new Scanner(System.in);

    public static int readInt(String message) {
        while (true) {
            System.out.print(message);
            try {
                int value = Integer.parseInt(sc.nextLine());
                return value;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter an integer.");
            }
        }
    }

    public static String readString(String message) {
        while (true) {
            System.out.println(message);
            String input = sc.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Entrada vacía.");
                continue;
            }
            return input;
        }
    }
}








