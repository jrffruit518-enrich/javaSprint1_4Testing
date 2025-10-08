package spring1TascaS103_N1_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

public class CountryLoader {
    public static HashMap<String, String> countryLoad() throws IOException {

        InputStream input = CountryLoader.class.getClassLoader().getResourceAsStream("countries.txt");
        if (input == null) {
            System.out.println("The file is not found.");
            return null;
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
        HashMap<String, String> countryCapital = new HashMap<>();
        String line;
        while ((line = reader.readLine()) != null) {
            line = line.trim();
            if (line.isEmpty()) continue;
            String[] parts = line.split("\\s+", 2);
            if (parts.length < 2) {
                continue;
            }
            String part0 = parts[0];
            String part1 = parts[1];
            countryCapital.put(part0, part1);
        }
        return countryCapital;
    }
}
