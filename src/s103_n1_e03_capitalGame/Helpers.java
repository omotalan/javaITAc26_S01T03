package s103_n1_e03_capitalGame;

import java.util.Scanner;

public class Helpers {
    public static int readInt(String prompt, Scanner scanner) {
        while (true) {
            System.out.print(prompt);
            String line = scanner.nextLine();
            try {
                return Integer.parseInt(line.trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Try again.");
            }
        }
    }

    public static String readLine(Scanner scanner) {
        System.out.print("Person name: ");
        return scanner.nextLine();
    }
}
