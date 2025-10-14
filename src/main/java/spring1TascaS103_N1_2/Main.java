package spring1TascaS103_N1_2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int count = Entry.readInt("Please enter a number. ");
        List<Integer> list = listGenerate(count);
        printList(list);
        System.out.println();


        List<Integer> listReverse = new ArrayList<>();
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            listReverse.add(iterator.previous());
        }
        printList(listReverse);


    }

    public static void printList(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static List<Integer> listGenerate(int count) {
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
}
