package spring1TascaS103_N1_3;

import java.util.Scanner;

public class EntryQuiz {
    private static Scanner sc = new Scanner(System.in);

    public static String readString() {
        while (true) {
            String value = sc.nextLine();
            if (value.trim().isEmpty()) {
                System.out.println("The value can not be void.");
                continue;
            }
            return value;
        }
    }
}
