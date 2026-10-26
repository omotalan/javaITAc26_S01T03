package s103_n2_e01_HashSet;

import s103_n1_e01_duplicats.Month;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Restaurant> restaurantList = new ArrayList<>();
        restaurantList.add(new Restaurant("La Tagliatella", 4));
        restaurantList.add(new Restaurant("Xàtiva", 5));
        restaurantList.add(new Restaurant("La Tagliatella", 3));
        restaurantList.add(new Restaurant("Xàtiva", 4));

        // Create HashSet from array, try to insert dupl
        HashSet<Restaurant> restaurantSet = new HashSet<>(restaurantList);
        restaurantSet.add(new Restaurant("Xàtiva", 4));


        System.out.println("\nPrinting HashSet with iterator - it doesn't have duplicates");
        Iterator<Restaurant> it = restaurantSet.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        // Order list using class' static comparator
        System.out.println("\nPrinting ordered list with comparator");
        restaurantList.sort(CompareRestaurant.compareRestaurant());
        for (Restaurant restaurant : restaurantList) {
            System.out.println(restaurant);
        }
    }
}

