package s103_n1_e01_duplicats;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        ArrayList<Month> months = new ArrayList<>();

        months.add(new Month("January"));
        months.add(new Month("February"));
        months.add(new Month("March"));
        months.add(new Month("April"));
        months.add(new Month("May"));
        months.add(new Month("June"));
        months.add(new Month("July"));
        months.add(new Month("September"));
        months.add(new Month("October"));
        months.add(new Month("November"));
        months.add(new Month("December"));

        // Insert August in the right position
        Month august = new Month("August");
        months.add(7, august);

        // Insert duplicated August
        Month augustDupl = new Month("August");
        months.add(augustDupl);


        // Print ArrayList in order
        System.out.println("Printing ArrayList - it has duplicates");
        for (Month mo : months) {
            System.out.println("Month: " + mo.getName());
        }

        // Turn Array into HashSet
        HashSet<Month> monthSet = new HashSet<>(months);
        monthSet.add(august);
        monthSet.add(augustDupl);


        System.out.println("\nPrinting HashSet - it doesn't have duplicates");
        for (Month mo : monthSet) {
            System.out.println("Month: " + mo.getName());
        }

        // Bucle con iterator
        System.out.println("\nPrinting HashSet with iterator - it doesn't have duplicates");
        Iterator<Month> it = monthSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
