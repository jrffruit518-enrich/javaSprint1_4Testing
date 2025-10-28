package sprint1TascaS103_N2_2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class RestauranteMain1 {
    public static void main(String[] args) {
        Restaurante1 restaurante1 = new Restaurante1("Good", 5);
        Restaurante1 restaurante2 = new Restaurante1("Nice", 3);
        Restaurante1 restaurante3 = new Restaurante1("great", 6);
        Restaurante1 restaurante4 = new Restaurante1("Good", 7); // The same name
        Restaurante1 restaurante5 = new Restaurante1("Good", 5);// The same name of restaurant1 with same score.It will not show in the set.

        Set<Restaurante1> restaurantehashset = new HashSet<>(Arrays.asList(restaurante1, restaurante2, restaurante3, restaurante4, restaurante5));
        restaurantehashset.stream().sorted(Comparator.comparing((Restaurante1 o1)-> o1.getName().toLowerCase()).thenComparing(Comparator.comparingInt(Restaurante1::getScore).reversed())).forEach(System.out::println);

    }
}
