package s103_n2_e01_HashSet;

import java.util.Comparator;

public class CompareRestaurant {
    public static Comparator<Restaurant> compareRestaurant() {
        return Comparator
                .comparing(Restaurant::getNom)
                .thenComparing(Restaurant::getPuntuacio, Comparator.reverseOrder());
    }
}
