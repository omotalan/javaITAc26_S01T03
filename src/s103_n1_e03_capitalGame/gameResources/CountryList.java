package s103_n1_e03_capitalGame.gameResources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CountryList {
    private final Map<String, String> countries = new HashMap<String, String>();

    public CountryList(String fileName) {
        readCountries(fileName);
    }

    private void readCountries(String fileName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) {
                    continue;
                }
                String[] parts = line.split("\\s+");
                if (parts.length == 2) {
                    countries.put(parts[0], parts[1]);
                }
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Could not read file: " + fileName);
        }
    }

    public boolean isValid() {
        return countries.size() < 10;
    }

    public Map<String, String> getCountries() {
        return countries;
    }
}
