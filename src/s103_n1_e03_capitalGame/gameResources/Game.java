package s103_n1_e03_capitalGame.gameResources;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Game {
    private Scanner scanner;
    private CountryList countryList;

    public Game(Scanner scanner, CountryList countryList) {
        this.scanner = scanner;
        this.countryList = countryList;
    }

    public int play() {
        List<String> keys = new ArrayList<String>(this.countryList.getCountries().keySet());
        Collections.shuffle(keys);

        int score = 0;
        for (int i = 0; i < 10; i++) {
            String country = keys.get(i);
            System.out.print("Question " + (i + 1) + ": What is the capital of " + country + "? ");
            String answer = this.scanner.nextLine().trim();
            if (answer.equalsIgnoreCase(this.countryList.getCountries().get(country))) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong. The capital of " + country + " is " + this.countryList.getCountries().get(country) + ".");
            }
        }
        return score;
    }

    public void saveScore(String name, int score) {
        try {
            FileWriter writer = new FileWriter("javaITAc26_S01T03/src/s103_n1_e03_capitalGame/classificacio.txt", true);
            writer.write(name + " " + score);
            writer.write(System.lineSeparator());
            writer.close();
            System.out.println("Score saved to classificacio.txt");
        } catch (IOException e) {
            System.out.println("Could not save the score.");
        }
    }
}
