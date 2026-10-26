package s103_n1_e03_capitalGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Helpers {
    public static int readInt(String prompt, Scanner scanner) {
        while (true) {
            System.out.print(prompt);
            String line = scanner.nextLine();
            try {
                return Integer.parseInt(line.trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Try again.");
            }
        }
    }

    public static List<String> parseLine(String line) {
        List<String> fields = new ArrayList<>();
        Pattern p = Pattern.compile("\"([^\"]*)\"|(\\S+)");
        Matcher m = p.matcher(line);
        while (m.find()) {
            if (m.group(1) != null) {
                fields.add(m.group(1));      // quoted value, quotes stripped
            } else {
                fields.add(m.group(2));      // unquoted value
            }
        }
        return fields;
    }
}
