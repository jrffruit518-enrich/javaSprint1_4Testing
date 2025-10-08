package spring1TascaS103_N1_2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = listGenerate();

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
        System.out.println();

        //1,Method1
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            list1.add(0, list.get(i));
        }
        Iterator<Integer> iterator1 = list1.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
        System.out.println();

        //2,Method2
        List<Integer> list2 = new ArrayList<>();
        list2.addAll(list);
        Collections.reverse(list2);
        Iterator<Integer> iterator2 = list2.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

    }

    public static List<Integer> listGenerate() {
        int count = Entry.readInt("Please enter a number. ");
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            Integer num = random.nextInt(100) + 1;
            numbers.add(num);
        }
        return numbers;
    }
}
