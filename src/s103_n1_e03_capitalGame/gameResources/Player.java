package s103_n1_e03_capitalGame.gameResources;

import s103_n1_e03_capitalGame.exceptions.InvalidPersonNameException;

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
            System.out.println("Name cannot be empty. Try again");
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            if (Character.isDigit(name.charAt(i))) {
                System.out.println("Name cannot contain numbers. Try again");
                return false;
            }
        }
        return true;
    }
}
