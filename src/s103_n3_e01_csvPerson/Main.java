package s103_n3_e01_csvPerson;

import s103_n3_e01_csvPerson.personAdmin.PersonService;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PersonService personService = new PersonService();
        ConsoleUI ui = new ConsoleUI(scanner, personService);

        // file path for testing: "javaITAc26_S01T03/src/s103_n3_e01_csvPerson/persones.csv"
        ui.start();
    }
}

