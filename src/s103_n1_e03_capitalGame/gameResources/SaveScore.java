package s103_n1_e03_capitalGame.gameResources;

import java.io.FileWriter;
import java.io.IOException;

public class SaveScore {

    public static void saveScore(String name, int score) {
        try {
            FileWriter writer = new FileWriter("classificacio.txt", true);
            writer.write(name + " " + score);
            writer.write(System.lineSeparator());
            writer.close();
            System.out.println("Score saved to classificacio.txt");
        } catch (IOException e) {
            System.out.println("Could not save the score.");
        }
    }
}
