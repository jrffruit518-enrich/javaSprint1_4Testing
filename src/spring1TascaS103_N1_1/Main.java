package spring1TascaS103_N1_1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Month> months = new ArrayList<>();
        months.addAll(Arrays.asList(Month.JANUARY, Month.FEBRUARY, Month.MARCH, Month.APRIL, Month.MAY, Month.JUNE, Month.JULY, Month.
                SEPTEMBER, Month.OCTOBER, Month.NOVEMBER, Month.DECEMBER));
        months.add(7, Month.AUGUST);

        for (Month month : months) {
            System.out.println(month);
        }
        System.out.println();

        Iterator<Month> iterator = months.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();


        HashSet<Month> hashMonths = new LinkedHashSet<>(months);

        for (Month month : hashMonths) {
            System.out.println(month);
        }
        System.out.println();


        Iterator<Month> monthIterator = hashMonths.iterator();
        while (monthIterator.hasNext()) {
            System.out.println(monthIterator.next());
        }
        System.out.println();

    }
}
