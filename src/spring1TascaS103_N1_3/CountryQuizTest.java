package spring1TascaS103_N1_3;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CountryQuizTest {

    @Test
    public void fileTest() throws Exception {
        InputStream input = getClass().getClassLoader().getResourceAsStream("countries.txt");

        if (input == null) {
            System.out.println("The file is not found.");
            return;
        }

        System.out.println("The file is found. ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }

    @Test
    public void countryLoadTest() throws IOException {
        Set<Map.Entry<String, String>> entries = CountryLoader.countryLoad().entrySet();
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }


}
