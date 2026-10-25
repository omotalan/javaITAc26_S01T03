package s103_n1_e02_listIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        List<Integer> original = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        List<Integer> reversed = new ArrayList<>();
        ListIterator<Integer> it = original.listIterator(original.size());

        while (it.hasPrevious()) {
            reversed.add(it.previous());
        }

        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}