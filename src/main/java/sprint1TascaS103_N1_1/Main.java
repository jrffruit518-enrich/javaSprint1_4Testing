package sprint1TascaS103_N1_1;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Month> months = createInitialMonthList();

        // No hay August
        showFor(months);

        addByIndex(months,7,Month.AUGUST);

        // Including August
        showFor(months);

        showIterator(months);

        //Add duplicated January
        addByIndex(months,12, Month.JANUARY);

        showFor(months);

        //Eliminate duplicated January
        Set<Month> monthSet = removeDuplicates(months);
        showIterator(monthSet);

    }
    public static List<Month> createInitialMonthList() {
        return Arrays.stream(Month.values())
                .filter(month -> month != Month.AUGUST)
                .collect(Collectors.toList());
    }

    public static void addByIndex(List<Month>months,int index , Month month) {
        if (index<0 || index > months.size()) {
            throw new IllegalArgumentException("The index is invalid.");
        }
        months.add(index,month);
    }

    public static  void showFor(Iterable<Month> months) {
        for (Month month : months ) {
            System.out.println(month);
        }
        System.out.println();
    }

    public static void showIterator(Iterable<Month> months) {
        Iterator<Month> iterator = months.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
    }
    public static Set<Month> removeDuplicates(List<Month> months) {
        return new LinkedHashSet<>(months);
    }


}
