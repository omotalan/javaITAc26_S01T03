package s103_n3_e01_csvPerson;

import s103_n3_e01_csvPerson.personAdmin.Person;
import s103_n3_e01_csvPerson.personAdmin.PersonList;

import java.util.*;

public class Helpers {

    public static void printSorted(PersonList persones, Comparator<Person> comparator, boolean asc) {
        if (asc) {
            Collections.sort(persones.getPersones(), comparator);
        } else {
            Collections.sort(persones.getPersones(), comparator.reversed());
        }

        System.out.printf("%-15s %-20s %-10s%n", "___Nom___", "____Cognoms______", "___NIF___");
        for (Person p : persones.getPersones()) {
            System.out.printf("%-15s %-20s %-10s%n", p.getNom(), p.getCognom(), p.getDni());
        }
    }

    public static int readInt(Scanner scanner, String message) {
        while (true) {
            System.out.print(message);
            String line = scanner.nextLine();
            try {
                return Integer.parseInt(line.trim());
            } catch (NumberFormatException e) {
                System.out.println("Error de format. Torna-ho a provar.");
            }
        }
    }

    public static String readString(Scanner scanner, String message) {
        while (true) {
            System.out.print(message);
            String line = scanner.nextLine();
            if (!line.trim().isEmpty()) {
                return line;
            }
            System.out.println("El text no pot estar buit.");
        }
    }

}
