package spring1TascaS103_N1_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

public class CountryLoader {
    public static HashMap<String, String> countryLoad() throws IOException {
        HashMap<String, String> countryCapital = new HashMap<>();

        try(InputStream input = CountryLoader.class.getClassLoader().getResourceAsStream("countries.txt")) {

            try(BufferedReader reader = new BufferedReader(new InputStreamReader(input, StandardCharsets.UTF_8))) {

                if (input == null) {
                    throw new IOException("countries.txt not found");
                }


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
            }
        }
        return countryCapital;
    }
}
