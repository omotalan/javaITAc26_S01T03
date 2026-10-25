package s103_n2_e01_HashSet;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Restaurant> restaurantList = new ArrayList<>();
        restaurantList.add(new Restaurant("La Tagliatella", 4));
        restaurantList.add(new Restaurant("Xàtiva", 5));
        restaurantList.add(new Restaurant("La Tagliatella", 3));
        restaurantList.add(new Restaurant("Xàtiva", 4));


        // Order list using class' static comparator
        restaurantList.sort(CompareRestaurant.compareRestaurant());
        for (Restaurant restaurant : restaurantList) {
            System.out.println(restaurant);
        }
    }
}

