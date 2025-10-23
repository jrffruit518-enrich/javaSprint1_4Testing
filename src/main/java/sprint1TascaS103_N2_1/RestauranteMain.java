package sprint1TascaS103_N2_1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RestauranteMain {
    public static void main(String[] args) {
        Restaurante restaurante1 = new Restaurante("Good", 5);
        Restaurante restaurante2 = new Restaurante("Nice", 3);
        Restaurante restaurante3 = new Restaurante("Good", 6);// The same name of restaurant1 with different score.
        Restaurante restaurante4 = new Restaurante("Good", 5);// The same name of restaurant1 with same score.It will not show in the set.
        Set<Restaurante> restaurantehashset = new HashSet<>();
        restaurantehashset.addAll(Arrays.asList(restaurante1,restaurante2,restaurante3,restaurante4));
        restaurantehashset.stream().forEach(System.out::println);
    }
}
