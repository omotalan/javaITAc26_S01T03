package s103_n2_e01_HashSet;

import java.util.Comparator;
import java.util.Objects;

public class Restaurant {

    private String nom;
    private int puntuacio;


    public Restaurant(String nom, int puntuacio) {
        this.nom = nom;
        this.puntuacio = puntuacio;
    }

    public String getNom() {
        return this.nom;
    }

    public int getPuntuacio() {
        return this.puntuacio;
    }
    
    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (!(other instanceof Restaurant otherRestaurant)) return false;

        return this.puntuacio == otherRestaurant.puntuacio &&
                (Objects.equals(this.nom, otherRestaurant.nom));
    }

    @Override
    public int hashCode() {
        // Use nom.hashCode() instead of multiplying the string directly
        int result = (nom != null ? nom.hashCode() : 0);
        return result * 31 + puntuacio;
    }

    @Override
    public String toString() {
        return "Nom: " + nom + ", Puntuació: " + puntuacio;
    }
}

