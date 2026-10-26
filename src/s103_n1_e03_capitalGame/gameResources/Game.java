package s103_n1_e03_capitalGame.gameResources;

import s103_n1_e03_capitalGame.ConsoleUI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Game {
    private Scanner scanner;
    private CountryList countryList;
    private ConsoleUI ui;

    public Game(Scanner scanner, CountryList countryList, ConsoleUI ui) {
        this.scanner = scanner;
        this.countryList = countryList;
        this.ui = ui;
    }

    private List<String> shuffleList() {
        List<String> keys = new ArrayList<String>(this.countryList.getCountries().keySet());
        Collections.shuffle(keys);

        return keys;
    }

    private boolean checkAnswer(String answer, String country) {
        return answer.equalsIgnoreCase(this.countryList.getCountries().get(country));
    }

    public int play() {
        List<String> keys = shuffleList();

        int score = 0;
        for (int i = 0; i < 10; i++) {
            String country = keys.get(i);
            String answer = ui.inputAnswer(i, country);
            if (checkAnswer(answer, country)) {
                ui.outputFeedback(true, country);
                score++;
            } else {
                ui.outputFeedback(false, country);
            }
        }
        return score;
    }
}
