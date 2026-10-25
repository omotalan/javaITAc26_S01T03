package s103_n3_e01_csvPerson.personAdmin;

import s103_n3_e01_csvPerson.Helpers;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonList {
    private ArrayList<Person> persones = new ArrayList<>();

    public PersonList(String fileName) {
        readCsv(fileName);
    }

    public ArrayList<Person> getPersones() {
        return persones;
    }

    private void readCsv(String fileName) {
        try {
            Scanner reader = new Scanner(new FileReader(fileName));
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                if (line.trim().isEmpty()) {
                    continue;
                }
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    this.persones.add(new Person(parts[0], parts[1], parts[2]));
                }
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("No s'ha pogut llegir el fitxer: " + fileName);
        }
    }


    public void addPerson(Scanner scanner) {
        String nom = Helpers.readString(scanner, "Nom: ");
        String cognom = Helpers.readString(scanner, "Cognom: ");
        String dni = Helpers.readString(scanner, "DNI: ");
        this.persones.add(new Person(nom, cognom, dni));
        System.out.println("Persona afegida.");
    }
}
