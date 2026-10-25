package s103_n1_e03_capitalGame;

import s103_n1_e03_capitalGame.gameResources.CountryList;
import s103_n1_e03_capitalGame.gameResources.Game;
import s103_n1_e03_capitalGame.gameResources.Player;

import java.util.Scanner;

public class ConsoleUI {
    private final Scanner scanner;
    private CountryList countryList;

    public ConsoleUI(Scanner scanner) {
        this.scanner = scanner;
        this.countryList = inputCountries();

    }

    public void start() {
        boolean running = true;
        while (running) {
            Player currentPlayer = inputPlayer();
            Game currentGame = new Game(this.scanner, this.countryList);

            int score = currentGame.play();
            System.out.println("Your score was " + score + "/10");
            currentPlayer.setScore(score);
            // Save score to external file
            currentGame.saveScore(currentPlayer.getName(), score);

            int option = Helpers.readInt("Want to try again? 1 for 'Yes', 0 for 'No' ", this.scanner);

            if (option == 0) {
                System.out.println("Bye!");
                scanner.close();
                running = false;
            }

        }
    }

    private Player inputPlayer() {
        Player player = new Player(null);

        while (player.getName() == null || !player.nameIsValid(player.getName())) {
            System.out.print("Enter player name: ");
            String playerName = this.scanner.nextLine().trim();
            player = new Player(playerName);

            if (!player.nameIsValid(player.getName())) {
                System.out.println("Invalid name. Try again.");
            }
        }

        return player;
    }


    private CountryList inputCountries() {
        countryList = null;

        while (countryList == null || countryList.isValid()) {
            System.out.print("Enter the filepath to the countries file: ");
            String fileName = this.scanner.nextLine().trim();
            countryList = new CountryList(fileName);

            if (countryList.isValid()) {
                System.out.println("Not enough countries loaded. Try again.");
                countryList = null;
            }
        }

        return countryList;
    }
}
