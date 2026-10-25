package s103_n1_e03_capitalGame.gameResources;

import n03_e01_reservesCinema.exceptions.InvalidPersonNameException;

public class Player {
    private String name;
    private int score;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


    public boolean nameIsValid(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidPersonNameException("Name cannot be empty.");
        }
        for (int i = 0; i < name.length(); i++) {
            if (Character.isDigit(name.charAt(i))) {
                throw new InvalidPersonNameException("Name cannot contain numbers.");
            }
        }
        return true;
    }
}
