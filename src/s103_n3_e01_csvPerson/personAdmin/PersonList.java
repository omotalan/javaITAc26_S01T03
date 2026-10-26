package s103_n3_e01_csvPerson.personAdmin;

import s103_n3_e01_csvPerson.Helpers;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonList {
    private ArrayList<Person> persones = new ArrayList<>();

    public PersonList(String fileName) throws IOException {
        readCsv(fileName);
    }

    public ArrayList<Person> getPersones() {
        return persones;
    }

    private void readCsv(String fileName) throws IOException {
        Scanner reader = new Scanner(new FileReader(fileName));
        try {
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
        } finally {
            reader.close();
        }
    }

}
