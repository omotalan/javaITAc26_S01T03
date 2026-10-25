package s103_n3_e01_csvPerson.personAdmin;

import s103_n3_e01_csvPerson.Helpers;

import java.util.Comparator;

public class PersonService {

    public PersonService() {
    }

    public void showByNom(PersonList persones, boolean asc) {
        Comparator<Person> byNom = Comparator.comparing(Person::getNom);
        Helpers.printSorted(persones, byNom, asc);
    }

    public void showByCognom(PersonList persones, boolean asc) {
        Comparator<Person> byCognom = Comparator.comparing(Person::getCognom);
        Helpers.printSorted(persones, byCognom, asc);
    }

    public void showByDni(PersonList persones, boolean asc) {
        Comparator<Person> byDni = Comparator.comparing(Person::getDni);
        Helpers.printSorted(persones, byDni, asc);
    }
}
