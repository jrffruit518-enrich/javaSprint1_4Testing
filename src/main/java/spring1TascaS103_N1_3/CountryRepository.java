package spring1TascaS103_N1_3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountryRepository {
    public List<Map.Entry<String, String>> loadCountries() throws IOException {
        HashMap<String, String> map = CountryLoader.countryLoad();
        if (map.isEmpty()) throw new IOException("Country data is empty");
        return new ArrayList<>(map.entrySet());
    }
}
