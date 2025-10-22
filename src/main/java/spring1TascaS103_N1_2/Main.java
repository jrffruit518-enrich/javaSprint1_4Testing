package spring1TascaS103_N1_2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int count = Entry.readInt("Please enter a number. ");

        List<Integer> list = generateRandomList(count);

        printList(list);

        System.out.println();

        printList(reversedList(list));


    }

    public static void printList(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static List<Integer> generateRandomList (int count) {
        if (count <= 0) {
            throw new IllegalArgumentException("The number must be greater than zero.");
        }
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            Integer num = random.nextInt(100) + 1;
            numbers.add(num);
        }
        return numbers;
    }

    public static List<Integer> reversedList(List<Integer> list) {
        List<Integer> listReverse = new ArrayList<>();
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            listReverse.add(iterator.previous());
        }return listReverse;

    }
}
