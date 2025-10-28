package sprint1TascaS103_N1_2;


import java.util.Scanner;

class Entry {
    private static final Scanner sc = new Scanner(System.in);


    public static int readInt(String message) {
        while (true) {
            System.out.print(message);
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter an integer.");
            }
        }
    }
}








