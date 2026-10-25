package s103_n3_e01_csvPerson;

import s103_n3_e01_csvPerson.personAdmin.PersonList;
import s103_n3_e01_csvPerson.personAdmin.PersonService;

import java.util.Scanner;


public class ConsoleUI {
    Scanner scanner;
    PersonService personService;
    PersonList persones;

    public ConsoleUI(Scanner scanner, PersonService personService) {
        this.scanner = scanner;
        this.personService = personService;
        this.persones = inputPersonList();
    }

    public void start() {
        int option = -1;
        while (option != 0) {
            showMenu();
            option = Helpers.readInt(this.scanner, "Opció: ");
            switch (option) {
                case 1:
                    this.persones.addPerson(this.scanner);
                    break;
                case 2:
                    this.personService.showByNom(this.persones, true);
                    break;
                case 3:
                    this.personService.showByNom(this.persones, false);
                    break;
                case 4:
                    this.personService.showByCognom(this.persones, true);
                    break;
                case 5:
                    this.personService.showByCognom(this.persones, false);
                    break;
                case 6:
                    this.personService.showByDni(this.persones, true);
                    break;
                case 7:
                    this.personService.showByDni(this.persones, false);
                    break;
                case 0:
                    System.out.println("Adéu!");
                    break;
                default:
                    System.out.println("Opcio incorrecta.");
            }
        }
    }

    private static void showMenu() {
        System.out.println();
        System.out.println("1. Introduir persona.");
        System.out.println("2. Mostrar les persones ordenades per nom (A-Z).");
        System.out.println("3. Mostrar les persones ordenades per nom (Z-A).");
        System.out.println("4. Mostrar les persones ordenades per cognoms (A-Z).");
        System.out.println("5. Mostrar les persones ordenades per cognoms (Z-A).");
        System.out.println("6. Mostrar les persones ordenades per DNI (1-9).");
        System.out.println("7. Mostrar les persones ordenades per DNI (9-1).");
        System.out.println("0. Sortir.");
    }


    private PersonList inputPersonList() {
        PersonList personList = null;

        while (personList == null) {
            System.out.print("Enter the path to the person list file: ");
            String fileName = this.scanner.nextLine().trim();
            personList = new PersonList(fileName);
        }

        return personList;
    }
}
